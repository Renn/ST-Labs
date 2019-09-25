import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    Clock[] clocks = hotel.getClocks();
    Phone mobilePhone = hotel.getMobilePhone();
    System.out.println(mobilePhone.getZone().getLocation() + ":" + mobilePhone.getTime());
    for (Clock temp : clocks) {
      System.out.println(temp.getZone().getLocation() + ":" + temp.getTime()
          .format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
    hotel.setPhoneTime(LocalTime.parse("10:00:00"));
    System.out.println(mobilePhone.getZone().getLocation() + ":" + mobilePhone.getTime()
        .format(DateTimeFormatter.ISO_LOCAL_TIME));
    for (Clock temp : clocks) {
      System.out.println(temp.getZone().getLocation() + ":" + temp.getTime()
          .format(DateTimeFormatter.ISO_LOCAL_TIME));
    }
  }
}

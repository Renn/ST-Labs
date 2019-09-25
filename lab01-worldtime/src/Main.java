import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Hotel hotel = new Hotel();
    Phone mobilePhone = hotel.getMobilePhone();
    Clock[] clocks = hotel.getClocks();
    String time;
    try {
      System.out.println("Input phone time:");
      Scanner in = new Scanner(System.in);
      time = in.next();
      hotel.setPhoneTime(LocalTime.parse(time));
      System.out.println("Phone time:" + mobilePhone.getTime()
          .format(DateTimeFormatter.ISO_LOCAL_TIME));
      for (Clock temp : clocks) {
        System.out.println(temp.getZone().getLocation() + ":" + temp.getTime()
            .format(DateTimeFormatter.ISO_LOCAL_TIME));
      }
    } catch (DateTimeParseException e) {
      System.out.println(
          "Input error. Time's format should be hh:mm:ss. (hh[00-23]:mm[00-59]:ss[00-59])");
    }

  }
}

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class testSetPhoneTime {

  private Hotel hotel;

  @BeforeEach
  void init() {
    hotel = new Hotel();
  }

  @Test
  void setPhoneTimeTo080000() {
    hotel.setPhoneTime(LocalTime.parse("08:00:00", DateTimeFormatter.ISO_LOCAL_TIME));
    Clock[] clocks = hotel.getClocks();
    Phone mobilePhone = hotel.getMobilePhone();
    Assertions.assertEquals(
        LocalTime.parse("08:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        mobilePhone.getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("08:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[0].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("00:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[1].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("04:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[2].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("19:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[3].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("10:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[4].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
  }

  @Test
  void setPhoneTimeTo000000() {
    hotel.setPhoneTime(LocalTime.parse("00:00:00", DateTimeFormatter.ISO_LOCAL_TIME));
    Clock[] clocks = hotel.getClocks();
    Phone mobilePhone = hotel.getMobilePhone();
    Assertions.assertEquals(
        LocalTime.parse("00:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        mobilePhone.getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("00:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[0].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("16:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[1].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("20:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[2].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("11:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[3].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("02:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[4].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
  }

  @Test
  void setPhoneTimeTo083642() {
    hotel.setPhoneTime(LocalTime.parse("08:36:42", DateTimeFormatter.ISO_LOCAL_TIME));
    Clock[] clocks = hotel.getClocks();
    Phone mobilePhone = hotel.getMobilePhone();
    Assertions.assertEquals(
        LocalTime.parse("08:36:42").format(DateTimeFormatter.ISO_LOCAL_TIME),
        mobilePhone.getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("08:36:42").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[0].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("00:36:42").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[1].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("04:36:42").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[2].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("19:36:42").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[3].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("10:36:42").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[4].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
  }

  @Test
  void setPhoneTimeTo235959() {
    hotel.setPhoneTime(LocalTime.parse("23:59:59", DateTimeFormatter.ISO_LOCAL_TIME));
    Clock[] clocks = hotel.getClocks();
    Phone mobilePhone = hotel.getMobilePhone();
    Assertions.assertEquals(
        LocalTime.parse("23:59:59").format(DateTimeFormatter.ISO_LOCAL_TIME),
        mobilePhone.getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("23:59:59").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[0].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("15:59:59").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[1].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("19:59:59").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[2].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("10:59:59").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[3].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("01:59:59").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[4].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
  }

  @Test
  void setPhoneTimeTo120000() {
    hotel.setPhoneTime(LocalTime.parse("12:00:00", DateTimeFormatter.ISO_LOCAL_TIME));
    Clock[] clocks = hotel.getClocks();
    Phone mobilePhone = hotel.getMobilePhone();
    Assertions.assertEquals(
        LocalTime.parse("12:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        mobilePhone.getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("12:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[0].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("04:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[1].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("08:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[2].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("23:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[3].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
    Assertions.assertEquals(
        LocalTime.parse("14:00:00").format(DateTimeFormatter.ISO_LOCAL_TIME),
        clocks[4].getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
  }
}

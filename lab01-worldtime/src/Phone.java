import java.time.LocalTime;

public class Phone {
  private LocalTime time;
  private TimeZone zone;

  public Phone(TimeZone zone) {
    this.time=LocalTime.now();
    this.zone = TimeZone.BEIJING;
  }

  public void setTime(LocalTime time) {
    this.time = time;
  }

  public LocalTime getTime() {
    return time;
  }

  public TimeZone getZone() {
    return zone;
  }
}

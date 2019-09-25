import java.time.LocalTime;

public class Clock {
  private LocalTime time;
  private TimeZone zone;

  public Clock(TimeZone zone) {
    this.zone = zone;
    this.time = LocalTime.of(0, 0, 0);
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

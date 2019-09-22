public enum TimeZone {
  LONDON("London", 0),
  BEIJING("Beijing", 8),
  MOSCOW("Moscow", 4),
  SYDNEY("Sydney", 10),
  NEWYORK("New York", -5);
  private String location;
  private int timezone;

  TimeZone(String location, int timezone) {
    this.location = location;
    this.timezone = timezone;
  }

  public String getLocation() {
    return location;
  }

  public int getTimezone() {
    return timezone;
  }
}

import java.time.LocalTime;

public class Hotel {
  private Clock[] clocks;
  private Phone mobilePhone;

  public Hotel() {
    this.clocks = new Clock[5];
    this.clocks[0]=new Clock(TimeZone.BEIJING);
    this.clocks[1]=new Clock(TimeZone.LONDON);
    this.clocks[2]=new Clock(TimeZone.MOSCOW);
    this.clocks[3]=new Clock(TimeZone.NEWYORK);
    this.clocks[4]=new Clock(TimeZone.SYDNEY);
    this.mobilePhone = new Phone(TimeZone.BEIJING);
  }

  public void setPhoneTime(LocalTime time)
  {
    mobilePhone.setTime(time);
    for(Clock temp:clocks)
    {
      temp.setTime(time.plusHours(temp.getZone().getTimezone()-mobilePhone.getZone().getTimezone()));
    }
  }
}

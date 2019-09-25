package beams;

public class DateRangeBean {
  Boolean ongoing = false;
  String startDate;
  String endDate;
  String startTime;
  String endTime;


  public Boolean getOngoing() {
    return ongoing;
  }

  public void setOngoing(Boolean ongoing) {
    this.ongoing = ongoing;
  }

  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate == null ? null : startDate.trim();
  }

  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate == null ? null : endDate.trim();
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime == null ? null : startTime.trim();
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime == null ? null : endTime.trim();
  }

}

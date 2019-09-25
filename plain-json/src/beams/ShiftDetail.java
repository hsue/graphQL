package beams;

import java.util.Date;

/**
 * Created by hsue on 8/26/19.
 */
public class ShiftDetail {
  private Integer id;
  private String name;
  private Date date;
  private String startTime;
  private String endTime;
  private Integer volNeeded;
  private String notes;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public Integer getVolNeeded() {
    return volNeeded;
  }

  public void setVolNeeded(Integer volNeeded) {
    this.volNeeded = volNeeded;
  }

  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

}


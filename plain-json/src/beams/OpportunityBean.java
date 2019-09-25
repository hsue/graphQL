package beams;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by jrackwitz on 9/8/17.
 */
public class OpportunityBean {
  Integer id;

  public enum OppType {PUBLIC,PRIVATE,PROJECT,NONVM,SHIFT;}

  String type = "public";

  String title;

  String description;

  DateRangeBean dateRanges;

  String updateDate;

  String renewal;

  ArrayList<String> categories = null;

  Integer volunteersNeeded;

  ArrayList<String> skills = null;

  String organizationUrl;

  OrganizationDetail parentOrg;

  String url;

  Set<ShiftDetail> shifts;

  LocationDetail location;

  public OpportunityBean() {
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ArrayList<String> getCategories() {
    return categories;
  }

  public void setCategories(ArrayList<String> categories) {
    this.categories = categories;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getVolunteersNeeded() {
    return volunteersNeeded;
  }

  public void setVolunteersNeeded(Integer volunteersNeeded) {
    this.volunteersNeeded = volunteersNeeded;
  }

  public ArrayList<String> getSkills() {
    return skills;
  }

  public void setSkills(ArrayList<String> skills) {
    this.skills = skills;
  }

  public String getOrganizationUrl() {
    return organizationUrl;
  }

  public void setOrganizationUrl(String organizationUrl) {
    this.organizationUrl = organizationUrl;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }

  public Set<ShiftDetail> getShifts() {
    return shifts;
  }

  public void setShifts(Set<ShiftDetail> shifts) {
    this.shifts = shifts;
  }
  public LocationDetail getLocation() {
    return location;
  }

  public void setLocation(LocationDetail location) {
    this.location = location;
  }

  public DateRangeBean getDateRanges() {
    return dateRanges;
  }

  public void setDateRanges(DateRangeBean dateRanges) {
    this.dateRanges = dateRanges;
  }
  public OrganizationDetail getParentOrg() {
    return parentOrg;
  }

  public void setParentOrg(OrganizationDetail parentOrg) {
    this.parentOrg = parentOrg;
  }
}

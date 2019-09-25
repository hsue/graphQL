package beams;


import java.util.ArrayList;

/**
 * Created by jrackwitz on 6/21/17.
 */
public class OrganizationDetail {

  Integer id;

  String name;

  String mission;

  String description;

  LocationDetail location;

  String phoneNumber;

  String ein;

  ArrayList<Integer> categoryIds = new ArrayList<>();

  String url;

  String imageUrl;

  public OrganizationDetail() {
  }

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
    this.name = name.trim();
  }

  public String getMission() {
    return mission;
  }

  public void setMission(String mission) {
    this.mission = mission.trim();
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description.trim();
  }

//  public ContactDetail getContact() {
//    return contact;
//  }
//
//  public void setContact(ContactDetail contact) {
//    this.contact = contact;
//  }

  public LocationDetail getLocation() {
    return location;
  }

  public void setLocation(LocationDetail location) {
    this.location = location;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber.trim();
  }

  public String getEin() {
    return ein;
  }

  public void setEin(String ein) {
    this.ein = ein.trim();
  }

  public ArrayList<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(ArrayList<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
}

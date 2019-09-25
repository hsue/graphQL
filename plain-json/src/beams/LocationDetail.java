package beams;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jrackwitz on 6/21/17.
 */
public class LocationDetail {
  String street1;

  String street2;

  String city;

  String region;

  String postalCode;

  String country;

  Boolean hideMap = false;

  Boolean virtual = false;

  public Boolean getVirtual() {
    return virtual;
  }

  public void setVirtual(Boolean virtual) {
    this.virtual = virtual;
  }

  public Boolean getHideMap() {
    return hideMap;
  }

  public void setHideMap(Boolean hideMap) {
    this.hideMap = hideMap;
  }

  public String getStreet1() {
    return street1;
  }

  public void setStreet1(String street1) {
    this.street1 = street1;;
  }

  public String getStreet2() {
    return street2;
  }

  public void setStreet2(String street2) {
    this.street2 = street2;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country == null ? null : country.toUpperCase();
  }
  
  private void buildAddress(StringBuffer location, String part) {
    if(location.length() > 0) {
      location.append(" ");
    }
    location.append(part);
  }
  public Map<String, Object> toMap() {
    Map locationMap = new HashMap();
    locationMap.put("street1", street1);
    locationMap.put("street2", street2);
    locationMap.put("city", city);
    locationMap.put("region", region);
    locationMap.put("postalCode", postalCode);
    locationMap.put("country", country);
    locationMap.put("hideMap", hideMap);

    return locationMap;
  }
}

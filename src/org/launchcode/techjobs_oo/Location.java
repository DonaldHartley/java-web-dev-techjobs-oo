package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location extends JobField{
  private int id;
  private static int nextId = 1;
  private String value;
  
  public Location(String aValue) {
    super(aValue);
    id = nextId;
    nextId++;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Location)) return false;
    Location location = (Location) o;
    return getId() == location.getId();
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
  
  public int getId() {
    return id;
  }
  
}

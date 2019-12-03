package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType extends JobField {
  private int id;
  private static int nextId = 1;
  private String value;
  
  public PositionType(String aValue) {
    super(aValue);
    id = nextId;
    nextId++;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PositionType that = (PositionType) o;
    return id == that.id;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
  
  public int getId() {
    return id;
  }
  
}

package org.launchcode.techjobs_oo;

public abstract class JobField {
  private String value;
  
  public JobField(String aValue){
    if ("".equals(aValue)){
      value = "Data not available";
    } else {
      value = aValue;
    }
    
  }
  
  public String getValue() {
    return value;
  }
  
  public void setValue(String value) {
    this.value = value;
  }
  
  @Override
  public String toString() {
    return value;
  }
  
}

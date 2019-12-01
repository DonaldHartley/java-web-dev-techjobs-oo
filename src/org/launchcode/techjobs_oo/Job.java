package org.launchcode.techjobs_oo;

import java.lang.reflect.Field;
import java.util.Objects;

public class Job {
  
  private int id;
  private static int nextId = 1;
  
  private String name;
  private Employer employer;
  private Location location;
  private PositionType positionType;
  private CoreCompetency coreCompetency;

  public Job() {
    id = nextId;
    nextId++;
  }
  
  public Job(String aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
    this();
    name = aName;
    employer = aEmployer;
    location = aLocation;
    positionType = aPositionType;
    coreCompetency = aCoreCompetency;
  }
  
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Job job = (Job) o;
    return id == job.id;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
  
  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public Employer getEmployer() {
    return employer;
  }
  
  public void setEmployer(Employer employer) {
    this.employer = employer;
  }
  
  public Location getLocation() {
    return location;
  }
  
  public void setLocation(Location location) {
    this.location = location;
  }
  
  public PositionType getPositionType() {
    return positionType;
  }
  
  public void setPositionType(PositionType positionType) {
    this.positionType = positionType;
  }
  
  public CoreCompetency getCoreCompetency() {
    return coreCompetency;
  }
  
  public void setCoreCompetency(CoreCompetency coreCompetency) {
    this.coreCompetency = coreCompetency;
  }
  
  @Override
  public String toString() {
    String stringToReturn;
    if (name==null){
      stringToReturn = "OOPS! This job does not seem to exist.";
      System.out.println(name instanceof String);
      return stringToReturn;
    }
    
    if (name=="") {
      name="Data not available";
    }
    if (employer.getValue()=="") {
      employer.setValue("Data not available");
    }
    if (location.getValue()=="") {
      location.setValue("Data not available");
    }
    if (positionType.getValue()=="") {
      positionType.setValue("Data not available");
    }
    if (coreCompetency.getValue()=="") {
      coreCompetency.setValue("Data not available");
    }
    
    stringToReturn = "\n" +
        "ID: " + id + "\n" +
        "Name: " + name + "\n" +
        "Employer: " + employer + "\n" +
        "Location: " + location + "\n" +
        "Position Type: " + positionType + "\n" +
        "Core Competency: " + coreCompetency + "\n";
    
    return stringToReturn;
  }
}

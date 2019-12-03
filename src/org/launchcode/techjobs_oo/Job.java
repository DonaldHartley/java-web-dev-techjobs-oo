package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {
  private int id;
  private static int nextId = 1;
  private Name name;
  private Employer employer;
  private Location location;
  private PositionType positionType;
  private CoreCompetency coreCompetency;

  public Job() {
    id = nextId;
    nextId++;
  }
  
  public Job(Name aName, Employer aEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency){
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
  
  public Name getName() {
    return name;
  }
  
  public void setName(Name aName) {
    name = aName;
  }
  
  public Employer getEmployer() {
    return employer;
  }
  
  public void setEmployer(Employer aEmployer) {
    employer = aEmployer;
  }
  
  public Location getLocation() {
    return location;
  }
  
  public void setLocation(Location aLocation) {
    location = aLocation;
  }
  
  public PositionType getPositionType() {
    return positionType;
  }
  
  public void setPositionType(PositionType aPositionType) {
    positionType = aPositionType;
  }
  
  public CoreCompetency getCoreCompetency() {
    return coreCompetency;
  }
  
  public void setCoreCompetency(CoreCompetency aCoreCompetency) {
    coreCompetency = aCoreCompetency;
  }
  
  @Override
  public String toString() {
    String stringToReturn;
    
    stringToReturn = "\n" +
        "ID: " + id + "\n" +
        "Name: " + name + "\n" +
        "Employer: " + employer + "\n" +
        "Location: " + location + "\n" +
        "Position Type: " + positionType + "\n" +
        "Core Competency: " + coreCompetency + "\n";
  
    if (name==null){
      stringToReturn = "OOPS! This job does not seem to exist.";
    }
    
    return stringToReturn;
  }
}

package org.launchcode.techjobs_oo.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
  private Job testJobObjA;
  private Job testJobObjB;
  private Job testJobCompleteListingA;
  private Job testJobCompleteListingB;
  private Job testJobIncompleteListingA;
  private Job testJobIncompleteListingB;
  
  @Before
  public void createTestObjs() {
    testJobObjA = new Job();
    testJobObjB = new Job();
  }
  
  @Test
  public void testSettingJobId(){
    assertTrue(testJobObjA.getId()>=1);
  }
  
  @Test
  public void testUniqueJobIds(){
    assertNotEquals(testJobObjA.getId(),testJobObjB.getId());
  }
  
  @Test
  public void testJobIdIteration(){
    assertEquals(testJobObjA.getId()+1, testJobObjB.getId());
  }
  
  @Before
  public void createCompeteJobListing() {
    testJobCompleteListingA = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobCompleteListingB = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobIncompleteListingA = new Job("" ,new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobIncompleteListingB = new Job();
  }
  
  @Test
  public void testJobConstructorSetsAllFields(){
    assertTrue(testJobCompleteListingA.getName() instanceof String);
    assertTrue(testJobCompleteListingA.getEmployer() instanceof Employer);
    assertTrue(testJobCompleteListingA.getLocation() instanceof Location);
    assertTrue(testJobCompleteListingA.getPositionType() instanceof PositionType);
    assertTrue(testJobCompleteListingA.getCoreCompetency() instanceof CoreCompetency);
  }
  
  @Test
  public void testJobsForEquality(){
    assertFalse(testJobCompleteListingA.equals(testJobCompleteListingB));
  }
  
  @Test
  public void testCompleteToString(){
    assertEquals("\nID: "+testJobCompleteListingA.getId()+"\n" +
        "Name: "+testJobCompleteListingA.getName()+"\n" +
        "Employer: "+testJobCompleteListingA.getEmployer()+"\n" +
        "Location: "+testJobCompleteListingA.getLocation()+"\n" +
        "Position Type: "+testJobCompleteListingA.getPositionType()+"\n" +
        "Core Competency: "+testJobCompleteListingA.getCoreCompetency()+"\n",
        testJobCompleteListingA.toString());
  }
  
  @Test
  public void testPartiallyIncompleteToString(){
    assertEquals("\nID: "+testJobIncompleteListingA.getId()+"\n" +
            "Name: Data not available\n" +
            "Employer: "+testJobIncompleteListingA.getEmployer()+"\n" +
            "Location: "+testJobIncompleteListingA.getLocation()+"\n" +
            "Position Type: "+testJobIncompleteListingA.getPositionType()+"\n" +
            "Core Competency: "+testJobIncompleteListingA.getCoreCompetency()+"\n",
        testJobIncompleteListingB.toString());
  }
  
  @Test
  public void testTotallyIncompleteToString(){
    assertEquals("OOPS! This job does not seem to exist.", testJobIncompleteListingB.toString());
}
  
}

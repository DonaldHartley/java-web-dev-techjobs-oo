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
  private Job testJobIncompleteListingC;
  
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
    testJobCompleteListingA = new Job(new Name ("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobCompleteListingB = new Job(new Name ("Product tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobIncompleteListingA = new Job(new Name (""),new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobIncompleteListingB = new Job(new Name ("Product tester"),new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    testJobIncompleteListingC = new Job();
  }
  
  @Test
  public void testJobConstructorSetsAllFields(){
    assertTrue(testJobCompleteListingA.getName() instanceof Name);
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
  public void testPartiallyIncompleteToStringA(){
    assertEquals("\nID: "+testJobIncompleteListingA.getId()+"\n" +
            "Name: Data not available\n" +
            "Employer: "+testJobIncompleteListingA.getEmployer()+"\n" +
            "Location: "+testJobIncompleteListingA.getLocation()+"\n" +
            "Position Type: "+testJobIncompleteListingA.getPositionType()+"\n" +
            "Core Competency: "+testJobIncompleteListingA.getCoreCompetency()+"\n",
        testJobIncompleteListingA.toString());
  }
  
  @Test
  public void testPartiallyIncompleteToStringB(){
    assertEquals("\nID: "+testJobIncompleteListingB.getId()+"\n" +
            "Name: "+testJobIncompleteListingB.getName()+"\n" +
            "Employer: Data not available\n" +
            "Location: "+testJobIncompleteListingB.getLocation()+"\n" +
            "Position Type: "+testJobIncompleteListingB.getPositionType()+"\n" +
            "Core Competency: "+testJobIncompleteListingB.getCoreCompetency()+"\n",
        testJobIncompleteListingB.toString());
  }
  
  @Test
  public void testTotallyIncompleteToString(){
    assertEquals("OOPS! This job does not seem to exist.", testJobIncompleteListingC.toString());
  }
  
}

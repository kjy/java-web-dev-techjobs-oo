package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class JobTest {

    Job myjob1;
    Job myjob2;
    Job myjob3;
    Job myjob4;
    Job myjob5;
    Job myjob6;
    Job myjob7;


    @Before

    @Test  // Test the empty constructor
    public void testSettingJobId() {
        myjob1 = new Job();
        myjob2 = new Job();

        // Use assertEquals, assertTrue, or assertFalse to test that the ID values
        // for the two objects are NOT the same and differ by 1.
        assertEquals(myjob1.getId(), myjob2.getId(), 1);
        assertTrue(myjob2.getId() - myjob1.getId() == 1);
        assertFalse(myjob2.getId() - myjob1.getId() != 1);
    }
    @Test
    public void testJobConstructorSetsAllFields() { // test that the constructor correctly assigns the class and value of each field.
       myjob3 =  new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       // objectName instanceof ClassName

       assertTrue(myjob3.getEmployer() instanceof Employer);
       assertTrue(myjob3.getLocation() instanceof Location);
       assertTrue(myjob3.getPositionType() instanceof PositionType);
       assertTrue(myjob3.getCoreCompetency() instanceof CoreCompetency);

       assertEquals(myjob3.getEmployer().getValue(), "ACME");
       assertEquals(myjob3.getLocation().getValue(), "Desert");
       assertEquals(myjob3.getPositionType().getValue(), "Quality control");
       assertEquals(myjob3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        myjob4 =  new Job("Software Engineer", new Employer("ABC"), new Location("New York"), new PositionType("Quality control"), new CoreCompetency("Reviewer"));
        myjob5 =  new Job("Software Engineer", new Employer("ABC"), new Location("New York"), new PositionType("Quality control"), new CoreCompetency("Reviewer"));
        assertFalse(myjob4.getId() == myjob5.getId());
    }

    @ Test
    public void testToString() {
        Job job6 = new Job("", new Employer("Ben&Jerry's"), new Location(""), new PositionType("UX"), new CoreCompetency("Taste"));
        Job job7 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("Ben&Jerry's", job6.getEmployer().toString());

    }

}

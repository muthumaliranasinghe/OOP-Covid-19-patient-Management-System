/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdf.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;



public class PatientListTest
{
	private PatientList patientList;

	public PatientListTest() {}

    /**
     *
     * @throws Exception
     */
    @BeforeClass
   public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        patientList= new PatientList();
    }

    @After
    public void tearDown() {
    }

   /**
     * Test case for add, getAll, getCount methods of class PatientList.
     */
    @Test
    public void testAddGetAllGetCount() {
		Patient patient1 = new Patient();
		Patient patient2 = new Patient();
		patient1.setNumber("P123");
		patient2.setNumber("P345");
		testInvariant();
		patientList.add(patient1);
		testInvariant();
		patientList.add(patient2);
		testInvariant();
		List<Patient> patients = patientList.getAll();
		assertTrue("patient1 missing", patients.contains(patient1));
		assertTrue("patient2 missing", patients.contains(patient2));
		assertTrue("count error", patientList.getCount() == 2);
    }

    /**
     * Test of invariant method, of class PatientList.
     */
    @Test
    public void testInvariant() {
		assertTrue("patientList is null",patientList.invariant());
    }

    private void assertTrue(String count_error, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
    }
}




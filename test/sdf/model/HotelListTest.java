

package sdf.model;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import sdf.model.HotelList;
import sdf.model.Hotel;



public class HotelListTest
{
	private HotelList hotelList;

	public HotelListTest() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        hotelList= new HotelList();
    }

    @After
    public void tearDown() {
    }

   /**
     * Test case for add, getAll, getCount methods of class PatientList.
     */
    @Test
    public void testAddGetAllGetCount() {
		Hotel hotel1 = new Hotel();
		Hotel hotel2 = new Hotel();
		hotel1.setNumber("P123");
		hotel2.setNumber("P345");
		testInvariant();
		hotelList.add(hotel1);
		testInvariant();
		hotelList.add(hotel2);
		testInvariant();
		List<Hotel> hotels = hotelList.getAll();
		assertTrue("patient1 missing", hotels.contains(hotel1));
		assertTrue("patient2 missing", hotels.contains(hotel2));
		assertTrue("count error", hotelList.getCount() == 2);
    }

    /**
     * Test of invariant method, of class PatientList.
     */
    @Test
    public void testInvariant() {
		assertTrue("patientList is null",hotelList.invariant());
    }

    private void assertTrue(String count_error, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Test of add method, of class HotelList.
     */
    @Test
    public void testAdd() {
    }

    /**
     * Test of getAll method, of class HotelList.
     */
    @Test
    public void testGetAll() {
    }

    /**
     * Test of getCount method, of class HotelList.
     */
    @Test
    public void testGetCount() {
    }

}
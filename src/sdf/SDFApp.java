package sdf;
import sdf.view.*;
import sdf.model.*;
import sdf.controller.*;
import javax.swing.JTabbedPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;

/**
 * Stay at Dedicated Facilities (SDF) accommondation System
 * <p>
 * The main class to run
 *
 * @version 1.0
 * @since   2021-06-06
 */
public class SDFApp extends JFrame
{

    public SDFApp ()
    {
		super("Stay at Dedicated Facilities (SDF) accommondation System");
		PatientList patientList;
		PatientController patientController;
		View patientView;

		HotelList hotelList;
		HotelController hotelController;
		View hotelView;

		//AllocationList allocationList;
		//AllocationtController allocationController;
    	//View allocationtView;

		this.setFont(View.generalFont);

    	patientList = new PatientList();
    	patientController = new PatientController();
    	patientController.setModel(patientList);
    	patientView = new PatientView(patientList, patientController);

      	hotelList = new HotelList();
      	hotelController = new HotelController();
      	hotelController.setModel(hotelList);
    	hotelView = new HotelView(hotelList, hotelController);

      	//allocationList = new AllocationList();
      	//allocationController = new AllocationController();
      	//allocationController.setModel(allocationList);
    	//allocationtView = new AllocationtView(allocationList, allocationController);

  		JTabbedPane tabbedPane = new JTabbedPane();
  	    tabbedPane.setFont(View.generalFont);
  	   tabbedPane.addTab("Patient Management", patientView);
  	    tabbedPane.addTab("Hotel Management",hotelView);
  	    //tabbedPane.addTab("Allocation Management", new JPanel());

  	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	    getContentPane().add(tabbedPane);
  	    pack();
  	    setVisible(true);
    }

    /**
	* The main program for the Online Allocationing System (sdf)
	*
	* @param args
	*	command line arguments
	* @post. SDF is launched
	*/
    public static void main (String[] args)
    {
    	   new SDFApp();
    }
}

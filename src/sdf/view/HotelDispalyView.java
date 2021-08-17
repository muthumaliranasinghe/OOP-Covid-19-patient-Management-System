/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdf.view;

import sdf.view.View;
import sdf.model.Hotel;
import sdf.model.HotelList;
import sdf.controller.HotelController;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import sdf.controller.HotelController;
import sdf.model.Hotel;
import sdf.model.HotelList;
public class HotelDispalyView extends View  {//create view
    private JPanel content;
    private final static int SIZE=20;
    private JLabel numberLabel = new JLabel("Hotel-No");//title of hotel number text box
    private JLabel nameLabel = new JLabel("Hotel-Name");
    private JLabel locationofhotelLabel = new JLabel("LOcation_Of_Hotel");
    private JLabel numberofroomsavailableLabel = new JLabel("Number_Of_Roomsavailable");
    private JLabel countLabel = new JLabel("Count");
    private JTextField countTextField = new JTextField(SIZE);

    public HotelDispalyView(HotelList model, HotelController controller)
    {
        super (model, controller);
        setLayout(new BorderLayout());
        displayContent();
        add(countLabel, BorderLayout.WEST);
        add(countTextField, BorderLayout.EAST);
        displayCount();
	}

	public void displayContent()
	{
		HotelList model = (HotelList)getModel();//display hotel view data
		content = new JPanel();
		content.setLayout(new GridLayout(0,4));
		content.add(numberLabel);
		content.add(nameLabel);
		content.add(locationofhotelLabel);
		content.add(numberofroomsavailableLabel);
		JTextField tf;

		for (Hotel h:  model.getAll())
		{

			tf = new JTextField(SIZE);
			tf.setText(h.getNumber());
			content.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(h.getName());
			content.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(""+h.getlocationofhotel());
			content.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(h.getNumberofroomsavailable ());
			content.add(tf);

			
       	}
       	add(content, BorderLayout.NORTH);
    }

    public void displayCount()
    {
		countTextField.setText(""+getModel().getCount());
	}

    @Override
	public void update(String messageId)
  	{
		remove(content);
		displayContent();
		displayCount();
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.pack();
        topFrame.repaint();
    }
    
}

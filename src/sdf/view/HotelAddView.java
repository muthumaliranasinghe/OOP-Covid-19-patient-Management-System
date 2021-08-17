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
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HotelAddView extends View {
    private final static int SIZE=20;
    private JTextField numberField = new JTextField("Hotel-No");
    private JTextField nameField = new JTextField("Hotel-Name");
    private JTextField locationofhotelField = new JTextField("LOcation_Of_Hotel");
    private JTextField numberofroomsavailableField = new JTextField("Number_Of_Roomsavailable");
    private JTextField countTextField = new JTextField(SIZE);


    private JLabel numberLabel = new JLabel("Hotel-No");
    private JLabel nameLabel = new JLabel("Hotel-Name");
    private JLabel locationofhotelLabel = new JLabel("LOcation_Of_Hotel");
    private JLabel numberofroomsavailableLabel = new JLabel("Number_Of_Roomsavailable");
    private JButton addButton = new JButton ("Add hotel");
    private JButton resetButton = new JButton ("Reset hotel");

    public HotelAddView(HotelList model, HotelController controller)
    {
        super (model, controller);
        setLayout(new GridLayout(0,2));
        add(numberLabel); add(numberField);
        add(nameLabel); add(nameField);
        add(locationofhotelLabel); add(locationofhotelField);
        add(numberofroomsavailableLabel); add(numberofroomsavailableField);
        add(addButton); add(resetButton);
        resetButton.addActionListener (
					new ActionListener ()
					{
                                                @Override
						public void actionPerformed (ActionEvent e)
						{
							numberField.setText("");
							nameField.setText("");
							locationofhotelField.setText("");
							numberofroomsavailableField.setText("");
							
                                                        
						}
					}
				);
		addButton.addActionListener (
					new ActionListener ()
					{
						public void actionPerformed (ActionEvent e)
						{
							String number = numberField.getText();
							String name = nameField.getText();
							String locationofhotel = locationofhotelField.getText();
							String numberofroomsavailable = numberofroomsavailableField.getText();
							Hotel h = new Hotel();
							h.setNumber(number);
							h.setName(name);
							h.setLocationofhotel(locationofhotel);
							h.setNumberofroomsavailable (numberofroomsavailable);
							HotelController controller = (HotelController) getController();
							controller.addHotel(h);
							System.out.println(""+h+" added to hotelList");
						}
					}
				);
    }
}


    
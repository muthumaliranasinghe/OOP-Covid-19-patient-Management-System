package sdf.view;

import sdf.view.View;
import sdf.model.Patient;
import sdf.model.PatientList;
import sdf.controller.PatientController;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientAddView  extends View {
    private final static int SIZE=20;
    private JTextField numberField = new JTextField("p001", SIZE);
    private JTextField nameField = new JTextField("Patient-Name", SIZE);
    private JTextField icNoField = new JTextField("IC-No", SIZE);
    private JTextField countryOfOriginField = new JTextField("Country-Of-Origin", SIZE);
    private JTextField dateOfAdmissionField = new JTextField("Date-Of-Admission", SIZE);
    private JTextField emailField = new JTextField("Email", SIZE);
    private JTextField mobilenumberField = new JTextField("Mobilenumber", SIZE);

    private JLabel numberLabel = new JLabel("Patient-Number");
    private JLabel nameLabel = new JLabel("Patient-Name");
    private JLabel icNoLabel = new JLabel("IC-No");
    private JLabel countryOfOriginLabel = new JLabel("Country-Of-Origin");
    private JLabel dateOfAdmissionLabel = new JLabel("Date-Of-Admission");
    private JLabel emailLabel = new JLabel("Email");
    private JLabel mobilenumberLabel = new JLabel("Mobilenumber");
    private JButton addButton = new JButton ("Add Patient");
    private JButton resetButton = new JButton ("Reset Patient");

    public PatientAddView(PatientList model, PatientController controller)
    {
        super (model, controller);
        setLayout(new GridLayout(0,2));
        add(numberLabel); add(numberField);
        add(nameLabel); add(nameField);
        add(icNoLabel); add(icNoField);
        add(countryOfOriginLabel); add(countryOfOriginField);
        add(dateOfAdmissionLabel); add(dateOfAdmissionField);
        add(emailLabel); add(emailField);
        add(mobilenumberLabel);add(mobilenumberField);
        add(addButton); add(resetButton);
        resetButton.addActionListener (
					new ActionListener ()
					{
						public void actionPerformed (ActionEvent e)
						{
							numberField.setText("");
							nameField.setText("");
							icNoField.setText("");
							countryOfOriginField.setText("");
							dateOfAdmissionField.setText("");
                                                        emailField.setText("");
                                                        mobilenumberField.setText("");
                                                        
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
							String icNo = icNoField.getText();
							String countryOfOrigin = countryOfOriginField.getText();
							String dateOfAdmission = dateOfAdmissionField.getText();
                                                        String email = emailField.getText();
							String mobilenumber = mobilenumberField.getText();
							Patient p = new Patient();
							p.setNumber(number);
							p.setName(name);
							p.setIcNo(icNo);
							p.setCountryOfOrigin(countryOfOrigin);
							p.setDateOfAdmission(dateOfAdmission);
                                                        p.setEmail(email);
							p.setMobilenumber(mobilenumber);
							PatientController controller = (PatientController) getController();
							controller.addPatient(p);
							System.out.println(""+p+" added to patientList");
						}
					}
				);
    }
}

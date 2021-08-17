package sdf.view;

import sdf.view.View;
import sdf.model.Patient;
import sdf.model.PatientList;
import sdf.controller.PatientController;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;





public class PatientDisplayView  extends View {
    private JPanel contents;
    private final static int SIZE=20;
    private JLabel numberLabel = new JLabel("Patient-No");
    private JLabel nameLabel = new JLabel("Patient-Name");
    private JLabel icNoLabel = new JLabel("IC-No");
    private JLabel countryOfOriginLabel = new JLabel("Country-Of-Origin");
    private JLabel dateOfAdmissionLabel = new JLabel("Date-Of-Admission");
    private JLabel emailLabel = new JLabel("Email");
    private JLabel mobilenumberLabel = new JLabel("Mobilenumber");
    private JLabel countLabel = new JLabel("Count");
    private JTextField countTextField = new JTextField(SIZE);

    public PatientDisplayView(PatientList model, PatientController controller)
    {
        super (model, controller);
        setLayout(new BorderLayout());
        displayContents();
        add(countLabel, BorderLayout.WEST);
        add(countTextField, BorderLayout.EAST);
        displayCount();
	}

	public void displayContents()
	{
		PatientList model = (PatientList)getModel();
		contents = new JPanel();
		contents.setLayout(new GridLayout(0,7));
		contents.add(numberLabel);
		contents.add(nameLabel);
		contents.add(icNoLabel);
		contents.add(countryOfOriginLabel);
		contents.add(dateOfAdmissionLabel);
                contents.add(emailLabel);
                contents.add(mobilenumberLabel);
		JTextField tf;

		for (Patient p:  model.getAll())
		{

			tf = new JTextField(SIZE);
			tf.setText(p.getNumber());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(p.getName());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(""+p.getIcNo());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(p.getCountryOfOrigin());
			contents.add(tf);

			tf = new JTextField(SIZE);
			tf.setText(p.getDateOfAdmission());
			contents.add(tf);
                        
                        tf = new JTextField(SIZE);
			tf.setText(p.getEmail());
			contents.add(tf);
                        
                        tf = new JTextField(SIZE);
			tf.setText(p.getMobilenumber());
			contents.add(tf);
       	}
       	add(contents, BorderLayout.NORTH);
    }

    public void displayCount()
    {
		countTextField.setText(""+getModel().getCount());
	}

	public void update(String messageId)
  	{
		remove(contents);
		displayContents();
		displayCount();
        JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        topFrame.pack();
        topFrame.repaint();
    }
}

package sdf.view;
import sdf.view.View;
import sdf.view.PatientAddView;
import sdf.view.PatientDisplayView;
import sdf.model.PatientList;
import sdf.controller.PatientController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PatientView  extends View
{
    private JButton addButton = new JButton ("Add Panel");
    private JButton displayButton = new JButton ("Display Panel");
    private PatientAddView addView;
    private PatientDisplayView displayView;

    private JPanel cards = new JPanel(new CardLayout());
    private JPanel buttons = new JPanel();
    private static final String ADD = "ADD";
    private static final String DISPLAY = "DISPLAY";

    public PatientView(PatientList model, PatientController controller)
    {
		super (model, controller);
		addView=new PatientAddView(model,controller);
		displayView=new PatientDisplayView(model,controller);
		buttons.add(addButton);
		buttons.add(displayButton);

        // Set Button Font
		addButton.setFont(View.btnFont);
		displayButton.setFont(View.btnFont);

        setLayout(new BorderLayout());
        add(buttons, BorderLayout.NORTH);
		add(new JLabel(""), BorderLayout.CENTER);
		cards.add(displayView, DISPLAY);
		cards.add(addView, ADD);
		add(cards, BorderLayout.SOUTH);

		showAddView();

        addButton.addActionListener(
					new ActionListener ()
	 				{
						public void actionPerformed (ActionEvent e)
						{
							showAddView();
						}
					}
		);

       	displayButton.addActionListener(
					new ActionListener ()
	 				{
						public void actionPerformed (ActionEvent e)
						{
							showDisplayView();
						}
					}
		);
	}

	private void showAddView()
	{
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, ADD);
	}

	private void showDisplayView()
	{
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, DISPLAY);
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdf.view;


import sdf.view.View;
import sdf.view.HotelAddView;
import sdf.view.HotelDispalyView;
import sdf.view.HotelExitView;
import sdf.model.HotelList;
import sdf.controller.HotelController;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

 

public class HotelView  extends View
{
    private JButton addButton = new JButton ("Add Panel");
    private JButton displayButton = new JButton ("Display Panel");
    private JButton exitButton = new JButton ("Exit");
    private HotelAddView addView;
    private HotelDispalyView displayView;
     //private HotelExitView exitView;

    private JPanel cards = new JPanel(new CardLayout());
    private JPanel buttons = new JPanel();
    private static final String ADD = "ADD";
    private static final String DISPLAY = "DISPLAY";
    //private static final String EXIT = "EXIT";

    public HotelView(HotelList model, HotelController controller)
    {
		super (model, controller);
		addView=new HotelAddView(model,controller);
		displayView=new HotelDispalyView(model,controller);
                //exitView=new HotelExitView(model,controller);
		buttons.add(addButton);
		buttons.add(displayButton);
               // buttons.add(exitButton);

        // Set Button Font
		addButton.setFont(View.btnFont);
		displayButton.setFont(View.btnFont);
                exitButton.setFont(View.btnFont);

        setLayout(new BorderLayout());
        add(buttons, BorderLayout.NORTH);
		add(new JLabel(""), BorderLayout.CENTER);
		cards.add(displayView, DISPLAY);
		cards.add(addView, ADD);
                //cards.add(exitView, EXIT);
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
//        exitButton.addActionListener(
//					new ActionListener ()
//	 				{
//						public void actionPerformed (ActionEvent e)
//						{
//							showExitView();
//						}
//					}
//		);
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
//        private void showExitView()
//	{
//		CardLayout cl = (CardLayout)(cards.getLayout());
//		cl.show(cards, EXIT);
//	}
}

    


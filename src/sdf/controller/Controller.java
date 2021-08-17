package sdf.controller;

import sdf.model.Model;
import sdf.view.View;


public class Controller
{
    private Model model;
    private View view;

    public Controller ()
    {
    }

    public void setModel(Model model)
    {
		this.model=model;
    }

    public void setView(View view)
    {
		this.view=view;
    }

    public Model getModel()
    {
		return model;
    }

    public View getView()
    {
		return view;
    }

}

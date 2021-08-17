package sdf.controller;

import sdf.model.Patient;
import sdf.model.PatientList;

public class PatientController extends Controller
{
    public PatientController ()
    {
    }

    public void addPatient(Patient p)
    {
        PatientList model = (PatientList)getModel();
        model.add(p);
    }
}



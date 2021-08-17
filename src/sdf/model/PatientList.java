package sdf.model;
import java.util.List;
import java.util.ArrayList;


public class PatientList extends Model
{

    private List<Patient> patients = new ArrayList<Patient>();//using java arry list we can get store data

    public void add(Patient p)
    {
        patients.add(p);
        notifyObserver();
    }

    public List<Patient> getAll()
    {
        return patients;
    }

    public int getCount()
    {
		return patients.size();
	}

	public boolean invariant(){
	    return patients != null;
    }
}



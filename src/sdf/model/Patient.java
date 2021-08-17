package sdf.model;

public class Patient
{
    private String number;
    private String name;
    private String icNo;
    private String countryOfOrigin ;
    private String dateOfAdmission;
    private String email;
    private String mobilenumber;


    public Patient()
    {
    }

    public Patient(String number)
    {
        this.number=number;
    }

    public void setNumber(String number)
    {
        this.number=number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }

    public void setCountryOfOrigin (String countryOfOrigin )
    {
        this.countryOfOrigin = countryOfOrigin ;
    }

    public String getCountryOfOrigin ()
    {
        return countryOfOrigin ;
    }

    public void setDateOfAdmission(
 				String dateOfAdmission)
    {
        this.dateOfAdmission=dateOfAdmission;
    }

    public String getDateOfAdmission()
    {
        return dateOfAdmission;
    }

    public void setIcNo(String icNo)
    {
        this.icNo=icNo;
    }

    public String getIcNo()
    {
        return icNo;
    }
    
    public void setEmail(String email)
    {
        this.email=email;
    }

    public String getEmail()
    {
        return email;
    }
    public void setMobilenumber(String mobilenumber)
    {
        this.mobilenumber=mobilenumber;
    }

    public String getMobilenumber()
    {
        return mobilenumber;
    }

    public String toString()
    {
	   String s; 		// should use StringBuffer
	   s = "Patient[";
	   s = s+"number="+number+", ";
	   s = s+"name="+name+", ";
	   s = s+"icNo="+icNo+", ";
	   s = s+"countryOfOrigin ="+countryOfOrigin +", ";
	   s = s+"dateOfAdmission="+dateOfAdmission+"]";
           s = s+"email="+email+", ";
           s = s+"mobilenumber="+mobilenumber+", ";
       return s;
    }

    public String getNumber(String p00) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

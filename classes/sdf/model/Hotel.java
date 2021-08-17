/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdf.model;

/**
 *
 * @author muthu
 */
public class Hotel {
     private String number;
    private String name;
    private String locationofhotel ;
  


    public Hotel()
    {
    }

    public Hotel(String number)
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

    public void setLocationofhotel (String locationofhotel )
    {
        this.locationofhotel = locationofhotel ;
    }

    public String getlocationofhotel ()
    {
        return locationofhotel ;
    }


    public String toString()
    {
	   String s; 		// should use StringBuffer
	   s = "hotel[";
	   s = s+"number="+number+", ";
	   s = s+"name="+name+", ";
	   s = s+"locationofhotel ="+locationofhotel +", ";
       return s;
    }
    
}

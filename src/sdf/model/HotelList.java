/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdf.model;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author muthu
 */
public class HotelList extends Model {
  private List<Hotel> hotels = new ArrayList<Hotel>();//used java array list to store data

    public void add(Hotel h)
    {
        hotels.add(h);
        notifyObserver();
    }

    public List<Hotel> getAll()
    {
        return hotels;
    }

  @Override
    public int getCount()
    {
		return hotels.size();
	}

	public boolean invariant(){
	    return hotels != null;
    }

    boolean contains(Hotel Hotel2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdf.controller;

import sdf.model.Hotel;
import sdf.model.HotelList;

public class HotelController extends Controller {
       public HotelController ()
    {
    }

    public void addHotel(Hotel h)
    {
        HotelList model = (HotelList)getModel();
        model.add(h);
    }
}



package sdf.model;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muthu
 */
public class HotelList extends Model {
      private List<Hotel> hotels;

    public HotelList() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokespecial sdf/model/Model."<init>":()V
         * 4: aload_0
         * 5: new           java/util/ArrayList
         * 8: dup
         * 9: invokespecial java/util/ArrayList."<init>":()V
         * 12: putfield      sdf/model/PatientList.patients:Ljava/util/List;
         * 15: return
         *  */
        // </editor-fold>
    }

    public void add(Hotel ptnt) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      sdf/model/PatientList.patients:Ljava/util/List;
         * 4: aload_1
         * 5: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
         * 10: pop
         * 11: aload_0
         * 12: invokevirtual sdf/model/PatientList.notifyObserver:()V
         * 15: return
         *  */
        // </editor-fold>
    }

    public List<Hotel> getAll() {
          return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      sdf/model/PatientList.patients:Ljava/util/List;
         * 4: areturn
         *  */
        // </editor-fold>
    }

      @Override
    public int getCount() {
          return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      sdf/model/PatientList.patients:Ljava/util/List;
         * 4: invokeinterface java/util/List.size:()I
         * 9: ireturn
         *  */
        // </editor-fold>
    }

    public boolean invariant() {
          return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      sdf/model/PatientList.patients:Ljava/util/List;
         * 4: ifnull        11
         * 7: iconst_1
         * 8: goto          12
         * 11: iconst_0
         * 12: ireturn
         *  */
        // </editor-fold>
    }
}

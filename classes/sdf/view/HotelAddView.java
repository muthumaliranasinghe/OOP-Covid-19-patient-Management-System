/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muthu
 */


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import sdf.controller.HotelController;
import sdf.model.HotelList;
import sdf.view.View;

public class HotelAddView extends View {
    
    private static final int SIZE = 20;
    private JTextField numberField;
    private JTextField nameField;
    private JTextField locationofhotelField;
    private JTextField numberofroomsavailableField;
    private JLabel numberLabel;
    private JLabel nameLabel;
    private JLabel locationofhotelLabel;
    private JLabel numberofroomsavailableLabel;
    private JButton addButton;
    private JButton resetButton;

    public HotelAddView(HotelList hl, HotelController hc) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: aload_2
         * 3: invokespecial sdf/view/View."<init>":(Lsdf/model/Model;Lsdf/controller/Controller;)V
         * 6: aload_0
         * 7: new           javax/swing/JTextField
         * 10: dup
         * 11: ldc           Patient-No
         * 13: bipush        20
         * 15: invokespecial javax/swing/JTextField."<init>":(Ljava/lang/String;I)V
         * 18: putfield      sdf/view/PatientAddView.numberField:Ljavax/swing/JTextField;
         * 21: aload_0
         * 22: new           javax/swing/JTextField
         * 25: dup
         * 26: ldc           Patient-Name
         * 28: bipush        20
         * 30: invokespecial javax/swing/JTextField."<init>":(Ljava/lang/String;I)V
         * 33: putfield      sdf/view/PatientAddView.nameField:Ljavax/swing/JTextField;
         * 36: aload_0
         * 37: new           javax/swing/JTextField
         * 40: dup
         * 41: ldc           IC-No
         * 43: bipush        20
         * 45: invokespecial javax/swing/JTextField."<init>":(Ljava/lang/String;I)V
         * 48: putfield      sdf/view/PatientAddView.icNoField:Ljavax/swing/JTextField;
         * 51: aload_0
         * 52: new           javax/swing/JTextField
         * 55: dup
         * 56: ldc           Country-Of-Origin
         * 58: bipush        20
         * 60: invokespecial javax/swing/JTextField."<init>":(Ljava/lang/String;I)V
         * 63: putfield      sdf/view/PatientAddView.countryOfOriginField:Ljavax/swing/JTextField;
         * 66: aload_0
         * 67: new           javax/swing/JTextField
         * 70: dup
         * 71: ldc           Date-Of-Admission
         * 73: bipush        20
         * 75: invokespecial javax/swing/JTextField."<init>":(Ljava/lang/String;I)V
         * 78: putfield      sdf/view/PatientAddView.dateOfAdmissionField:Ljavax/swing/JTextField;
         * 81: aload_0
         * 82: new           javax/swing/JLabel
         * 85: dup
         * 86: ldc           Patient-No
         * 88: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;)V
         * 91: putfield      sdf/view/PatientAddView.numberLabel:Ljavax/swing/JLabel;
         * 94: aload_0
         * 95: new           javax/swing/JLabel
         * 98: dup
         * 99: ldc           Patient-Name
         * 101: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;)V
         * 104: putfield      sdf/view/PatientAddView.nameLabel:Ljavax/swing/JLabel;
         * 107: aload_0
         * 108: new           javax/swing/JLabel
         * 111: dup
         * 112: ldc           IC-No
         * 114: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;)V
         * 117: putfield      sdf/view/PatientAddView.icNoLabel:Ljavax/swing/JLabel;
         * 120: aload_0
         * 121: new           javax/swing/JLabel
         * 124: dup
         * 125: ldc           Country-Of-Origin
         * 127: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;)V
         * 130: putfield      sdf/view/PatientAddView.countryOfOriginLabel:Ljavax/swing/JLabel;
         * 133: aload_0
         * 134: new           javax/swing/JLabel
         * 137: dup
         * 138: ldc           Date-Of-Admission
         * 140: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;)V
         * 143: putfield      sdf/view/PatientAddView.dateOfAdmissionLabel:Ljavax/swing/JLabel;
         * 146: aload_0
         * 147: new           javax/swing/JButton
         * 150: dup
         * 151: ldc           Add Patient
         * 153: invokespecial javax/swing/JButton."<init>":(Ljava/lang/String;)V
         * 156: putfield      sdf/view/PatientAddView.addButton:Ljavax/swing/JButton;
         * 159: aload_0
         * 160: new           javax/swing/JButton
         * 163: dup
         * 164: ldc           Reset Patient
         * 166: invokespecial javax/swing/JButton."<init>":(Ljava/lang/String;)V
         * 169: putfield      sdf/view/PatientAddView.resetButton:Ljavax/swing/JButton;
         * 172: aload_0
         * 173: new           java/awt/GridLayout
         * 176: dup
         * 177: iconst_0
         * 178: iconst_2
         * 179: invokespecial java/awt/GridLayout."<init>":(II)V
         * 182: invokevirtual sdf/view/PatientAddView.setLayout:(Ljava/awt/LayoutManager;)V
         * 185: aload_0
         * 186: aload_0
         * 187: getfield      sdf/view/PatientAddView.numberLabel:Ljavax/swing/JLabel;
         * 190: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 193: pop
         * 194: aload_0
         * 195: aload_0
         * 196: getfield      sdf/view/PatientAddView.numberField:Ljavax/swing/JTextField;
         * 199: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 202: pop
         * 203: aload_0
         * 204: aload_0
         * 205: getfield      sdf/view/PatientAddView.nameLabel:Ljavax/swing/JLabel;
         * 208: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 211: pop
         * 212: aload_0
         * 213: aload_0
         * 214: getfield      sdf/view/PatientAddView.nameField:Ljavax/swing/JTextField;
         * 217: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 220: pop
         * 221: aload_0
         * 222: aload_0
         * 223: getfield      sdf/view/PatientAddView.icNoLabel:Ljavax/swing/JLabel;
         * 226: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 229: pop
         * 230: aload_0
         * 231: aload_0
         * 232: getfield      sdf/view/PatientAddView.icNoField:Ljavax/swing/JTextField;
         * 235: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 238: pop
         * 239: aload_0
         * 240: aload_0
         * 241: getfield      sdf/view/PatientAddView.countryOfOriginLabel:Ljavax/swing/JLabel;
         * 244: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 247: pop
         * 248: aload_0
         * 249: aload_0
         * 250: getfield      sdf/view/PatientAddView.countryOfOriginField:Ljavax/swing/JTextField;
         * 253: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 256: pop
         * 257: aload_0
         * 258: aload_0
         * 259: getfield      sdf/view/PatientAddView.dateOfAdmissionLabel:Ljavax/swing/JLabel;
         * 262: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 265: pop
         * 266: aload_0
         * 267: aload_0
         * 268: getfield      sdf/view/PatientAddView.dateOfAdmissionField:Ljavax/swing/JTextField;
         * 271: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 274: pop
         * 275: aload_0
         * 276: aload_0
         * 277: getfield      sdf/view/PatientAddView.addButton:Ljavax/swing/JButton;
         * 280: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 283: pop
         * 284: aload_0
         * 285: aload_0
         * 286: getfield      sdf/view/PatientAddView.resetButton:Ljavax/swing/JButton;
         * 289: invokevirtual sdf/view/PatientAddView.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 292: pop
         * 293: aload_0
         * 294: getfield      sdf/view/PatientAddView.resetButton:Ljavax/swing/JButton;
         * 297: new           sdf/view/PatientAddView$1
         * 300: dup
         * 301: aload_0
         * 302: invokespecial sdf/view/PatientAddView$1."<init>":(Lsdf/view/PatientAddView;)V
         * 305: invokevirtual javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
         * 308: aload_0
         * 309: getfield      sdf/view/PatientAddView.addButton:Ljavax/swing/JButton;
         * 312: new           sdf/view/PatientAddView$2
         * 315: dup
         * 316: aload_0
         * 317: invokespecial sdf/view/PatientAddView$2."<init>":(Lsdf/view/PatientAddView;)V
         * 320: invokevirtual javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
         * 323: return
         *  */
        // </editor-fold>
    }
}

    


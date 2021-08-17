import javax.swing.JButton;
import javax.swing.JPanel;
import sdf.controller.HotelController;
import sdf.model.HotelList;
import sdf.view.HotelAddView;
import sdf.view.HotelDispalyView;
import sdf.view.View;
public class HotelView extends View{
    private JButton addButton;
    private JButton displayButton;
    private HotelAddView addView;
    private HotelDispalyView displayView;
    private JPanel cards;
    private JPanel buttons;
    private static final String ADD = "ADD";
    private static final String DISPLAY = "DISPLAY";

    public HotelView(HotelList hl, HotelController hc) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: aload_2
         * 3: invokespecial sdf/view/View."<init>":(Lsdf/model/Model;Lsdf/controller/Controller;)V
         * 6: aload_0
         * 7: new           javax/swing/JButton
         * 10: dup
         * 11: ldc           Add Panel
         * 13: invokespecial javax/swing/JButton."<init>":(Ljava/lang/String;)V
         * 16: putfield      sdf/view/PatientView.addButton:Ljavax/swing/JButton;
         * 19: aload_0
         * 20: new           javax/swing/JButton
         * 23: dup
         * 24: ldc           Display Panel
         * 26: invokespecial javax/swing/JButton."<init>":(Ljava/lang/String;)V
         * 29: putfield      sdf/view/PatientView.displayButton:Ljavax/swing/JButton;
         * 32: aload_0
         * 33: new           javax/swing/JPanel
         * 36: dup
         * 37: new           java/awt/CardLayout
         * 40: dup
         * 41: invokespecial java/awt/CardLayout."<init>":()V
         * 44: invokespecial javax/swing/JPanel."<init>":(Ljava/awt/LayoutManager;)V
         * 47: putfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 50: aload_0
         * 51: new           javax/swing/JPanel
         * 54: dup
         * 55: invokespecial javax/swing/JPanel."<init>":()V
         * 58: putfield      sdf/view/PatientView.buttons:Ljavax/swing/JPanel;
         * 61: aload_0
         * 62: new           sdf/view/PatientAddView
         * 65: dup
         * 66: aload_1
         * 67: aload_2
         * 68: invokespecial sdf/view/PatientAddView."<init>":(Lsdf/model/PatientList;Lsdf/controller/PatientController;)V
         * 71: putfield      sdf/view/PatientView.addView:Lsdf/view/PatientAddView;
         * 74: aload_0
         * 75: new           sdf/view/PatientDisplayView
         * 78: dup
         * 79: aload_1
         * 80: aload_2
         * 81: invokespecial sdf/view/PatientDisplayView."<init>":(Lsdf/model/PatientList;Lsdf/controller/PatientController;)V
         * 84: putfield      sdf/view/PatientView.displayView:Lsdf/view/PatientDisplayView;
         * 87: aload_0
         * 88: getfield      sdf/view/PatientView.buttons:Ljavax/swing/JPanel;
         * 91: aload_0
         * 92: getfield      sdf/view/PatientView.addButton:Ljavax/swing/JButton;
         * 95: invokevirtual javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 98: pop
         * 99: aload_0
         * 100: getfield      sdf/view/PatientView.buttons:Ljavax/swing/JPanel;
         * 103: aload_0
         * 104: getfield      sdf/view/PatientView.displayButton:Ljavax/swing/JButton;
         * 107: invokevirtual javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
         * 110: pop
         * 111: aload_0
         * 112: getfield      sdf/view/PatientView.addButton:Ljavax/swing/JButton;
         * 115: getstatic     sdf/view/View.btnFont:Ljava/awt/Font;
         * 118: invokevirtual javax/swing/JButton.setFont:(Ljava/awt/Font;)V
         * 121: aload_0
         * 122: getfield      sdf/view/PatientView.displayButton:Ljavax/swing/JButton;
         * 125: getstatic     sdf/view/View.btnFont:Ljava/awt/Font;
         * 128: invokevirtual javax/swing/JButton.setFont:(Ljava/awt/Font;)V
         * 131: aload_0
         * 132: new           java/awt/BorderLayout
         * 135: dup
         * 136: invokespecial java/awt/BorderLayout."<init>":()V
         * 139: invokevirtual sdf/view/PatientView.setLayout:(Ljava/awt/LayoutManager;)V
         * 142: aload_0
         * 143: aload_0
         * 144: getfield      sdf/view/PatientView.buttons:Ljavax/swing/JPanel;
         * 147: ldc           North
         * 149: invokevirtual sdf/view/PatientView.add:(Ljava/awt/Component;Ljava/lang/Object;)V
         * 152: aload_0
         * 153: new           javax/swing/JLabel
         * 156: dup
         * 157: ldc
         * 159: invokespecial javax/swing/JLabel."<init>":(Ljava/lang/String;)V
         * 162: ldc           Center
         * 164: invokevirtual sdf/view/PatientView.add:(Ljava/awt/Component;Ljava/lang/Object;)V
         * 167: aload_0
         * 168: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 171: aload_0
         * 172: getfield      sdf/view/PatientView.displayView:Lsdf/view/PatientDisplayView;
         * 175: ldc           DISPLAY
         * 177: invokevirtual javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
         * 180: aload_0
         * 181: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 184: aload_0
         * 185: getfield      sdf/view/PatientView.addView:Lsdf/view/PatientAddView;
         * 188: ldc           ADD
         * 190: invokevirtual javax/swing/JPanel.add:(Ljava/awt/Component;Ljava/lang/Object;)V
         * 193: aload_0
         * 194: aload_0
         * 195: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 198: ldc           South
         * 200: invokevirtual sdf/view/PatientView.add:(Ljava/awt/Component;Ljava/lang/Object;)V
         * 203: aload_0
         * 204: invokespecial sdf/view/PatientView.showAddView:()V
         * 207: aload_0
         * 208: getfield      sdf/view/PatientView.addButton:Ljavax/swing/JButton;
         * 211: new           sdf/view/PatientView$1
         * 214: dup
         * 215: aload_0
         * 216: invokespecial sdf/view/PatientView$1."<init>":(Lsdf/view/PatientView;)V
         * 219: invokevirtual javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
         * 222: aload_0
         * 223: getfield      sdf/view/PatientView.displayButton:Ljavax/swing/JButton;
         * 226: new           sdf/view/PatientView$2
         * 229: dup
         * 230: aload_0
         * 231: invokespecial sdf/view/PatientView$2."<init>":(Lsdf/view/PatientView;)V
         * 234: invokevirtual javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
         * 237: return
         *  */
        // </editor-fold>
    }

    private void showAddView() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 4: invokevirtual javax/swing/JPanel.getLayout:()Ljava/awt/LayoutManager;
         * 7: checkcast     java/awt/CardLayout
         * 10: checkcast     java/awt/CardLayout
         * 13: astore_1
         * 14: aload_1
         * 15: aload_0
         * 16: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 19: ldc           ADD
         * 21: invokevirtual java/awt/CardLayout.show:(Ljava/awt/Container;Ljava/lang/String;)V
         * 24: return
         *  */
        // </editor-fold>
    }

    private void showDisplayView() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 4: invokevirtual javax/swing/JPanel.getLayout:()Ljava/awt/LayoutManager;
         * 7: checkcast     java/awt/CardLayout
         * 10: checkcast     java/awt/CardLayout
         * 13: astore_1
         * 14: aload_1
         * 15: aload_0
         * 16: getfield      sdf/view/PatientView.cards:Ljavax/swing/JPanel;
         * 19: ldc           DISPLAY
         * 21: invokevirtual java/awt/CardLayout.show:(Ljava/awt/Container;Ljava/lang/String;)V
         * 24: return
         *  */
        // </editor-fold>
    }
    
}

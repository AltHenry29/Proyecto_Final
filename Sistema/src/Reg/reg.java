package Reg;

public class reg {
}

// package Registro;
//
//import Opciones.opciones;
//
//import javax.swing.*;
//
//public class registro extends JFrame{
//    private JPanel reg;
//    private JTextField txtcod;
//    private JTextField txtnom;
//    private JTextField txtdet;
//    private JTextField txtval;
//    private JTextField txtstk;
//    private JButton guardarButton;
//    private JButton limpiarButton;
//    private JButton REGRESARALMENUButton;
//
//    public static String codGlobal = "";
//    public static String nomGlobal = "";
//    public static String detGlobal = "";
//    public static double valGlobal = 0;
//    public static int stkGlobal = 0;
//
//    public registro(){
//        setTitle("Registro");
//        setContentPane(reg);
//        setSize(300,250);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setVisible(true);
//
//        guardarButton.addActionListener(e ->  {
//            String cod = txtcod.getText().trim();
//            String nom = txtnom.getText().trim();
//            String det = txtdet.getText().trim();
//            String val = txtval.getText().trim();
//            String stock = txtstk.getText().trim();
//
//            if (cod.isEmpty() || nom.isEmpty() || det.isEmpty() || val.isEmpty() || stock.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
//                return;
//
//            }
//
//            if (val.length() > 4 || stock.length() > 3) {
//                JOptionPane.showMessageDialog(this, "Precio max 4 cifras. \n Stock max 3 cifras.");
//                return;
//
//            }
//
//            try {
//                codGlobal = cod;
//                nomGlobal = nom;
//                detGlobal = det;
//                valGlobal = Double.parseDouble(val);
//                stkGlobal = Integer.parseInt(stock);
//
//                JOptionPane.showMessageDialog(this, "Producto registrado con exito.");
//
//                txtcod.setText(" ");
//                txtdet.setText(" ");
//                txtnom.setText(" ");
//                txtstk.setText(" ");
//                txtval.setText(" ");
//
//            } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(this, "Precio y Stock deben ser numericos.");
//
//            }
//
//        });
//
//        limpiarButton.addActionListener(e ->  {
//            txtcod.setText(" ");
//            txtdet.setText(" ");
//            txtnom.setText(" ");
//            txtstk.setText(" ");
//            txtval.setText(" ");
//
//        });
//
//        REGRESARALMENUButton.addActionListener(e ->  {
//            setVisible(false);
//            new opciones().setVisible(true);
//            dispose();
//
//        });
//    }
//}
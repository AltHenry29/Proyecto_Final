package Login;
import Usuario.usuario;
import Admin.admin;

import javax.swing.*;

public class login extends JFrame {
    private JPanel log;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JComboBox comboBox1;
    private JButton ingresarButton;

    public login(){
        //String[] opciones ={"Seleccione","Administrador","Usuario"};
        setTitle("LOGIN");
        setContentPane(log);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        ingresarButton.addActionListener(e ->  {
            String user = textField1.getText();
            String pass = new String(passwordField1.getPassword());
            String seleccion = (String) comboBox1.getSelectedItem();
            if (user.equals("Henry")&& pass.equals("1234")  && "Administrador".equals(seleccion)){
                new admin().setVisible(true);
                dispose();

            } else if ("Usuario".equals(seleccion)){
                new usuario().setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(null, "Invalido");

            }
        });
    }

}

//package Login;
//
//import javax.swing.*;
//
//public class login {
//    private JPanel panel1;
//    private JTextField textField1;
//    private JPasswordField passwordField1;
//    private JComboBox comboBox1;
//    private JButton button1;
//}

package Admin;

import javax.swing.*;

public class admin extends JFrame{
    private JPanel admin;
    private JTextField textField1;
    private JTextField textField2;
    private JButton guardarButton;
    private JButton limpiarButton;

    public admin(){
        setTitle("Administrador");
        setSize(300,200);
        setContentPane(admin);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        guardarButton.addActionListener(e ->  {


        });

        limpiarButton.addActionListener( e ->  {
            textField1.setText(" ");
            textField2.setText(" ");

        });


    }

}

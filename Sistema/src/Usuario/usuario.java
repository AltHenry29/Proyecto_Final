package Usuario;

import javax.swing.*;
import java.awt.*;

public class usuario extends JFrame {
    private JPanel caj;
    private JTextField textField1;
    private JTextField textField2;
    private JButton guardarButton;
    private JButton limpiarButton;

    public usuario(){
        setTitle("Cajero");
        setSize(300,200);
        setContentPane(caj);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        limpiarButton.addActionListener(e ->  {
            textField1.setText(" ");
            textField2.setText(" ");
        });
    }

}

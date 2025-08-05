package Admin;

import javax.swing.*;

public class admin extends JFrame{
    private JPanel admin;
    private JTabbedPane tabbedPane1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton agregarButton;
    private JButton editarButton;
    private JButton borrarButton;
    private JComboBox comboBox1;
    private JTable table1;
    private JButton verButton;
    private JTable table2;
    private JTable table3;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JButton button1;
    private JButton button2;
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

package Gestion;

import javax.swing.*
import com.mongodb.client.*;
import Usuario.usuario;

public class gestion {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;

    SwingUtilities.invokeLater(() -> {
        // Crear el marco principal
        JFrame frame = new JFrame("Sistema Universitario - MongoDB");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Crear el panel con pestañas
        JTabbedPane tabbedPane = new JTabbedPane();

        // Pestaña 1: Estudiantes
        usuario users = new usuario();
        new usuarios(users); // Adjuntar el controlador
        tabbedPane.addTab("Estudiantes", users.getContentPane());

        // Pestaña 2: Cursosw
        CursosForm cursosForm = new CursosForm();
        new CursosController(cursosForm);
        tabbedPane.addTab("Cursos", cursosForm.getContentPane());

        // Pestaña 3: Inscripciones
        InscripcionesForm inscripcionesForm = new InscripcionesForm();
        new InscripcionesController(inscripcionesForm);
        tabbedPane.addTab("Inscripciones", inscripcionesForm.getContentPane());

        // Añadir el panel con pestañas al marco
        frame.add(tabbedPane);

        // Hacer visible el marco
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    });

}

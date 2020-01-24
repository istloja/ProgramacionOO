package app_semana;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static sun.net.www.http.HttpClient.New;

public class VentanaPrincical extends JFrame {

    JPanel p = new JPanel();
    JLabel l = new JLabel("¿En que numero de la semana estamos?");
    JButton b = new JButton("Chequear");
    JTextField t = new JTextField(15);
    VentanaResultado q;
    JComboBox cb;
    
    public VentanaPrincical() {
        super("Ventana Principal");
        setLocation(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponentes();
        pack();        
    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridx = 0;
        g.insets = new Insets(10, 10, 10, 10);
        p.add(l, g);
        g.gridy = 1;
        p.add(t, g);
        Vector v = new Vector(5);
        v.addElement("numero de la semana");
        v.addElement("dia del año");
        cb = new JComboBox(v);
        g.gridx = 1;
        p.add(cb, g);
        g.gridy = 2;
        g.gridx = 0;
        p.add(b, g);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                VentanaResultado vr = new VentanaResultado();
                if (!t.getText().isEmpty()) {
                } else {
                    JOptionPane.showInternalMessageDialog(null, "inserte texto para jugar");
                }                
            }
        }
        );
    }

    public void chequear() {
        
        try {
            int text = Integer.parseInt(t.getText());
            Calendar c = Calendar.getInstance();
            int ca = c.get(Calendar.WEEK_OF_YEAR);
            if (text == ca) {
                q = new VentanaResultado();
                q.lr.setText("correcto");
                q.lr.setForeground(Color.green);
                q.br.setText("terminar");
                
            } else {
                q = new VentanaResultado();
                q.lr.setText("incorrecto");
                q.lr.setForeground(Color.red);
                q.br.setText("trata de nuevo");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "por favor ingrese numeros para jugar");
        }
        
    }
}

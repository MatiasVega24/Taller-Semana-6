import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormCadenasGUI {
    private JPanel pGeneral;
    private JTextField txtPrincipal;
    private JTextField txtSub;
    private JTextArea textArea1;
    private JButton buscarButton;
    private BusquedaSubcadenas busquedaSubcadenas = new BusquedaSubcadenas();

    public FormCadenasGUI() {

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setText("");
                String cadenaPrincipal = txtPrincipal.getText();
                String cadenaSub = txtSub.getText();
                int pos = busquedaSubcadenas.buscar(cadenaPrincipal,cadenaSub);
                if(pos != -1)
                    textArea1.append("La subcadena: \""+cadenaSub+"\" se encuentra en la posicion: "+pos);
                else
                    textArea1.append("La sub cadena no se encuentra en la cadena pricipal");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Búsqueda por cadenas");
        frame.setContentPane(new FormCadenasGUI().pGeneral);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setMinimumSize(new Dimension(500,400));
        frame.setVisible(true);
    }
}

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Geometria extends JPanel {

    private Rectangulo rectangulo;

    public Geometria() {
        Punto punto = new Punto(50, 50);
        rectangulo = new Rectangulo(punto, 200, 100);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        rectangulo.dibujar(g); // Dibuja el rectángulo
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Rectángulo");
        Geometria panel = new Geometria();

        ventana.add(panel);
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

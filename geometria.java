import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class geometria extends JPanel {
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja un rectángulo
        g.setColor(Color.BLUE); // Color del rectángulo
        g.fillRect(50, 50, 200, 100); // (x, y, ancho, alto)
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Dibujo de Rectángulo");
        geometria panel = new geometria();
        
        ventana.add(panel);
        ventana.setSize(300, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}
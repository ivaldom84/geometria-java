import java.awt.Color;
import java.awt.Graphics;

public class Rectangulo {
    private Punto esquinaInferiorIzquierda;
    private int ancho;
    private int alto;

    public Rectangulo(Punto esquinaInferiorIzquierda, int ancho, int alto) {
        this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
        this.ancho = ancho;
        this.alto = alto;
    }

    public void dibujar(Graphics g) {
        g.setColor(Color.BLUE); // Color del rectángulo
        g.fillRect(esquinaInferiorIzquierda.getX(), esquinaInferiorIzquierda.getY(), ancho, alto);
    }
}


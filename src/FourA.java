import java.awt.*;
 class FourA {
    public static void main (String[] args) {
        DrawingPanel p = new DrawingPanel(300, 200);
        Graphics g = p.getGraphics();
        g.fillRect(40, 10, 100, 50);
        g.setColor(Color.CYAN);
        g.fillRect(110, 20, 30, 20);
        g.setColor(Color.RED);
        for (int i = 0; i <= 4; i++) {
            g.fillOval(20 * i + 40, 50, 20, 20);
        }
    }
}

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ChessTable2 {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0,0,WIDTH,HEIGHT);
        int size1 = WIDTH/8;
        int size2 = HEIGHT/8;
        int startingPoint1 = 0;
        int startingPoint2 = 0;
        for (int columns = 0; columns < 8; columns++) {
            for (int rows = 0; rows < 4 ; rows++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(startingPoint1,startingPoint2,size1,size2);
                startingPoint1+=2*size1;
            }
            startingPoint2+=size2;
            startingPoint1=size1-startingPoint1;

        }
        startingPoint1=0;
        startingPoint2=0;
        for (int columns1 = 0; columns1 < 8; columns1++) {
            for (int rows1 = 0; rows1 < 4 ; rows1++) {
                graphics.setColor(Color.BLACK);
                graphics.fillRect(startingPoint1+size1,startingPoint2+size2,size1,size2);
                startingPoint1+=2*size1;
            }
            startingPoint2+=size2;
            startingPoint1=size1-startingPoint1;

        }
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        JPanel canvas = new Drawing();
        canvas.setSize(1891, 999);
        frame.add(canvas);
        frame.setVisible(true);


    }

    @Override
    public void paintComponent(Graphics g) {
        ComplexNumber c = new ComplexNumber(.8, 1.5);
        MandelbrotDrawer m = new MandelbrotDrawer();
        int counter = 0;
        while (c.getA() > -2.5) {
            while (c.getB() > -1.5) {
                ComplexNumber Z = new ComplexNumber(0, 0);
                boolean MandelbrotTest = m.getNewZvals(Z, c.getA(), c.getB(), 0);
                //counter += 1;
                //System.out.println(counter);
                int xVal = (int) ( ( c.getA() * 333 ) + 1395 );// gets C's A value and multiply's by 100 to make it not a decimal and then slides it over 250 pixels because my domain is -2.25, .8 or -225 to 80 pixels .
                int yVal = (int) ( c.getB() * -333 + 499.5 ); // gets Y value, multiply by -100 because of conversion for cartesian plane to java drawing plane. My range is from -150 to 150 pixels.
                if (MandelbrotTest) {
                    g.setColor(Color.BLACK);

                } else {
                    g.setColor(Color.RED);
                }
                g.drawLine(xVal, yVal, xVal, yVal);
                c.setB(c.getB() - .001);
            }
            c.setB(1.5);
            c.setA(c.getA() - .001);
        }
        System.out.println("I finished printing");


    }
}


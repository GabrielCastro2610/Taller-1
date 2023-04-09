import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Lineas {
    public static void main(String[] args){

        //Rango de Dibujo

        double min = -1.0;
        double max = 1.0;

        //Definición de la escala del lienzo de dibujo

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        //Evitar el Parpadeo de pantalla.

        StdDraw.enableDoubleBuffering();

        Color[] colores = {Color.BLUE, Color.GREEN, Color.MAGENTA, Color.RED};

        //Dibujo de líneas

        while (true) {

            //Generación de un par ordenado (x,y)

            double x0 = min + (max - min) * Math.random();
            double y0 = min + (max - min) * Math.random();
            double x1 = min + (max - min) * Math.random();
            double y1 = min + (max - min) * Math.random();

            //Selecciono el color del lápiz al azar

            StdDraw.setPenColor(colores[(int) (Math.random() * colores.length) ]);

            StdDraw.line(x0, y0, x1, y1);

            StdDraw.show();

            StdDraw.pause(200);
        }





    }
}

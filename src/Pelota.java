import edu.princeton.cs.stdlib.StdDraw;

public class Pelota {
    public static void main(String[] args) {

        //Rango de Dibujo

        double min = -1.0;
        double max = 1.0;

        //Definición de la escala del lienzo de dibujo

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        //Evitar el Parpadeo de pantalla.

        StdDraw.enableDoubleBuffering();


        //Posición inicial (x,y)

        double x = min + (max - min) * Math.random();
        double y = min + (max - min) * Math.random();

        //Velocidad Inicial

        double vx = 0.002;
        double vy = 0.012;

        //Radio de la pelotita

        double radio = 0.05;

        //Ciclo Infinito

        while (true) {

            //Colisión

            if (Math.abs(x + vx) > 1.0 - radio){

                vx = -vx;

            }

            if (Math.abs(y + vy) > 1.0 - radio){

                vy = -vy;
            }

            //Actualización de posición

            x += vx;
            y += vy;

            //Limpiar el fondo

            StdDraw.clear();

            //Dibujar la pelotita

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x , y , radio);

            //Mostrar la pantalla y esperar

            StdDraw.show();

            // StDraw.pause(10);





        }

    }
}

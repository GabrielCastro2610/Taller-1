import edu.princeton.cs.stdlib.StdDraw;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        //Hola , esta es una prueba para usar java / escribir en una sola línea

        /* Shift + Botón a la izquierda del enter, es el asterisco
            xd, escribir en un párrafo
         */



        //Rango de Dibujo

        double min = -1.0;
        double max = 1.0;

        //Definición de la escala del lienzo de dibujo

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        //Evitar el Parpadeo de pantalla.

        StdDraw.enableDoubleBuffering();

        //Dibujar 1.000.000 de puntos

        for (int i = 0; i < 1000000; i++){

            //Generación de un par ordenado (x,y)

            double x = min + (max - min) * Math.random();
            double y = min + (max - min) * Math.random();

            StdDraw.point(x,y);
            StdDraw.show();


        }

    }
}

import edu.princeton.cs.stdlib.StdDraw;

import java.awt.*;

public class Taller1 {

    public static void main(String[] args){

        //Rango de Dibujo (es el cuadro que se va a formar)

        double min = -1.0;
        double max = 1.0;

        //Definición de la escala del lienzo de dibujo (Es el rango en el que la libreria puede dibujar dentro del cuadro)

        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);

        //Evitar el Parpadeo de pantalla para que no haya flashes que impiden ver correctamente el comportamiento de las líneas.

        StdDraw.enableDoubleBuffering();


        //Posición inicial (x,y) para cada punto que forme una línea.

        //Linea 1, esta se genera de forma random y el resto va a seguir su trayectoria.

        double x = Math.random();
        double y = Math.random();
        double x1 = Math.random();
        double y1 = Math.random();

        //Linea 2

        double x2 = x - 0.02;
        double y2 = y - 0.02;
        double x3 = x1 - 0.02;
        double y3 = y1 - 0.02;

        //Linea 3

        double x4 =  x2 - 0.02;
        double y4 =  y2 - 0.02;
        double x5 =  x3 - 0.02;
        double y5 =  y3 - 0.02;

        //Linea 4

        double x6 =  x4 - 0.02;
        double y6 =  y4 - 0.02;
        double x7 =  x5 - 0.02;
        double y7 =  y5 - 0.02;

        //Linea 5

        double x8 =  x6 - 0.02;
        double y8 =  y6 - 0.02;
        double x9 =  x7 - 0.02;
        double y9 =  y7 - 0.02;

        //Linea 6

        double x10 =  x8 - 0.02;
        double y10 =  y8 - 0.02;
        double x11 =  x9 - 0.02;
        double y11 =  y9 - 0.02;

        //Velocidad Inicial deben ser 24 ya que son 4 por cada línea (6)

        //Linea 1 , esta se genera de forma random y el resto de lineas se igualan a esta.

        double vx = (1 - 0.999) * Math.random();
        double vy = (1 - 0.999) * Math.random();
        double vx1 = (1 - 0.999) * Math.random();
        double vy1 = (1 - 0.999) * Math.random();

        //Linea 2

        double vx2 = vx ;
        double vy2 = vy ;
        double vx3 = vx1 ;
        double vy3 = vy1 ;

        //Linea 3

        double vx4 = vx2 ;
        double vy4 = vy2 ;
        double vx5 = vx3 ;
        double vy5 = vy3 ;

        //Linea 4

        double vx6 = vx4 ;
        double vy6 = vy4 ;
        double vx7 = vx5 ;
        double vy7 = vy5 ;

        //Linea 5

        double vx8 = vx6 ;
        double vy8 = vy6 ;
        double vx9 = vx7 ;
        double vy9 = vy7 ;

        //Linea 6

        double vx10 = vx8 ;
        double vy10 = vy8 ;
        double vx11 = vx9 ;
        double vy11 = vy9 ;

        //Radio de los puntos extremos de cada línea

        double radio = 0.01;

        //Ciclo Infinito

        while (true) {

            //Colisión, esto permite que un punto de la línea al llegar al borde de la pantalla, rebote hacia el lado contrario.

            //Colisión Linea 1

            if (Math.abs(x + vx) > 1.0 - radio){

                vx = -vx;

            }

            if (Math.abs(y + vy) > 1.0 - radio){

                vy = -vy;
            }

            if (Math.abs(x1 + vx1) > 1.0 - radio){

                vx1 = -vx1;

            }

            if (Math.abs(y1 + vy1) > 1.0 - radio){

                vy1 = -vy1;
            }

            //Colisión Linea 2


            if (Math.abs(x2 + vx2) > 1.0 - radio){

                vx2 = -vx2;

            }

            if (Math.abs(y2 + vy2) > 1.0 - radio){

                vy2 = -vy2;
            }

            if (Math.abs(x3 + vx3) > 1.0 - radio){

                vx3 = -vx3;

            }

            if (Math.abs(y3 + vy3) > 1.0 - radio){

                vy3 = -vy3;
            }

            //Colisión  Linea 3


            if (Math.abs(x4 + vx4) > 1.0 - radio){

                vx4 = -vx4;

            }

            if (Math.abs(y4 + vy4) > 1.0 - radio){

                vy4 = -vy4;
            }

            if (Math.abs(x5 + vx5) > 1.0 - radio){

                vx5 = -vx5;

            }

            if (Math.abs(y5 + vy5) > 1.0 - radio){

                vy5 = -vy5;
            }

            //Colisión  Linea 4



            if (Math.abs(x6 + vx6) > 1.0 - radio){

                vx6 = -vx6;

            }

            if (Math.abs(y6 + vy6) > 1.0 - radio){

                vy6 = -vy6;
            }

            if (Math.abs(x7 + vx7) > 1.0 - radio){

                vx7 = -vx7;

            }

            if (Math.abs(y7 + vy7) > 1.0 - radio){

                vy7 = -vy7;
            }

            //Colisión  Linea 5



            if (Math.abs(x8 + vx8) > 1.0 - radio){

                vx8 = -vx8;

            }

            if (Math.abs(y8 + vy8) > 1.0 - radio){

                vy8 = -vy8;
            }

            if (Math.abs(x9 + vx9) > 1.0 - radio){

                vx9 = -vx9;

            }

            if (Math.abs(y9 + vy9) > 1.0 - radio){

                vy9 = -vy9;
            }

            //Colisión Linea 6



            if (Math.abs(x10 + vx10) > 1.0 - radio){

                vx10 = -vx10;

            }

            if (Math.abs(y10 + vy10) > 1.0 - radio){

                vy10 = -vy10;
            }

            if (Math.abs(x11 + vx11) > 1.0 - radio){

                vx11 = -vx11;

            }

            if (Math.abs(y11 + vy11) > 1.0 - radio){

                vy11 = -vy11;
            }

            //Actualización de posición, esto genera el movimiento ya que la posición se iguala a la velocidad.

            //Linea 1

            x += vx;
            y += vy;
            x1 += vx1;
            y1 += vy1;

            //Linea 2

            x2 += vx2;
            y2 += vy2;
            x3 += vx3;
            y3 += vy3;

            //Linea 3

            x4 += vx4;
            y4 += vy4;
            x5 += vx5;
            y5 += vy5;

            //Linea 4

            x6 += vx6;
            y6 += vy6;
            x7 += vx7;
            y7 += vy7;

            //Linea 5

            x8 += vx8;
            y8 += vy8;
            x9 += vx9;
            y9 += vy9;

            //Linea 6

            x10 += vx10;
            y10 += vy10;
            x11 += vx11;
            y11 += vy11;

            //Limpiar el fondo , sirve para que se eliminen las lineas ya creadas y siempre se actualicen.

            StdDraw.clear();

            //Dibujar la linea 1

            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(x , y , radio);
            StdDraw.filledCircle(x1 , y1 , radio);
            StdDraw.line(x, y, x1, y1);

            //Dibujar la linea 2

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(x2 , y2 , radio);
            StdDraw.filledCircle(x3 , y3 , radio);
            StdDraw.line(x2, y2, x3, y3);

            //Dibujar la linea 3

            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledCircle(x4 , y4 , radio);
            StdDraw.filledCircle(x5 , y5 , radio);
            StdDraw.line(x4, y4, x5, y5);

            //Dibujar la linea 4

            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(x6 , y6 , radio);
            StdDraw.filledCircle(x7 , y7 , radio);
            StdDraw.line(x6, y6, x7, y7);

            //Dibujar la linea 5

            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.filledCircle(x8 , y8 , radio);
            StdDraw.filledCircle(x9 , y9 , radio);
            StdDraw.line(x8, y8, x9, y9);

            //Dibujar la linea 6

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(x10 , y10 , radio);
            StdDraw.filledCircle(x11 , y11 , radio);
            StdDraw.line(x10, y10, x11, y11);

            //Mostrar la pantalla y esperar

            StdDraw.show();




        }


    }




    }















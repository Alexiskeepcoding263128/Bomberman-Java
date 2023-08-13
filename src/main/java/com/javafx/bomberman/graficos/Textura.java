package com.javafx.bomberman.graficos;
import javafx.scene.image.Image;

public class Textura {
    private static int TAMANO_ORIGINAL = 32;
    private static int ESCALA = 2;

    public static final int TAMANO_FINAL = TAMANO_ORIGINAL * ESCALA ;

    // Bloques
    public static Image Cesped = new Image("green_concrete_powder.png", TAMANO_FINAL,
            TAMANO_FINAL, false, false);
    public static Image Ladrillo = new Image("bricks.png", TAMANO_FINAL,
            TAMANO_FINAL, false, false);

    public static Image Concreto = new Image("stone_bricks.png", TAMANO_FINAL,
            TAMANO_FINAL, false, false);



    /*public static Image jugador_Textura_Arriba1 = Image();
    public static Image jugador_Textura_Arriba2 = Image();
    public static Image jugador_Textura_Arriba3 = Image();

    public static Image jugador_Textura_Derecha1 = Image();
    public static Image jugador_Textura_Derecha2 = Image();
    public static Image jugador_Textura_Derecha3 = Image();


    public static Image jugador_Textura_Abajo1 = Image();
    public static Image jugador_Textura_Abajo2 = Image();
    public static Image jugador_Textura_Abajo3 = Image();


    public static Image jugador_Textura_Izquierda1 = Image();
    public static Image jugador_Textura_Izquierda2 = Image();
    public static Image jugador_Textura_Izquierda3 = Image();


    public static Image dahl_Textura_Arriba1 = Image();
    public static Image dahl_Textura_Arriba2 = Image();
    public static Image dahl_Textura_Arriba3 = Image();

    public static Image dahl_Textura_Derecha1 = Image();
    public static Image dahl_Textura_Derecha2 = Image();
    public static Image dahl_Textura_Derecha3 = Image();


    public static Image dahl_Textura_Abajo1 = Image();
    public static Image dahl_Textura_Abajo2 = Image();
    public static Image dahl_Textura_Abajo3 = Image();


    public static Image dahl_Textura_Izquierda1 = Image();
    public static Image dahl_Textura_Izquierda2 = Image();
    public static Image dahl_Textura_Izquierda3 = Image();

    public static Image doria_Textura_Arriba1 = Image();
    public static Image doria_Textura_Arriba2 = Image();
    public static Image doria_Textura_Arriba3 = Image();

    public static Image doria_Textura_Derecha1 = Image();
    public static Image doria_Textura_Derecha2 = Image();
    public static Image doria_Textura_Derecha3 = Image();

    public static Image doria_Textura_Izquierda1 = Image();
    public static Image doria_Textura_Izquierda2 = Image();
    public static Image doria_Textura_Izquierda3 = Image();

    public static Image ovape_Textura_Arriba1 = Image();
    public static Image ovape_Textura_Arriba2 = Image();
    public static Image ovape_Textura_Arriba3 = Image();

    public static Image ovape_Textura_Derecha1 = Image();
    public static Image ovape_Textura_Derecha2 = Image();
    public static Image ovape_Textura_Derecha3 = Image();

    public static Image ovape_Textura_Abajo1 = Image();
    public static Image ovape_Textura_Abajo2 = Image();
    public static Image ovape_Textura_Abajo3 = Image();

    public static Image ovape_Textura_Izquierda1 = Image();
    public static Image ovape_Textura_Izquierda2 = Image();
    public static Image ovape_Textura_Izquierda3 = Image();*/

}

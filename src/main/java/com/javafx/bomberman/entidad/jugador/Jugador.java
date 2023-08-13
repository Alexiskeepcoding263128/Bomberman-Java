package com.javafx.bomberman.entidad.jugador;

import com.javafx.bomberman.entidad.Entidad;
import javafx.scene.image.Image;

public class Jugador extends Entidad {

    private int vida;
    private int velocidad;
    private static int contabilizar_Muerte;
    private int cantidadDePowerUpsRecogidos;


    public Jugador(int posicionX, int posicionY, Image imagen) {
        super(posicionX, posicionY, imagen);
    }

    public void sufrirDaño(){

    }

    @Override
    public void actualizar() {
        sufrirDaño();
    }
}

package com.javafx.bomberman.entidad.enemigo;

import com.javafx.bomberman.entidad.Entidad;
import javafx.scene.image.Image;

public abstract class enemigo extends Entidad {

    public enemigo(int posicionX, int posicionY, Image imagen) {
        super(posicionX, posicionY, imagen);
    }

    @Override
    public void actualizar() {

    }
}

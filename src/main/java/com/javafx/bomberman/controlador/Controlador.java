package com.javafx.bomberman.controlador;

import javafx.scene.Scene;

public interface Controlador {
    public Scene getScene();
    public void renderizar();
    public abstract void actualizar();

}

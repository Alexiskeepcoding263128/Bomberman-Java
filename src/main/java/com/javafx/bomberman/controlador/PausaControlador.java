package com.javafx.bomberman.controlador;
import com.javafx.bomberman.main.Estado;
import com.javafx.bomberman.main.Juego;
import javafx.scene.Scene;

public class PausaControlador implements Controlador{
    @Override
    public Scene getScene() {
        return null;
    }

    @Override
    public void renderizar() {

    }

    @Override
    public void actualizar() {

    }

    public void togglePausa(){
        Juego.cambiarEstadoDelJuego(Estado.PARTIDA);
    }

    public void regresarMenuPrincipal(){
        Juego.cambiarEstadoDelJuego(Estado.MENU_PRINCIPAL);
        Juego.nuevoJuego = true;
    }
}

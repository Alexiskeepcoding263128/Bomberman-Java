package com.javafx.bomberman.controlador;
import com.javafx.bomberman.main.Estado;
import com.javafx.bomberman.main.Juego;
import com.javafx.bomberman.ui.MenuUI;
import javafx.scene.Scene;

public class MenuPrincipalControlador implements Controlador{
    private MenuUI menuUI;

    public MenuPrincipalControlador(){
        menuUI = new MenuUI(this);
    }

    @Override
    public void renderizar() {

    }

    @Override
    public void actualizar() {

    }

    @Override
    public Scene getScene() {
        return menuUI.getScene();
    }

    public void iniciarPartida(){
        Juego.cambiarEstadoDelJuego(Estado.PARTIDA);
    }

    public void salirDelJuego(){
        Juego.salir();
    }

}

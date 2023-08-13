package com.javafx.bomberman.controlador;
import com.javafx.bomberman.logic.PartidaLogic;
import com.javafx.bomberman.ui.PartidaUI;
import javafx.scene.Scene;


public class PartidaControlador implements Controlador{


    private PartidaLogic partidaLogic;
    private PartidaUI partidaUI;

    public PartidaControlador(){
        partidaLogic = new PartidaLogic();
        inicializarPartidaUI();
    }

    private void inicializarPartidaUI() {
        partidaUI = new PartidaUI();
        partidaUI.setBloques( partidaLogic.getListaDeBloques() );
    }

    @Override
    public Scene getScene() {
        return partidaUI.getScene();
    }

    @Override
    public void renderizar() {
        partidaUI.renderizar();;
    }

    @Override
    public void actualizar() {
        partidaLogic.actualizar();
    }
}

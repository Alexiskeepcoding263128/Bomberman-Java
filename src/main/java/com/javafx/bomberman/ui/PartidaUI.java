package com.javafx.bomberman.ui;

import com.javafx.bomberman.entidad.Entidad;
import com.javafx.bomberman.main.Juego;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class PartidaUI {

    private Scene scene;
    private ArrayList<Entidad> listaDeBloques;
    private GraphicsContext graphicsContext;

    public PartidaUI(){
        Canvas canvas = new Canvas(Juego.LARGO_PANTALLA , Juego.ANCHO_PANTALLA);
        graphicsContext = canvas.getGraphicsContext2D();
        Pane pane = new Pane();
        pane.getChildren().add(canvas);
        scene = new Scene(pane);
    }
    public void setBloques(ArrayList<Entidad> listaDeBloques) {
        this.listaDeBloques = listaDeBloques;
    }

    public void renderizar(){
        for ( Entidad bloque : listaDeBloques ){
            graphicsContext.drawImage( bloque.getImagen() , bloque.getX() , bloque.getY() );
        }
    }

    public Scene getScene(){
        return scene;
    }
}

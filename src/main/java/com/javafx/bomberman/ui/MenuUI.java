package com.javafx.bomberman.ui;

import com.javafx.bomberman.controlador.MenuPrincipalControlador;
import com.javafx.bomberman.main.Juego;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;



public class MenuUI {
    private Text menuTest;
    private Scene scene;
    private MenuPrincipalControlador menuPrincipalControlador;
    public MenuUI(MenuPrincipalControlador menuPrincipalControlador){
        this.menuPrincipalControlador = menuPrincipalControlador;
        createMenu();
    }

    private void createMenu() {
        Canvas canvas = new Canvas(Juego.ANCHO_PANTALLA , Juego.LARGO_PANTALLA);

        menuTest = new Text("MENU");
        menuTest.setFont(Font.font("Times new Roman" , FontWeight.BOLD, 30) );
        menuTest.setY(100);
        menuTest.setX(100);

        Image image = new Image("bricks.png");
        ImageView imageView = new ImageView(image);
        imageView.setX(200);
        imageView.setY(200);
        Pane pane = new Pane();
        pane.getChildren().addAll(canvas,menuTest , imageView);
        pane.setStyle("-fx-background-color: #353535");
        scene = new Scene(pane);
    }

    public Scene getScene(){
        return scene;
    }

}


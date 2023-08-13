package com.javafx.bomberman.main;
import com.javafx.bomberman.controlador.Controlador;
import com.javafx.bomberman.controlador.MenuPrincipalControlador;
import com.javafx.bomberman.controlador.PartidaControlador;
import com.javafx.bomberman.controlador.PausaControlador;
import com.javafx.bomberman.graficos.Textura;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Juego extends Application {
    public static int LARGO_PANTALLA = 1280;
    public static int ANCHO_PANTALLA = 768;
    public static int NUMERO_FILAS = ANCHO_PANTALLA / Textura.TAMANO_FINAL;
    public static int NUMERO_COLUMNAS = LARGO_PANTALLA / Textura.TAMANO_FINAL;
    public static boolean nuevoJuego = true;
    private static Controlador controlador;
    private static Stage mainStage;
    public static Estado estadoDelJuego;

    @Override
    public void start(Stage stage) throws Exception {
        mainStage = stage;
        mainStage.setTitle("Bomberman");
        cambiarEstadoDelJuego(Estado.PARTIDA);
        AnimationTimer animationTimer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                controlador.renderizar();
            }
        };
        animationTimer.start();
    }




    public static void main(String[] args) {
        launch();
    }



    public static void cambiarEstadoDelJuego(Estado estado){
        estadoDelJuego = estado;
        switch ( estado ){
            case MENU_PRINCIPAL -> controlador = new MenuPrincipalControlador();
            case PARTIDA -> {
              if ( nuevoJuego ){
                  controlador = new PartidaControlador();
                  nuevoJuego = false;
                  break;
              }
            }
            case MENU_PAUSA -> controlador = new PausaControlador();
        }
        cambiarScene();
        controlador.renderizar();
    }

    private static void cambiarScene() {
        mainStage.setScene(controlador.getScene());
        mainStage.show();
    }

    public static void salir(){
        Platform.exit();
        System.exit(0);
    }
}

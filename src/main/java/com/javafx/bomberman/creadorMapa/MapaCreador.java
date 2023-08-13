package com.javafx.bomberman.creadorMapa;
import com.javafx.bomberman.entidad.Entidad;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import com.javafx.bomberman.entidad.bloque.Cesped;
import com.javafx.bomberman.entidad.bloque.Concreto;
import com.javafx.bomberman.entidad.bloque.Ladrillo;
import com.javafx.bomberman.graficos.Textura;
import com.javafx.bomberman.main.Juego;

public class MapaCreador {
    private File archivo;
    public MapaCreador(String nombreNivel){
        archivo = new File(nombreNivel);
    }

    public ArrayList<Entidad> getBloques(){
        ArrayList<Entidad> listaDeBloques = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(archivo);
            Scanner scanner = new Scanner(fileReader);

            for ( int fila=0 ; fila < Juego.NUMERO_FILAS ; fila++){
                String linea = scanner.nextLine();
                String[] codigos = linea.split(" ");
                for ( int columna=0 ; columna < Juego.NUMERO_COLUMNAS ; columna++){
                    Entidad entidad;
                    int numero;
                    try {
                        numero = Integer.parseInt(codigos[columna]);
                    } catch (Exception e){
                        numero = 0;
                    }
                    switch ( numero ){
                        case 1 -> entidad = new Concreto(columna * Textura.TAMANO_FINAL , fila * Textura.TAMANO_FINAL , Textura.Concreto );
                        case 2 -> entidad = new Ladrillo( columna * Textura.TAMANO_FINAL , fila * Textura.TAMANO_FINAL , Textura.Ladrillo);
                        default -> entidad = new Cesped( columna * Textura.TAMANO_FINAL, fila * Textura.TAMANO_FINAL , Textura.Cesped);
                    }
                    listaDeBloques.add(entidad);
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return listaDeBloques;
    }

}

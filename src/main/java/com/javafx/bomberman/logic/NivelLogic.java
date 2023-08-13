package com.javafx.bomberman.logic;

import com.javafx.bomberman.entidad.Entidad;

import java.util.ArrayList;

public class NivelLogic {
    private Nivel nivelActual;
    private Nivel1 nivel1;
    public NivelLogic(){
        nivel1 = new Nivel1();
        nivelActual = nivel1;
    }

    public ArrayList<Entidad> getListaDeEnemigos(){
        return nivelActual.getListaDeEnemigos();
    }

    public ArrayList<Entidad> getListaDeBloques(){
        return nivelActual.getListaDeBloques();
    }

    public void actualizar() {
        nivelActual.actualizar();
    }
}

package com.javafx.bomberman.logic;

import com.javafx.bomberman.entidad.Entidad;
import com.javafx.bomberman.entidad.jugador.Jugador;

import java.util.ArrayList;

public class PartidaLogic {

    private Jugador jugador;
    private NivelLogic nivelLogic;

    public PartidaLogic(){
        nivelLogic = new NivelLogic();
        jugador = null;
    }
    public ArrayList<Entidad> getListaDeBloques(){
        return nivelLogic.getListaDeBloques();
    }

    public ArrayList<Entidad> getEnemigos(){
        return nivelLogic.getListaDeEnemigos();
    }

    public Entidad getPlayer(){
        return jugador;
    }

    public void actualizar(){
        jugador.actualizar();
        nivelLogic.actualizar();
    }
}

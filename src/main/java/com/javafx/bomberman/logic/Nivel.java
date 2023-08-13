package com.javafx.bomberman.logic;

import com.javafx.bomberman.entidad.Entidad;

import java.util.ArrayList;

public abstract class Nivel {
    protected ArrayList<Entidad> listaDeBloques;
    protected ArrayList<Entidad> listaDeEnemigos;
    public Nivel(){
        this.listaDeBloques = new ArrayList<>();
        this.listaDeEnemigos = new ArrayList<>();

    }
    public ArrayList<Entidad> getListaDeEnemigos(){
        return listaDeEnemigos;
    }
    public ArrayList<Entidad> getListaDeBloques(){
        return listaDeBloques;
    }
    public abstract void actualizar();
}

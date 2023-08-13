package com.javafx.bomberman.logic;

import com.javafx.bomberman.creadorMapa.MapaCreador;
import com.javafx.bomberman.entidad.Entidad;

public class Nivel1 extends Nivel{

    public Nivel1(){
        super();
        MapaCreador mapaCreador = new MapaCreador("src/main/resources/nivel1.txt");
        listaDeBloques = mapaCreador.getBloques();
    }

    @Override
    public void actualizar() {
        listaDeBloques.forEach(Entidad::actualizar);
        listaDeEnemigos.forEach(Entidad::actualizar);
    }
}

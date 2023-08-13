package com.javafx.bomberman.entidad;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Entidad {

    protected int x;
    protected int y;
    protected Image imagen;

    public Entidad(int posicionX, int posicionY, Image imagen){
        this.x = posicionX;
        this.y = posicionY;
        this.imagen = imagen;
    }

    public void render(GraphicsContext gc){
        gc.drawImage(imagen, (double)this.x, (double)this.y);
    }

    public abstract void actualizar();

    public Image getImagen(){
        return imagen;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

}

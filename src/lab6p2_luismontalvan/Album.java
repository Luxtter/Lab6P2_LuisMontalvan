/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismontalvan;

import java.util.ArrayList;

/**
 *
 * @author luism
 */
public class Album extends Lanzamientos{
    ArrayList<Cancion> canciones = new ArrayList();
    private int cCanciones;

    public Album() {
        super();
    }

    public Album(int cCanciones, String tipo, String titulo, String fecha, int likes) {
        super(tipo, titulo, fecha, likes);
        this.cCanciones = cCanciones;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public int getcCanciones() {
        return cCanciones;
    }

    public void setcCanciones(int cCanciones) {
        this.cCanciones = cCanciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        return "Album{" + "canciones=" + canciones + ", cCanciones=" + cCanciones + '}';
    }
    
}

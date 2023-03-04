/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Lanzamientos {
    protected String tipo,titulo,fecha;
    protected int likes;

    public Lanzamientos() {
    }

    public Lanzamientos(String tipo, String titulo, String fecha, int likes) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.fecha = fecha;
        this.likes = likes;
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
        return "Lanzamientos{" + "tipo=" + tipo + ", titulo=" + titulo + ", fecha=" + fecha + ", likes=" + likes + '}';
    }
    
}

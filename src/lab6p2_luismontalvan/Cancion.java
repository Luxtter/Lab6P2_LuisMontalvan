/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Cancion {
    private String titulo, duracion, AoS;

    public Cancion() {
    }

    public Cancion(String titulo, String duracion, String AoS) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.AoS = AoS;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAoS() {
        return AoS;
    }

    public void setAoS(String AoS) {
        this.AoS = AoS;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", duracion=" + duracion + ", AoS=" + AoS + '}';
    }
    
}

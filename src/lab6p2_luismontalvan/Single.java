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
public class Single {
    ArrayList<Cancion> cancion = new ArrayList();

    public Single() {
        super();
    }

    public ArrayList<Cancion> getCancion() {
        return cancion;
    }

    public void setCancion(ArrayList<Cancion> cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return "Single{" + "cancion=" + cancion + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismontalvan;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author luism
 */
public class AdministrarLanzamientos {
    private ArrayList<Lanzamientos> listaLanzamientos = new ArrayList();//RAM
    private File archivo = null;//ROM

    public void administrarLanzamientoss(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Lanzamientos> getListaLanzamientos() {
        return listaLanzamientos;
    }

    public void setListaLanzamientoss(ArrayList<Lanzamientos> listaLanzamientos) {
        this.listaLanzamientos = listaLanzamientos;
    }

    @Override
    public String toString() {
        return "listaLanzamientos=" + listaLanzamientos;
    }

    //extra mutador
    public void setLanzamientos(Lanzamientos p) {
        this.listaLanzamientos.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            
            for (Lanzamientos t : listaLanzamientos) {
                if (t.getTipo().equalsIgnoreCase("Album")) {
                    
                    bw.write(t.getTitulo()+ ";");
                    bw.write(t.getTipo()+ ";");
                    bw.write(t.getFecha()+ ";");
                    bw.write(t.getLikes()+ ";");
                    
                }else{
                    bw.write(t.getTitulo()+ ";");
                    bw.write(t.getTipo()+ ";");
                    bw.write(t.getFecha()+ ";");
                    bw.write(t.getLikes()+ ";");
                }
                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaLanzamientos = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    int cCanciones = sc.nextInt();
                    if (sc.next().equalsIgnoreCase("Album")) {
                        listaLanzamientos.add(new Album(cCanciones,sc.next(),
                                    sc.next(),sc.next(),
                                    sc.nextInt()
                                 ));
                    }else{
                        listaLanzamientos.add(new Single(sc.nextLine(),sc.next(),sc.next(),
                                    sc.nextInt())
                                 );
                    }
                    
                    
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}

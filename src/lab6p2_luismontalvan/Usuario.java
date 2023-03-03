/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_luismontalvan;

/**
 *
 * @author luism
 */
public class Usuario {
    protected String nUsuario, tipoUsuario, contrasena;
    protected int edad;

    public Usuario() {
    }

    public Usuario(String nUsuario, String tipoUsuario, String contrasena, int edad) {
        this.nUsuario = nUsuario;
        this.tipoUsuario = tipoUsuario;
        this.contrasena = contrasena;
        this.edad = edad;
    }

    public String getnUsuario() {
        return nUsuario;
    }

    public void setnUsuario(String nUsuario) {
        this.nUsuario = nUsuario;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nUsuario=" + nUsuario + ", tipoUsuario=" + tipoUsuario + ", contrasena=" + contrasena + ", edad=" + edad + '}';
    }
    
    
}

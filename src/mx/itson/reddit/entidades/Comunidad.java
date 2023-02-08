/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.util.List;

/** 
 * Declaración de la clase Comunidad.
 * @author Emmanuel , Erick y Carlos
 * 
 */



public class Comunidad {
   
   
    private String nombre;
    private List<Usuario> usuario;


    public String getNombre() {
        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
 
    }

    public List<Usuario> getUsuario() {
        return usuario;
    }

    public void setUsuario(List<Usuario> usuario) {
        this.usuario = usuario;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Melanie Guaman
 */
public class Usuario extends Persona{
    private String email;


    public Usuario(String email, int ced, String nom, int edad, String direcc) {
        super(ced, nom, edad, direcc);
        this.email = email;
    }
    
    
}

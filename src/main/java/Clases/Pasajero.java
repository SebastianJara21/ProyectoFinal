/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Melanie Guaman
 */
public class Pasajero extends Padre{

    private int id;
    private String clase;
    private int numFicha;
    
    public Pasajero(int id, String clase, int numFicha, int ced, String nom, int edad, String direcc) {
        super(ced, nom, edad, direcc);
        this.id = id;
        this.clase = clase;
        this.numFicha = numFicha;
    }
 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Melanie Guaman
 */
public class Pasajero extends Persona {

    private int id;
    private String clase;
    private int numFicha;

    public Pasajero(int id, String clase, int numFicha, int ced, String nom, int edad, String direcc) {
        super(ced, nom, edad, direcc);
        this.id = id;
        this.clase = clase;
        this.numFicha = numFicha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getNumFicha() {
        return numFicha;
    }

    public void setNumFicha(int numFicha) {
        this.numFicha = numFicha;
    }

}

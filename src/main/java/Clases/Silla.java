/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Melanie Guaman
 */
public class Silla {
    private int numSilla;
    private String ubiSilla;
    private String claseSilla;

    public Silla(int numSilla, String ubiSilla, String claseSilla) {
        this.numSilla = numSilla;
        this.ubiSilla = ubiSilla;
        this.claseSilla = claseSilla;
    }

    public int getNumSilla() {
        return numSilla;
    }

    public void setNumSilla(int numSilla) {
        this.numSilla = numSilla;
    }

    public String getUbiSilla() {
        return ubiSilla;
    }

    public void setUbiSilla(String ubiSilla) {
        this.ubiSilla = ubiSilla;
    }

    public String getClaseSilla() {
        return claseSilla;
    }

    public void setClaseSilla(String claseSilla) {
        this.claseSilla = claseSilla;
    }
    
}

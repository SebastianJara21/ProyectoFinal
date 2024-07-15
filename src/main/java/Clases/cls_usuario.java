/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Melanie Guaman
 */
public class cls_usuario extends Persona{
    
    private String email;
    private String contra;

    public cls_usuario(String email, String contra, String ced, String nom, int edad, String direcc) {
        super(ced, nom, edad, direcc);
        this.email = email;
        this.contra = contra;
    }

   
    
}

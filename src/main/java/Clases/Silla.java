/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Melanie Guaman
 */
public class Silla implements Interface_GuardarBuscar{
    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    FileWriter escribir;
    PrintWriter linea;
    
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

    @Override
    public boolean mtd_guardar() {
        boolean ban = false;
        if (seleccionado.showDialog(null, "Guardar archivo .txt") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
        }
        if (archivo.exists()) {
            archivo.delete();
        }
        if (archivo.getName().endsWith("txt")) {
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("N silla=" + this.numSilla() + "\n");
                linea.println("Ubicacion silla=" + this.ubiSilla() + "\n");
                linea.println("Clase silla=" + this.claseSilla() + "\n");
                
                linea.close();
                escribir.close();
                ban = true;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
                ban = false;
            }
            JOptionPane.showMessageDialog(null, "Se guardo con exito el archivo");
        } else {
            JOptionPane.showMessageDialog(null, "La extensión del archivo debe ser txt.");
            ban = false;
        }
        return ban;
    }

    @Override
    public boolean mtd_buscar() {
         boolean ban = true;
        try {
            if (seleccionado.showDialog(null, "Abrir archivo .txt") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionado.getSelectedFile();
                FileReader reader = new FileReader(archivo);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] parts = line.split("=");
                    if (parts[0].equals("E-mail")) {
                        this.setNumSilla(Integer.parseInt(parts[1]));
                    } else if (parts[0].equals("N silla")) {
                        this.setUbiSilla(parts[2]);
                    } else if (parts[0].equals("Ubicacion silla")) {
                        this.setUbiSilla(parts[1]);
                    } else if (parts[0].equals("Clase silla")) {
                        this.setClaseSilla(parts[1]);
                    } 
                }
                reader.close();
            }
        } catch (IOException ex) {
            System.out.println("Error al leer el archivo.");

            ban = false;
        }
        return ban;
    }

    private String numSilla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String ubiSilla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private String claseSilla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

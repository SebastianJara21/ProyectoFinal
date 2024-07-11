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
public class Usuario extends Persona implements Interface_GuardarBuscar {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    FileWriter escribir;
    PrintWriter linea;

    private String email;
    private String contra;

    public Usuario(String email, String contra, int ced, String nom, int edad, String direcc) {
        super(ced, nom, edad, direcc);
        this.email = email;
        this.contra = contra;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
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

                linea.println("E-mail=" + this.getEmail() + "\n");
                linea.println("Contraseña=" + this.getContra() + "\n");
                linea.println("Cédula=" + this.getCed() + "\n");
                linea.println("Nombre=" + this.getNom() + "\n");
                linea.println("Edad=" + this.getEdad() + "\n");
                linea.println("Dirección=" + this.getDirecc() + "\n");

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
                        this.setEmail(parts[1]);
                    } else if (parts[0].equals("Contraseña")) {
                        this.setContra(parts[1]);
                    } else if (parts[0].equals("Cédula")) {
                        this.setCed(Integer.parseInt(parts[1]));
                    } else if (parts[0].equals("Nombre")) {
                        this.setNom(parts[1]);
                    } else if (parts[0].equals("Edad")) {
                        this.setEdad(Integer.parseInt(parts[1]));
                    } else if (parts[0].equals("Dirección")) {
                        this.setDirecc(parts[1]);
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
}



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Utilidades {

    public static boolean grabaArchivo(String nombreArchivo, String linea) throws Exception {

        try {

            ArrayList<String> archivoEnLineas = arregloArchivo(nombreArchivo); //hacer el metodo arregloArchivo
            archivoEnLineas.add(linea);

        } catch (IOException exception) {
        } finally {
            try {

            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
        return true;
    }

    public static ArrayList<String> arregloArchivo(String nombreArchivo) throws Exception {
        ArrayList<String> lineas = new ArrayList<>();
        FileReader fileReader = new FileReader(nombreArchivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linea;
        while ((linea = bufferedReader.readLine()) != null) {

            if (linea.length() > 0) {
                lineas.add(linea);
            }
        }
        return lineas;
    }

    private static String arrayToString(ArrayList<String> lineas) {
        StringBuilder builder = new StringBuilder();
        for (String linea : lineas) {
            builder.append(linea + "\n");
        }
        return builder.toString();
    }

    //con estos tres metodos hago la interface y la excepcion para luego hacer el negoocio
    //ahora para el boton buscar
    public static String buscarEnArchivo(String criterio) {

        try {

            String linea = null;
            while (linea != null) {
                if (isBuscarEnlinea(criterio, linea)) {
                    return linea;
                }
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        } finally {
            try {

            } catch (Exception exception) {
                exception.printStackTrace();
            }
        }

        return null;

    }

    private static boolean isBuscarEnlinea(String criterio, String linea) {
        boolean bandera = false;
        String[] array = linea.split(";");
        for (String temporal : array) {
            if (criterio.trim().equals(temporal.trim())) {
                bandera = true;
                return bandera;
            }
        }
        return bandera;
    }

    // eliminar
    public static boolean eliminar(String nombreArchivo, String criterio) throws Exception {

        try {
            String borrar = "";
            ArrayList<String> archivoEnLineas = arregloArchivo(nombreArchivo);
            for (String lineaTemporal : archivoEnLineas) {
                if (isBuscarEnlinea(criterio, lineaTemporal)) {
                    borrar = lineaTemporal;
                }
            }
            archivoEnLineas.remove(borrar);

        } catch (IOException exception) {
        } finally {
            try {

            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
        return true;
    }

    //actualizar
    public static boolean actualizar(String nombreArchivo, String criterio, String linea) throws Exception {

        try {
            String borrar = "";
            ArrayList<String> archivoEnLineas = arregloArchivo(nombreArchivo);
            for (String lineaTemporal : archivoEnLineas) {
                if (isBuscarEnlinea(criterio, lineaTemporal)) {
                    borrar = lineaTemporal;
                }
            }
            archivoEnLineas.remove(borrar);
            archivoEnLineas.add(linea);

        } catch (IOException exception) {
        } finally {
            try {

            } catch (Exception exception2) {
                exception2.printStackTrace();
            }
        }
        return true;
    }

}

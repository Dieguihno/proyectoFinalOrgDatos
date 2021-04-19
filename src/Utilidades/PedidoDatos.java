/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import Entidades.TomarPedido;
import java.util.ArrayList;
import java.util.List;
import Entidades.Excepciones.Exepcion;

/**
 *
 * @author diego
 */
public class PedidoDatos {
    
    //faltaria instanciar en las clases negocio e interface estos metodos
    public static final String TOKEN = ";";
    
     public String agregar(TomarPedido pedido) throws Exepcion, Exception {

        String nombreCurso = null;
        String lineaCurso = mapeaCursoLinea(pedido); //nos vamos a hacer mapeaCursoLinea
        boolean grabaFicheroCurso = Utilidades.grabaArchivo(lineaCurso);
        if (grabaFicheroCurso) {
            nombreCurso = curso.getNombreCurso();
            return nombreCurso;
        }
        return nombreCurso;
    }

    private String mapeaCursoLinea(TomarPedido pedido) {
        StringBuilder builder = new StringBuilder();
        builder.append(curso.getNombreCurso()).append(TOKEN);
        builder.append(curso.getCupo()).append(TOKEN);
        builder.append(curso.isTipo()).append(TOKEN);
        builder.append(curso.getProfesor1()).append(TOKEN);
        builder.append(curso.getProfesor2()).append(TOKEN);
        builder.append(curso.isSistemas()).append(TOKEN);
        builder.append(curso.isSoftware()).append(TOKEN);
        builder.append(curso.getCosto()).append(TOKEN);

        return builder.toString();
    }

    //metodo para eliminar
    @Override
    public String eliminar(TomarPedido pedido) throws Exepcion, Exception  {
        boolean eliminar = Utilidades.eliminar(ARCHIVO_CURSOS, curso.getNombreCurso());
        if (eliminar) {
            return curso.getNombreCurso();
        }
        return "";

    }

    //metodo para actualizar
    @Override
    public String Actualizar(TomarPedido pedido) throws Exepcion, Exception  {
        String lineaCurso = mapeaCursoLinea(curso);
        boolean actualizar = Utilidades.actualizar(ARCHIVO_CURSOS, curso.getNombreCurso(), lineaCurso);
        if (actualizar) {
            return curso.getNombreCurso();
        }
        return "";
    }

    //metodo de consulta
    @Override
    public Curso consultar(String nombrePedido) throws Exepcion, Exception  {
        try {
            String lineaCurso = Utilidades.buscarEnArchivo(ARCHIVO_CURSOS, nombreCurso);
            return mapeaLineaCurso(lineaCurso);
        } catch (Exception e) {
        }
        return null;

    }

//para meter los datos en las tablas
    @Override
    public List<Curso> consultarTodosLosCursos() throws Exception {
        List<Curso> listaCursos = new ArrayList<>();
        List<String> listaLineas = Utilidades.arregloArchivo(ARCHIVO_CURSOS);
        for (String listaLinea : listaLineas) {
            Curso cursoTemporal = mapeaLineaCurso(listaLinea);
            listaCursos.add(cursoTemporal);
        }
        return listaCursos;
    }

//otro metodo importante para el array
    private Curso mapeaLineaCurso(String lineaPedido) {
        Curso curso = new Curso();
        try {
            String[] arrayCurso = lineaCurso.split(TOKEN);
            curso.setNombreCurso(arrayCurso[0]);
            curso.setCupo(Integer.parseInt(arrayCurso[1]));
            curso.setProfesor1(arrayCurso[2]);
            curso.setProfesor2(arrayCurso[3]);
            curso.setTipo(Boolean.parseBoolean(arrayCurso[4]));
            curso.setSistemas(Boolean.parseBoolean(arrayCurso[5]));
            curso.setSoftware(Boolean.parseBoolean(arrayCurso[6]));
            curso.setCosto(Double.parseDouble(arrayCurso[7]));

        } catch (Exception e) {

        }
        return curso;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;
import p1.*;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerPromedioMatriculas() {
        double suma = 0;

        for (int i = 0; i < matriculas.size(); i++) {
            suma = suma + matriculas.get(i).obtenerTarifa();
        }

        promedioMatriculas = suma / matriculas.size();
    }

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    @Override
    public String toString() {
         String mensaje = "Listado de Matrículas: \n";
        for (Matricula m : matriculas) {
            mensaje = String.format("%s%s"
                    + "-----------------\n", mensaje, m);
        }
        
         mensaje = String.format("%s\nLa tarifa promedio es: %.2f\n",
                mensaje, 
                promedioMatriculas);
        return mensaje;
    }

}

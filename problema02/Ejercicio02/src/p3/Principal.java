/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import java.util.ArrayList;
import p1.*;
import p2.TipoMatricula;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList <Matricula> matriculas = new ArrayList ();
        
        
        Matricula mcamp = new MatriculaCampamento();       
        Matricula mcolegio = new MatriculaColegio();      
        Matricula mescuela = new MatriculaEscuela();
        Matricula mjardin = new MatriculaJardin();
        Matricula mmaternal = new MatriculaMaternal();
        Matricula mmaternal2 = new MatriculaMaternal();
        
        matriculas.add(mcamp);
        matriculas.add(mcolegio);
        matriculas.add(mescuela);
        matriculas.add(mjardin);
        matriculas.add(mmaternal);
        matriculas.add(mmaternal2);
        
        
        for (Matricula m : matriculas) {
            m.establecerTarifa();
        }
        
        TipoMatricula tipos = new TipoMatricula();
        tipos.establecerMatriculas(matriculas);
        tipos.establecerPromedioMatriculas();
        
        System.out.printf("%s\n", tipos);
    }
}

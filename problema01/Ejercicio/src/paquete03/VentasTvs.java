/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

/**
 *
 * @author reroes
 */
public class VentasTvs {

    ArrayList<Televisor> televisores;
    double totalPrecioTvs;
    String listaMarcasVendidas;
    double televisorMasCaro;

    public VentasTvs(ArrayList<Televisor> t) {
        televisores = t;
    }

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public void establecerTotalPrecioTvs() {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();

        }
        totalPrecioTvs = s;
    }

    public void establecerTelevisorMasCaro() {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > s) {
                s = televisores.get(i).obtenerPrecio();

            }
        }

        televisorMasCaro = s;
    }

    public void establecerListaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s%s\n", s, televisores.get(i).obtenerMarca());
        }
        listaMarcasVendidas = s;
    }

    public double obtenerTotalPrecioTvs() {
        return totalPrecioTvs;
    }

    public String obtenerListaMarcasVendidas() {
        return listaMarcasVendidas;
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    @Override
    public String toString() {
        String mensaje = "";
        for (Televisor t : televisores) {
            mensaje = String.format("%s%s\n"
                    + "-----------------\n", mensaje, t);
        }

        mensaje = String.format("%sPrecio total de Tv's: %.2f\n"
                + "Televisor mas caro: %s\n"
                + "Marcas vendidos: \n%s\n", mensaje,
                obtenerTotalPrecioTvs(),
                obtenerTelevisorMasCaro(),
                obtenerListaMarcasVendidas());

        return mensaje;

    }

}


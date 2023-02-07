package main;

import conversor.Fahrenheit;
import conversor.Reaumur;
import tabla.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla();
        tabla.addConversor(new Fahrenheit());
        tabla.addConversor(new Reaumur());
        tabla.addHeader();
        tabla.addTabla(0, 100, 5);
    }
}
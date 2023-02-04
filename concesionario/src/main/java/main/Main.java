package main;

import impuesto.ImpuestoCirculacion;
import lista.ListaCoches;
import lista.ListaMotos;
import lista.ListaTodos;
import lista.ListaTransporteMaterial;
import vehiculos.Vehiculo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Vehiculo> listaPrincipal = new LinkedList<>();

        listaPrincipal.add(new Vehiculo("Utilitario", "1234ABC", 125, 4, 3, 100, "Diesel", 3, 1500, 4, 135));
        listaPrincipal.add(new Vehiculo("Furgoneta", "7674BKL", 761, 3, 2, 110, "Diesel", 4, 3000, 4, 120));
        listaPrincipal.add(new Vehiculo("Familiar", "4315NHD", 146, 5, 5, 130, "Gasolina", 5, 1800, 4, 145));
        listaPrincipal.add(new Vehiculo("Camioneta", "7463QWC", 175, 5, 4, 135, "Diesel", 4, 2500, 4, 130));
        listaPrincipal.add(new Vehiculo("Scooter", "4682RBC", 345, 1, 0, 125, "Gasolina", 2, 500, 2, 120));
        listaPrincipal.add(new Vehiculo("MotoCarretera", "1946FKH", 456, 1, 0, 140, "Gasolina", 2, 500, 2, 135));
        listaPrincipal.add(new Vehiculo("Deportivo", "7954TFR", 167, 2, 2, 300, "Gasolina", 6, 1500, 4, 250));

        ListaTodos todos = new ListaTodos(listaPrincipal);
        ListaCoches coches = new ListaCoches(listaPrincipal);
        ListaMotos motos = new ListaMotos(listaPrincipal);
        ListaTransporteMaterial transportes = new ListaTransporteMaterial(listaPrincipal);

        System.out.println("Lista de Vehiculos: ");
        todos.imprimirLista();
        System.out.format("%n%n%n");
        System.out.println("Lista de Coches: ");
        coches.imprimirLista();
        System.out.format("%n%n%n");
        System.out.println("Lista de Motos: ");
        motos.imprimirLista();
        System.out.format("%n%n%n");
        System.out.println("Lista de Transportes: ");
        transportes.imprimirLista();
        System.out.format("%n%n%n");

        System.out.println("Impuestos: ");
        System.out.println("Utilitario: " + new ImpuestoCirculacion(new Vehiculo("Utilitario", "1234ABC", 125, 4, 3, 100, "Diesel", 3, 1500, 4, 135)).calcularImpuesto());
        System.out.println("Deportivo: " + new ImpuestoCirculacion(new Vehiculo("Deportivo", "7954TFR", 167, 2, 2, 300, "Gasolina", 6, 1500, 4, 250)).calcularImpuesto());
    }
}
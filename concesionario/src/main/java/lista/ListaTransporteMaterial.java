package lista;

import vehiculos.Vehiculo;
import java.util.LinkedList;

public class ListaTransporteMaterial implements Lista{
    LinkedList<Vehiculo> listaTransportes = new LinkedList<>();
    public ListaTransporteMaterial(LinkedList<Vehiculo> listaVehiculos){
        for(Vehiculo vehiculo : listaVehiculos){
            if ("Furgoneta, Camioneta".contains(vehiculo.getTipo())){
                listaTransportes.add(vehiculo);
            }
        }
    }
    public void imprimirLista(){
        for(Vehiculo transporte : listaTransportes){
            System.out.println(transporte.getTipo() + "-->" + transporte.getMatricula());
        }
    }
}
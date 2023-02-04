package vehiculos;

public class Vehiculo{
    String tipo;
    String matricula;
    int numBastidor;
    int plazas;
    int puertas;
    int cilindrada;
    String combustible;
    int cilindros;
    double tara;
    int ruedas;
    int velMaxima;

    public Vehiculo(String tipo, String matricula, int numBastidor, int plazas, int puertas, int cilindrada, String combustible, int cilindros, double tara, int ruedas, int velMaxima){
        this.tipo=tipo;
        this.matricula=matricula;
        this.numBastidor=numBastidor;
        this.plazas=plazas;
        this.puertas=puertas;
        this.cilindrada=cilindrada;
        this.combustible=combustible;
        this.cilindros=cilindros;
        this.tara=tara;
        this.ruedas=ruedas;
        this.velMaxima=velMaxima;
    }

    public String getTipo(){
        return this.tipo;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public int getCilindrada(){
        return this.cilindrada;
    }
    public String getCombustible(){
        return this.combustible;
    }
    public double getTara(){
        return this.tara;
    }
}
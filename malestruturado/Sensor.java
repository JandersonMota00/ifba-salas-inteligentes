package malestruturado;

public class Sensor {

    private int id;
    private SensorTipo tipo;
    private double valor; // Pode ser temperatura e intensidade de luz
    
    public Sensor(int id, SensorTipo tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public SensorTipo getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "\n\tId = " + id +
                "\n\tTipo = " + tipo +
                "\n\tValor = " + valor +
                '}';
    }
    
}

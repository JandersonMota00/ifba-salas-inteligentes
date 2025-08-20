package bemestruturado.model;

public interface Sensor<T> {

    int getId();
    SensorTipo getTipo();
    T lerValor();

}

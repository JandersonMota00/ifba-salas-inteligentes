package bemestruturado.model.sensores;

import java.util.Random;

import bemestruturado.model.Sensor;
import bemestruturado.model.SensorTipo;

public class TemperaturaSensor implements Sensor<Double> {

    private final int id; // Adicionamos o atributo id aqui
    private double temperatura;

    public TemperaturaSensor(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id; // Retorna o id
    }

    @Override
    public SensorTipo getTipo() {
        return SensorTipo.TEMPERATURA; // Retorna o tipo específico
    }

    @Override
    public Double lerValor() {
        temperatura = 18 + new Random().nextDouble(10); // simula leitura
        return temperatura;
    }

}

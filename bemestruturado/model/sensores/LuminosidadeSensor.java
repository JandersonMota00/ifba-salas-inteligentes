package bemestruturado.model.sensores;

import java.util.Random;

import bemestruturado.model.Sensor;
import bemestruturado.model.SensorTipo;

public class LuminosidadeSensor implements Sensor<Integer> {

    private int id;
    private int intensidade;

    public LuminosidadeSensor(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public SensorTipo getTipo() {
        return SensorTipo.LUMINOSIDADE;
    }

    @Override
    public Integer lerValor() {
        intensidade = new Random().nextInt(100);
        return intensidade;
    }
    
}

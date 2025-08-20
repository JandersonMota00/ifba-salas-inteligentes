package bemestruturado.model.sensores;

import java.util.Random;

import bemestruturado.model.Sensor;
import bemestruturado.model.SensorTipo;

public class PresencaSensor implements Sensor<Boolean> {

    private final int id; // Adicionamos o atributo id aqui
    private boolean presenca;

    public PresencaSensor(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return this.id; // Retorna o id
    }

    @Override
    public SensorTipo getTipo() {
        return SensorTipo.PRESENCA; // Retorna o tipo específico
    }

    @Override
    public Boolean lerValor() {
        presenca = new Random().nextBoolean();
        return presenca;
    }
    
}

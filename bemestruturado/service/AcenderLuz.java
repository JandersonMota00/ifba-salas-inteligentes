package bemestruturado.service;

import bemestruturado.model.Sensor;
import bemestruturado.model.SensorTipo;
import bemestruturado.model.sensores.PresencaSensor;

public class AcenderLuz implements AcaoStrategy {

    @Override
    public boolean podeExecutar(Sensor<?> sensor) {
        // Verifica se o sensor é de Presença
        return sensor.getTipo() == SensorTipo.PRESENCA;
    }

    @Override
    public void executar(Sensor<?> sensor) {
        // O cast aqui é seguro porque podeExecutar já filtrou o tipo
        PresencaSensor sensorDePresenca = (PresencaSensor) sensor;
        if (sensorDePresenca.lerValor()) {
            System.out.println("Luz acesa!");
        }
    }
    
}

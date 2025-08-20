package bemestruturado.service;

import bemestruturado.model.Sensor;
import bemestruturado.model.sensores.LuminosidadeSensor;
import bemestruturado.model.sensores.PresencaSensor;
import bemestruturado.model.sensores.TemperaturaSensor;
import bemestruturado.model.SensorTipo;

public class SensorFactory {

    public static Sensor<?> criarSensor(int id, SensorTipo tipo) { // Ajuste aqui para SensorTipo
        return switch (tipo) {
            case TEMPERATURA -> new TemperaturaSensor(id);
            case PRESENCA -> new PresencaSensor(id);
            case LUMINOSIDADE -> new LuminosidadeSensor(id);
        };
    }

}

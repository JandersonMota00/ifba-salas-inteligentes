package malestruturado;

import java.util.Random;

public class SensorService {

    private Random random = new Random();

    public void atualizarSensor(Sensor sensor) {
        switch (sensor.getTipo()) {
            case TEMPERATURA -> sensor.setValor(18 + random.nextDouble() * 10); // 18-28 ºC
            case PRESENCA -> sensor.setValor(random.nextBoolean() ? 1 : 0); // 0 ou 1
            case LUMINOSIDADE -> sensor.setValor(random.nextDouble() * 100); // 0-100
        }
    }
    
}

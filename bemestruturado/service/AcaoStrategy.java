package bemestruturado.service;

import bemestruturado.model.Sensor;

public interface AcaoStrategy {
    boolean podeExecutar(Sensor<?> sensor);
    void executar(Sensor<?> sensor);
}

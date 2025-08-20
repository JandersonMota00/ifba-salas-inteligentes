package bemestruturado.service;

import java.util.List;

import bemestruturado.model.Sensor;

public class RelatorioTexto extends Relatorio {

    @Override
    protected void cabecalho() {
        System.out.println("===== Relatório de Sensores =====");
    }

    @Override
    protected void corpo(List<Sensor> sensores) {
        for(Sensor sensor : sensores) {
            System.out.println("Sensor ID: " + sensor.getId() + ", Tipo: " + sensor.getTipo() + ", Valor: " + sensor.lerValor());
        }
    }

    @Override
    protected void rodape() {
        System.out.println("===== Fim do Relatório =====");
    }

}

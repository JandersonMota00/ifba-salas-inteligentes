package bemestruturado;

import bemestruturado.model.Sensor;
import bemestruturado.model.SensorTipo;
import bemestruturado.service.AcaoStrategy;
import bemestruturado.service.AcenderLuz;
import bemestruturado.service.Relatorio;
import bemestruturado.service.RelatorioFactory;
import bemestruturado.service.SensorFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Sensor<?>> sensores = List.of(
                SensorFactory.criarSensor(1, SensorTipo.TEMPERATURA),
                SensorFactory.criarSensor(2, SensorTipo.PRESENCA),
                SensorFactory.criarSensor(3, SensorTipo.LUMINOSIDADE)
        );

        // Estratégia de ação
        AcaoStrategy acao = new AcenderLuz();
        sensores.stream()
                .filter(acao::podeExecutar)
                .forEach(acao::executar);

        // Relatório
        Relatorio relatorio = RelatorioFactory.criarRelatorio("texto");
        relatorio.gerar(sensores);
    }
}
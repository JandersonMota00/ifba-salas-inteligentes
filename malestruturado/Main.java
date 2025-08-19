package malestruturado;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Criando a sala
        SalaInteligente sala = new SalaInteligente("Laboratório 1");
        sala.adicionarSensor(new Sensor(1, SensorTipo.TEMPERATURA));
        sala.adicionarSensor(new Sensor(2, SensorTipo.PRESENCA));
        sala.adicionarSensor(new Sensor(3, SensorTipo.LUMINOSIDADE));

        SensorService sensorService = new SensorService();
        MonitoramentoService monitoramentoService = new MonitoramentoService();
        RelatorioService relatorioService = new RelatorioService();

        // Simulação em loop
        for (int i = 0; i < 5; i++) {
            sala.getSensores().forEach(sensorService::atualizarSensor);
            monitoramentoService.verificarSala(sala);
            relatorioService.gerarRelatorio(sala);

            Thread.sleep(2000); // espera 2 segundos
        }
    }
    
}

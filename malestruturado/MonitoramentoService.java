package malestruturado;

public class MonitoramentoService {

    public void verificarSala(SalaInteligente sala) {
        sala.getSensores().forEach(sensor -> {
            if (sensor.getTipo() == SensorTipo.PRESENCA && sensor.getValor() == 1) {
                sala.setLuzAcesa(true);
            }
        });

        // Se não há presença, apaga a luz
        boolean presencaDetectada = sala.getSensores().stream()
                .anyMatch(s -> s.getTipo() == SensorTipo.PRESENCA && s.getValor() == 1);

        if (!presencaDetectada) {
            sala.setLuzAcesa(false);
        }
    }
    
}

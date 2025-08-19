package malestruturado;

import java.util.ArrayList;
import java.util.List;

public class SalaInteligente {
    
    private String nome;
    private List<Sensor> sensores;
    private boolean luzAcesa;
    
    public SalaInteligente(String nome) {
        this.nome = nome;
        this.sensores = new ArrayList<>();
        this.luzAcesa = false; // Por padrão, a luz está apagada
    }

    public void adicionarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public String getNome() {
        return nome;
    }

    public List<Sensor> getSensores() {
        return sensores;
    }

    public boolean isLuzAcesa() {
        return luzAcesa;
    }

    public void setLuzAcesa(boolean luzAcesa) {
        this.luzAcesa = luzAcesa;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "\n\tNome = " + nome +
                "\n\tSensores = " + sensores +
                "\n\tLuzAcesa = " + luzAcesa +
                '}';
    }

}

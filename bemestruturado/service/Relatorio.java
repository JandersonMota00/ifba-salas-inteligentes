package bemestruturado.service;

import java.util.List;

import bemestruturado.model.Sensor;

public abstract class Relatorio {

    public final void gerar(List<Sensor> sensores) {
        cabecalho();
        corpo(sensores);
        rodape();
    }

    protected abstract void cabecalho();
    protected abstract void corpo(List<Sensor> sensores);
    protected abstract void rodape();

}

package bemestruturado.service;

public class RelatorioFactory {

    public static Relatorio criarRelatorio(String tipo) {
        switch (tipo.toLowerCase()) {
            case "texto":
                return new RelatorioTexto();
            //case "html": return new RelatorioHtml();
            default:
                throw new IllegalArgumentException("Tipo de relatório desconhecido: " + tipo);
        }
    }
    
}

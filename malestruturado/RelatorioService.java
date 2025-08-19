package malestruturado;

public class RelatorioService {

    public void gerarRelatorio(SalaInteligente sala) {
        System.out.println("=== Relatório da Sala: " + sala.getNome() + " ===");
        sala.getSensores().forEach(System.out::println);
        System.out.println("Luz acesa: " + sala.isLuzAcesa());
        System.out.println("=====================================");
    }
    
}

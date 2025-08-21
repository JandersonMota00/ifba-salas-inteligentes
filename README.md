# Trabalho de Monitoramento de Salas Inteligentes
- **Instituição:** IFBA - Instituto Federal da Bahia
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projetos
- **Projeto:** Criação e Evolução de um Sistema Mal Projetado com Aplicação Guiada de Padrões
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

# Sistema de Monitoramento de Salas Inteligentes
Desenvolver um pequeno sistema de monitoramento de salas inteligentes, com funcionalidades básicas como:
- Cadastro de sensores (temperatura, presença, luminosidade);
- Coleta periódica de dados;
- Acionamento de ações com base em condições simples (ex: acender luz se presença = true);
- Geração de relatórios simples.

> Basicamente projetar propositalmente um sistema com problemas de acoplamento, coesão e violação de SOLID, para depois refatorar usando padrões GOF (criação, estruturais e comportamentais).

[A6 - SAJ-ADS08 - Criação e Evolução de um Sistema Mal Projetado.pdf](https://github.com/user-attachments/files/21842005/A6.-.SAJ-ADS08.-.Criacao.e.Evolucao.de.um.Sistema.Mal.Projetado.com.Aplicacao.Guiada.de.Padroes.1.pdf)

## Integrantes do Projeto

<table>
  <tr>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/111200453?v=4" width="100px;" alt="Foto do Integrante Amanda"/><br />
      <sub><b><a href="https://github.com/Amandalopes28">Amanda Lopes</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/80362674?v=4" width="100px;" alt="Foto do Integrante Janderson"/><br />
      <sub><b><a href="https://github.com/JandersonMota">Janderson Mota</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/110790276?v=4" width="100px;" alt="Foto da Integrante Sarah"/><br />
      <sub><b><a href="https://github.com/">Sarah Pithon</a></b></sub>
    </td>
  </tr>
</table>

## Tecnologias
- **Linguagem:** Java 21

## Estrutura do Projeto

### Mal Estruturado
```
malestruturado/
 ├── Main.java
 ├── Sensor.java
 ├── SensorTipo.java
 ├── SensorService.java
 ├── SalaInteligente.java
 ├── MonitoramentoService.java
 └── RelatorioService.java
```

### Bem Estruturado
```
bemestruturado/
 ├── model/
 │    ├── Sensor.java
 │    ├── SensorTipo.java
 │    └── sensores/
 │         ├── TemperaturaSensor.java
 │         ├── PresencaSensor.java
 │         └── LuminosidadeSensor.java
 ├── service/
 │    ├── AcaoStrategy.java
 │    ├── AcenderLuz.java
 │    ├── Relatorio.java
 │    ├── RelatorioTexto.java
 │    ├── RelatorioFactory.java
 │    └── SensorFactory.java
 └── Main.java
```

## Diagrama UML
Antes
<img width="3840" height="1588" alt="Untitled diagram _ Mermaid Chart-2025-08-21-011148" src="https://github.com/user-attachments/assets/40aee2ea-761a-4a71-9bf8-b67c23b3d06d" />


Depois
<img width="3840" height="1585" alt="Untitled diagram _ Mermaid Chart-2025-08-21-010709" src="https://github.com/user-attachments/assets/ee47aff7-8d8d-4ef4-a90a-c6ef717727bc" />



## Documentação Técnica

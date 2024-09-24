package ControleCandidato.Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);
        }
    
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu= atender();
            continuarTentando= !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else
                System.out.println("Contato realizado com sucesso");
        }while(continuarTentando && tentativasRealizadas < 3);
        if (atendeu) 
            System.out.println("Conseguimos contato com o " + candidato +" na " + tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com o " + candidato + ", numero maximo de tentativas " + tentativasRealizadas + " realizada");
        
    }
    
    //metodo auxiliar 
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    
    static void imprimindoSelecionados() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
            System.out.println("Imrpimindo a lista de candidatos conforme o seu indice: ");
        for(int indice=0; indice < candidatos.length; indice++) {
           System.out.println("O candidato de numero: " + (indice+1) + " é o candidato: "+ candidatos[indice]);
            //forma abreviada for each 
            //for(String candidato: candidatos){
            // System.out.println("O candidato selecionado foi: "+ candidato);
            // }
        }

    }

    // Método para selecionar candidatos
    static void selecaoCandidatos() {
        String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", 
                               "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            // Corrigido para exibir a variável correta
            System.out.println("O candidato " + candidato + " solicitou este valor: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    // Método para gerar o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200); // Faixa alterada para gerar valores diferentes
    }

    // Método para analisar o candidato (opcional se for usar no futuro)
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}
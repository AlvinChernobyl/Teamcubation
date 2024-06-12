package br.com.teamcubation.exercicios.estruturadados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio9 {
    public class Exercicio {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Queue<String> emailsOffline = new LinkedList<>();

            while (true) {
                System.out.println("Digite o email para enviar (ou 'online' para enviar todos):");
                String email = sc.nextLine();

                if (email.equalsIgnoreCase("online")) {
                    while (!emailsOffline.isEmpty()) {
                        String emailEnviado = emailsOffline.poll();
                        System.out.println("Enviando email: " + emailEnviado);
                    }
                    System.out.println("Todos os emails foram enviados.");
                    break;
                } else {
                    emailsOffline.offer(email);
                    System.out.println("Email adicionado à fila para enviar quando online.");
                }
            }

            sc.close();
        }
    }
}
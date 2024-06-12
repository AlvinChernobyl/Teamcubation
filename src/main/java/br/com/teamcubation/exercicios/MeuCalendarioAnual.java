package br.com.teamcubation.exercicios;

import java.util.Scanner;

public class MeuCalendarioAnual {

        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o ano que você quer ver o calendário: ");
            int ano = entrada.nextInt();

            int diaSemanaInicioAno = determinarDiaSemana(1, 1, ano);

            imprimirCalendario(ano, diaSemanaInicioAno);

            entrada.close();
        }

        private static int determinarDiaSemana(int dia, int mes, int ano) {
            if (mes < 3) {
                mes += 12;
                ano--;
            }
            int diaSemana = (dia + 2 * mes + (3 * (mes + 1)) / 5 + ano + (ano / 4) - (ano / 100) + (ano / 400)) % 7;
            return diaSemana;
        }

        private static void imprimirCalendario(int ano, int diaSemanaInicioAno) {
            String[] nomesMeses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                    "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

            int[] diasPorMes = {31, (ehAnoBissexto(ano) ? 29 : 28), 31, 30, 31, 30,
                    31, 31, 30, 31, 30, 31};

            int diaDoMes = 1;

            for (int mes = 0; mes < 12; mes++) {
                System.out.println("\n" + nomesMeses[mes] + " " + ano);
                System.out.println("Dom Seg Ter Qua Qui Sex Sab");


                for (int i = 0; i < diaSemanaInicioAno; i++) {
                    System.out.print("    ");
                }


                while (diaDoMes <= diasPorMes[mes]) {
                    System.out.printf("%3d ", diaDoMes);

                    diaDoMes++;
                    diaSemanaInicioAno++;

                    if (diaSemanaInicioAno % 7 == 0) {
                        System.out.println();
                    }
                }

                diaSemanaInicioAno = diaSemanaInicioAno % 7;
                diaDoMes = 1;

                System.out.println();
            }
        }

        private static boolean ehAnoBissexto(int ano) {
            return ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0);
        }
}

package Target;

import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Execute o código e obtenha as respostas.
         Fique à vontade para dar feedback :)*/

        /*1*/

        int indice = 13;
        int soma = 0, k = 0;

        while (k < indice) {
            k++;
            soma += k;
        }
        System.out.println("1| O valor da variável soma é: " + soma);

        /*2*/
        System.out.println();

        System.out.println("2| Sequência de Fibonacci: ");
        System.out.print("Digite o número para verificar se está na sequência: ");
        int numeroVerificar = sc.nextInt();

        int x = 0;
        int y = 1;
        boolean inicialFibonacci = false;

        if (numeroVerificar == 0 || numeroVerificar == 1) {
            inicialFibonacci = true;
        } else {
            while (y <= numeroVerificar) {
                int temporario = x + y;
                if (temporario == numeroVerificar) {
                    inicialFibonacci = true;
                    break;
                }
                x = y;
                y = temporario;
            }
        }

        if (inicialFibonacci) {
            System.out.println(numeroVerificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroVerificar + " não pertence à sequência de Fibonacci.");
        }

        /*3*/
        System.out.println();
        System.out.println("3| Complete o próximo elemento: ");

        /* Somando de dois em dois */
        System.out.println(" - a) 1, 3, 5, 7, 9");

        /* Multiplicando os números por dois */
        System.out.println(" - b) 2, 4, 8, 16, 32, 64, 128");

        /* Sequência de números elevado ao quadrado */
        System.out.println(" - c) 0, 1, 4, 9, 16, 25, 36, 49");

        /* Sequência de números elevado ao quadrado somente pares*/
        System.out.println(" - d) 4, 16, 36, 64, 100");

        /* A memória ainda está fresca = sequência de Fibonacci*/
        System.out.println(" - e) 1, 1, 2, 3, 5, 8, 13");

        /* Sequência com números que iniciam com a letra 'D' */
        System.out.println(" - f) 2, 10, 12, 16, 17, 18, 19, 200");

        /*4*/
        System.out.println();

        System.out.println("4| Para facilitar vamos chamar os interruptores de A B C: \n" +
                "Vamos ligar o interruptor A e deixar ligado por um tempo, o suficiente para a lâmpada esquentar.\n" +
                "Em seguida vamos desligar o interruptor A e já ligar o interruptor B, enquanto o C não vamos mexer.\n" +
                "Assim quando entrarmos nas duas primeiras salas vamos ter 3 possíveis resultados: \n" +
                "A = Lâmpada quente\n" +
                "B = Lâmpada ligada\n" +
                "C = Lâmpada fria\n" +
                "Então é só classificar de acordo com o interruptor.");

        /*5*/
        System.out.println();

        System.out.println("5| Inverter caracteres de uma string:");
        System.out.print("Digite a string para ser invertida: ");
        sc.nextLine();
        String stringOriginal = sc.nextLine();

        System.out.println("String original: " + stringOriginal);
        char[] armazenarCaracteres = new char[stringOriginal.length()];
        for (int c = stringOriginal.length() - 1, i = 0; c >= 0; c--, i++) {
            armazenarCaracteres[i] = stringOriginal.charAt(c);
        }
        String stringInvertida = new String(armazenarCaracteres);

        System.out.println("String invertida: " + stringInvertida);

        sc.close();
    }
}

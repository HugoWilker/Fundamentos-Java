// 1 pacotes
package fundamentos;

// 2 bibliotecas


import jdk.nashorn.internal.ir.WhileNode;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

// 3 classes
public class Medidas {

    static Scanner entrada;


//3.1 - Atributo


// métodos e funções


    public static void main(String[] args) {

        String opcao = "";
        int area = 0;


        entrada = new Scanner(System.in);

        while (opcao.toUpperCase().equals("S") ) {
            System.out.println("Escolha o cálculo desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retângulo");
            System.out.println("(3) - Area do Triangulo");
            System.out.println("(4) - Area do Circulo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(S) - Sair");

            opcao = entrada.nextLine();

            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuarado();
                    break;
                case "2":
                    area = calcularAreaDoRetangulo();
                    break;
                case "3":
                    // to do calcular area do triangulo
                    area = calcularAreaDoTriangulo();
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;
                case "7":
                    contagemRegressiva();
                    break;
                case "s":
                case "S":
                    System.out.println("O sistema será encerrado");
                   break;
                default:
                    //System.out.println("opcao inválida " + opcao);
            }

            if (area > 0) {
                System.out.println(" A area e de " + area + "M²");

            }
        }



    }

    public static int calcularAreaDoQuarado() {
        int lado; // tamanho do lado

        System.out.println("Digite o tamanho do lado");
        lado = entrada.nextInt();

        //desenhar o quadrado

        for (int linha = 1; linha <= lado; linha++) {
            for (int coluna = 1; coluna <= lado; coluna++) {
                System.out.print("#");

            }
            System.out.println("");
        }

            System.out.println("");
            return lado * lado;

    }

    public static int calcularAreaDoRetangulo() {
       int base;
       int altura;

        System.out.println("Digite o calor da base do Retangulo ");
        base = entrada.nextInt();
        System.out.println("Digite o valor  da altura do Retangulo ");
        altura = entrada.nextInt();
        return base * altura;


    }

    public static int calcularAreaDoTriangulo() {
        int base;
        int altura;

        System.out.println("Digite a base do triangulo ");
        base = entrada.nextInt();
        System.out.println("Digite a Altura do triangulo ");
        altura = entrada.nextInt();
        return base * altura;


    }


   // public static double  calcularAreaDoCirculo() {
     // double raio;
      //  System.out.println("Digite o valor do Raio");
        //raio = entrada.nextInt();
       // return (raio * raio) *3,14;


    //}
    public static void tabuada() {
        System.out.println("informa o numero da tabuada que deseja visualizar");
        byte numero = entrada.nextByte();

        for (byte i = 1; i <= 10; i++) {

            System.out.print(numero * i +" " );
        }

    }

    public static void fibonacci(){

        System.out.print(" quantos numeros deseja calcular na seguencia " );
        byte numero = entrada.nextByte();

        switch (numero){

            case 0:
                System.out.println("A sequencia está vazia.");
                break;
            case 1:
                System.out.println("A sequencia de fibonacci  1.");
                break;
            default:
                int num1 = 0;
                int num2 = 1;

                System.out.println("Sequencia de Fibonacci: 1");
                for (byte i = 2; i <= numero; i++){

                    int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;
                }
        }

    }


    public static void contagemRegressiva(){

        System.out.println("Digite o número para contagem regressiva");

        int numero = entrada.nextInt();


        for (int i = numero; i >= 0; i-- ){
            System.out.println(ii);


        }



    }

}
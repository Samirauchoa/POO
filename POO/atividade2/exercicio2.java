package atividade2;
import java.util.Scanner;

public class exercicio2{
    public static void main(String[] args){
        
        System.out.print("==========Conversor de temperatura==========\n\n");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o Grau(Não é necessário o °): \n");
        double Grau = scanner.nextDouble();

        System.out.print("\nEscreva somente C (Celsius) ou F (Fahrenheit)\n \n");

        System.out.print("Escreva qual medida de temperatura do grau indicado: ");
        String unidade = scanner.next();

        Converter(Grau, unidade, scanner);
        scanner.close();
    }
    public static void Converter(double Grau, String unidade, Scanner scanner){
        double conversao = 0.0;
        if (unidade.equals("C")) {
            conversao = (Grau * 1.8) + 32;
            System.out.println("Convertido: " + conversao + "° Fahrenheit");
        }
        if (unidade.equals("F")) {
            conversao = (Grau - 32) / 1.8;
            System.out.println("Convertido: " + conversao + " ° Celsius");
        }
    }
}
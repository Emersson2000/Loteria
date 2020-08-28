package Juego_De_Loteria;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static int loteria[] = new int[5];
    static Random aleatorio = new Random();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        introducirNumero();
        comprobarNumeroLoteria();
    }

    public static void introducirNumero() {
        int numero, i = 0;
        boolean correct = true;
        do {
            System.out.print("Digite un número: ");
            numero = entrada.nextInt();
            if (numero < 0 || numero > 10) {
                System.out.println("El número no está dentro del rango");
            } else {
                if (i == 0) {
                    loteria[i] = numero;
                    i++;
                } else {
                    correct = true;
                    for (int j = 0; j < i; j++) {
                        if (loteria[j] == numero) {
                            correct = false;
                            break;
                        }
                    }
                    if (correct == false) {
                        System.out.println("El número ingresado ya lo tiene reguistrado");
                    } else {
                        loteria[i] = numero;
                        i++;
                    }
                }
            }

        } while (i < 5);

        for (int j = 0; j < loteria.length; j++) {
            System.out.print(loteria[j] + " - ");
        }
    }

    public static void comprobarNumeroLoteria() {
        boolean numeroEncontrado = false;
        int p = aleatorio.nextInt(11);

        for (int i = 0; i < loteria.length; i++) {
            if (loteria[i] == p) {
                numeroEncontrado = true;
                break;
            }
        }
        if (numeroEncontrado == true) {
            System.out.println("\nFelicidades, ganaste la loteria, tú número de la suerte fue: " + p + "\nGrande campeón, suerte.");
        }else{
            System.out.println("\nMala suerte, sigue intentando, el número de la loteria es: " + p);
        }
    }
}

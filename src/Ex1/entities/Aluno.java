/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1.entities;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class Aluno
 */
public class Aluno {

    public static double N1, N2, N3, N4;
    public static String nome;
    public static double mediaPonderada, somaDeMedidas, media_Alunos;
    public int numero_de_alunos = 3;

    public static void calcularMedia() {

        mediaPonderada = ((N1 * 1) + (N2 * 2) + (N3 * 3) + (N4 * 4)) / 10;

        somaDeMedidas = somaDeMedidas + mediaPonderada;

    }

    public String toString() {
        return "Nome: " + nome + "\n"
                + "Media: " + mediaPonderada;

    }

    public static void mediaAlunos() {
        System.out.printf("Soma das Médias: " + "%.2f", somaDeMedidas);
        somaDeMedidas = somaDeMedidas / 3;
        System.out.println();
        System.out.printf("Media Geral dos Alunos: " + "%.2f", somaDeMedidas);
    }

}

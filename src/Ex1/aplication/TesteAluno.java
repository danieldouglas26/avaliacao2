/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ex1.aplication;

import java.util.Scanner;
import Ex1.entities.Aluno;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class TesteAluno
 */
public class TesteAluno {

    static int i = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno Aluno = new Aluno();

        do {
            System.out.println("Informe o Nome do aluno " + i);
            Aluno.nome = sc.next();
            i++;

            System.out.println("Informe a N1: ");
            Aluno.N1 = sc.nextDouble();
            System.out.println("Informe a N2: ");
            Aluno.N2 = sc.nextDouble();
            System.out.println("Informe a N3: ");
            Aluno.N3 = sc.nextDouble();
            System.out.println("Informe a N4: ");
            Aluno.N4 = sc.nextDouble();

            Aluno.calcularMedia();

            System.out.println(Aluno);

        } while (i <= 3);

        System.out.println("Numero de alunos: " + Aluno.numero_de_alunos);

        Aluno.mediaAlunos();

    }
}

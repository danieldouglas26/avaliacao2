/*
 * Copyright (C) 2024 Daniel Douglas <danieldouglas26@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package Ex3.entities;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class Product
 */
public class Product {

    // O encapsulamento nessa clase se da em prol dos metodos de acesso escolhidos para os atributos 
    //todos do tipo private 
    // A abastração se da na declaração dos atributos e dos metodos;
    // A herenca se da pela subclasses, onde onde uma "expande a outra", no caso a claase Movie e Album;
    // O polimofirsmo se na na classe Teste (main) onde pode se utilizar objetos distintos contanto que eles compartilhem uma mesma classe pai 
    // Atributos
    private String name;
    private double price;
    private int numberOfcopies;

    //metodos
    public static void sellCopies() {

    }

    public void orderCopies(int num) {
        num -= numberOfcopies;
    }

}

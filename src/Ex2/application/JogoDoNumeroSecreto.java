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
package Ex2.application;

import Ex2.entities.NumeroSecreto;
import java.util.*;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class JogoDoNumeroSecreto
 */
public class JogoDoNumeroSecreto {
    
    public static void main(String[] args) {
        
        int numeroDigitado = 0;
        NumeroSecreto numerosecreto = new NumeroSecreto();
        
        Scanner sc = new Scanner(System.in);
        numerosecreto.sortearNumero();
        System.out.println();
        System.out.println("Tente acertar o numero sorteado!");
        System.out.println("");
        while (numeroDigitado != numerosecreto.numero) {
            System.out.print("Digite um numero: ");
            numeroDigitado = sc.nextInt();
            numerosecreto.adivinhaNumero(numeroDigitado);
        }
        
    }
}

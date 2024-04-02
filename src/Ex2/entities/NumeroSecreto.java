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

package Ex2.entities;

import static java.lang.Math.random;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com> 
 * @date 01/04/2024
 * @brief Class NumeroSecreto
 */
public class NumeroSecreto {

    public int numero = -1;
    
    public NumeroSecreto () {
  
    }
    
    public NumeroSecreto (int numero) {
    this.numero = numero;
    }
    
    public void sortearNumero () {
    double numeroAleatorio =  Math.random();
    numeroAleatorio *= 100;
    numeroAleatorio = Math.round(numeroAleatorio);
    numero = (int) numeroAleatorio;
    System.out.println(numero);
    }
    
    public void adivinhaNumero (int numeroDigitado) {
        
        if (numero != 0) {
        if (numeroDigitado != numero) {
            if (numeroDigitado < numero) {
                System.out.println("Numero digitado é menor que o numero sorteado");
            } else if (numeroDigitado > numero) {
                System.out.println("Numero digitado é maior que o numero sorteado");
            } 
        } else {
            System.out.println("Você acertou! Numero digitado " + numeroDigitado + " Numero Sorteado " + numero);
  
        }
        } else {
        numero = -1;
        }
        
    
    }
}

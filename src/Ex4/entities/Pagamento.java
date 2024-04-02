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

package Ex4.entities;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class Pagamento
 */
public class Pagamento {

    public static double valor;
    public static double total;
    
    public static void Pagamento (double valor) { 
        total -= valor;
    }
    
    public static void adicionarAoTotal(double valor) {
        total += valor;
    }
    
    public static void resetarTotal() {
        total = 0.0;
    }
    
}

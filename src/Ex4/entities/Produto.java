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
 * @brief Class Produto
 */
public class Produto {

    private String nome;
    private double preco;
    
    public Produto () {
    
    }
    
    public Produto (String nome, double preco) {
    this.nome = nome;
    this.preco = preco;
    }
    
    public void cadastrarProduto (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;   
    }
    
     public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
  
    public String exibirDados () {
    return "Nome Produto: "
            + nome
            + "\n     Preco do produto: "
            + preco
            +" R$";
    }
    
}

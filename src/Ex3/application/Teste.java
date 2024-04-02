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
package Ex3.application;
import java.util.Scanner;
import Ex3.entities.Product;
import Ex3.entities.Movie;
import Ex3.entities.Album;
import Ex3.entities.StockKeeper;

/**
 *
 * @author Daniel Douglas / Kaua Honorota <danieldouglas26@outlook.com>
 * @date 01/04/2024
 * @brief Class Teste
 */
public class Teste {

    public static void main(String[] args) {

        String artist, director;
        
        Scanner sc = new Scanner (System.in);
        
        Movie movie1 = new Movie();
        Album album1 = new Album();
        Movie movie2 = new Movie();
        Album album2 = new Album();

        System.out.print("Digite o nome do diretor: ");
        artist = sc.next();
        movie1.setDirector(artist);
        System.out.print("Digite o nome do artista: ");
        director = sc.next();
        album1.setArtist(director);
        
        System.out.print("Digite o nome do diretor: ");
        artist = sc.next();
        movie2.setDirector(artist);
        System.out.print("Digite o nome do artista: ");
        director = sc.next();
        album2.setArtist(director);
        
        System.out.println(movie1.getDirector());
        System.out.println(album1.getArtist());
        
        System.out.println(movie2.getDirector());
        System.out.println(album2.getArtist());
        
    }

}

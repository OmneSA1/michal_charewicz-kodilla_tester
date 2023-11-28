package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.*;
// Kolekcja ArrayList
public class ShapesListApplication {
    public static void main(String[] args) {
        List<Square> shapes = new ArrayList<>();// Utworzenie kolekcji
        shapes.add(new Square(10.0)); //Dodanie obiektów do kolekcji
        shapes.add(new Square(5.0));
        shapes.add(new Square(1.0));


//        for (int n = 0; n < shapes.size(); n++) {  // Wartość zmiennej n będzie zwiększana o jeden w każdej iteracji pętli od 0 do wartości 2 (ponieważ rozmiar kolekcji wynosi 3, a warunek pętli to n < shapes.size()
//            Square square = shapes.get(n); // Z kolekcji shapes pobieramy jeden obiek o indeksie n i referencja umnieszczana jest w zmiennej square
//            if(square.getArea() > 20) // sprawdzenie warunku czy trafiają tylko obiekty większe niż 20
//                System.out.println(square + ", area: " + square.getArea()); // jeśli warunke został spełniony, wyświetla się informacja z obliczonym polem powierzchni
//        }
        for (Square square : shapes) { // for (Typ zmienna : kolekcja) {// kod} Iteruj po kolekcji kolekcja i kolejne jej elementy wstawiaj do zmiennej o nazwie zmienna, która jest typu Typ. Czyli iteruj po kolekcji shapes wstawiaj elementy do zmiennej shapes o typie Square
            if(square.getArea() > 20) // sprawdzenie warunku czy trafiają tylko obiekty większe niż 20
                System.out.println(square + ", area: " + square.getArea()); // jeśli warunke został spełniony, wyświetla się informacja z obliczonym polem powierzchni
        }

    }
}

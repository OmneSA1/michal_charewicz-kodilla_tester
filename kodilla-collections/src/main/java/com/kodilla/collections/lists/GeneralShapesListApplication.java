package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;

//Kolekcja LinkedList
public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>(); // implementacja kolekcji LinkedList
        Square square = new Square(10.0); //Tworzymy obiekt klasy Square, zapamiętywany jest w zmiennej square
        shapes.add(new Square(10.0)); // do kolekcji możemy wstawić różne kształy, muszą implementować Shape
        shapes.add(new Circle(7.0));
        shapes.add(new Triangle(10.0,4.0,10.77));

        shapes.remove(1); // Usuwamy z kolekcji obiekt o indeksie 1
        shapes.remove(square); // Usuwamy utworzony kwadrat Square square = new Square(10.0);

        Triangle triangle = new Triangle(10.0,4.0,10.77); //Tworzymy nowy obiekt klasy triangle
        shapes.remove(triangle); // wywołujemy metodę remove, przekazując jej jako argument utworzony obiekt

        System.out.println(shapes.size()); //Wyświetlamy aktualny rozmiar listy "2"
        for(Shape shape : shapes) { //Iteruj po kolekcji shapes wstawiaj zmienne do shape od typie Shape
            System.out.println(shape + ", area: " + shape.getArea() +
                    ", perimeter: " + shape.getPerimeter());
        }
    }
}

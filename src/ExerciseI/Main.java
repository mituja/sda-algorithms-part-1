//Napisz metode, ktora wypisze co drugi element tablicy przekazanej jako parametr
//Pozniej wprowadz parametr ktory pozwoli wydrukowac parzyste lub nieparzyste indeksy
//Nastepnie zwieksz funkcjonalnosc przez mozliwosc dodawania liczb ze stringa w konsoli

package ExerciseI;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczby oddzielone przecinkiem: ");
        String input = sc.nextLine();
        String[] split = input.split(",");

        System.out.println("Medoda 1: ");
        printList(split);
        System.out.println("Metoda 2: ");
        printListLambda(split);
    }


    public static void printList(String[] array) {
        int index = 0;
        for (int i = index; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
    }

    public static void printListLambda(String[] array) {
        IntStream.range(0, array.length).filter(value -> value % 2 == 0).mapToObj(operand -> array[operand]).forEach(System.out::println);
        // strumien integerow, range umozliwia przejscie z zakresu 0-dl tablicy
        // dzieki temu otrzymalismy liste 0 - dl tabl
        // uzywamy filtra, ktory pozwala filtrowac dane - integery 0 - dl tablicy
        // wyrazenie boolowskie - jako wejscie strumienia mamy value, dla kazdego indeksu tablicy %2
        // jezeli warunek spelniony to wartosc strumienia przechodzi dalej
        // map to obj mapuje dane?
        // dla wynikowego, przemapowanego strumienia sout, :: - methody reference (skrot do metody printline)
    }

//    public static void printList(Integer[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(array[i]);
//            }
//        }
//    }
}

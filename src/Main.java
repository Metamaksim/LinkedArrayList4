import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static LinkedList<Person> personLinkedList = new LinkedList<>();
    public static ArrayList<Person> personArrayList = new ArrayList<>();

    public static void main(String[] args) {
        Person vasya = new Person(12, "Вася");
        Person petya = new Person(12, "Петя");
        Person dima = new Person(12, "Дима");
        //реализация листа
        personLinkedList.add(vasya);
        personLinkedList.add(petya);
        personLinkedList.add(dima);

        //поиск по индексу
        System.out.println(personLinkedList.get(0));
        System.out.println(personLinkedList.get(1));
        System.out.println(personLinkedList.get(2));

        personArrayList.add(vasya);
        personArrayList.add(petya);
        personArrayList.add(dima);
        personLinkedList.add(dima);


        //поиск по индексу
        System.out.println(personArrayList.get(0));
        System.out.println(personArrayList.get(1));
        System.out.println(personArrayList.get(2));

        //поиск по объекту
        System.out.println(personArrayList.indexOf(vasya));
        System.out.println(personArrayList.indexOf(dima));
        System.out.println(personArrayList.indexOf(petya));


    }
}
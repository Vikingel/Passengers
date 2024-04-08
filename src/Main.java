import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        example2();
           }

private static void example2() {
        //Bus bus1=new Bus(4,
                //{new Passenger("Оксана", 31,85), new Passenger("Вася", 17,74)});
        int weightTotal=0;
    ArrayList<Passenger> bus1 = new ArrayList<>();
    bus1.add(new Passenger("Гриша", 19, 67));
    bus1.add(new Passenger("Миша", 31,85));
    bus1.add(new Passenger("Паша", 17,74));
    ArrayList<Passenger> bus2 = new ArrayList<>();
    bus2.add(new Passenger("Зина", 15, 49));
    bus2.add(new Passenger("Нина", 50,85));
    bus2.add(new Passenger("Ирина", 21,60));

    ArrayList<Bus>[] buses = new ArrayList[]{bus1, bus2};
    System.out.println("*****"+buses);

    //Passenger[] mas3 = {new Passenger("Оксана", 31,85), new Passenger("Вася", 17,74)};

    System.out.println(bus1);

    bus1.sort(Comparator.comparing(Passenger::toString));
    System.out.println(bus1);

    bus1.sort(Comparator.comparing(Passenger::getWeight));
    System.out.println(bus1);

    //for (Passenger p: bus1 ) {
        //System.out.println(p.getWeight());

        for (Passenger p: bus1 ) {
            weightTotal= weightTotal+p.getWeight();
        }
            System.out.println(weightTotal);
    }

    //people.sort(Comparator.naturalOrder());   //нельзя - у Person нет метода compareTo
}
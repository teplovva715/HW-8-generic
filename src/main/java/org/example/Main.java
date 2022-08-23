package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person ( "Name1", 50 );
        Person person2 = new Person ( "Name2", 41 );
        Person person3 = new Person ( "Name3", 29 );
        Person person4 = null;

        Person [] people = new Person[] {person1, person3, person4, person2, new Person ( "new name4", 40 ), new Person ( "new name5", 54 )};

        for (Person item : people) {
            System.out.println (item);
        }


        System.out.println ("-------------------------------------");

        for (int i = 0; i < people.length; i++) {
            System.out.println (people[i]);
        }

        int [] intArray1 = new int[]{5, 10, 15, 20};
//        for (int i = 0; i < intArray.length; i++) {
//            System.out.println (intArray[i]);
//        }

        int [] intArray2 = new int[5];

        intArray1[3] = 5;
        for (int i = 0; i < intArray1.length; i++) {
            intArray2[i] = intArray1[i];
            System.out.println (intArray1[i]);
        }
        intArray2[intArray2.length - 1] = 9999;

        for (int item : intArray2 ) {
            System.out.println (item);
        }

        System.out.println ("-------------------------------------------");

        List<Integer> list = new ArrayList<> ();
        list.add ( 5 );
        list.add ( 10 );
        list.add ( 15 );
        list.add ( 20 );

        for (Integer value : list) {
            System.out.println (value);
        }

        list.add ( 5 );
        System.out.println ("-------- after adding --------");
        for (Integer value : list) {
            System.out.println (value);
        }

    }
}
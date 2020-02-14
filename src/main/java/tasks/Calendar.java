package tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calendar {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String a = scan.nextLine();
                int year = 2020;
                try {
                        year = Integer.parseInt(a);
                } catch (NumberFormatException e){
                        System.out.println(e.getMessage());
                }

                if ( year < 0) {
                                System.out.println("Please enter valid data!");
                }
                System.out.println(year + " " + getAnimal(year));
                }

        private static String getAnimal(int year){
                List<String> animals = Arrays.asList("Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig");
                int index = (year+8)%12;
                return animals.get(index);
        }
        
}
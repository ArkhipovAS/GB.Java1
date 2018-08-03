/**
 * Java1 homework7
 * @Arkhipov Aleksandr
 * @version Aug 03, 2018
 * @link https://github.com/ArkhipovAS
 */

import java.util.Scanner;

public class AnimalFarm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Cat cat = new Cat("Barsik", 10, false);
        Plate plate = new Plate(10);
        //System.out.println(plate);
        //System.out.println(cat);
        //cat.eat(plate);
        //System.out.println(plate);
        //System.out.println(cat);

        Cat[] cats = new Cat[5];
        cats [0]= new Cat ("Pusha", 3, false);
        cats [1]= new Cat ("Masha", 4, false);
        cats [2]= new Cat ("Belka", 5, false);
        cats [3]= new Cat ("Sonya", 2, false);
        cats [4]= new Cat ("Pulya", 10, false);
        for (Cat cat : cats){
            cat.eat(plate);

            System.out.println(cat);
            System.out.println(plate);
        }
        System.out.println("Add feed? Write how much:");
        int a = scanner.nextInt();
        plate.riseFood(a);

        for (Cat cat : cats){
            if (cat.satiety != true){
                cat.eat(plate);
                System.out.println(cat);
                System.out.println(plate);

            }
        }


    }
}

class Cat {
    private String name;
    private int appetite;
    public boolean satiety;

    Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    void eat(Plate plate) {
        plate.dicreaseFood(appetite);
        satiety = plate.eatsucsess;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\tAppetite: " + appetite + "\tSatiety: " + satiety;
    }
}


class Plate {
    private int food;
    boolean eatsucsess;

    Plate(int food) {
        this.food = food;
    }

    void dicreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            eatsucsess = true;
        }
        else {
            eatsucsess = false;
            System.out.print("Feed is not enough ");
        }

    }
    void riseFood (int food){
        this.food += food;
    }

    @Override
    public String toString() {
        return "Food in plate: " + food;
    }
}

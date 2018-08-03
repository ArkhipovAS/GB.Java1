/**
 * Java1 homework6
 * @Arkhipov Aleksandr
 * @version Aug 02, 2018
 * @link https://github.com/ArkhipovAS
 */
class Animal {
    String name;
    int distance;
    int limitrun;
    int limitswim;
    float limitjump;

    //Constructor Animal class
    //input parameters Name animal, limit for running, limit for swimming, limit for jumping
    Animal(String name, int limitrun, int limitswim, float limitjump) {
        this.name = name;
        this.limitrun = limitrun;
        this.limitswim = limitswim;
        this.limitjump = limitjump;
    }

    //metod run with input parametrs distance for move
    void run (int distance){
        System.out.println("Animal: " + name + " run: " + (distance < limitrun));
    }

    //metod swim with input parametrs distance for move
    void swim (int distance){
        System.out.println("Animal: " + name + " swim: " + (distance < limitswim));
    }

    //metod jump with input parametrs distance for move
    void jump (float distance){
        System.out.println("Animal: " + name + " jump: " + (distance < limitjump));
    }

}
class Cat extends Animal{

    Cat (String name, int limitrun, int limitswim, float limitjump){
        super(name, limitrun, limitswim, limitjump);
    }

}

class Dog extends Animal{

    Dog (String name, int limitrun, int limitswim, float limitjump){
        super(name, limitrun, limitswim, limitjump);
    }

}




public class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat ("Pusha", 200, 0, 2);
        Dog dog1 = new Dog ("Sharik", 400, 10, 0.5f);
        Dog dog2 = new Dog ("Tuzik", 600, 10, 0.5f);
        cat.run(150);
        cat.swim (5);
        cat.jump(1);
        dog1.run(500);
        dog2.run(500);
        dog2.jump(0.6f);
        String s = "test";
        s = s.toUpperCase();
        System.out.println(s);

    }
}
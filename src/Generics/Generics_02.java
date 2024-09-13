package Generics;

class Animal <T,U> {

    T name;
    U age;

   public   Animal(T name,  U age){
        this.name=name;
        this.age=age;
    }

    public void print(){
        System.out.println(name);
        System.out.println(age);
    }
}

class Animal2{

    public <T> void sound(T sound){
        System.out.println(sound);
    }
}

public class Generics_02 {

    public static void main(String[] args) {
        Animal<String,Integer> dog= new Animal<>("Dog",10);
//        Animal<String,Integer> dog= new Animal("Dog",10); // gives waring
        dog.print();

        Animal2 cat= new Animal2();
        cat.sound("miaouuuun");

    }
}

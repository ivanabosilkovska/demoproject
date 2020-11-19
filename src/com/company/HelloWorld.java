package com.company;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello world!!!");
        sayHello("Ivana");
        sayGoodBye("Ivana");

        boolean flag = true;
        if(flag == true){
            System.out.println("Value od flag is true");
        }else {
            System.out.println("Value of flag is false");
        }


        printMessage();


    }

    public static void printMessage() {
        String message = "how are you?";
        System.out.println(message);
    }

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public HelloWorld(int age) {
        this.age = age;
    }


    public static void sayHello(String name){
        System.out.println("Hello " +name);
        // TODO: add support for multiple users
    }

    public static void sayGoodBye(String name){
        System.out.println("Good Bye " +name);
    }

}

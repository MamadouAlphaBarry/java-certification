package it.cws.pond.shore;

public class StaticUseCase {
    private static String name;
    public static void main(String[] args) {
        sayHelloOne(name);
        sayHelloTwo();
        sayHelloThree();
    }
    private static void sayHelloOne(String name){
      System.out.println("Hello One");
    }
    private static void sayHelloTwo(){
        System.out.println("Hello Two");

    }
    private static void sayHelloThree(){
        System.out.println("Hello Three");

    }
}

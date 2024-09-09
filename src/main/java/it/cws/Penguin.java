package it.cws;

public class Penguin {
    String name;
    static String nameOfTallestPenguin;

    public static  void main(String[] args){
       Penguin p1= new Penguin();
       p1.name="FirstPenguin";
       p1.nameOfTallestPenguin="first Test";
       System.out.println(p1.name);
       System.out.println(p1.nameOfTallestPenguin);
       Penguin p2= new Penguin();
       p2.name="second Penguin";
       p2.nameOfTallestPenguin="Second Test P";
        System.out.println(p1.name);
        System.out.println(p1.nameOfTallestPenguin);
        System.out.println(p2.name);
        System.out.println(p2.nameOfTallestPenguin);
        System.out.println(p1.nameOfTallestPenguin);
    }
}

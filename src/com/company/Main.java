package com.company;

public class Main {

    public static void main(String[] args) {
    String me = "June";
    // <type> <name> = <type> ()
        Pet dogPet = new Pet("Marlow", 2, "Austin, TX", "Yorkie");
        Pet dogPet2 = new Pet("Sussy", 9, "San Diego, CA", "German Shepherd");


        System.out.print(dogPet.getName());
        System.out.println(dogPet.getAge());

    }
}

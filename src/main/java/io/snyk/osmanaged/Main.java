package io.snyk.osmanaged;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        var messager = new BasicMessager();
        System.out.println(messager.getMessage("foobarbaz"));
    }
}
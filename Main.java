package ru.netology.core2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;

        new Worker(listener, errorListener).start();
    }
}

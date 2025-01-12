package org.example;

public class Exceptions {
    public static void main(String[] args) {

        String[] httpMethods = {"get", "post", "put"};

        System.out.println("Before");

        try {
            System.out.println(httpMethods[-1]);

        } catch (Exception e) {
            System.out.println("Exception");
        }


        System.out.println("After");

    }
}

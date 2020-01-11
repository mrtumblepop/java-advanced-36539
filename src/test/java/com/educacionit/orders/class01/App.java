package com.educacionit.orders.class01;

public class App {

    public static void main (String[] args) {

        // INTERFACES AND CLASSES.

        INotification e1 = new EmailNotification();
        e1.send ("Homer Simpson", "Lisa Simpson", "Interfaces",
                "My first interface");

        e1 = new PushNotification();
        e1.send ("Bart Simpson", "Magie Simpson", "Interfaces",
                "My first interface");


        // ANONYMOUS CLASS.
        INotification e2 = new INotification () {

            public void send(String to, String from, String subject, String content) {

                System.out.println (String.format ("%s sending message [%s][%s] to %s using anonymous class !!!", from, subject, content, to));
            }
        };

        e2.send ("Maggie Simpson", "Marge Simpson", "Interfaces",
                "My first interface");


        // LAMBDA EXPRESSIONS.
        INotification e3 = (String to, String from,
                            String subject, String content) -> {

                System.out.println (String.format ("%s sending message [%s][%s] to %s using lambda expressions !!!", from, subject, content, to));
        };

        e3.send ("Maggie Simpson", "Marge Simpson", "Interfaces",
                "My first interface");

        e3 = (to, from, subject, content) -> {

            System.out.println (String.format ("%s sending message [%s][%s] to %s using lambda expressions (2) !!!", from, subject, content, to));
        };

        e3.send ("Maggie Simpson", "Marge Simpson", "Interfaces",
                "My first interface");

        e3 = (to, from, subject, content) -> System.out.println (String.format ("%s sending message [%s][%s] to %s using lambda expressions (3) !!!", from, subject, content, to));

        e3.send ("Maggie Simpson", "Marge Simpson", "Interfaces",
                "My first interface");

    }
}

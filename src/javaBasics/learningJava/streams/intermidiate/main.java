package javaBasics.learningJava.streams.intermidiate;

import java.util.*;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Fiction", 299.0, 2018, "The Silent Forest"),
                new Book("Technology", 599.0, 2022, "Java Mastery"),
                new Book("History", 450.0, 2015, "Ancient Empires"),
                new Book("Self-Help", 350.0, 2020, "Atomic Habits"),
                new Book("Technology", 799.0, 2023, "Spring Boot in Action"),
                new Book("Finance", 499.0, 2019, "Rich Dad Poor Dad"),
                new Book("Fiction", 399.0, 2021, "Midnight City"),
                new Book("Science", 650.0, 2017, "Space and Time"),
                new Book("Biography", 550.0, 2016, "Steve Jobs"),
                new Book("Self-Help", 299.0, 2024, "Think Like a Monk")
        );
        // filtering books cheaper than 300;
        Stream<Book> filteredbooks= books.stream()
                .filter(p->p.price<300);
        filteredbooks.forEach(System.out::println);

        // mapping : convert book tittles in UPPERCASE
        Stream<String>UPPERCASEBOOKTITTLE =books.stream()
                .map(book->book.tittle.toUpperCase());
        UPPERCASEBOOKTITTLE.forEach(System.out::println);

        // Sorting books by its publication dates
        Stream<Book>sortedbyyear=books.stream()
                .sorted(Comparator.comparingInt(book->book.publicationYear));
        sortedbyyear.forEach(System.out::println);

        //Distinct : remove duplicate tittles
        Stream<Book>Distinct =books.stream()
                .distinct();
        Distinct.forEach(System.out::println);

        // limit : display only first 3
        System.out.println("DISPLAY FIRST 3 PUBLISHED BOOK BY PUBLICATION YEAR");
        Stream<Book>limit=books.stream()
                .sorted(Comparator.comparingInt(book->book.publicationYear))
                .limit(3);
        limit.forEach(System.out::println);

        // 6. Skip: Skip the first 2 books
        Stream<Book>skipby2=books.stream()
                .skip(4);
        skipby2.forEach(System.out::println);


    }
}

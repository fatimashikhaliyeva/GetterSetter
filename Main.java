package Modul1;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {
    public static void main(String[] args) {
        Book book=new Book("unknown","John",20);
        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());


    }
}

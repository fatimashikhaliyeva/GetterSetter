package Modul1.ObjectConstructorEncapsulation;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public void setTitle(String title){this.title=title;}
    public void setAuthor(String author){this.author=author;}
    public void setPrice(int price){this.price=price;}

    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public int getPrice(){
        return this.price;
    }

}

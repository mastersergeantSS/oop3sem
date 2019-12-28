package ru.mirea.pr1;

public class Book {
    private int pages;
    private String author;
    private String name;

    public Book() {
        pages = 0;
        author = "none";
        name = "none";
    }
    public Book(int pages, String author, String name) {
        this.pages = pages;
        this.author = author;
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public  String toString() {
        return author + ", " + name + ", " + pages + " pages";
    }
}

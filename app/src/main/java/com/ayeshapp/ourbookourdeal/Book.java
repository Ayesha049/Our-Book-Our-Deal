package com.ayeshapp.ourbookourdeal;

public class Book {

    String imageUrls;
    String bookName;
    String edition;
    String authorName;
    String price;

    public Book() {
    }

    public Book(String imageUrls, String bookName, String edition, String authorName, String price) {
        this.imageUrls = imageUrls;
        this.bookName = bookName;
        this.edition = edition;
        this.authorName = authorName;
        this.price = price;
    }

    public String getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(String imageUrls) {
        this.imageUrls = imageUrls;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}

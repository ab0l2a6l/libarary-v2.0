package Modle.entity;

public class Book extends Entity {
    private String author;
    private Genre genre;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
}

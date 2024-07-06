package com.literatura.literatura_app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String language;
    private Double downloads;
    @ManyToOne
    private Autor author;

    public Book() {}

    public Book(BookData bookData, List<Autor> authorList) {
        this.title = bookData.title();
        this.language = bookData.languages().get(0);
        this.author = authorList.get(0);
        this.downloads = Double.valueOf(bookData.downloads());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Double getDownloads() {
        return downloads;
    }

    public void setDownloads(Double downloads) {
        this.downloads = downloads;
    }

    public Autor getAuthor() {
        return author;
    }

    public void setAuthor(Autor author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String message = String.format("""
                --- LIBRO ---
                Título: %s
                Autor: %s
                Idioma: %s
                Número de descargas: %s
                ------------""", title, author.getName(), language, downloads);
        return message;
    }
}

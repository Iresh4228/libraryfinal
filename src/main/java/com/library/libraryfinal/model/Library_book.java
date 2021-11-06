package com.library.libraryfinal.model;


import javax.persistence.*;

@Entity
@Table(name = "show_book")
public class Library_book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "id_book")
    private Integer idbook;

    @Column(name = "book_name")
    private String bookname;

    @Column(name = "book_type")
    private String booktype;

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }
}

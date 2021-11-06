package com.library.libraryfinal.model;

import javax.persistence.*;

@Entity
@Table(name = "library_stk")
public class Library_stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idbook_stk")
    private Integer bookstk_id;

    @Column(name = "phbook_stkqty")
    private String bookstk_qty;

    @Column(name = "book_stkitems")
    private String bookstk_items;

    @Column(name = "id_book")
    private Integer idbook;

    public Integer getBookstk_id() {
        return bookstk_id;
    }

    public void setBookstk_id(Integer bookstk_id) {
        this.bookstk_id = bookstk_id;
    }

    public String getBookstk_qty() {
        return bookstk_qty;
    }

    public void setBookstk_qty(String bookstk_qty) {
        this.bookstk_qty = bookstk_qty;
    }

    public String getBookstk_items() {
        return bookstk_items;
    }

    public void setBookstk_items(String bookstk_items) {
        this.bookstk_items = bookstk_items;
    }

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }
}

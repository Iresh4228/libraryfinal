package com.library.libraryfinal.model;

import javax.persistence.*;

@Entity
@Table(name = "purchasing_book")
public class Library_purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpurchasing_phar")
    private Integer idpurchase;

    @Column(name = "idsystem_user")
    private Integer iduser;

    @Column(name = "id_book")
    private Integer idbook;

    @Column(name = "purchasing_bookamount")
    private String bamount;

    @Column(name = "purchasing_bookdate")
    private String bdate;

    public Integer getIdpurchase() {
        return idpurchase;
    }

    public void setIdpurchase(Integer idpurchase) {
        this.idpurchase = idpurchase;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public Integer getIdbook() {
        return idbook;
    }

    public void setIdbook(Integer idbook) {
        this.idbook = idbook;
    }

    public String getBamount() {
        return bamount;
    }

    public void setBamount(String bamount) {
        this.bamount = bamount;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }
}

package com.hnevkop.eet.model;

import javax.persistence.Embeddable;
import java.math.BigDecimal;

@Embeddable
public class SaleItem {

    private String nazev;

    private BigDecimal mnozstvi;

    private BigDecimal cena;

    public SaleItem(String nazev, BigDecimal mnozstvi, BigDecimal cena) {
        this.nazev = nazev;
        this.mnozstvi = mnozstvi;
        this.cena = cena;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public BigDecimal getMnozstvi() {
        return mnozstvi;
    }

    public void setMnozstvi(BigDecimal mnozstvi) {
        this.mnozstvi = mnozstvi;
    }

    public BigDecimal getCena() {
        return cena;
    }

    public void setCena(BigDecimal cena) {
        this.cena = cena;
    }
}

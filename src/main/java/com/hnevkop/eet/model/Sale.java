package com.hnevkop.eet.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uuidZpravy;

    private boolean prvniZaslani;

    private boolean overovaciRezim;

    private String dicPoplatnika;

    private String dicPoverujiciho;

    private Integer idPokladny;

    private String poradoveCislo;

    private Date datumTrzby;

    private Float celkovaTrzba;

    private Float zakladNepodlehajiciDph;

    private Float zakladDan1;

    private Float dan1;

    private Float zakladDan2;

    private Float dan2;

    private Float zakladDan3;

    private Float dan3;

    private Float cestovniSluzba;

    private Float pouzitZbozi1;

    private Float pouzitZbozi2;

    private Float pouzitZbozi3;

    private Float urcenoCerpZust;

    private Float cerpZustatku;

    private boolean rezim;

    public String getUuidZpravy() {
        return uuidZpravy;
    }

    public void setUuidZpravy(String uuidZpravy) {
        this.uuidZpravy = uuidZpravy;
    }

    public boolean isPrvniZaslani() {
        return prvniZaslani;
    }

    public void setPrvniZaslani(boolean prvniZaslani) {
        this.prvniZaslani = prvniZaslani;
    }

    public boolean isOverovaciRezim() {
        return overovaciRezim;
    }

    public void setOverovaciRezim(boolean overovaciRezim) {
        this.overovaciRezim = overovaciRezim;
    }

    public String getDicPoplatnika() {
        return dicPoplatnika;
    }

    public void setDicPoplatnika(String dicPoplatnika) {
        this.dicPoplatnika = dicPoplatnika;
    }

    public String getDicPoverujiciho() {
        return dicPoverujiciho;
    }

    public void setDicPoverujiciho(String dicPoverujiciho) {
        this.dicPoverujiciho = dicPoverujiciho;
    }

    public Integer getIdPokladny() {
        return idPokladny;
    }

    public void setIdPokladny(Integer idPokladny) {
        this.idPokladny = idPokladny;
    }

    public String getPoradoveCislo() {
        return poradoveCislo;
    }

    public void setPoradoveCislo(String poradoveCislo) {
        this.poradoveCislo = poradoveCislo;
    }

    public Date getDatumTrzby() {
        return datumTrzby;
    }

    public void setDatumTrzby(Date datumTrzby) {
        this.datumTrzby = datumTrzby;
    }

    public Float getCelkovaTrzba() {
        return celkovaTrzba;
    }

    public void setCelkovaTrzba(Float celkovaTrzba) {
        this.celkovaTrzba = celkovaTrzba;
    }

    public Float getZakladNepodlehajiciDph() {
        return zakladNepodlehajiciDph;
    }

    public void setZakladNepodlehajiciDph(Float zakladNepodlehajiciDph) {
        this.zakladNepodlehajiciDph = zakladNepodlehajiciDph;
    }

    public Float getZakladDan1() {
        return zakladDan1;
    }

    public void setZakladDan1(Float zakladDan1) {
        this.zakladDan1 = zakladDan1;
    }

    public Float getDan1() {
        return dan1;
    }

    public void setDan1(Float dan1) {
        this.dan1 = dan1;
    }

    public Float getZakladDan2() {
        return zakladDan2;
    }

    public void setZakladDan2(Float zakladDan2) {
        this.zakladDan2 = zakladDan2;
    }

    public Float getDan2() {
        return dan2;
    }

    public void setDan2(Float dan2) {
        this.dan2 = dan2;
    }

    public Float getZakladDan3() {
        return zakladDan3;
    }

    public void setZakladDan3(Float zakladDan3) {
        this.zakladDan3 = zakladDan3;
    }

    public Float getDan3() {
        return dan3;
    }

    public void setDan3(Float dan3) {
        this.dan3 = dan3;
    }

    public Float getCestovniSluzba() {
        return cestovniSluzba;
    }

    public void setCestovniSluzba(Float cestovniSluzba) {
        this.cestovniSluzba = cestovniSluzba;
    }

    public Float getPouzitZbozi1() {
        return pouzitZbozi1;
    }

    public void setPouzitZbozi1(Float pouzitZbozi1) {
        this.pouzitZbozi1 = pouzitZbozi1;
    }

    public Float getPouzitZbozi2() {
        return pouzitZbozi2;
    }

    public void setPouzitZbozi2(Float pouzitZbozi2) {
        this.pouzitZbozi2 = pouzitZbozi2;
    }

    public Float getPouzitZbozi3() {
        return pouzitZbozi3;
    }

    public void setPouzitZbozi3(Float pouzitZbozi3) {
        this.pouzitZbozi3 = pouzitZbozi3;
    }

    public Float getUrcenoCerpZust() {
        return urcenoCerpZust;
    }

    public void setUrcenoCerpZust(Float urcenoCerpZust) {
        this.urcenoCerpZust = urcenoCerpZust;
    }

    public Float getCerpZustatku() {
        return cerpZustatku;
    }

    public void setCerpZustatku(Float cerpZustatku) {
        this.cerpZustatku = cerpZustatku;
    }

    public boolean isRezim() {
        return rezim;
    }

    public void setRezim(boolean rezim) {
        this.rezim = rezim;
    }

}

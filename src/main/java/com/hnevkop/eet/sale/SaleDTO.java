package com.hnevkop.eet.sale;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaleDTO {

    private String uuidZpravy;

    private boolean prvniZaslani;

    private boolean overovaciRezim;

    private String dicPoplatnika;

    private String dicPoverujiciho;

    private String idPokladny;

    private String poradoveCislo;

    private Date datumTrzby;

    private BigDecimal celkovaTrzba;

    private BigDecimal zakladNepodlehajiciDph;

    private BigDecimal zakladDan1;

    private BigDecimal dan1;

    private BigDecimal zakladDan2;

    private BigDecimal dan2;

    private BigDecimal zakladDan3;

    private BigDecimal dan3;

    private BigDecimal cestovniSluzba;

    private BigDecimal pouzitZbozi1;

    private BigDecimal pouzitZbozi2;

    private BigDecimal pouzitZbozi3;

    private BigDecimal urcenoCerpZust;

    private BigDecimal cerpZustatku;

    private boolean rezim;

    private List<SaleItemDTO> polozky;

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

    public BigDecimal getCelkovaTrzba() {
        return celkovaTrzba;
    }

    public void setCelkovaTrzba(BigDecimal celkovaTrzba) {
        this.celkovaTrzba = celkovaTrzba;
    }

    public BigDecimal getZakladNepodlehajiciDph() {
        return zakladNepodlehajiciDph;
    }

    public void setZakladNepodlehajiciDph(BigDecimal zakladNepodlehajiciDph) {
        this.zakladNepodlehajiciDph = zakladNepodlehajiciDph;
    }

    public BigDecimal getZakladDan1() {
        return zakladDan1;
    }

    public void setZakladDan1(BigDecimal zakladDan1) {
        this.zakladDan1 = zakladDan1;
    }

    public BigDecimal getDan1() {
        return dan1;
    }

    public void setDan1(BigDecimal dan1) {
        this.dan1 = dan1;
    }

    public BigDecimal getZakladDan2() {
        return zakladDan2;
    }

    public void setZakladDan2(BigDecimal zakladDan2) {
        this.zakladDan2 = zakladDan2;
    }

    public BigDecimal getDan2() {
        return dan2;
    }

    public void setDan2(BigDecimal dan2) {
        this.dan2 = dan2;
    }

    public BigDecimal getZakladDan3() {
        return zakladDan3;
    }

    public void setZakladDan3(BigDecimal zakladDan3) {
        this.zakladDan3 = zakladDan3;
    }

    public BigDecimal getDan3() {
        return dan3;
    }

    public void setDan3(BigDecimal dan3) {
        this.dan3 = dan3;
    }

    public BigDecimal getCestovniSluzba() {
        return cestovniSluzba;
    }

    public void setCestovniSluzba(BigDecimal cestovniSluzba) {
        this.cestovniSluzba = cestovniSluzba;
    }

    public BigDecimal getPouzitZbozi1() {
        return pouzitZbozi1;
    }

    public void setPouzitZbozi1(BigDecimal pouzitZbozi1) {
        this.pouzitZbozi1 = pouzitZbozi1;
    }

    public BigDecimal getPouzitZbozi2() {
        return pouzitZbozi2;
    }

    public void setPouzitZbozi2(BigDecimal pouzitZbozi2) {
        this.pouzitZbozi2 = pouzitZbozi2;
    }

    public BigDecimal getPouzitZbozi3() {
        return pouzitZbozi3;
    }

    public void setPouzitZbozi3(BigDecimal pouzitZbozi3) {
        this.pouzitZbozi3 = pouzitZbozi3;
    }

    public BigDecimal getUrcenoCerpZust() {
        return urcenoCerpZust;
    }

    public void setUrcenoCerpZust(BigDecimal urcenoCerpZust) {
        this.urcenoCerpZust = urcenoCerpZust;
    }

    public BigDecimal getCerpZustatku() {
        return cerpZustatku;
    }

    public void setCerpZustatku(BigDecimal cerpZustatku) {
        this.cerpZustatku = cerpZustatku;
    }

    public boolean isRezim() {
        return rezim;
    }

    public void setRezim(boolean rezim) {
        this.rezim = rezim;
    }

    public List<SaleItemDTO> getPolozky() {
        return polozky;
    }

    public String getIdPokladny() {
        return idPokladny;
    }

    public void setIdPokladny(String idPokladny) {
        this.idPokladny = idPokladny;
    }

    public void setPolozky(List<SaleItemDTO> polozky) {
        this.polozky = polozky;
    }
}

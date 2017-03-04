package com.hnevkop.eet.converter;

import com.hnevkop.eet.model.Sale;
import com.hnevkop.eet.model.SaleItem;
import com.hnevkop.eet.sale.SaleDTO;
import com.hnevkop.eet.sale.SaleItemDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class SaleDTOToSaleConverter implements Converter<SaleDTO, Sale> {

    @Override
    public Sale convert(SaleDTO saleDTO) {
        Sale sale = new Sale();
        sale.setUuidZpravy(saleDTO.getUuidZpravy());
        sale.setPrvniZaslani(saleDTO.isPrvniZaslani());
        sale.setOverovaciRezim(saleDTO.isOverovaciRezim());
        sale.setIdPokladny(saleDTO.getIdPokladny());
        sale.setPoradoveCislo(saleDTO.getPoradoveCislo());
        sale.setDatumTrzby(saleDTO.getDatumTrzby());
        sale.setCelkovaTrzba(saleDTO.getCelkovaTrzba());
        sale.setZakladNepodlehajiciDph(saleDTO.getZakladNepodlehajiciDph());
        sale.setZakladDan1(saleDTO.getZakladDan1());
        sale.setDan1(saleDTO.getDan1());
        sale.setZakladDan2(saleDTO.getZakladDan2());
        sale.setDan2(saleDTO.getDan2());
        sale.setZakladDan3(saleDTO.getZakladDan3());
        sale.setDan3(saleDTO.getDan3());
        sale.setCestovniSluzba(saleDTO.getCestovniSluzba());
        sale.setPouzitZbozi1(saleDTO.getPouzitZbozi1());
        sale.setPouzitZbozi2(saleDTO.getPouzitZbozi2());
        sale.setPouzitZbozi3(saleDTO.getPouzitZbozi3());
        sale.setCerpZustatku(saleDTO.getCerpZustatku());
        sale.setUrcenoCerpZust(saleDTO.getUrcenoCerpZust());
        if (saleDTO.getPolozky() != null) {
            sale.setItems(convertItems(saleDTO.getPolozky()));
        }
        return sale;
    }


    private List<SaleItem> convertItems(List<SaleItemDTO> polozky) {
        return polozky.stream()
                .map(p -> new SaleItem(p.getNazev(), p.getMnozstvi(), p.getCena()))
                .collect(Collectors.toList());
    }
}

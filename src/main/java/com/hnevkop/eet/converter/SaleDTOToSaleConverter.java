package com.hnevkop.eet.converter;

import com.hnevkop.eet.model.Sale;
import com.hnevkop.eet.sale.SaleDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SaleDTOToSaleConverter implements Converter<SaleDTO, Sale> {

    @Override
    public Sale convert(SaleDTO source) {
        Sale sale = new Sale();
        sale.setUuidZpravy(source.getUuidZpravy());
        return sale;
    }
}

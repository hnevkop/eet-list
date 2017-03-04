package com.hnevkop.eet.converter;

import com.hnevkop.eet.model.Sale;
import com.hnevkop.eet.sale.SaleDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SaleToSaleDTOConverter implements Converter<Sale, SaleDTO> {
    @Override
    public SaleDTO convert(Sale source) {
        SaleDTO saleDTO = new SaleDTO();
        saleDTO.setUuidZpravy(source.getUuidZpravy());
        return saleDTO;
    }
}




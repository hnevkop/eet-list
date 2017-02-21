package com.hnevkop.eet.service;


import com.hnevkop.eet.converter.SaleDTOToSaleConverter;
import com.hnevkop.eet.repository.SaleRepository;
import com.hnevkop.eet.sale.SaleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EETService {

    @Autowired
    SaleDTOToSaleConverter converter;

    @Autowired
    SaleRepository saleRepository;

    public void saveSale(SaleDTO saleDTO) {
        saleRepository.save(converter.convert(saleDTO));
    }
}

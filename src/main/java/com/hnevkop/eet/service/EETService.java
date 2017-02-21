package com.hnevkop.eet.service;


import com.hnevkop.eet.converter.SaleDTOToSaleConverter;
import com.hnevkop.eet.converter.SaleToSaleDTOConverter;
import com.hnevkop.eet.model.Sale;
import com.hnevkop.eet.repository.SaleRepository;
import com.hnevkop.eet.sale.SaleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EETService {

    @Autowired
    SaleDTOToSaleConverter saleDTOToSaleConverterer;

    @Autowired
    SaleToSaleDTOConverter saleToSaleDTOConverteronverter;

    @Autowired
    SaleRepository saleRepository;

    public void saveSale(SaleDTO saleDTO) {
        saleRepository.save(saleDTOToSaleConverterer.convert(saleDTO));
    }

    public List<SaleDTO> findAll(){
        List<Sale> sales= saleRepository.findAll();
        List<SaleDTO> dtos = sales.stream().map(sale -> saleToSaleDTOConverteronverter.convert(sale)).collect(Collectors.toList());
        return dtos;
    }
}

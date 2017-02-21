package com.hnevkop.eet.list;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.hnevkop.eet.sale.SaleDTO;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EETResponseListDTO {

    private List<SaleDTO> results;

    public EETResponseListDTO(List<SaleDTO> all) {
        this.results = all;
    }

    public List<SaleDTO> getResults() {
        return results;
    }

    public void setResults(List<SaleDTO> results) {
        this.results = results;
    }
}

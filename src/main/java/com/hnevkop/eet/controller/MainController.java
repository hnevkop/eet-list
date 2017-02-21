package com.hnevkop.eet.controller;

import com.hnevkop.eet.list.EETResponseListDTO;
import com.hnevkop.eet.sale.SaleDTO;
import com.hnevkop.eet.service.EETService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    private EETService eetService;

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ResponseEntity<String> badRequest() {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(value = "Find client eet records",
            notes = "Retrieve eet records",
            response = EETResponseListDTO.class)
    @RequestMapping(value = "/eet/list/{from}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public EETResponseListDTO findEetRecords(@ApiParam(
            name = "From date",
            value = "From date",
            required = true) @PathVariable final String from) {
        return new EETResponseListDTO();
    }

    @RequestMapping(value = "/eet/add", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public String addSale(@ApiParam(
            name = "Social Security number",
            value = "Client's Social Security Number DTO",
            required = true) @RequestBody final SaleDTO saleDTO)
            throws Exception {
        eetService.saveSale(saleDTO);
        return "OK";
    }
}

package com.hnevkop.eet;

import com.hnevkop.eet.list.EETListResponseDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EETController {

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.HEAD})
    public ResponseEntity<String> badRequest() {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    @ApiOperation(value = "Find client eet records",
            notes = "Retrieve eet records",
            response = EETListResponseDTO.class)
    @RequestMapping(value = "/eet/list/{from}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public EETListResponseDTO findEetRecords(@ApiParam(
            name = "From date",
            value = "From date",
            required = true) @PathVariable final String from){
        return new EETListResponseDTO();
    }


}

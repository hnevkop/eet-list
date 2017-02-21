package com.hnevkop.eet.list;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EETResponseListDTO {

    private String result;
}

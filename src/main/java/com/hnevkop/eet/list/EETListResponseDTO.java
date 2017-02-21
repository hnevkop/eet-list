package com.hnevkop.eet.list;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class EETListResponseDTO {

    private String result;
}

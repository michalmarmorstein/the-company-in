package com.example.thecompanyin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyCategory {

//    private String sector;
//    private String sindustryGroup;
    private String industry;
//    private String subIndustry;
//    private int sicCode;
//    private int naicsCode;

}

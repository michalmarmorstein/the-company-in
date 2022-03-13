package com.example.thecompanyin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company {

//    private UUID id;
    private String logo;
    private String name;
    private String domain;
    private String description;
    private CompanyCategory category;
    private String type;
    private CompanyMetrics metrics;
    private String location;
//    private String legalName;
//    private String[] domainAliases;
//    private CompanySite site;
//    private String[] tags;
//    private int foundedYear;
//    private String timeZone;
//    private int utcOffset;
//    private Geo geo;

}

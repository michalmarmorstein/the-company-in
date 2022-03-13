package com.example.thecompanyin.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyMetrics {

    private long employees;
    private double raised;
    private long marketCap;
    private long annualRevenue;
}

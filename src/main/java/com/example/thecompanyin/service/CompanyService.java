package com.example.thecompanyin.service;

import com.example.thecompanyin.model.Company;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CompanyService {

    public Company getCompanyByDomain(String domain){

        Company company = getCompany(domain);
        return company;
    }

    //TODO move to network service
    private Company getCompany(String domain){
        String url = "https://company.clearbit.com/v2/companies/find?domain=" + domain; //TODO get uri as parameter
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer sk_bd16fff876554c3a767f98cf263121b4");//TODO hide it
        HttpEntity request = new HttpEntity(headers);
        ResponseEntity<Company> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                request,
                Company.class
        );
        //TODO handle exceptions
        // check response
        if (response.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Successful.");
            System.out.println(response.getBody());
        } else {
            System.out.println("Request Failed");
            System.out.println(response.getStatusCode());
        }
        return response.getBody();
    }
}

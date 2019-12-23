package com.example.democlient.controller;

import com.example.democlient.model.Account;
import com.example.democlient.model.Turnover;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("client")
public class TestClientController {

    @GetMapping("/accounts")
    private List<Account> getAllAccounts() {
        final String uri = "http://test-app-test00.192.168.42.137.nip.io/api/accounts";
        //local: final String uri = "http://localhost:8080/api/accounts";
        RestTemplate restTemplate = new RestTemplate();
        List<Account> result = restTemplate.getForObject(uri, List.class);
        return result;
    }

    @GetMapping("/turnovers")
    private List<Turnover> getAllTurnovers() {
        final String uri = "http://test-app-test00.192.168.42.137.nip.io/api/turnovers";
        //local: final String uri = "http://localhost:8080/api/turnovers";
        RestTemplate restTemplate = new RestTemplate();
        List<Turnover> result = restTemplate.getForObject(uri, List.class);
        return result;
    }

}

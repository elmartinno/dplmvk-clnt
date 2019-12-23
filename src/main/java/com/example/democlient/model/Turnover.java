package com.example.democlient.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "turnovers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Turnover {

    private String turnoverId;
    private String accountIban;
    private String counterAccountName;
    private String date;
    private Amount amount;
    private Balance balance;
    private String note;
    private String description;
    private String specific;
    private String variable;

}

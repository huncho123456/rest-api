package com.expense.restapi.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class expenseResponse {

    private String expenseId;

    private String name;
    private String note;
    private String description;
    private Date date;
    private BigDecimal amount;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}

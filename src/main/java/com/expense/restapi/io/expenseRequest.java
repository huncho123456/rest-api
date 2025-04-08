package com.expense.restapi.io;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class expenseRequest {

    private String name;
    private String note;
    private String description;
    private Date date;
    private BigDecimal amount;

}

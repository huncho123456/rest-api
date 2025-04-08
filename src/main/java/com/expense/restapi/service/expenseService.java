package com.expense.restapi.service;

import com.expense.restapi.dto.expenseDto;

import java.util.List;

public interface expenseService {

    List<expenseDto> getAllExpense();
}

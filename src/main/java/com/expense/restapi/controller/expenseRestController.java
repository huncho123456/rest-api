package com.expense.restapi.controller;

import com.expense.restapi.dto.expenseDto;
import com.expense.restapi.io.expenseResponse;
import com.expense.restapi.service.expenseService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
//use for logging error in your code
@Slf4j
@CrossOrigin("*")
public class expenseRestController {

    private final expenseService expenseService ;
    private final ModelMapper modelMapper;

    @GetMapping("/expenses")
    public List <expenseResponse> getExpenses() {
        //add the logger as we access this API
        log.info("GET /expenses called");
        // call the service method
        List<expenseDto> list = expenseService.getAllExpense();
        // convert the expenseDTO to expense response
        List<expenseResponse> response = list.stream().map(expenseDto-> mapToExpenseResponse(expenseDto))
                .collect(Collectors.toList());
        //return the response
        return response;
    }

    private expenseResponse mapToExpenseResponse(expenseDto expenseDto) {
        return modelMapper.map(expenseDto, expenseResponse.class);

    }
}

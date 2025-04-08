package com.expense.restapi.service.Implication;

import com.expense.restapi.repository.expenseRepo;
import com.expense.restapi.dto.expenseDto;
import com.expense.restapi.entity.expenseEntity;
import com.expense.restapi.service.expenseService;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class  expenseServiceImpl implements expenseService {

    private final expenseRepo expenseRepository;
    private final ModelMapper modelMapper;


    @Override
    public List<expenseDto> getAllExpense() {
    //      CALL THE REPOSITORY
            List<expenseEntity> list = expenseRepository.findAll();
    //     CONVERT THE ENTITY OBJECT TO DTO OBJECT
           List<expenseDto> listOfExpense = list.stream().map(expenseEntity -> mapToExpenseDTO(expenseEntity)).collect(Collectors.toList());
    //     RETURN THE LIST
           return listOfExpense;
    }

    private expenseDto mapToExpenseDTO(expenseEntity expenseEntity){
        return modelMapper.map(expenseEntity, expenseDto.class);
    }
}

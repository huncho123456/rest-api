package com.expense.restapi.repository;

import com.expense.restapi.entity.expenseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface expenseRepo extends JpaRepository<expenseEntity, Long> {

}

package com.expanse.Coino.service;

import com.expanse.Coino.models.Expense;
import com.expanse.Coino.repository.ExpenseRepository;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(@Valid Expense expense) {
        return expenseRepository.save(expense);
    }
}

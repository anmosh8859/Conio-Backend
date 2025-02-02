package com.expanse.Coino.controller;

import com.expanse.Coino.models.Expense;
import com.expanse.Coino.service.ExpenseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class ExpanseController {

    @Autowired
    private ExpenseService expenseService;

    @PostMapping("/add-expense")
    public ResponseEntity<Expense> addExpense(@Valid @RequestBody Expense expense) {
        Expense savedExpense = expenseService.saveExpense(expense);
        return ResponseEntity.ok(savedExpense);
    }

    @GetMapping("/get-expenses")
    public ResponseEntity<List<Expense>> getAllExpenses(@RequestParam String memberId) {
        return ResponseEntity.ok(expenseService.getAllExpenses(memberId));
    }
}

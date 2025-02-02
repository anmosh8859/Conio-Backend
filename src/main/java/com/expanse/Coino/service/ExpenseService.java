package com.expanse.Coino.service;

import com.expanse.Coino.models.Expense;
import com.expanse.Coino.models.ExpenseSplit;
import com.expanse.Coino.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    private ExpenseRepository expenseRepository;

    public Expense saveExpense(Expense expense) {
        List<ExpenseSplit> splitMembers = expense.getSplitBetween();

        if (splitMembers == null || splitMembers.isEmpty()) {
            throw new IllegalArgumentException("SplitBetween list cannot be empty");
        }
        double perPersonAmount = expense.getAmount() / splitMembers.size();

        for (int i = 0; i < splitMembers.size(); i++) {
            splitMembers.set(i, new ExpenseSplit(splitMembers.get(i).userId(), perPersonAmount, "PENDING"));
        }

        return expenseRepository.save(expense);
    }

    public List<Expense> getAllExpenses(String userId){
        return expenseRepository.findAllExpensesByUserId(userId);
    }
}

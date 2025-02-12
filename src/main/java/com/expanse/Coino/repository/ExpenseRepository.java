package com.expanse.Coino.repository;

import com.expanse.Coino.models.Expense;
import com.expanse.Coino.models.Group;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {

    @Query("{ 'splitBetween.userId': ?0 }")
    List<Expense> findAllExpensesByUserId(String userId);
}

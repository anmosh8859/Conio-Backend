package com.expanse.Coino.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "expenses")
public class Expense {

    @Id
    private String id;

    private String createdBy;
    private String description;
    private double amount;
    private String currency;
    private String category; /* User_id */
    private String paidBy;
    private List<ExpenseSplit> splitBetween;
    private LocalDateTime createdAt = LocalDateTime.now();
    private String UpdatedBy;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}


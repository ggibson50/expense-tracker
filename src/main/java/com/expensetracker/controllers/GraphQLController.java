package com.expensetracker.controllers;

import com.expensetracker.entities.Expense;
import com.expensetracker.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {

    @Autowired
    private ExpenseService expenseService;

    @QueryMapping
    public List<Expense> allExpenses() {
        return expenseService.getAllExpenses();
    }
}

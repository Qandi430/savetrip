package com.savetrip.DTO.budget;

import lombok.Data;

@Data
public class BudgetDTO {
    private int budgetNo;
    private int visitNo;
    private String budgetType;
    private String budgetCurrency;
    private String budgetTitle;
}

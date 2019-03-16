package com.savetrip.DTO.expense;

import com.savetrip.DTO.gallery.GalleryDTO;
import lombok.Data;

import java.sql.Date;

@Data
public class ExpenseDTO {
    private int expenseNo;
    private int budgetNo;
    private String expenseType;
    private double expenseAmount;
    private String expenseTitle;
    private String expenseComment;
    private Date expenseDate;
    private GalleryDTO galleryDto;
}

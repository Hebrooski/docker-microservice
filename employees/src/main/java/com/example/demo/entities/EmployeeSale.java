package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "employeesales")
public class EmployeeSale {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "saleid")
    private Integer saleId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "starttimezone")
    private LocalDateTime startTimezone;


    @Column(name = "endtimezone")
    private LocalDateTime endTimezone;

    @Column(name = "recurrencerule")
    private String recurrenceRule;

    @Column(name = "recurrenceid")
    private String recurrenceId;

    @Column(name = "recurrenceexception")
    private String recurrenceException;

    @Column(name = "isallday")
    private Boolean isAllDay;

    @Column(name = "employeeid")
    private Integer employeeId;

    // Constructors
    public EmployeeSale() {}

    public EmployeeSale(String title, String description,
                        LocalDateTime startTimezone, LocalDateTime endTimezone,
                        String recurrenceRule, String recurrenceId, String recurrenceException,
                        Boolean isAllDay, Integer employeeId) {
        this.title = title;
        this.description = description;
        this.startTimezone = startTimezone;
        this.endTimezone = endTimezone;
        this.recurrenceRule = recurrenceRule;
        this.recurrenceId = recurrenceId;
        this.recurrenceException = recurrenceException;
        this.isAllDay = isAllDay;
        this.employeeId = employeeId;
    }

    // Getters and setters
    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public LocalDateTime getStartTimezone() {
        return startTimezone;
    }

    public void setStartTimezone(LocalDateTime startTimezone) {
        this.startTimezone = startTimezone;
    }


    public LocalDateTime getEndTimezone() {
        return endTimezone;
    }

    public void setEndTimezone(LocalDateTime endTimezone) {
        this.endTimezone = endTimezone;
    }

    public String getRecurrenceRule() {
        return recurrenceRule;
    }

    public void setRecurrenceRule(String recurrenceRule) {
        this.recurrenceRule = recurrenceRule;
    }

    public String getRecurrenceId() {
        return recurrenceId;
    }

    public void setRecurrenceId(String recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public String getRecurrenceException() {
        return recurrenceException;
    }

    public void setRecurrenceException(String recurrenceException) {
        this.recurrenceException = recurrenceException;
    }

    public Boolean getIsAllDay() {
        return isAllDay;
    }

    public void setIsAllDay(Boolean isAllDay) {
        this.isAllDay = isAllDay;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
}
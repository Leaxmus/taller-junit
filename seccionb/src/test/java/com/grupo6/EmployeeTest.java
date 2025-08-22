package com.grupo6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee workerUSD;
    private Employee supervisorEUR;
    private Employee managerUSD;

    @BeforeEach
    void setUp() {
        workerUSD = new Employee(1000, "USD", 200, EmployeeType.Worker);
        supervisorEUR = new Employee(2000, "EUR", 300, EmployeeType.Supervisor);
        managerUSD = new Employee(3000, "USD", 500, EmployeeType.Manager);
    }

    // --------- TESTS DE BONO ANUAL ---------

    @Test
    void testYearBonusWorker() {
        assertEquals(386.0f, workerUSD.CalculateYearBonus(), 0.001);
    }

    @Test
    void testYearBonusSupervisor() {
        float expected = (2000 * 0.95f) + (386.0f * 0.5f);
        assertEquals(expected, supervisorEUR.CalculateYearBonus(), 0.001);
    }

    @Test
    void testYearBonusManager() {
        float expected = 3000 + 386.0f;
        assertEquals(expected, managerUSD.CalculateYearBonus(), 0.001);
    }

    // --------- TESTS DE SALARIO MENSUAL ---------

    @Test
    void testSalaryWorkerUSD() {
        float result = workerUSD.cs();
        assertTrue(result >= 1000);
    }

    @Test
    void testSalarySupervisorEUR() {
        float result = supervisorEUR.cs();
        assertTrue(result >= 1900);
    }

    @Test
    void testSalaryManagerUSD() {
        float result = managerUSD.cs();
        assertTrue(result >= 3000 + (500 * 0.7f));
    }
}

package com.example.verificationInera.soap;

import com.github.javafaker.Faker;

import java.time.LocalDate;

public class DataDateInterval {
    private String startDate;
    private String endDate;
    Faker faker = new Faker();

    private void generateDates() {
        int day = faker.number().numberBetween(1, 31);
        int month = faker.number().numberBetween(1, 12);
        int year = faker.number().numberBetween(1995, 2023);

        LocalDate fromDate = getFromDate(day, month, year);
        LocalDate toDate = getFromDate(day, month, year);
    }

    private static LocalDate getFromDate(int day, int month, int year) {
        LocalDate fromDate = LocalDate.of(year, month, day);
        return fromDate;
    }
}

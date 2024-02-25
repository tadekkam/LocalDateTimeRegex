package org.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.WeekFields;
import java.util.Locale;

public class BirthdayAnalyzer {

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.parse("2005-05-01");

        LocalDate currentDate = LocalDate.now();
        int age = currentDate.getYear() - birthday.getYear();

        DayOfWeek dayOfWeek = birthday.getDayOfWeek();

        WeekFields weekFields = WeekFields.of(Locale.getDefault());
        int weekNumber = birthday.get(weekFields.weekOfWeekBasedYear());

        System.out.println("Wiek: " + age + " lat");
        System.out.println("Dzień tygodnia urodzenia: " + dayOfWeek);
        System.out.println("Numer tygodnia roku: " + weekNumber);
    }

}

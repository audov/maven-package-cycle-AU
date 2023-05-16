package ru.netology.javaqa.mavenpackagecycleAU;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(resources="/parameters.csv")
       public void testOptions(int income, int expenses, int threshold) {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(income, expenses, threshold);
        System.out.println(actual);
    }
}

package ru.netology.javaqa.mavenpackagecycleAU;

import org.junit.jupiter.api.Test;

public class ScheduleServiceTestSimple {
    @Test
    public void testOptions1() {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(10000, 3000, 20000);
        System.out.println(actual);
    }
    @Test
    public void testOptions2() {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(100000, 60000, 150000);
        System.out.println(actual);
    }
}

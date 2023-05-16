package ru.netology.javaqa.mavenpackagecycleAU;

public class ScheduleService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {// можем ли отдыхать?
                int holiday = (money - expenses) * 2 / 3; // цена отдыха :)
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses - holiday; // остаток денег после месяца отдыха
                System.out.println("Месяц " + month + ". Денег " + (money + expenses + holiday) + ". Буду отдыхать. Потратил -" + expenses + ", потом еще -" + holiday);
            } else {
                money = money + income - expenses; // остаток денег после месяца работы
                System.out.println("Месяц " + month + ". Денег " + (money - income + expenses) + ". Придется работать. Заработал " + income + ". Потратил -" + expenses);
            }
        }
        return (count);
    }
}
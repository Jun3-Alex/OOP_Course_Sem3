package OOP_Course.Lesson3.OOPSeminar3.src.main.java.ru.gb.oseminar.data;

import java.time.LocalDate;
import java.util.Random;

public class StudentGenerator {

    private static final String[] FIRST_NAMES = {"Ivan", "Petr", "Sergey", "Vladimir", "Dmitry", "Nikolay", "Alexey", "Andrey", "Mikhail", "Yuri"};
    private static final String[] SECOND_NAMES = {"Ivanov", "Petrov", "Sergeev", "Vladimirov", "Dmitriev", "Nikolaev", "Alexandrov", "Andreev", "Mikhailov", "Yuriev"};
    private static final String[] PATRONYMICS = {"Ivanovich", "Petrovich", "Sergeevich", "Vladimirovich", "Dmitrievich", "Nikolaevich", "Alexandrovich", "Andreevich", "Mikhailovich", "Yurievich"};


    public static Student generateRandomStudent() {
        Random random = new Random();
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String secondName = SECOND_NAMES[random.nextInt(SECOND_NAMES.length)];
        String patronymic = PATRONYMICS[random.nextInt(PATRONYMICS.length)];
        LocalDate dateOfBirth = generateRandomDateOfBirth();
        Long studentId = (long) random.nextInt(1000); // Просто случайное число в качестве ID

        return new Student(firstName, secondName, patronymic, dateOfBirth, studentId);
    }

    private static LocalDate generateRandomDateOfBirth() {
        Random random = new Random();
        int year = 1990 + random.nextInt(20); // Год от 1990 до 2009
        int month = 1 + random.nextInt(12);
        int day = 1 + random.nextInt(28); // Просто предполагаем, что в месяце может быть до 28 дней
        return LocalDate.of(year, month, day);
    }
}


package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test

    public void testSimpleTaskMatches() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = true;
        boolean actual = simpleTask.matches("Позвонить");


        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void testSimpleTaskNotMatches() {

        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean expected = false;
        boolean actual = simpleTask.matches("Написать");


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testEpicMatches() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = true;
        boolean actual = epic.matches("Молоко");


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testEpicNotMatches() {

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        boolean expected = false;
        boolean actual = epic.matches("Творог");


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMeetingMatches() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = true;
        boolean actual = meeting.matches("Выкатка");


        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testMeetingNotMatches() {

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        boolean expected = false;
        boolean actual = meeting.matches("Пятница");


        Assertions.assertEquals(expected, actual);
    }


}
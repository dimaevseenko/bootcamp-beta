package ru.faang.school.hashmap.task_3.solution;

import java.util.Objects;

public class Student {

    private String name;

    private Faculty faculty;

    private int year;

    public Student(String name, Faculty faculty, int year) {
        this.name = name;
        this.faculty = faculty;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", faculty=" + faculty +
                ", year=" + year +
                '}';
    }

    public PairOfKeys getPairKeys(){
        return new PairOfKeys(faculty, year);
    }

    public static class PairOfKeys{
        private Faculty faculty;

        private int year;

        public PairOfKeys(Faculty faculty, int year) {
            this.faculty = faculty;
            this.year = year;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof PairOfKeys that)) return false;
            return year == that.year && faculty == that.faculty;
        }

        @Override
        public int hashCode() {
            return Objects.hash(faculty, year);
        }

        @Override
        public String toString() {
            return "PairOfKeys{" +
                    "faculty=" + faculty +
                    ", year=" + year +
                    '}';
        }
    }

    public enum Faculty{
        Gryffindor, Hufflepuff, Ravenclaw, Slytherin
    }
}

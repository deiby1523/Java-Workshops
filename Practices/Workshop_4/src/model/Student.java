package model;

@SuppressWarnings("FieldMayBeFinal")
public class Student {
    private String name;
    private byte age;
    private double[] grades = new double[2];

    public Student(String name, byte age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double[] getGrades() {
        return grades;
    }

    public void setGrade(int n, double grade) {
        this.grades[n] = grade;
    }

    public double calculateAverage() {
        double sum = 0;
        for (double nota : this.grades) {
            sum += nota;
        }
        return sum / this.grades.length;
    }

    public double calculateAssistance() {
        double average = this.calculateAverage();
        double assistance = 0;
        if (this.calculateAverage() > 4.5) {
            assistance = this.age * 5000;
        } else {
            if (average >= 3.8 && average <= 4.5) {
                assistance = this.age * 2000;
            }
        }
        return assistance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(name.toUpperCase());
        sb.append(" ").append(age);
        return sb.toString();
    }
}

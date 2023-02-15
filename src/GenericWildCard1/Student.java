package GenericWildCard1;

import java.util.List;

public class Student {
    public String studentName;
    public String studentSurname;
    public double marksAverage;

    public Student(String studentName, String studentSurname, double marksAverage) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    public static double getAverageMark(List<? extends Number> listOfMarks) {
        double sum = listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue();
        return sum / listOfMarks.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}

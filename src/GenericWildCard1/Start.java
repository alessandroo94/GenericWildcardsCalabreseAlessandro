package GenericWildCard1;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        List<Double> individualMarksListLisa = new ArrayList<>();
        individualMarksListLisa.add(28.5);
        individualMarksListLisa.add(30.0);

        List<Integer> projectMarksListJeremy = new ArrayList<>();
        projectMarksListJeremy.add((int) 90) ;
        projectMarksListJeremy.add((int) 100);

        double lisaAvg = Student.getAverageMark(individualMarksListLisa);
        double jeremyAvd = Student.getAverageMark(projectMarksListJeremy);

        List<Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student("Lista", "Stuart", lisaAvg));
        listOfStudent.add(new Student("Jeremy", "Green", jeremyAvd));

        for(Student student : listOfStudent)
            System.out.println(student);
    }
}

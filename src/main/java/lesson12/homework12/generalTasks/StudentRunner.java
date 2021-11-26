package lesson12.homework12.generalTasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {
        StudentRunner studentRunner = new StudentRunner();
        //12
        Student student1 = new Student("Ivan", "Biologi", 1, 2, "Human Anatomy");
        Student student2 = new Student("Ihor", "Physics", 1, 1, "Inertia");
        Student student3 = new Student("Svetlana", "Math", 2, 5, "Logarithms");
        Student student4 = new Student("Chemistry", "Explosive combinations", 2, 4, "Big boom");
        List<Student> studentsCollection = new ArrayList<>();
        studentsCollection.add(student1);
        studentsCollection.add(student2);
        studentsCollection.add(student3);
        studentsCollection.add(student4);
        studentRunner.printStudents(studentsCollection, 1);
        List<Student> studentsAfterSorting = studentRunner.sortStudentBySubjectAssessment(studentsCollection);
        for (Student student : studentsAfterSorting) {
            System.out.println(student);
        }

    }


    public List<Student> sortStudentBySubjectAssessment(List<Student> students) {
        Collection<Student> studentsToRemove = new ArrayList<>();
        for (Student student : students) {
            if (student.getSubjectAssessment() >= 3) {
                int studentCourse = student.getCourse();
                student.setCourse(studentCourse + 1);
            }
            if (student.getSubjectAssessment() < 3) {
                studentsToRemove.add(student);
            }
        }

        for (Student studentTeRemove : studentsToRemove) {
            students.remove(studentTeRemove);
        }
        return students;
    }

    public void printStudents(List<Student> students, int course) {
        System.out.println("Students: " + students);
        for (Student student : students) {
            if (student.getCourse() == course) {
                System.out.println("Student on current course: " + student.getStudentName());
            }
        }
    }
}
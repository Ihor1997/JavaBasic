package lesson8.classes;

public class TeacherLogic {

    public void excludeProcess(int rectorId, String nameStudent) {
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorId);
        System.out.println("Student: " + nameStudent + " removed:" + teacher.excludeStudent(nameStudent));

    }
}

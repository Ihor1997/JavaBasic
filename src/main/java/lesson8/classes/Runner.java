package lesson8.classes;

public class Runner {
    public static void main(String[] args) {
        TeacherLogic teacherLogic = new TeacherLogic();
        teacherLogic.excludeProcess(777, "Sergey");
        teacherLogic.excludeProcess(666, "Oleh");
    }
}

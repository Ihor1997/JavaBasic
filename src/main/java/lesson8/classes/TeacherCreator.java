package lesson8.classes;

public class TeacherCreator {

    public static AbstractTeacher createTeacher(int id) {
        class Rector extends AbstractTeacher {
            Rector(int id) {
                super(id);
            }

            @Override
            public boolean excludeStudent(String name) {
                return name != null;
            }
        }
        if (isRectorId(id)) {
            return new Rector(id);
        } else {
            return new AbstractTeacher.Teacher(id);
        }
    }

    private static boolean isRectorId(int id) {
        return id == 6;
    }
}

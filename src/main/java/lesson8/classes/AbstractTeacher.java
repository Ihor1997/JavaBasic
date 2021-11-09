package lesson8.classes;

public abstract class AbstractTeacher {


    private int id;

    public AbstractTeacher(int id) {
        this.id = id;
    }

    public abstract boolean excludeStudent(String name);

    public static class Teacher extends AbstractTeacher{

        public Teacher(int id){
            super(id);
        }

        @Override
        public boolean excludeStudent(String name) {
            return false;
        }

    }
}

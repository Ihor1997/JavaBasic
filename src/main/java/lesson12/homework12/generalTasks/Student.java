package lesson12.homework12.generalTasks;
//12
public class Student {

    private String studentName;
    private String groupName;
    private int course;
    private int subjectAssessment;
    private String assessment;

    public Student(String studentName, String groupName, int course, int subjectAssessment, String assessment) {
        this.studentName = studentName;
        this.groupName = groupName;
        this.course = course;
        this.subjectAssessment = subjectAssessment;
        this.assessment = assessment;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSubjectAssessment() {
        return subjectAssessment;
    }

    public void setSubjectAssessment(int subjectAssessment) {
        this.subjectAssessment = subjectAssessment;
    }

    public String getAssessment() {
        return assessment;
    }

    public void setAssessment(String assessment) {
        this.assessment = assessment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", groupName='" + groupName + '\'' +
                ", course=" + course +
                ", subjectAssessment=" + subjectAssessment +
                ", assessment='" + assessment + '\'' +
                '}';
    }
}

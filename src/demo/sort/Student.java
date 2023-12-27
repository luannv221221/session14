package demo.sort;

public class Student implements Comparable<Student> {
    private int studentCode;
    private String studentName;
    private int age;

    public Student() {
    }

    public Student(int studentCode, String studentName, int age) {
        this.studentCode = studentCode;
        this.studentName = studentName;
        this.age = age;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode=" + studentCode +
                ", studentName='" + studentName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {

        // tang dan
        // return this.getStudentName().compareTo(o.getStudentName());
        // giam dan
        // return o.getStudentName().compareTo(this.getStudentName());

        return o.getAge() - this.getAge();
    }
}

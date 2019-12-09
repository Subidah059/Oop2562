public class Student {
    String studentId;
    String studentName;
    String faculty;
    String major;

    void enrollment() {
        System.out.println("enrollment");
    }

    void payment() {
        System.out.println("payment");
    }

    void addCourse() {
        System.out.println("addCourse");
    }

    void dropCourse() {
        System.out.println("dropCourse");
    }

    public void showdata() {
        System.out.println("ID :" + studentId);
        System.out.println("Name :" + studentName);
        System.out.println("Major :" + major);
        System.out.println("Faculty :" + faculty);

    }

    public static void main(String[] args) {//psvm
        Student nali = new Student();
        System.out.println("Object = " + nali);
        nali.studentId = "614234007";
        nali.studentName = "Suphakin";
        nali.major = "CS";
        nali.faculty = "Scuence and Technology";
        
    }
}//end class

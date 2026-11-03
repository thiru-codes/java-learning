class Student {
    private int studentId;
    private String email;

    public Student(int studentId, String email) {
        this.studentId = studentId;
        this.email = email;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

public class ImmutableStudentProfile {
    public static void main(String[] args) {
        Student student = new Student(101, "student@example.com");

        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Email: " + student.getEmail());

        // Update email
        student.setEmail("newemail@example.com");

        System.out.println("\nAfter updating email:");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Email: " + student.getEmail());

        // student.setStudentId(102); // Error: No setter exists for studentId
    }
}
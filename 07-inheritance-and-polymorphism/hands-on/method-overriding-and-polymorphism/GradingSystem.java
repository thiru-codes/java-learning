class Student{
    void displayGrade(int[] grades){
        System.out.println("----Grades of Student----");
        for(int x: grades){
           System.out.print(x+" ");
        }
    }
}

class PostGraduate extends Student{
    @Override
    void displayGrade(int[] grades){
        System.out.println("----Grades of Post Graduate----");
        for(int x: grades){
           System.out.print(x+" ");
        }
        System.out.println();
    }

    void displayGrade(String[] courses, int[] grades){
        System.out.println("----Grades of Post Graduate----");
        for(int i=0;i<courses.length;i++){
           System.out.println(courses[i] + " : " + grades[i]);
        }
        System.out.println();
    }
}

public class GradingSystem {
    public static void main(String[] args) {

        Student student = new PostGraduate();

        int[] grades = {85, 92, 78};
        student.displayGrade(grades);


        PostGraduate pg = new PostGraduate();

        String[] courses = {"Java","DBMS","OS","CN"};
        int[] scores = {90,88,95,95};
        pg.displayGrade(courses, scores);
    }
}
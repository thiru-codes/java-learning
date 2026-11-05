class OuterDepartment{
    private String departmentName = "A department name";
    
    static class Location{
        public static String OFFICE_ADDRESS = "A random address";

        public static void getOFFICE_ADDRESS(){
            System.out.println(OFFICE_ADDRESS);
        }
    }

    class JobPosition{
        public String getDepartmentName(){
            // accessing private field beloning to outer class
            return departmentName;
        }
    }

}


public class Office{
    public static void main(String[] args){

        //accessing static nested class
        OuterDepartment.Location.getOFFICE_ADDRESS();

        //accessing member inner class
        OuterDepartment department = new OuterDepartment();

        OuterDepartment.JobPosition  jobPost = department.new JobPosition();

        System.out.println(jobPost.getDepartmentName());
    }
}

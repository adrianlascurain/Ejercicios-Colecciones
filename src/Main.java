
public class Main {
    public static void main( String[] args )
    {
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String courseId2 = "phys_01";
        String courseId3 = "chem_01";
        String studentId = "120120";
        
        courseService.displayCourseInformation( courseId );
        courseService.displayStudentInformation( studentId);
        courseService.displayCredits(studentId);
        
        System.out.println("");
        courseService.enrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        courseService.displayCredits(studentId);
        
        System.out.println("");
        courseService.enrollStudent( studentId, courseId2 );
        courseService.displayStudentInformation( studentId);
        courseService.displayCredits(studentId);
        
        System.out.println("");
        courseService.enrollStudent( studentId, courseId3 );
        courseService.displayStudentInformation( studentId);
        courseService.displayCredits(studentId);

        System.out.println("");
        courseService.unEnrollStudent( studentId, courseId );
        courseService.displayStudentInformation( studentId);
        courseService.displayCredits(studentId);
    }

}
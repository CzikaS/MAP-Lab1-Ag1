import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] grades = {55, 13, 78, 100};
        GradeTools gradeTools = new GradeTools();
        System.out.println(gradeTools.verifyGrades(grades));

        if (gradeTools.verifyGrades(grades) == false)
            throw new AssertionError("Grades verification failed");

        System.out.println(Arrays.toString(gradeTools.getFailingGrades(grades)));
        System.out.println(gradeTools.average(grades));
    }
}
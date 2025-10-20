import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        int[] grades = {50, 13, 78, 100};
        GradeTools gradeTools = new GradeTools();
        System.out.println(gradeTools.verifyGrades(grades));

        if (gradeTools.verifyGrades(grades) == false)
            throw new AssertionError("Grades veriication failed");

        System.out.println(Arrays.toString(gradeTools.getFailingGrades(grades)));
    }
}
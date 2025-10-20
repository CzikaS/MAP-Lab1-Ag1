public class GradeTools {

    public GradeTools() {
    }

    public boolean verifyGrades(int[] grades){
        for (int grade : grades)
            if (grade < 0 || grade > 100)
                return false;
        return true;
    }

    public int[] getFailingGrades(int[] grades){
        if (verifyGrades(grades)) {
            int count = 0;
            for (int grade : grades)
                if (grade < 40)
                    count++;

            int[] failingGrades = new int[count];
            int size = 0;
            for (int grade : grades)
                if (grade < 40) {
                    failingGrades[size] = grade;
                    size++;
                }

            return failingGrades;
        } else{
            throw new AssertionError("Grades are not valid.");
        }
    }

}
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

    public double average(int[] grades){
        if (verifyGrades(grades)){
            int sum = 0;
            for (int grade : grades)
                sum += grade;
            return (double) sum/grades.length;
        } else{
            throw new AssertionError("Grades are not valid");
        }
    }

    public int[] roundedGrades(int[] grades){
        if (verifyGrades(grades)){
            int[] result = new int[grades.length];
            for (int i=0; i< grades.length; i++){
                if (grades[i] < 38 || grades[i] % 5 == 0)
                    result[i] = grades[i];
                else {
                    int value = ((grades[i]/5)+1)*5;
                    if ((value - grades[i]) < 3)
                        result[i] = value;
                    else
                        result[i] = grades[i];
                }
            }
            return result;
        } else {
            throw new AssertionError("Invalid grades");
        }
    }

    public int maxRoundedGrade(int[] grades){
        int[] roundedGrades = roundedGrades(grades);
        int maxGrade = roundedGrades[0];
        for (int grade : grades){
            if (grade > maxGrade)
                maxGrade = grade;
        }
        return maxGrade;
    }

}
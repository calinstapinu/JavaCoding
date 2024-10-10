import java.util.ArrayList;

public class GradingMethods {

    // Metoda pentru a returna notele insuficiente
    public static int[] getInsufficientGrades(int[] grades) {
        ArrayList<Integer> insufficientGrades = new ArrayList<>();
        for (int grade : grades) {
            if (grade < 40) {
                insufficientGrades.add(grade);
            }
        }
        int[] result = new int[insufficientGrades.size()];
        for (int i = 0; i < insufficientGrades.size(); i++) {
            result[i] = insufficientGrades.get(i);
        }
        return result;
    }

    // Metoda pentru calcularea mediei notelor
    public static double calculateAverageGrade(int[] grades) {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // Metoda pentru a rotunji notele
    public static int[] getRoundedGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for (int i = 0; i < grades.length; i++) {
            int grade = grades[i];
            if (grade < 38) {
                roundedGrades[i] = grade; // nu se rotunjește
            } else {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    roundedGrades[i] = nextMultipleOf5;
                } else {
                    roundedGrades[i] = grade;
                }
            }
        }
        return roundedGrades;
    }

    // Metoda pentru a găsi nota maximă rotunjită
    public static int getMaxRoundedGrade(int[] grades) {
        int[] roundedGrades = getRoundedGrades(grades);
        int maxGrade = roundedGrades[0];
        for (int grade : roundedGrades) {
            if (grade > maxGrade) {
                maxGrade = grade;
            }
        }
        return maxGrade;
    }

    // Metoda pentru afișarea unui array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

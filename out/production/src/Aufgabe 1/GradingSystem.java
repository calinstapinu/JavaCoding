public class GradingSystem {
    public static void main(String[] args) {

        int[] grades = {29, 37, 38, 41, 84, 67};

        // 1
        int[] insufficientGrades = GradingMethods.getInsufficientGrades(grades);
        System.out.print("Note insuficiente: ");
        GradingMethods.printArray(insufficientGrades);

        // 2
        double averageGrade = GradingMethods.calculateAverageGrade(grades);
        System.out.printf("Media notelor: %.2f%n", averageGrade);

        // 3
        int[] roundedGrades = GradingMethods.getRoundedGrades(grades);
        System.out.print("Note rotunjite: ");
        GradingMethods.printArray(roundedGrades);

        // 4
        int maxRoundedGrade = GradingMethods.getMaxRoundedGrade(grades);
        System.out.println("Nota maximă rotunjită: " + maxRoundedGrade);
    }
}

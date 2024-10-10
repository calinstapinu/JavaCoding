// GradingSystem.java
public class GradingSystem {
    public static void main(String[] args) {
        // Exemplu de array de note
        int[] grades = {29, 37, 38, 41, 84, 67};

        // 1. Afișarea notelor insuficiente
        int[] insufficientGrades = GradingMethods.getInsufficientGrades(grades);
        System.out.print("Note insuficiente: ");
        GradingMethods.printArray(insufficientGrades);

        // 2. Afișarea mediei notelor
        double averageGrade = GradingMethods.calculateAverageGrade(grades);
        System.out.printf("Media notelor: %.2f%n", averageGrade);

        // 3. Afișarea notelor rotunjite
        int[] roundedGrades = GradingMethods.getRoundedGrades(grades);
        System.out.print("Note rotunjite: ");
        GradingMethods.printArray(roundedGrades);

        // 4. Afișarea notei maxime rotunjite
        int maxRoundedGrade = GradingMethods.getMaxRoundedGrade(grades);
        System.out.println("Nota maximă rotunjită: " + maxRoundedGrade);
    }
}

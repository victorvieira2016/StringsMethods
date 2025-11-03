import java.util.Arrays;

public class RegexSubstitution {
    public static void main(String[] args) {
        String firstString = "This sentence ends in 5 stars *****";
        String secondString = "1,2,3,4,5,6,7,8";

        System.out.printf("Original String 1: %s%n", firstString);

        firstString = firstString.replaceAll("\\*", "ˆ");

        System.out.printf("After replaceAll(ˆ) String 1: %s%n", firstString);

        firstString = firstString.replaceAll("stars", "carets");

        System.out.printf("After replaceAll(carets) String 1: %s%n", firstString);

        System.out.printf("Every world replace by \"world\": %s%n", firstString.replaceAll("\\w+", "world"));

        System.out.printf("%nOriginal String 2: %s%n", secondString);

        for (int i = 0; i < 3; i++)
            secondString = secondString.replaceFirst("\\d", "digit");
        System.out.printf("First 3 digits replace: %s%n", secondString);

        System.out.print("String split at commas: ");

        String[] results = secondString.split(",\\s*");
        System.out.println(Arrays.toString(results));
    }
}

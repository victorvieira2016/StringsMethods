public class StringConcatenation {
    public static void main(String[] args) {
        String s1 = "Happy ";
        String s2 = "Birthday";

        System.out.printf("s1 = %s%ns2 = %s%n", s1,s2);

        System.out.printf("%nResult s1.concat(2) = %s%n", s1.concat(s2));

        System.out.printf("%nAfter concatenation, result of s1 = %s%n", s1);
    }
}

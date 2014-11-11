public class NameTester {
    public static void main(String[] args) {
        Name name = new Name(
                "Mr.",
                "Bob",
                "Manfred",
                "Jinkens",
                "Jones",
                "Jinkens",
                "III",
                "Ph.D."
                );

        System.out.printf("%s %s %s %s (formerly %s) %s, %s\n",
                name.getTitle(),
                name.getFirst(),
                name.getMiddle(),
                name.getSurname(),
                name.getPaternal(),
                name.getSuffixGenerational(),
                name.getSuffixProfessional()
                );
    }
}

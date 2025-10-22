// test class

public class LibraryRoyaltyCalculator {
    public static void main(String[] args) {

        // Opretter forfattere
        Author author1 = new Author("J. K. Rowling");
        Author author2 = new Author("Brian Tee");
        Author author3 = new Author("Olga Ravn");


        // Harry Potter eksempel med store tal
        PrintedBook printedBook1 = new PrintedBook("Harry Potter og de vises sten", "SKØN", 50000, 233);
        PrintedBook printedBook2 = new PrintedBook("Harry Potter og Hemmelighedernes Kammer", "SKØN", 100000, 400);
        AudioBook audioBook1 = new AudioBook("Harry Potter og Fønixordenen", "SKØN", 150000, 144);

        author1.addTitle(printedBook1);
        author1.addTitle(printedBook2);
        author1.addTitle(audioBook1);


        // Små fiktive eksempler med mindre tal
        PrintedBook printedBook3 = new PrintedBook("Jurrasic Park - The New Planet", "TE", 150, 30);

        author2.addTitle(printedBook3);

        // Opgave eksemplet
        PrintedBook printedBook4 = new PrintedBook("Celestine", "SKØN", 166, 140);
        AudioBook audioBook2 = new AudioBook("Celestine", "SKØN", 140, 192);

        author3.addTitle(printedBook4);
        author3.addTitle(audioBook2);

        // Printer resultatet på en pæn måde
        System.out.println("=============================================");
        System.out.println("     Forfatterens samlede Bibliotekspenge    ");
        System.out.println("=============================================");

        // Ekstra loop, som kører igennem alle forfattere og printer dem allle ud
        Author[] allAuthors = {author1, author2, author3};
        for (Author a : allAuthors)
            System.out.printf("%-25s %15.2f kr.%n", a.getName(), a.calculateRoyalties());

        System.out.println("=============================================");



// Oprindelige version
//        System.out.printf("%-24s %.2f kr.%n", author1.getName(), author1.calculateRoyalties());
//        System.out.printf("%-28s %.2f kr.%n", author2.getName(), author2.calculateRoyalties());
//        System.out.printf("%-27s %.2f kr.%n", author3.getName(), author3.calculateRoyalties());


    }
}

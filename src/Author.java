import java.util.ArrayList;

public class Author {
    private String name;
    private ArrayList<Title> titles;

    public Author(String name) {
        this.name = name;
        this.titles = new ArrayList<>(); // Tom liste til titlerne
    }

    // Tilføjer en ny titel
    public void addTitle(Title title) {
        titles.add(title);
    }

    // Beregner forfatterens penge og løber igennem alle bøger eller audiobøger af forfatteren
    public double calculateRoyalties() {
        double total = 0;
        for (Title t : titles) {
            total += t.calculateRoyalty();
        }
        return total;
    }

    // Henter forfatteren navn
    public String getName() {
        return name;
    }
}

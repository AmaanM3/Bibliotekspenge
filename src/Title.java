public abstract class Title {
    private String title;
    private String literatureType;
    private static final double RATE = 0.067574;

    public Title(String title, String literatureType) {
        this.title = title;
        this.literatureType = literatureType;
    }

    // Beregner bibliotekspengene for hver en titel og ganger derefeter med den faste RATE
    public double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    // Abstreact metode bruges i subklasserne
    protected abstract double calculatePoints();

    // En converter der konverterer typen til et tal, der bruges i beregningen
    protected double convertLiteratureType() {
        if (literatureType.equals("BI")) {
            return 3.0;
        } else if (literatureType.equals("TE")) {
            return 3.0;
        } else if (literatureType.equals("LYRIK")) {
            return 6.0;
        } else if (literatureType.equals("SKØN")) {
            return 1.7;
        } else if (literatureType.equals("FAG")) {
            return 1.0;
        } else {
            return 0;
        }
    }
}

public class AudioBook extends Title{
    private int durationInMinutes;
    private int copies;

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) {
        super(title, literatureType);
        this.durationInMinutes = durationInMinutes;
        this.copies = copies;
    }

    @Override
    // Beregner point for hver printet bøg
    public double calculatePoints() {
        return (durationInMinutes *0.5 )* convertLiteratureType() * copies;
    }
}

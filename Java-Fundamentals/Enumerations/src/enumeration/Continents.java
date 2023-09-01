package enumeration;

public enum Continents {
    AFRICA(53),     // Elements are treated as objects
    EUROPE(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);    // Semicolon for the last element

    private final int NumberCountries;

    Continents(int numberCountries) {
        this.NumberCountries = numberCountries;
    }

    public int getNumberCountries() {
        return this.NumberCountries;
    }
}

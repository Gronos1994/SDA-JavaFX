package pl.sdaacademy.model;

/**
 * Created by RENT on 2017-03-15.
 */
public enum StreetPrefix {
    STREET("ul."), AVENUE("al."), SQUERE("pl."),;

    public String getPrefix() {
        return prefix;
    }

    private final String prefix;

    StreetPrefix(String prefix) {
        this.prefix = prefix;

    }
}

package model;

import com.example.asgn2.GenList;

public class Game {
    private String name;
    private String publisher;
    private String developer;
    private  int releaseYear;
    private String coverImageUrl;
    private String originalGameMachine;



    public Game(String name, String publisher, String developer, int releaseYear, String coverImageUrl,String originalGameMachine) {
        this.name = name;
        this.publisher = publisher;
        this.developer = developer;
        this.releaseYear = releaseYear;
        this.coverImageUrl = coverImageUrl;
        this.originalGameMachine = originalGameMachine;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public void setCoverImageUrl(String coverImageUrl) {
        this.coverImageUrl = coverImageUrl;
    }

    public String getOriginalGameMachine() {
        return originalGameMachine;
    }

    public void setOriginalGameMachine(String originalGameMachine) {
        this.originalGameMachine = originalGameMachine;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", publisher='" + publisher + '\'' +
                ", developer='" + developer + '\'' +
                ", releaseYear=" + releaseYear +
                ", coverImageUrl='" + coverImageUrl + '\'' +
                '}';
    }
}

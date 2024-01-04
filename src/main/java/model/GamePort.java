package model;

public class GamePort {
    private String originalGame;
    private String originalGameMachine;
    private String portDeveloper;
    private int releaseYear;
    private String coverImageUrl;

    public GamePort(String originalGame, String originalGameMachine, String portDeveloper, int releaseYear, String coverImageUrl) {
        this.originalGame = originalGame;
        this.originalGameMachine = this.originalGame;
        this.portDeveloper = portDeveloper;
        this.releaseYear = releaseYear;
        this.coverImageUrl = coverImageUrl;
    }

    public String getOriginalGame() {
        return originalGame;
    }

    public void setOriginalGame(String originalGame) {
        this.originalGame = originalGame;
    }

    public String getOriginalGameMachine() {
        return originalGameMachine;
    }

    public void setOriginalGameMachine(String originalGameMachine) {
        this.originalGameMachine = originalGameMachine;
    }

    public String getPortDeveloper() {
        return portDeveloper;
    }

    public void setPortDeveloper(String portDeveloper) {
        this.portDeveloper = portDeveloper;
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

    @Override
    public String toString() {
        return "GamePort{" +
                "originalGame=" + originalGame +
                ", originalGameMachine=" + originalGameMachine +
                ", portDeveloper='" + portDeveloper + '\'' +
                ", releaseYear=" + releaseYear +
                ", coverImageUrl='" + coverImageUrl + '\'' +
                '}';
    }
}

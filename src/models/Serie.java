package models;

public class Serie extends Titulo {
    private int season;
    private int episodesBySeason;
    private int durationInMinutesPerEpisode;

    @Override
    public int getDurationTimeperMinutes() {
        return durationInMinutesPerEpisode * episodesBySeason * season;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getEpisodesBySeason() {
        return episodesBySeason;
    }

    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }

    public int getDurationInMinutesPerEpisode() {
        return durationInMinutesPerEpisode;
    }

    public void setDurationInMinutesPerEpisode(int durationInMinutesPerEpisode) {
        this.durationInMinutesPerEpisode = durationInMinutesPerEpisode;
    }
}

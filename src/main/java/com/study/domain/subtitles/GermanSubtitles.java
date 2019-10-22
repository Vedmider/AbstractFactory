package com.study.domain.subtitles;

public class GermanSubtitles implements Subtitle {
    public void playSubtitle(String movieTitle) {
        System.out.println("Playing German subtitles for " + movieTitle + " movie.");
    }
}

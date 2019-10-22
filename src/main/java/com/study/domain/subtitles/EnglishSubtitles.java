package com.study.domain.subtitles;

public class EnglishSubtitles implements Subtitle {
    public void playSubtitle(String movieTitle) {
        System.out.println("Playing English subtitles for " + movieTitle + " movie.");
    }
}

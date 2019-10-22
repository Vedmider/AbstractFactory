package com.study.domain.track;

public class EnglishTrack implements Track {
    public void playTrack(String movieTitle) {
        System.out.println("Playing English audio track for " + movieTitle + " movie");
    }
}

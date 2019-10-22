package com.study.domain;

import com.study.domain.factories.ContextFactory;
import com.study.domain.subtitles.Subtitle;
import com.study.domain.track.Track;

public class Movie {
    private String movieTitle;
    private Subtitle subtitle;
    private Track track;

    public Movie(String movieTitle, ContextFactory context){
        subtitle = context.createSubtitle();
        track = context.createTack();
        this.movieTitle = movieTitle;
    }

    public void play(){
        subtitle.playSubtitle(movieTitle);
        track.playTrack(movieTitle);
    }

    public void changeContext(ContextFactory context){
        subtitle = context.createSubtitle();
        track = context.createTack();
    }

    public String getMovieTitle() {
        return movieTitle;
    }
}

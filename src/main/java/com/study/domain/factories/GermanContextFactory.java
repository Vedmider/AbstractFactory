package com.study.domain.factories;

import com.study.domain.subtitles.GermanSubtitles;
import com.study.domain.subtitles.Subtitle;
import com.study.domain.track.GermanTrack;
import com.study.domain.track.Track;

public class GermanContextFactory implements ContextFactory {
    public Subtitle createSubtitle() {
        return new GermanSubtitles();
    }

    public Track createTack() {
        return new GermanTrack();
    }
}

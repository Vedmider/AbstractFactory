package com.study.domain.factories;

import com.study.domain.subtitles.EnglishSubtitles;
import com.study.domain.subtitles.Subtitle;
import com.study.domain.track.EnglishTrack;
import com.study.domain.track.Track;

public class EnglishContextFactory implements ContextFactory {
    public Subtitle createSubtitle() {
        return new EnglishSubtitles();
    }

    public Track createTack() {
        return new EnglishTrack();
    }
}

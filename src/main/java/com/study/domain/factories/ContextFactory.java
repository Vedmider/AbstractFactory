package com.study.domain.factories;

import com.study.domain.subtitles.Subtitle;
import com.study.domain.track.Track;

public interface ContextFactory {
    Subtitle createSubtitle();
    Track createTack();
}

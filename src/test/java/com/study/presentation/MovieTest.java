package com.study.presentation;

import com.study.domain.Movie;
import com.study.domain.factories.EnglishContextFactory;
import com.study.domain.factories.GermanContextFactory;
import com.study.domain.subtitles.EnglishSubtitles;
import com.study.domain.subtitles.GermanSubtitles;
import com.study.domain.track.EnglishTrack;
import com.study.domain.track.GermanTrack;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class MovieTest {
    private Movie movie;

    @Before
    public void setUp(){
        movie = new Movie("Star Wars", new EnglishContextFactory());
    }

    @Test
    public void shouldReturnEnglishSubtitle(){
        assertEquals(EnglishSubtitles.class, movie.getSubtitle().getClass());
    }

    @Test
    public void shouldReturnEnglishTrack(){
        assertEquals(EnglishTrack.class, movie.getTrack().getClass());
    }

    @Test
    public void shouldReturnGermanSubtitleAfterChangingContext(){
        movie.changeContext(new GermanContextFactory());
        assertEquals(GermanSubtitles.class, movie.getSubtitle().getClass());
    }

    @Test
    public void shouldReturnGermanTrackAfterChangingContext(){
        movie.changeContext(new GermanContextFactory());
        assertEquals(GermanTrack.class, movie.getTrack().getClass());
    }

    @Test
    public void shouldReturnTrueWhenPlaysMovie(){
        assertTrue(movie.play());
    }
}

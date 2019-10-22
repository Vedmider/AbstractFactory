package com.study.presentation;

import com.study.domain.Movie;
import com.study.domain.factories.EnglishContextFactory;
import com.study.domain.factories.GermanContextFactory;

import java.util.Scanner;

public class ConsolePresentation {

    public static void main(String[] args) {

        System.out.println("This program gives you opportunity to chose movie you want with English or German context.\n" +
                "In order to choose movie please chose movie number and chose context number.\n" +
                "Movies:\n" +
                "1 - Forrest Gump\n" +
                "2 - Green Mile\n" +
                "3 - Escape from shawshank\n" +
                "Context:\n" +
                "1 - English\n" +
                "2 - German\n");

        Movie movie = getMovieWithContextFromInput();
        changeContext(movie);
    }

    private static Movie getMovieWithContextFromInput(){
        Scanner scanner = new Scanner(System.in);
        Movie movie = null;
        String input;
        String movieTitle = "";
        int movieNumber;
        int contextNumber;
        boolean shouldProcessConsoleInput = true;

        while(shouldProcessConsoleInput) {
            input = scanner.nextLine().trim();
            String[] params = input.split("\\s+");

            if (params.length != 2) {
                System.out.println("Please enter valid number of params");
                continue;
            }

            movieNumber = Integer.parseInt(params[0]);
            contextNumber = Integer.parseInt(params[1]);

            if (movieNumber > 3){
                System.out.println("Invalid number of movie");
                continue;
            }

            switch (movieNumber){
                case (1):
                    movieTitle = "Forrest Gump";
                    break;
                case(2):
                    movieTitle = "Green Mile";
                    break;
                case(3):
                    movieTitle = "Escape from shawshank";
            }

            switch (contextNumber){
                case(1):
                    movie = new Movie(movieTitle, new EnglishContextFactory());
                    break;
                case(2):
                    movie = new Movie(movieTitle, new GermanContextFactory());
                    break;
            }
            shouldProcessConsoleInput = false;
        }
        movie.play();
        return movie;
    }

    private static Movie changeContext(Movie movie){
        Scanner scanner = new Scanner(System.in);
        String input;
        int contextNumber;
        boolean shouldProcessConsoleInput = true;

        System.out.println("Please enter context number you want to change in " + movie.getMovieTitle() + "movie\n" +
                "1 - change to English track or Subtitle\n" +
                "2 - change to German track or Subtitle\n");

        while(shouldProcessConsoleInput) {
            input = scanner.nextLine().trim();
            contextNumber = Integer.parseInt(input);

            switch (contextNumber) {
                case (1):
                    movie.changeContext(new EnglishContextFactory());
                    break;
                case (2):
                    movie.changeContext(new GermanContextFactory());
                    break;
            }
            shouldProcessConsoleInput = false;
        }
        movie.play();
        return movie;
    }
}

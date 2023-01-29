package org.example;

import java.io.*;

class BeatlesException extends Exception {
    public BeatlesException(String message) {
        super("Beatles: " + message);
    }
}

public class Task1_2 {

    public static boolean isFoundInSong(String songLyrics,String lyricsToBeFound) {
        return songLyrics.contains(lyricsToBeFound);
    }

    public static void main(String[] args) {
        String str = "Show must go on!";
        boolean matchedLyrics = false;

        try {
            String line;
            FileReader file = new FileReader("lyrics.txt");
            BufferedReader reader = new BufferedReader(file);
            while ((line = reader.readLine()) != null) {
                if(isFoundInSong(line, str)) {
                    matchedLyrics = true;
                    break;
                }
            }

            if (!matchedLyrics) {
                throw new BeatlesException("String not found in the song");
            }

        } catch (IOException | BeatlesException e) {
            e.printStackTrace();
        }
    }
}

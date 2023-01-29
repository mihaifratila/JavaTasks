package org.example;

import java.util.Arrays;
import java.util.Comparator;
//import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {

        // Part 1:
        String lyrics = "In the town where I was born\n" +
                "Lived a man who sailed to sea\n" +
                "And he told us of his life\n" +
                "In the land of submarines\n" +
                "So we sailed on to the sun\n" +
                "'Til we found a sea of green\n" +
                "And we lived beneath the waves\n" +
                "In our yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "And our friends are all aboard\n" +
                "Many more of them live next door\n" +
                "And the band begins to play\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "Full steam ahead, Mister Boatswain, full steam ahead\n" +
                "Full steam ahead it is, Sergeant\n" +
                "Cut the cable, drop the cable\n" +
                "Aye-aye, sir, aye-aye\n" +
                "Captain, captain\n" +
                "As we live a life of ease a life of ease\n" +
                "Every one of us every one of us\n" +
                "Has all we need has all we need\n" +
                "Sky of blue sky of blue\n" +
                "And sea of green sea of green\n" +
                "In our yellow in our yellow\n" +
                "Submarine submarine, aha\n" +
                "We all live in a yellow submarine\n" +
                "A yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "A yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine\n" +
                "We all live in a yellow submarine\n" +
                "Yellow submarine, yellow submarine";

        String lowerCaseLyrics = lyrics.toLowerCase();
        lowerCaseLyrics = lowerCaseLyrics.replaceAll(",", "").replaceAll(",", "").replaceAll("\n", " ");
        String[] arrayOfLyrics = lowerCaseLyrics.split(" ");
//        for (String lyric : arrayOfLyrics) {
//            System.out.println(lyric);
//        }

        // Part 2:
        List<String> lyricsAsList = Arrays.asList(arrayOfLyrics);
        List<String> lyricsAsListWithoutDuplicateWords = lyricsAsList.stream().distinct().toList();
//        Iterator<String> iterator = lyricsAsListWithoutDuplicateWords.iterator();
//        if (iterator.hasNext()) {
//            do {
//                System.out.println(iterator.next());
//            } while (iterator.hasNext());
//        }

        List<String> sortedLyrics = lyricsAsListWithoutDuplicateWords.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();

        // Part 3:
        List<String> filteredLyricsAsList = lyricsAsList.stream()
                .filter(w -> (!w.equals("yellow") && !w.equals("submarine")))
                .toList();

        filteredLyricsAsList.forEach(System.out::println);
    }
}

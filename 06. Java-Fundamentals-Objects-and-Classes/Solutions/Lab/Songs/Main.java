package Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            String input = scanner.nextLine();
            String typeList = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];
            Song song = new Song(typeList, name, time);
            songList.add(song);
        }
        String query = scanner.nextLine();
        if (!query.equals("all")) {
            songList = songList.stream().filter(s -> s.getTypeList().equals(query)).collect(Collectors.toList());
        }
        printNameList(songList);
    }

    private static void printNameList(List<Song> songList) {
        for (Song song : songList) {
            System.out.println(song.toString());
        }
    }
}

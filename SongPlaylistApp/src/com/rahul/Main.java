package com.rahul;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("GOAT","KK");

        album.addSong("Beete Lamhe", 3.5);
        album.addSong("Ud Chala", 4.5);
        album.addSong("Mai Sahi hun", 3);
        album.addSong("Labon", 4.1);
        albums.add(album);

        album = new Album("Album2", "Eminem");
        album.addSong("Rap god", 3);
        album.addSong("Not Afraid", 5.1);
        album.addSong("Lose YourSelf", 3.3);
        albums.add(album);

        LinkedList<Song> playlist_1 = new LinkedList<>();
        albums.get(0).addToPlayList("Beete Lamhe", playlist_1);
        albums.get(0).addToPlayList("Ud Chala", playlist_1);
        albums.get(1).addToPlayList("Not Afraid", playlist_1);
        albums.get(1).addToPlayList("Rap god", playlist_1);

        play(playlist_1);

    }
    private static void play(LinkedList<Song> playlist){
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("This playlist have no song");
        }else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }


        while(!quit){
            int action = sc.nextInt();
            switch (action){
                case 0:
                    System.out.println("Playlist Completed");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next().toString());
                    }else{
                        System.out.println("no song available, reached to the end of the list");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the first song");
                        forward = false;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous().toString());
                            forward = false;
                        } else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next().toString());
                            forward = true;
                        } else{
                            System.out.println("we have reached to the end of list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("now playinng " + listIterator.next().toString());
                            forward = true;
                        }
                    }else{
                        if(listIterator.hasPrevious()){
                            System.out.println("now playing "+ listIterator.previous().toString());
                        }

                    }

            }
        }
    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list of all songs \n" +
                "5 - print all available options\n" +
                "6 - delete current song\n"
                );
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();

        System.out.println("_________________________");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("_________________________");
    }
}

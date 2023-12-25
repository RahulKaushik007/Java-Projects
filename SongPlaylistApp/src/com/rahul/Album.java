package com.rahul;

import java.util.ArrayList;
import java.util.LinkedList;

// first of all what is album
// in album there is "Name" of album like diljit dosanjh "GOAT"
// --and there is artis name of album
// --and song in the album
public class Album {
    //what will have as a properties of album is...
    //arraylist of songs - why we use (we need to use dynamic arraylist)

    private String name;
    private String artist;
    //how to create arraylist - we use generic for creating arraylist;
    //here we create arraylist of song class
    private ArrayList<Song> songs;

    public Album(String name, String artist){
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //empty constructor
    public Album(){

    }

    public Song findSong(String title){
        for (Song checkdSong: songs){
            //arraylist songs se jitne bhi song hai usko cecksong variable me dalo jo ki hai Song type ka
            if(checkdSong.getTitle() == title){
                return checkdSong;
            }
        }
        return null;
    }

    //now we have to addd some funtionality in the application because this is song playlist app
    //now we have to add song in album so we create add method and return true if added
    public boolean addSong(String title, double duration){
        //so we have to check wether the song is in the album or not
        //so wew can create separate method for it
        if(findSong(title) == null){
            songs.add(new Song(title, duration));
//            System.out.println(title + " successfully added to the album");
            return true;
        } else{
//            System.out.println("Song with name " + title + " already exist in the album");
            return false;
        }
    }

    //we can add the song in the playlist that already exist in the album and that make sence
   public boolean addToPlayList(int trackNumber, LinkedList<Song> PlayList){
        int index = trackNumber-1;
        if(index > 0 && index<=this.songs.size()){
            //array list to playlist
            PlayList.add(this.songs.get(index));
            return true;
        }
//        System.out.println("this album does not have song with tracknumber " + trackNumber);
        return false;
   }

   public boolean addToPlayList(String title, LinkedList<Song> PlayList){
        for(Song checkedSong : this.songs){
            if(checkedSong.getTitle().equals(title)){
                PlayList.add(checkedSong);
                return true;
            }
        }
//       System.out.println("There is no such song in album");
        return false;
   }
}

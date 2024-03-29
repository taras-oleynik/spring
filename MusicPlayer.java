package com.alishev.springcourse;

public class MusicPlayer {

    private int volume;



    private Music music;
    private String name;

    public MusicPlayer() {
        this.music = music;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {

        System.out.println("Playing " + music.getSong());
    }
}

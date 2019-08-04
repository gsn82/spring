package ru.gorshkov.springcourse;

public class MusicPlayer {
    private Music music;

    private String name;
    private int volume;

    //IoC
    // инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Music getMusic() {
        return music;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer() {
    }

    //выводим песню на экран
    public void playMusic (){
        System.out.println("Playing: "+ music.getSong());
    }


}

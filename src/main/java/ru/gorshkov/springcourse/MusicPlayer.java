package ru.gorshkov.springcourse;

public class MusicPlayer {
    private Music music;

    //IoC
    // инверсия управления
    public MusicPlayer(Music music) {
        this.music = music;
    }

    //выводим песню на экран
    public void playMusic (){
        System.out.println("Playing: "+ music.getSong());
    }


}

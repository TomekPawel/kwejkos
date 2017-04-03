package pl.akademiakodu.model;

/**
 * Created by gosc on 31.03.2017.
 */
public class Gif {
    private String name,username;

    private boolean favorite;


    public Gif(String s, String tomek, boolean b) {
        this.name = name;
        this.username = username;
        this.favorite = favorite;
    }

    public boolean isFavorite(){
        return favorite;
    }

    public String getName(){
        return name;
    }
}

package pl.akademiakodu.Controller.dao;

import pl.akademiakodu.model.Gif;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gosc on 03.04.2017.
 */
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "Chris Nowak", false),
            new Gif("adroid-explosion", "Ben Jakuben", true),
            new Gif("adroid-explosion", "Craig Daniels", false),
            new Gif("adroid-explosion", "Ada Lowelace", false),
            new Gif("adroid-explosion", "Grace Hoper", true),
            new Gif("adroid-explosion", "Melissa Mayer", false)
    );

    public static List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public Gif findByName(String name) {
                for (Gif gif : ALL_GIFS) {
                    if (gif.getName().equals(name)) {
                        return gif;
                    }

            }
            return null;
            }

}

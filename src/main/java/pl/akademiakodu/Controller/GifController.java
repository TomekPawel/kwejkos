package pl.akademiakodu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.akademiakodu.Controller.dao.GifRepository;
import pl.akademiakodu.model.Gif;

import java.util.List;

/**
 * Created by gosc on 31.03.2017.
 */

@Controller
public class GifController {

    @Autowired
    private GifRepository gifRepository;



    @GetMapping("/")
    public String listGifts(ModelMap modelMap){
        List<Gif> allGifs = GifRepository.getAllGifs();
        modelMap.put("gifs", allGifs);
        return "home";
    }
    @GetMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("cowboy-coder", "tomek", true);
        modelMap.addAttribute("gif",gif);
        return "gif-details";
    }
    @GetMapping("/gif/{nsame}")
    public String getDetails(@PathVariable String name, ModelMap modelMap){
        Gif gif = gifRepository.findByName(name);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}

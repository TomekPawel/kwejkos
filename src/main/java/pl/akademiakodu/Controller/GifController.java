package pl.akademiakodu.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import pl.akademiakodu.Controller.dao.*;
import pl.akademiakodu.Controller.model.Gif;

@Controller
public class GifController {

    @Autowired
    private pl.akademiakodu.Controller.dao.GifRepository gifRepository;

    @GetMapping("/")
    public String listGifs(ModelMap modelMap) {
        modelMap.addAttribute("gifs",gifRepository.getAllGifs());
        return "home";
    }


    @GetMapping("/gif")
    public String gifDetails(ModelMap modelMap){
        Gif gif = new Gif("cowboy-coder","michalos",true);
        modelMap.addAttribute("gif",gif);
        return "gif-details";
    }


}

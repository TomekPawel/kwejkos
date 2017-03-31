package pl.akademiakodu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by gosc on 31.03.2017.
 */

@Controller
public class GitController {

    @GetMapping("/")
    public String listGifts(){
        return "home";
    }
}

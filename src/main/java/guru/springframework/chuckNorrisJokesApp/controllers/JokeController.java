package guru.springframework.chuckNorrisJokesApp.controllers;

import guru.springframework.chuckNorrisJokesApp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String getCNQuote(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "index";
    }
}

package com.gfa.thereddit.controllers;


import com.gfa.thereddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("post")
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping(value = {"/","/list",""})

    public String list(Model m){
        m.addAttribute("posts",this.postService.findAll());
        return "list";
    }

}

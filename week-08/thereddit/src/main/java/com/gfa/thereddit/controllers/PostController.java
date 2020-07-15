package com.gfa.thereddit.controllers;


import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("{id}/plus")
    public String plus(@PathVariable Long id){
        Post post = this.postService.findById(id);
        if (post!=null) {
            post.vote(1);
            this.postService.save(post);
        }
        return "redirect:/post/list";
    }

    @GetMapping("{id}/minus")
    public String minus(@PathVariable Long id){
        Post post = this.postService.findById(id);
        if (post!=null) {
            post.vote(-1);
            this.postService.save(post);
        }
        return "redirect:/post/list";
    }

}

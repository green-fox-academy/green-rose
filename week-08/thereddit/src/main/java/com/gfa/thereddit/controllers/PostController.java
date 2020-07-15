package com.gfa.thereddit.controllers;


import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.services.PostService;
import com.gfa.thereddit.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("post")
public class PostController {

    private PostService postService;
    private UserService userService;

    public PostController(PostService postService, UserService userService) {
        this.userService = userService;
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

    @GetMapping("add")
    public String addForm(Model m){
        m.addAttribute("users",this.userService.findAll());
        return "add";
    }

    @PostMapping("add")
    public String addFormHandling(@ModelAttribute Post post,  @RequestParam Long user_id){
        post.setUser(this.userService.findById(user_id));
        post.setDate();
        this.postService.save(post);
        return  "redirect:/post/list";
    }

}

package com.gfa.thereddit.controllers;


import com.gfa.thereddit.models.Post;
import com.gfa.thereddit.models.PostPage;
import com.gfa.thereddit.models.User;
import com.gfa.thereddit.models.Voting;
import com.gfa.thereddit.services.PostService;
import com.gfa.thereddit.services.UserService;
import com.gfa.thereddit.services.VotingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("post")
public class PostController {

    private final PostService postService;
    private final UserService userService;
    private final VotingService votingService;

    public PostController(PostService postService, UserService userService, VotingService votingService) {
        this.userService = userService;
        this.postService = postService;
        this.votingService = votingService;
    }

    @GetMapping(value = {"/", "/list", ""})
    public String list(@RequestParam(required = false) Integer page, Model m, HttpSession session) {
        if (session.getAttribute("user")==null) return "redirect:/post/login";
        if (page==null) page=0;
        PostPage postPage = this.postService.findAll(page);
        m.addAttribute("posts", postPage.getPageList());
        m.addAttribute("pages", postPage.getPages()-1);
        m.addAttribute("page", page);
        m.addAttribute("name", ((User)session.getAttribute("user")).getUsername());
        return "list";
    }

    @GetMapping("login")
    public String login() {
        return "login";
    }

    @PostMapping("login")
    public String loginHandled(@ModelAttribute User user, HttpSession session) {
        User match = this.userService.findByUsernameAndPassword(user.getUsername(), user.getPassword());
        if (match == null) {
            return "redirect:/post/login";
        }
        session.setAttribute("user", match);
        return "redirect:/post/list";
    }

    @GetMapping("{id}/{rating}")
    public String plus(@PathVariable Long id, @PathVariable Integer rating, HttpSession session) {
        if (session.getAttribute("user")==null) return "redirect:/post/login";
        Post post = this.postService.findById(id);
        User user = ((User)session.getAttribute("user"));
        if (post != null && user !=null) {
            post.vote(rating);
            this.postService.save(post);
            this.votingService.save(new Voting(user, post, rating));
        }
        return "redirect:/post/list";
    }

    @GetMapping("add")
    public String addForm(Model m, HttpSession session) {
        if (session.getAttribute("user")==null) return "redirect:/post/login";
        return "add";
    }

    @PostMapping("add")
    public String addFormHandling(@ModelAttribute Post post, @RequestParam Long user_id) {
        post.setUser(this.userService.findById(user_id));
        post.setDate();
        this.postService.save(post);
        return "redirect:/post/list";
    }

    @GetMapping("add-user")
    public String addUserForm(HttpSession session) {
        if (session.getAttribute("user")==null) return "redirect:/post/login";
        return "user";
    }

    @PostMapping("add-user")
    public String addUserHandling(@ModelAttribute User user) {
        this.userService.save(user);
        return "redirect:/post/list";
    }

}

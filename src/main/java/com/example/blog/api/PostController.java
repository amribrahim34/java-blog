package com.example.blog.api;

import com.example.blog.models.Post;
import com.example.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/v1/posts")
public class PostController {

    private final PostService postService;
    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public List<Post> allPosts()
    {
        return this.postService.allPosts();
    }

    @PostMapping
    public void addPost(@RequestBody Post post)
    {
        this.postService.addPost(post);
    }

    @PutMapping
    public void editPost(@RequestBody Post post)
    {
        this.postService.editPost(post);
    }

    @DeleteMapping(path="/{id}")
    public void deletePost(@PathVariable("id") UUID id)
    {
        this.postService.deletePost(id);
    }

    @GetMapping(path="/{id}")
    public Post getPost(@PathVariable("id") UUID id)
    {
        return this.postService.getPost(id);
    }


}

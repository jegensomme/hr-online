package com.techspirit.casein.controller;


import com.techspirit.casein.model.Post;
import com.techspirit.casein.service.prototype.ServicePost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    private final ServicePost servicePost;

    @Autowired
    public PostController(ServicePost servicePost) { this.servicePost = servicePost;}

    @CrossOrigin
    @PostMapping(value = "/profile")
    public ResponseEntity<?> create (@RequestBody Post post)
    {
        servicePost.create(post);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @GetMapping(value = "/profile")
    public ResponseEntity<List<Post>> read ()
    {
        final List<Post> posts = servicePost.readALL();

        return posts != null && !posts.isEmpty()
                ? new ResponseEntity<>(posts, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @CrossOrigin
    @GetMapping(value = "/profile/{id}")
    public ResponseEntity<Post> read(@PathVariable(name = "id") int id){
        final Post post = servicePost.read(id);

        return post != null
                ? new ResponseEntity<>(post, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @PutMapping(value = "/profile/{id}")
    public ResponseEntity<?> update(@PathVariable(name = "id") int id, @RequestBody Post post) {
        final boolean update = servicePost.update(post, id);
        return update
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping(value = "/profile/{id}")
    public ResponseEntity<?> delete(@PathVariable(name = "id") int id) {
        final boolean deleted = servicePost.delete(id);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}

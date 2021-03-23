package com.techspirit.casein.service.implementation;

import com.techspirit.casein.model.Post;
import com.techspirit.casein.repository.PostRepository;
import com.techspirit.casein.service.prototype.ServicePost;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService implements ServicePost {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void create(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> readALL(){
        return postRepository.findAll();
    }

    @Override
    public Post read(int id){
        return postRepository.getOne(id);
    }

    @Override
    public boolean update(Post post, int id)
    {
        if(postRepository.existsById(id)) {
            post.setId(id);
            postRepository.save(post);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(int id)
    {
        if (postRepository.existsById(id))
        {
            postRepository.deleteById(id);
            return  true;
        }
        return false;
    }
}

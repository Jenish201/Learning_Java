package com.example.spring_boot_blog_app.config;

import com.example.spring_boot_blog_app.models.Account;
import com.example.spring_boot_blog_app.models.Post;
import com.example.spring_boot_blog_app.services.AccountService;
import com.example.spring_boot_blog_app.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SeedData implements CommandLineRunner{
    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {
        List<Post> posts = postService.getAll();

        if (posts.isEmpty()){

            Account account1 = new Account();
            Account account2 = new Account();

            account1.setEmail("user");
            account1.setPassword("password");
            account1.setFirstName("user");
            account1.setLastName("user");


            account2.setFirstName("user2");
            account2.setLastName("user2");
            account2.setEmail("admin");
            account2.setPassword("password");

            accountService.save(account1);
            accountService.save(account2);


            Post post1 = new Post();
            post1.setTitle("Post 1");
            post1.setBody("This is the body of post 1");
            post1.setAccount(account1);
            postService.save(post1);

        }
    }
}

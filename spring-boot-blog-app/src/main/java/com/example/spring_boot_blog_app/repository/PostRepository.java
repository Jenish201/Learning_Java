package com.example.spring_boot_blog_app.repository;

import com.example.spring_boot_blog_app.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}

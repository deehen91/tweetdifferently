package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface tweetRepository extends CrudRepository<tweetcontent, Long> {
}

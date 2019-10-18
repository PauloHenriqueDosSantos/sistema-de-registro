package com.example.demo.repository.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.topic.Topic;


@Repository
public interface TopicRepository extends CrudRepository<Topic, String> {

}
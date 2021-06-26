package io.jay.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;


    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<Topic>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    public Topic getTopic(int id) {
        return topicRepository.findById(id).get();

    }


    public void deleteService(int id) {
        topicRepository.deleteById(id);
    }


    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }
}

package com.nasa.service;

import com.nasa.model.FeedBack;
import com.nasa.repository.FeedBackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedBackService implements IFeedBackService{
    @Autowired
    private FeedBackRepo feedBackRepo;

    public Iterable<FeedBack> getAllFB() {
        return feedBackRepo.findAll();
    }
    public FeedBack save(FeedBack feedBack) {
        return feedBackRepo.save(feedBack);
    }
}

package com.nasa.service;

import com.nasa.model.FeedBack;

public interface IFeedBackService {
    Iterable<FeedBack> getAllFB();
    FeedBack save(FeedBack feedBack);
}

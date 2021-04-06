package com.nasa.repository;

import com.nasa.model.FeedBack;
import org.springframework.data.repository.CrudRepository;

public interface FeedBackRepo extends CrudRepository<FeedBack, Long> {
}

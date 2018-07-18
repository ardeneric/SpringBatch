package com.springBatch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBatch.entity.User;
import com.springBatch.repository.UserRepository;

@Service
public class DBWritter implements ItemWriter<User> {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void write(List<? extends User> user) throws Exception {
		System.err.println("user saved ::" + user);
		userRepository.save(user);
	}

}

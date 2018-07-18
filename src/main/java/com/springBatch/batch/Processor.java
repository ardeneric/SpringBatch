package com.springBatch.batch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Service;

import com.springBatch.entity.User;

@Service
public class Processor implements ItemProcessor<User, User>{

	private static final Map<String, String> DEPT_NAMES = new HashMap<>();
	
	public Processor() {
		DEPT_NAMES.put("001", "Tech");
		DEPT_NAMES.put("002", "Operation");
		DEPT_NAMES.put("003", "Accounts");
	}
	
	@Override
	public User process(User user) throws Exception {
		String deptCode = user.getDept();
		user.setDept(DEPT_NAMES.get(deptCode));
		return user;
	}

}

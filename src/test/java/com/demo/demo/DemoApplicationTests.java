package com.demo.demo;

import com.demo.demo.Domain.User;
import com.demo.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.skyscreamer.jsonassert.JSONAssert.assertEquals;

@ActiveProfiles("dev")
@SpringBootTest
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=DemoApplicationTests.class)
class DemoApplicationTests {
	@Autowired
	UserService userService;
	@Test
	void contextLoads() {
//		List<User> users = userService.getUsers();
//		assertNotNull(users);
//		assertEquals(10, users.size());

	}

}

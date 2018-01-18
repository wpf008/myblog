package com.wpf.blog;

import com.wpf.blog.mapper.UserMapper;
import com.wpf.blog.service.Userservice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private Userservice userservice;

	@Test
	public void contextLoads() {

		System.out.println(userMapper.selectAll());


		System.out.println(userMapper.findOne());
	}


	@Test
	public void testpage() {
		System.out.println(userservice.findAll());
	}

}

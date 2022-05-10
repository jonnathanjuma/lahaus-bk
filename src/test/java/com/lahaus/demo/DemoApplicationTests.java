package com.lahaus.demo;

import com.lahaus.demo.controller.Controller;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private Controller controller;

	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

//	@Autowired
//	private MockMvc mockMvc;
//
//	@Test
//	public void shouldReturnDefaultMessage() throws Exception {
//		this.mockMvc.perform(get("/existe")).andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("existe")));
//	}

}

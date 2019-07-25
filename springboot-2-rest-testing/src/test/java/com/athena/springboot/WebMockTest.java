package com.athena.springboot;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.athena.springboot.controller.RestTestController;
import com.athena.springboot.service.RestTestService;

@RunWith(SpringRunner.class)
@WebMvcTest(RestTestController.class)
public class WebMockTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	RestTestService restTestService; 
	
	@Test
	public void greetingResturnFromService() throws Exception {
		when(restTestService.greet()).thenReturn("Hello Suresh ");
		this.mockMvc.perform(get("/rest-service")).andDo(print()).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello Suresh")));
		
	}

}

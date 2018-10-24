package com.pentasys.schulungsprojekt;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SchulungsprojektApplicationTests {

	@Value("${name}")
	private String name;
	
	@Test
	public void contextLoads() {
		System.out.println("name: " + name);
	}

}

package fi.haagahelia.friends;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.assertj.core.api.Assertions.assertThat;

import fi.haagahelia.friends.web.Friendscontroller;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FriendsApplicationTests {

	@Autowired
	private Friendscontroller controller;
	
	@Test
	public void contextLoads() throws Exception {
	assertThat(controller).isNotNull();
	}

}

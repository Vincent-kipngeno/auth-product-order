package com.example.SpringAngularAuth;

import com.example.SpringAngularAuth.dto.UserInfo;
import com.example.SpringAngularAuth.repo.UserInfoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SpringAngularAuthApplicationTests {

	@Autowired
	private UserInfoRepository userInfoRepository;

	@Test
	public void getUserInfoTest() {
		List<UserInfo> list = userInfoRepository.getUerInfo();
		assertThat(list).isNotEmpty();
	}

}

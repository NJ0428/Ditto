package com.ditto.repository;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.entity.S_Ditto_MemberEntity;
@SpringBootTest
public class MemberRepoTest {
	@Autowired//스프링이 자동으로 해당 타입의 빈(Bean)을 찾아서 필드에 주입
	private MemberRepository memberRepository;
	
	
	@Test
	void memberInsert() {//100건의 사용자 정보를 생성
		IntStream.rangeClosed(1, 100).forEach(i -> {
			S_Ditto_MemberEntity member = S_Ditto_MemberEntity.builder()
					.loginId("user" + i)
					.loginPw("1234")
					.memberNm("nm_"+i)
					.memberEmail("user" + i + "@test.com")
					.memberAddr("myh")
					.memberZipcd("1234")
					.memberTel("01012341234")
					.memberDt("1234")
					.build();
			System.out.println(memberRepository.save(member));
		});
	}
}

package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.MemberDTO;
import com.ditto.entity.S_Ditto_MemberEntity;

@SpringBootTest
public class MemberServiceTest{
	@Autowired
    private MemberService memberService;


	@Test
	public void regTest() {//등록
		MemberDTO dto = MemberDTO.builder()
				.loginId("user1")
				.loginPw("12345")
				.memberNm("nm_nj5")
				.memberEmail("user0051@test.com")
				.memberAddr("myh5")
				.memberZipcd("12345")
				.memberTel("010123412355")
				.memberDt("c")
				.build();
		System.out.println(memberService.joinProcess(dto));
	}
	
    //@Test
    public void testGetMemberList() {//리스트 출력
        List<S_Ditto_MemberEntity> memberList = memberService.getList();
        memberList.forEach(dto -> System.out.println(dto));
    }

    //@Test
    public void testGetMember() {//특정 조회
        Long memberId = 101L; // 조회할 멤버의 아이디
        MemberDTO memberDTO = memberService.get(memberId);
        System.out.println(memberDTO);
        // memberDTO가 반환되는지 확인
    }

    //@Test
    public void testUpdateMember() {//수정
    	MemberDTO memberDTO = MemberDTO.builder()
				.memberNo(101L)
				.loginPw("1235")
				.memberAddr("aaaa")
				.memberZipcd("ssss")
				.memberEmail("ssss")
				.memberTel("12051112245")
				.build();

        memberService.updateArticle(memberDTO);;
    }

    //@Test
    public void testDeleteMember() {//삭제
        Long memberId = 101L; // 삭제할 멤버의 아이디
        memberService.delArticle(memberId);
    }
}

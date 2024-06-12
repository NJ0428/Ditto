package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.CtgDTO;
import com.ditto.entity.S_Ditto_CtgEntity;

@SpringBootTest
public class CtgServiceTest{
	@Autowired
    private S_Ditto_CtgService ctgService;

	@Test
	public void regTest() {//등록
		CtgDTO dto = CtgDTO.builder()
				.idx(2)
				.ctgNm("여성")
				.build();
		System.out.println(ctgService.register(dto));
	}
	@Test
	public void regTest2() {//등록
		CtgDTO dto = CtgDTO.builder()
				.idx(3)
				.ctgNm("유아")
				.build();
		System.out.println(ctgService.register(dto));
	}
    //@Test
    public void testGetMemberList() {//리스트 출력
        List<S_Ditto_CtgEntity> memberList = ctgService.getList();
        memberList.forEach(dto -> System.out.println(dto));
    }

    //@Test
    public void testGetMember() {//특정 조회
        Long cgtId = 1L; // 조회할 멤버의 아이디
        CtgDTO cgtDTO = ctgService.get(cgtId);
        System.out.println(cgtDTO);
        // cgtDTO가 반환되는지 확인
    }

    //@Test
    public void testUpdateMember() {//수정
    	CtgDTO ctgDTO = CtgDTO.builder()
    			.ctgCd(1L)
    			.ctgNm("test")
				.build();

    	ctgService.updateArticle(ctgDTO);;
    }

    //@Test
    public void testDeleteMember() {//삭제
        Long ctgId = 1L; // 삭제할 멤버의 아이디
        ctgService.delArticle(ctgId);
    }
}

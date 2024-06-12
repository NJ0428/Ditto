package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.S_ADTO;
import com.ditto.entity.S_Ditto_AEntity;



@SpringBootTest
public class S_AServiceTest {
	@Autowired
	private S_Ditto_AService s_aService;

	@Test
	public void regTest() {//등록
	    S_ADTO dto = S_ADTO.builder()
				.qnaNo(1L)
				.answerContent("sests")
				.build();
	    System.out.println(s_aService.register(dto));
	}

	//@Test
	public void testGets_aList() {//리스트 출력
	    List<S_Ditto_AEntity> s_aList = s_aService.getList();
	    s_aList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGets_a() {//특정 조회
	    Long s_aId = 1L; // 조회할  아이디
	    S_ADTO S_ADTO = s_aService.get(s_aId);
	    System.out.println(S_ADTO);
	    // S_ADTO가 반환되는지 확인
	}

	//@Test
	public void testUpdates_a() {//수정
	    S_ADTO dto = S_ADTO.builder()
	    		.qnaNo(1L)
				.answerContent("sests")		
	            .build();

	    s_aService.updateArticle(dto);;
	}

	//@Test
	public void testDeletes_a() {//삭제
	    Long s_aId = 1L; // 삭제할  아이디
	    s_aService.delArticle(s_aId);
	}
}

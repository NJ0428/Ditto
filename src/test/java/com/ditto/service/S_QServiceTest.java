package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.S_QDTO;
import com.ditto.entity.S_Ditto_QEntity;



@SpringBootTest
public class S_QServiceTest {
	@Autowired
	private S_Ditto_QService qService;

	//@Test
	public void regTest() {//등록
	    S_QDTO dto = S_QDTO.builder()
				.productId(1L)
				.productName("test")
				.loginId("test")
				.inquiryTitle("test")
				.inquiryContent("test")
				.orderNo(123L)
				.inquiryStatus("test")
				.build();
	    System.out.println(qService.register(dto));
	}

	//@Test
	public void testGetqList() {//리스트 출력
	    List<S_Ditto_QEntity> qList = qService.getList();
	    qList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetq() {//특정 조회
	    Long qId = 1L; // 조회할  아이디
	    S_QDTO S_QDTO = qService.get(qId);
	    System.out.println(S_QDTO);
	    // S_QDTO가 반환되는지 확인
	}

	//@Test
	public void testUpdateq() {//수정
	    S_QDTO dto = S_QDTO.builder()
	    		.qnaNo(1L)
				.inquiryTitle("test")
				.inquiryContent("test")
				.inquiryStatus("test123")
	            .build();

	    qService.updateArticle(dto);;
	}

	//@Test
	public void testDeleteq() {//삭제
	    Long qId = 1L; // 삭제할  아이디
	    qService.delArticle(qId);
	}
}

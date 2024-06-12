package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.S_NotiDTO;
import com.ditto.entity.S_Ditto_NotiEntity;
import com.ditto.entity.S_Ditto_QEntity;



@SpringBootTest
public class S_NotiServiceTest {
	@Autowired
	private S_Ditto_NotiService notiService;

	@Test
	public void regTest() {//등록
		S_NotiDTO dto = S_NotiDTO.builder()
				.sNotiNm("test")
				.sNotiTitle("test")
				.sNotiCntt("test")
				.build();
	    System.out.println(notiService.register(dto));
	}

	//@Test
	public void testGetqList() {//리스트 출력
	    List<S_Ditto_NotiEntity> qList = notiService.getList();
	    qList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetq() {//특정 조회
	    Long qId = 1L; // 조회할  아이디
	    S_NotiDTO S_QDTO = notiService.get(qId);
	    System.out.println(S_QDTO);
	    // S_QDTO가 반환되는지 확인
	}

	//@Test
	public void testUpdateq() {//수정
		S_NotiDTO dto = S_NotiDTO.builder()
				.sNotiNm("test")
				.sNotiTitle("test")
				.sNotiCntt("test")				
	            .build();

		notiService.updateArticle(dto);;
	}

	//@Test
	public void testDeleteq() {//삭제
	    Long qId = 1L; // 삭제할  아이디
	    notiService.delArticle(qId);
	}
}

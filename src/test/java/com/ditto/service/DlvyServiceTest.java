package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.DlvyDTO;
import com.ditto.entity.S_Ditto_DlvyEntity;



@SpringBootTest
public class DlvyServiceTest {
	@Autowired
	private S_Ditto_DlvyService dlvyService;

	//@Test
	public void regTest() {//등록
	    DlvyDTO dto = DlvyDTO.builder()
	    		.invoiceNo(1L)
				.ordNo(1L)
				.deliveryId("test")
				.exType("test")
				.build();
	    System.out.println(dlvyService.register(dto));
	}

	//@Test
	public void testGetdlvyList() {//리스트 출력
	    List<S_Ditto_DlvyEntity> dlvyList = dlvyService.getList();
	    dlvyList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetdlvy() {//특정 조회
	    Long dlvyId = 1L; // 조회할  아이디
	    DlvyDTO DlvyDTO = dlvyService.get(dlvyId);
	    System.out.println(DlvyDTO);
	    // DlvyDTO가 반환되는지 확인
	}

	//@Test
	public void testUpdatedlvy() {//수정
	    DlvyDTO dto = DlvyDTO.builder()
	    		.invoiceNo(1L)
	    		.ordNo(1L)
				.deliveryId("test")
				.exType("test")
				.build();

	    dlvyService.updateArticle(dto);;
	}

	//@Test
	public void testDeletedlvy() {//삭제
	    Long dlvyId = 1L; // 삭제할  아이디
	    dlvyService.delArticle(dlvyId);
	}
}

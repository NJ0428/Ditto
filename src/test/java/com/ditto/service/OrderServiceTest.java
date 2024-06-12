package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.OrderDTO;
import com.ditto.entity.S_Ditto_OrderEntity;




@SpringBootTest
public class OrderServiceTest {
	@Autowired
	private S_Ditto_OrderService orberService;

	//@Test
	public void regTest() {//등록
		OrderDTO dto = OrderDTO.builder()
				.prodId(2L)
				.prodNm("dt")
				.memberId("sests")
				.orderQuantity(0)
				.orderPrice(0.0)
				.orderStatus("sests")
				.orderStatus("expectYn")
				.build();
	    System.out.println(orberService.register(dto));
	}

	//@Test
	public void testGetorberList() {//리스트 출력
	    List<S_Ditto_OrderEntity> orderList = orberService.getList();
	    orderList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetorber() {//특정 조회
	    Long orberId = 1L; // 조회할  아이디
	    OrderDTO OrberDTO = orberService.get(orberId);
	    System.out.println(OrberDTO);
	    // OrberDTO가 반환되는지 확인
	}

	@Test
	public void testUpdateorber() {//수정
		OrderDTO dto = OrderDTO.builder()
				.orderNo(1L)
				.prodId(2L)
				.prodNm("dt")
				.memberId("1234")
				.orderQuantity(0)
				.orderPrice(0.0)
				.orderStatus("sests")
				.orderStatus("expectYn")			
	            .build();

	    orberService.updateArticle(dto);;
	}

	//@Test
	public void testDeleteorber() {//삭제
	    Long orberId = 1L; // 삭제할  아이디
	    orberService.delArticle(orberId);
	}
}

package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.CartDTO;
import com.ditto.entity.S_Ditto_CartEntity;



@SpringBootTest
public class CratServiceTest {
	@Autowired
	private S_Ditto_CartService CartService;

	@Test
	public void regTest() {//등록
	    CartDTO dto = CartDTO.builder()
	    		.loginNo(1L)
	    		.productId(2L)
	    		.cartCount(0)
	    		.build();
				
	    System.out.println(CartService.register(dto));
	}

	//@Test
	public void testGetCartList() {//리스트 출력
	    List<S_Ditto_CartEntity> CartList = CartService.getList();
	    CartList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetCart() {//특정 조회
	    Long CartId = 1L; // 조회할  아이디
	    CartDTO CartDTO = CartService.get(CartId);
	    System.out.println(CartDTO);
	    // CartDTO가 반환되는지 확인
	}

	//@Test
	public void testUpdateCart() {//수정
	    CartDTO dto = CartDTO.builder()
	    		.cartCount(0)
	    		.build();
	    CartService.updateArticle(dto);;
	}

	//@Test
	public void testDeleteCart() {//삭제
	    Long CartId = 1L; // 삭제할  아이디
	    CartService.delArticle(CartId);
	}
}

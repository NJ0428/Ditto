package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.ProdDTO;
import com.ditto.entity.S_Ditto_ProdEntity;



@SpringBootTest
public class ProductServiceTest {

	private S_Ditto_ProdService prodService;

	@Test
	public void regTest() {//등록

		
		
    	ProdDTO dto = ProdDTO.builder()
    			.prodNm("여성치마")
				.originPrice(20000)
				.salePrice(25000)
				.margin(50.0)
				.taxTp("1")
				.realCnt(300)
				.prodDesc("<img src='../../../ditto/2024/여성치마1_상세.jpg'/>")
				.saleStatus("판매중")
				.dlvyTp("1")
				.dlvyCost(2500)
				.dlvyCostRe(2500)
				.dlvyAdd("1")
				.ctgCd(1L)
				.pathUrl("여성치마1.jpg")
	            .build();
	

	    System.out.println(prodService.register2(dto));
	}

	//Test
	public void testGetprodList() {//리스트 출력
	    List<S_Ditto_ProdEntity> prodList = prodService.getList();
	    prodList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetprod() {//특정 조회
	    Long prodId = 1L; // 조회할  아이디
	    ProdDTO ProdDTO = prodService.get(prodId);
	    System.out.println(ProdDTO);
	    // ProdDTO가 반환되는지 확인
	}

	//@Test
	public void testUpdateprod() {//수정
	    ProdDTO dto = ProdDTO.builder()
				.prodId(2L)
				.prodNm("test")				
				.originPrice(8000)
				.salePrice(5400)
				.margin(5000 / 100.0)
				.taxTp("est")
				.realCnt(30)
				.prodDesc("test")
				.saleStatus("N; sold out")
				.dlvyTp("ou")
				.dlvyCost(3000)
				.dlvyCostRe(6000)
				.dlvyAdd("aaa")
	            .build();

	    prodService.updateArticle(dto);;
	}

	//@Test
	public void testDeleteprod() {//삭제
	    Long prodId = 1L; // 삭제할  아이디
	    prodService.delArticle(prodId);
	}
}

package com.ditto.service;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.ProdDTO;
import com.ditto.entity.S_Ditto_ProdEntity;



@SpringBootTest
public class ProductImgServiceTest2 {
	@Autowired
	private S_Ditto_ProdService prodService;

	//@Test
	public void regTest() {//등록
		
		IntStream.rangeClosed(1, 20).forEach(i -> {
		
		ProdDTO prod1 = ProdDTO.builder()
				.prodNm("남성복 테스트")
				.originPrice(i)
				.salePrice(i)
				.margin(i)
				.taxTp("영세")
				.realCnt(i)
				.prodDesc("test" + i)
				.userId("seller1")
				.saleStatus("N")
				.dlvyTp("우체국")
				.dlvyCost(3000)
				.dlvyCostRe(6000)
				.dlvyAdd("aaa")
				.ctgCd(1L)
	            .build();
		
	    System.out.println(prodService.register(prod1));
	    
		});
		
		
		
		
		IntStream.rangeClosed(1, 20).forEach(i -> {
			
			ProdDTO prod2 = ProdDTO.builder()
					.prodNm("여성복 테스트")
					.originPrice(i)
					.salePrice(i)
					.margin(i)
					.taxTp("영세")
					.realCnt(i)
					.prodDesc("test" + i)
					.userId("seller2")
					.saleStatus("N")
					.dlvyTp("CJ대한통운")
					.dlvyCost(3000)
					.dlvyCostRe(6000)
					.dlvyAdd("aaa")
					.ctgCd(2L)
		            .build();
			
		    System.out.println(prodService.register(prod2));
		    
			});
		
		
		IntStream.rangeClosed(1, 20).forEach(i -> {
			
			ProdDTO prod3 = ProdDTO.builder()
					.prodNm("아동복 테스트")
					.originPrice(i)
					.salePrice(i)
					.margin(i)
					.taxTp("영세")
					.userId("seller3")
					.realCnt(i)
					.prodDesc("test" + i)
					.saleStatus("N")
					.dlvyTp("CJ대한통운")
					.dlvyCost(3000)
					.dlvyCostRe(6000)
					.dlvyAdd("aaa")
					.ctgCd(3L)
		            .build();
			
		    System.out.println(prodService.register(prod3));
		    
			});
	    
	    
	}

	//@Test
	public void testGetprodList() {//리스트 출력
	    List<S_Ditto_ProdEntity> prodList = prodService.getList();
	    prodList.forEach(dto -> System.out.println(dto));
	}

	@Test
	public void testGetprod() {//특정 조회
	    Long prodId = 12L; // 조회할  아이디
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

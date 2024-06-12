package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.GetProdDTO;
import com.ditto.entity.Get_ProdEntiy;
import com.ditto.entity.S_Ditto_ProdEntity;

@SpringBootTest
public class GetProdTest {
	@Autowired
	private Get_ProdService prodService;
	
	@Test
	public void regTest() {//�벑濡�
		
		for(int i=0;i<100;i++) {
		GetProdDTO dto = GetProdDTO.builder()
				.prodNm("as"+i)
				.wholesaleNm("asdcom")
				.originPrice(1000*i)
				.salePrice(5000*i)
				.margin(5000/100.0)
				.taxTp("est")
				.realCnt(30*i)
				.prodDesc("test"+i)
				.saleStatus("sold out")
				.dlvyTp("ou")
				.dlvyCost(3000)
				.dlvyCostRe(6000)
				.dlvyAdd("aaa")
				.ctgCd("12")
				.uuid("asad"+i)
				.imgName("dddd")
	            .build();
		System.out.println(dto);
	    System.out.println(prodService.register(dto));
		}
	}
	
	@Test
	public void testGetprodList() {//由ъ뒪�듃 異쒕젰
	    List<Get_ProdEntiy> prodList = prodService.getList();
	    prodList.forEach(dto -> System.out.println(dto));
	}
	
	
	
}

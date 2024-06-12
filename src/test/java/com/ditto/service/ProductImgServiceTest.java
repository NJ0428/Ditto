package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.Prod_ImgDTO;
import com.ditto.entity.S_Ditto_Prod_ImgEntity;


@SpringBootTest
public class ProductImgServiceTest {
	@Autowired
	private S_Ditto_Prod_ImgService imgService;


	@Test
	public void regTest() {//등록
		for(int i=0; i<=100; i++) {
	    Prod_ImgDTO dto = Prod_ImgDTO.builder()

	            .path("test")
	            .imgName("nmnj5")
	            .uuid("nmnj5")
	            .build();
	    System.out.println(imgService.register(dto));
		}
	}

	//@Test
	public void testGetProd_ImgList() {//리스트 출력
	    List<S_Ditto_Prod_ImgEntity> Prod_ImgList = imgService.getList();
	    Prod_ImgList.forEach(dto -> System.out.println(dto));
	}

	//@Test
	public void testGetProd_Img() {//특정 조회
	    Long Prod_ImgId = 1L; // 조회할  아이디
	    Prod_ImgDTO Prod_ImgDTO = imgService.get(Prod_ImgId);
	    System.out.println(Prod_ImgDTO);
	    // Prod_ImgDTO가 반환되는지 확인
	}

	@Test
	public void testUpdateProd_Img() {//수정
	    Prod_ImgDTO ImgDTO = Prod_ImgDTO.builder()
	            .imgNo(1L)
	            .path("test")
	            .build();

	    imgService.updateArticle(ImgDTO);;
	}

	//@Test
	public void testDeleteProd_Img() {//삭제
	    Long Prod_ImgId = 1L; // 삭제할  아이디
	    imgService.delArticle(Prod_ImgId);
	}
}

package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.M_NotiDTO;
import com.ditto.dto.M_QDTO;
import com.ditto.entity.M_Ditto_NotiEntity;
import com.ditto.entity.M_Ditto_QEntity;



@SpringBootTest
public class M_NotiServiceTest{
	@Autowired
    private M_Ditto_NotiService notiService;

	@Test
	public void regTest() {//등록
		M_NotiDTO dto = M_NotiDTO.builder()
				.mQnaTitle("test")
				.mQnaCntt("nm_nj5")
				.mQnaStatus("myh5")
				.mQnaQAns("12345")
				.build();
		System.out.println(notiService.register(dto));
	}
	
    //@Test
    public void testGetM_AList() {//리스트 출력
        List<M_Ditto_NotiEntity> M_AList = notiService.getList();
        M_AList.forEach(dto -> System.out.println(dto));
    }

    //@Test
    public void testGetM_A() {//특정 조회
        Long M_AId = 1L; // 조회할 멤버의 아이디
        M_NotiDTO M_ADTO = notiService.get(M_AId);
        System.out.println(M_ADTO);
        // M_ADTO가 반환되는지 확인
    }

    //@Test
    public void testUpdateM_A() {//수정
    	M_NotiDTO M_ADTO = M_NotiDTO.builder()
				.mQnaNo(1L)
				.mQnaTitle("test")
				.mQnaCntt("nm_nj5")
				.mQnaStatus("myh5")
				.mQnaQAns("12345")
				.build();

    	notiService.updateArticle(M_ADTO);
    }

    //@Test
    public void testDeleteM_A() {//삭제
        Long M_AId = 1L; // 삭제할 멤버의 아이디
        notiService.delArticle(M_AId);
    }
}

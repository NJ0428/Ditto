package com.ditto.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ditto.dto.M_QDTO;
import com.ditto.entity.M_Ditto_QEntity;



@SpringBootTest
public class M_QServiceTest{
	@Autowired
    private M_Ditto_QService M_AService;

	@Test
	public void regTest() {//등록
		M_QDTO dto = M_QDTO.builder()
				.loginId("user1")
				.mQnaTitle("test")
				.mQnaContent("nm_nj5")
				.mQnaStatus("myh5")
				.mQnaStatus("12345")
				.mQnaAnswer("test")
				.build();
		System.out.println(M_AService.register(dto));
	}
	
    //@Test
    public void testGetM_AList() {//리스트 출력
        List<M_Ditto_QEntity> M_AList = M_AService.getList();
        M_AList.forEach(dto -> System.out.println(dto));
    }

    //@Test
    public void testGetM_A() {//특정 조회
        Long M_AId = 101L; // 조회할 멤버의 아이디
        M_QDTO M_ADTO = M_AService.get(M_AId);
        System.out.println(M_ADTO);
        // M_ADTO가 반환되는지 확인
    }

    //@Test
    public void testUpdateM_A() {//수정
    	M_QDTO M_ADTO = M_QDTO.builder()
				.mQnaNo(1L)
				.loginId("user1")
				.mQnaTitle("test")
				.mQnaContent("nm_nj5")
				.mQnaStatus("myh5")
				.mQnaStatus("12345")
				.mQnaAnswer("test")
				.build();

        M_AService.updateArticle(M_ADTO);
    }

    //@Test
    public void testDeleteM_A() {//삭제
        Long M_AId = 101L; // 삭제할 멤버의 아이디
        M_AService.delArticle(M_AId);
    }
}

package com.zero.Start.manage.mapper;

import com.zero.Start.manage.domain.Manager;
import com.zero.Start.manage.domain.ManagerParam;
//import com.zero.Start.manage.domain.ManagerUseLombok;
import com.zero.Start.manage.service.ManageService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class ManageMapperTest {
    
    @Autowired
    ManageMapper manageMapper;

    @Autowired
    ManageService manageService;

    @Test
    @DisplayName("관리자 구하기")
    void 관리자구하기() {

        List<Manager> managers = manageMapper.findAll();
        
        for(Manager manager : managers) {
            System.out.println("manager.getName() = " + manager.getName());
        }

    }


    @Test
    @DisplayName("회원 ID로 가져오기")
    void findById() {
        ManagerParam param = new ManagerParam();
        param.setUserId("asdf");

        Manager manager = manageMapper.findById(param);

        assertThat(param.getUserId()).isEqualTo(manager.getUserId());
    }




    // 2023.05.09 서영정 : 이건뭐하는건가요 !
//    @Test
//    @DisplayName("롬복사용하기")
//    void manageUseLombok() {
//
//        ManagerUseLombok manager =
//         new ManagerUseLombok("1","2","3","4"); // @AllArgsConstructor
//
//        new ManagerUseLombok(); // 이때 기본 생성자 정의
//
//
//        manager.getPassword();   //@Getter
//        manager.setPassword("2"); //@Setter
//
//    }


    @Test
    @DisplayName("관리자 저장")
    void 관리자저장() {
        Manager manager = new Manager();
        manager.setUserId("asdf");
        manager.setPassword("1234");
        manager.setName("요미");
        manager.setDept("호랑이과");

        manageService.saveManager(manager);
    }

    @Test
    @DisplayName("관리자 정보 업데이트")
    void 관리자정보수정() {
        Manager manager = new Manager();
        manager.setUserId("asdf");
        manager.setPassword("1234");
        manager.setName("서요미");
        manager.setDept("호랑이과");

        Manager result = manageService.updateManager(manager);


        System.out.println(result);
    }

    @Test
    @DisplayName("관리자 계정 삭제")
    void 관리자정보삭제() {
        ManagerParam param = new ManagerParam();
        param.setUserId("asdf");

        manageService.deleteManager(param);
    }


}

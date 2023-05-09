package com.zero.Start.manage.mapper;

import com.zero.Start.manage.domain.Manager;
import com.zero.Start.manage.domain.ManagerUseLombok;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ManageMapperTest {
    
    @Autowired
    ManageMapper manageMapper;

    @Test
    @DisplayName("관리자 구하기")
    void 관리자구하기() {

        List<Manager> managers = manageMapper.findAll();
        
        for(Manager manager : managers) {
            System.out.println("manager.getName() = " + manager.getName());
        }

    }


    @Test
    @DisplayName("롬복사용하기")
    void manageUseLombok() {

        ManagerUseLombok manager =
         new ManagerUseLombok("1","2","3","4"); // @AllArgsConstructor

        new ManagerUseLombok(); // 이때 기본 생성자 정의


        manager.getPassword();   //@Getter
        manager.setPassword("2"); //@Setter

    }



}

package com.zero.Start.manage.mapper;

import com.zero.Start.manage.domain.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ManageMapperTest {
    
    @Autowired
    ManageMapper manageMapper;
    @Test
    void 관리자구하기() {
        List<Manager> managers = manageMapper.findAll();
        
        for(Manager manager : managers) {
            System.out.println("manager.getName() = " + manager.getName());
        }
    }
}

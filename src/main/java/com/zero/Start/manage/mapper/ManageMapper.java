package com.zero.Start.manage.mapper;

import com.zero.Start.manage.domain.Manager;
import com.zero.Start.manage.domain.ManagerParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ManageMapper {

    List<Manager> findAll();

    Manager findById(ManagerParam param);

    void saveManager(Manager manager);
    void updateManager(Manager manager);
    void deleteManager(String userId);
}

package com.zero.Start.user.mapper;

import com.zero.Start.manage.domain.Manager;
import com.zero.Start.manage.domain.ManagerParam;
import com.zero.Start.user.domain.UserParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    List<Manager> findAll(UserParam userParam);

}

package com.zero.Start.manage.service;

import com.zero.Start.manage.domain.Manager;
import com.zero.Start.manage.domain.ManagerParam;
import com.zero.Start.manage.mapper.ManageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManageService {

    private final ManageMapper manageMapper;

    public List<Manager> findAll() {
        return manageMapper.findAll();
    }

    // Id를 사용하여 관리자 검색
    public Manager findById(ManagerParam param){
        return manageMapper.findById(param);
    }


    // 관리자 회원 등록
    public void saveManager(Manager manager) {
        manageMapper.saveManager(manager);
    }

    // 관리자 회원 등록
    public Manager updateManager(Manager manager) {
        manageMapper.updateManager(manager);

        ManagerParam param = new ManagerParam();
        param.setUserId(manager.getUserId());

        return manageMapper.findById(param);
    }

    // 관리자 회원 등록
    public void deleteManager(ManagerParam param) {
        manageMapper.deleteManager(param.getUserId());
    }



}

package com.zero.Start.manage.repository;

//import com.zero.Start.DB.ConfigDB;
import com.zero.Start.datasource.ConfigDB;
import com.zero.Start.manage.domain.Manager;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import static com.zero.Start.DB.ConfigDB.jdbcDataSource;

class ManageRepositoryTest {

//    ConfigDB configDB = new ConfigDB();
//
//    @Test
//    void saveManager() throws SQLException {
//        Manager manager = new Manager();
//        manager.setUserId("bbb");
//        manager.setPassword("1234");
//        manager.setName("김요미");
//        manager.setDept("호랑이과");
//
//        Connection con = jdbcDataSource.getConnection();
//
//        String sql = "insert into Manager(userId, password, name, dept) values(?, ? , ? , ?)";
//
//        PreparedStatement pstmt = con.prepareStatement(sql);
//
//        pstmt.setString(1, manager.getUserId());
//        pstmt.setString(2, manager.getPassword());
//        pstmt.setString(3, manager.getName());
//        pstmt.setString(4, manager.getDept());
//
//        pstmt.execute();
//
//        pstmt.close();
//        con.close();
//
//    }
//
//    @Test
//    void updateManager() throws SQLException {
//
//        Manager manager = new Manager();
//        manager.setUserId("aaa");
//        manager.setPassword("1234");
//        manager.setName("김요미");
//        manager.setDept("고양이과");
//자
//        Connection con = jdbcDataSource.getConnection();
//
//        String sql = "UPDATE Manager SET password = ?, name = ?, dept = ? WHERE userId = ?";
//
//        PreparedStatement pstmt = con.prepareStatement(sql);
//        pstmt.setString(1, manager.getPassword());
//        pstmt.setString(2, manager.getName());
//        pstmt.setString(3, manager.getDept());
//        pstmt.setString(4, manager.getUserId());
//
//        pstmt.execute();
//
//        pstmt.close();
//        con.close();
//    }
//
//    @Test
//    void deleteManager() throws SQLException {
//        String userId = "aaa";
//
//        Connection con = jdbcDataSource.getConnection();
//
//        String sql = "DELETE FROM Manager WHERE userId = ?";
//
//        PreparedStatement pstmt = con.prepareStatement(sql);
//        pstmt.setString(1, userId);
//
//        pstmt.execute();
//
//        pstmt.close();
//        con.close();
//    }
//
//    @Test
//    void ManagerList() throws  SQLException {
//
//        List<Manager> managerList = new ArrayList<>();
//
//        Connection con = jdbcDataSource.getConnection();
//
//        String sql = "SELECT * FROM Manager";
//        PreparedStatement pstmt = con.prepareStatement(sql);
//
//        ResultSet rs = pstmt.executeQuery();
//
//        while(rs.next()) {
//            Manager manager = new Manager();
//            manager.setUserId(rs.getString("userId"));
//            manager.setName(rs.getString("name"));
//            manager.setDept(rs.getString("dept"));
//
//            managerList.add(manager);
//        }
//
//        for(Manager manager : managerList) {
//            System.out.println("manager.getName() = " + manager.getName());
//        }
//    }
}
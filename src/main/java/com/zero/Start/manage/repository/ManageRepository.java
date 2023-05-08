package com.zero.Start.manage.repository;

//import com.zero.Start.DB.ConfigDB;
import com.zero.Start.manage.domain.Manager;
import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//import static com.zero.Start.DB.ConfigDB.jdbcDataSource;

public class ManageRepository {

    private static ManageRepository manageRepository = new ManageRepository();
//    ConfigDB configDB = new ConfigDB();

    private ManageRepository() {
    }

//    public static ManageRepository getInstance() {
//        return manageRepository;
//    }
//
//    public void saveManager(Manager manager) throws SQLException {
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
//    }
//
//    public void updateManager(Manager manager) throws SQLException {
//
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
//    public void deleteManager(String userId) throws SQLException {
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
//    public List<Manager> ManagerList() throws  SQLException {
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
//        return managerList;
//    }
}

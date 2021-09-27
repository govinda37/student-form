/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daoImp;

import com.connection.DBconnection;
import com.dao.StudentDao;
import com.model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Govinda
 */
public class StudentDaoImpl implements StudentDao{
    static Connection con = DBconnection.getConnection();
    @Override
    public Integer addStudent(Student s) {
        Integer roll = null;
        try {
            String addQuery = "INSERT INTO users(s_name,nic,email,address,city,age) VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(addQuery);
            ps.setString(1, s.getStudentName());
            ps.setDouble(2, s.getCNIC());
            ps.setString(3, s.getEmail());
            ps.setString(4, s.getAddress());
            ps.setString(5, s.getCity());
            ps.setInt(6, s.getAge());
            
            roll  = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());
            e.printStackTrace();
        }
        return roll;
    }
    
}

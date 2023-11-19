package com.spring.initializr.demovd1.service;

import com.spring.initializr.demovd1.model.Employee;

import java.util.List;

public interface IEmployeeService {
    // Hàm thêm nhân viên
    public Employee addEmployee(Employee employee);

    // Hàm chỉnh sửa thông tin nhân viên
    public Employee updateEmployee(long id, Employee employee);

    // Hàm xóa nhân viên
    public boolean deleteEmployee(long id);

    // Hàm lấy ra danh sách nhân viên
    public List<Employee> getAllEmployee();

    // Hàm lấy ra 1 nhân viên
    public Employee getOneEmployee(long id);
}

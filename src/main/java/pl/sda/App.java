package pl.sda;

import pl.sda.dao.ClassroomDao;
import pl.sda.dao.DepartmentDao;
import pl.sda.dao.EmployeeDao;
import pl.sda.model.Address;
import pl.sda.model.Classroom;
import pl.sda.model.Department;
import pl.sda.model.Employee;

public class App {
    public static void main( String[] args ) {
        DepartmentDao departmentDao = new DepartmentDao();
        EmployeeDao employeeDao = new EmployeeDao();
        ClassroomDao classroomDao = new ClassroomDao();


//     Department itDepartment = new Department("IT");
//        Department testDepartment = new Department("TEST");
//        departmentDao.add(itDepartment);
//        departmentDao.add(testDepartment);
//
//        departmentDao.findAll().forEach(department -> System.out.println(department.toString()));


//        Employee cezary = new Employee("Cezary", "Nowak",departmentDao.findById(1));
//        Employee arkadiusz = new Employee("Arkadiusz", "Kowalski", departmentDao.findById(2));


       // Employee cezary = new Employee("Cezary", "Nowak",departmentDao.findById(1),new Address("Nowa", 15,"Test", "21-132"));
//        Employee arkadiusz = new Employee(
//                "Arkadiusz", "Kowalski", "Nowa", 15,
//                "Test", "21-132", departmentDao.findById(2));
//
//        employeeDao.add(cezary);
//        employeeDao.add(arkadiusz);

      //  employeeDao.findAll().forEach(employee -> System.out.println(employee.toString()));

        /*Employee cezaryFromDatabase = employeeDao.findById(1);
        cezaryFromDatabase.setFirstName("Maciej");

        employeeDao.update(cezaryFromDatabase);
        employeeDao.findAll().forEach(employee -> System.out.println(employee.toString()));
*/

        //departmentDao.findByName("IT").forEach(department -> System.out.println(department.toString()));

//        System.out.println("findAllByFirstName");
//        employeeDao.findAllByFirstName("Cezary").forEach(employee -> System.out.println(employee.toString()));
//        System.out.println("findAllByLastName");
//        employeeDao.findAllByLastName("Kowalski").forEach(employee -> System.out.println(employee.toString()));
//        System.out.println("findAllByFirstAndLastName");
//        employeeDao.findAllByFirstAndLastName("Arkadiusz", "Kowalski") .forEach(employee -> System.out.println(employee.toString()));


//        Classroom classroom15A = new Classroom("15A", departmentDao.findById(1));
//        Classroom classroom1C = new Classroom("1C", departmentDao.findById(2));
//        Classroom classroom104 = new Classroom("104", departmentDao.findById(1));
//
//        classroomDao.add(classroom15A);
//        classroomDao.add(classroom1C);
//        classroomDao.add(classroom104);
       // classroomDao.findAll().forEach(classroom -> System.out.println(classroom.toString()));

//        System.out.println("findByClassroomNumber - 1C");
//        classroomDao.findByClassroomNumber("1C").forEach(employee -> System.out.println(employee.toString()));



        employeeDao.delete(employeeDao.findById(9));
        employeeDao.findAll().forEach(employee -> System.out.println(employee.toString()));



    }
}

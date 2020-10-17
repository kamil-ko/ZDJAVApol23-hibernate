package pl.sda.dao;

import org.hibernate.Session;
import pl.sda.database.SessionProvider;
import pl.sda.model.Employee;

import java.util.List;

public class EmployeeDao extends AbstractDao<Employee> {

    public EmployeeDao() {
        super(Employee.class);
    }
    public List<Employee> findAllByFirstName(String firstName) {
        Session session = SessionProvider.getSession();
        List<Employee> records =
                session.createQuery("from Employee where firstName = :firstName", Employee.class)
                        .setParameter("firstName", firstName)
                        .list();
        session.close();
        return records;
    }
    public List<Employee> findAllByLastName(String lastName) {
        Session session = SessionProvider.getSession();
        List<Employee> records =
                session.createQuery("from Employee where lastName = :lastName", Employee.class)
                        .setParameter("lastName", lastName)
                        .list();
        session.close();
        return records;
    }

    public List<Employee> findAllByFirstAndLastName(String firstName,String lastName) {
        Session session = SessionProvider.getSession();
        List<Employee> records =
                session.createQuery("from Employee where firstName = :firstName and lastName = :lastName  ", Employee.class)
                        .setParameter("firstName",firstName)
                        .setParameter("lastName",lastName)
                        .list();
        session.close();
        return records;
    }


    public List<Employee> findAllByDepartmentID(int departmentId){
        Session session = SessionProvider.getSession();
        List<Employee> records =
                session.createQuery("from Employee where department.id = :departmentId",Employee.class )
                .setParameter("departmentId",departmentId)
                        .list();
        session.close();
        return records;
    }



}

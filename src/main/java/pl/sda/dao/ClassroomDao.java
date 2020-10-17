package pl.sda.dao;

import org.hibernate.Session;
import pl.sda.database.SessionProvider;
import pl.sda.model.Classroom;

import java.util.List;

public class ClassroomDao extends AbstractDao<Classroom> {


    public ClassroomDao() {
        super(Classroom.class);
    }

    public List<Classroom> findByClassroomNumber(String classroomNumber) {
        Session session = SessionProvider.getSession();
        List<Classroom> records =
                session.createQuery("from Classroom where classroomNumber = :classroomNumber", Classroom.class)
                        .setParameter("classroomNumber", classroomNumber)
                        .list();
        session.close();
        return records;
    }
}

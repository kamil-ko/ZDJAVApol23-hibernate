package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;


@Entity
@Table(name = "classroom")

public class Classroom {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "classroomSeq")
    @GenericGenerator(name = "classroomSeq", strategy = "increment")
    private int id;

    @Column(name = "classroom_number")
    private String classroomNumber;


    @ManyToOne(targetEntity = Department.class)
    private Department department;

    public Classroom() {
    }

    public Classroom(String classroomNumber, Department department) {
        this.classroomNumber = classroomNumber;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Classroom classroom = (Classroom) o;
        return id == classroom.id &&
                Objects.equals(classroomNumber, classroom.classroomNumber) &&
                Objects.equals(department, classroom.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, classroomNumber, department);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", classroomNumber='" + classroomNumber + '\'' +
                ", department=" + department +
                '}';
    }
}

// Sneha's code being tested on Tyler's environment


import java.util.*; // tyler change
import class StudentDataMapper; // tyler change

import java.util.List;
import java.util.Optional;

public final class mapper implements StudentDataMapper {

    public Optional < Student > find(int studentId) {


        for (final Student student: this.getStudents()) {


            if (student.getStudentId() == studentId) {

                return Optional.of(student);
            }
        }


        return Optional.empty();
    }


    public void update(Student studentToBeUpdated) throws DataMapperException {


        if (this.getStudents().contains(studentToBeUpdated)) {


            final int index = this.getStudents().indexOf(studentToBeUpdated);


            this.getStudents().set(index, studentToBeUpdated);

        } else {


            throw new DataMapperException("Student [" + studentToBeUpdated.getName() + "] is not found");
        }
    }


    public void insert(Student studentToBeInserted) throws DataMapperException {


        if (!this.getStudents().contains(studentToBeInserted)) {


            this.getStudents().add(studentToBeInserted);

        } else {


            throw new DataMapperException("Student already [" + studentToBeInserted.getName() + "] exists");
        }
    }


    public void delete(Student studentToBeDeleted) throws DataMapperException {


        if (this.getStudents().contains(studentToBeDeleted)) {

            this.getStudents().remove(studentToBeDeleted);

        } else {


            throw new DataMapperException("Student [" + studentToBeDeleted.getName() + "] is not found");
        }
    }

    public List < Student > getStudents() {
        return this.getStudents();
    }
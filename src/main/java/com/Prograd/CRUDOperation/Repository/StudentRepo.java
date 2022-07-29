package com.Prograd.CRUDOperation.Repository;

import com.Prograd.CRUDOperation.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}

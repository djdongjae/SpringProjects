package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import net.skhu.entity.Student;
import net.skhu.model.Pagination;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public default List<Student> findAll(Pagination pagination) {
		
	}
}
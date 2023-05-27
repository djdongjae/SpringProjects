package net.skhu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import net.skhu.entity.Engineer;

public interface EngineerRepository extends JpaRepository<Engineer, Integer>{

	List<Engineer> findByRoleId(int id);
	
	List<Engineer> findByNameStartsWith(String name);
	
	@Query("""
			select e
			from Engineer e
			join e.assignments g
			where g.project.id = ?1
			""")
	List<Engineer> findByProjectId(int id);
	
	@Query("""
	         SELECT e
	         FROM Engineer e
	         WHERE EXISTS (SELECT g.project
	                       FROM e.assignments g
	                       WHERE g.project.manager.id = ?1)""")
	List<Engineer> findByManagerId(int id);
	
}

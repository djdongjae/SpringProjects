package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Department;

public interface DepartmentMapper {
	
	@Select("""
			select *
			from department
			""")
	List<Department> findAll();

}

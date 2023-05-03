package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	
	@ResultMap("findAll")
	@Select("""
			select s.*, d.name departmentName, d.shortName, d.phone departmentPhone
			from student s join department d
				on s.departmentId = d.id
			""")
	List<Student> findAll();

}
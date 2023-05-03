package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	
	@Select("""
			select s.*, d.name departmentName
			from student s join department d on s.departmentId = d.id
			order by
				(case when #{order} = 0 then s.studentNo end) asc,
				(case when #{order} = 1 then s.studentNo end) desc,
				(case when #{order} = 2 then s.name end) asc,
				(case when #{order} = 3 then s.name end) desc,
				(case when #{order} = 4 then d.name end) asc
			""")
	List<Student> findAll(int order);

}

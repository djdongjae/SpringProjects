package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Student;
import net.skhu.model.Pagination;

@Mapper
public interface StudentMapper {
	
	@Select("""
			select s.*, d.name departmentName
			from student s left join department d on s.departmentId = d.id
			order by s.id
			limit #{firstRecordIndex}, #{sz}
			""")
	List<Student> findAll(Pagination pagination);
	
	@Select("""
			select count(id)
			from student
			""")
	int getCount();
	
	@Select("""
			select *
			from student
			where id = #{id}
			""")
	Student findOne(int id);
	
	@Insert("""
			insert student (studentNo, name, departmentId, sex, phone, email)
			values (#{studentNo}, #{name}, #{departmentId}, #{sex}, #{phone}, #{email}
			""")
	void insert(Student student);
	
	@Update("""
			update student set
			studentNo = #{studentNo},
			name = #{name},
			departmentId = #{departmentId},
			sex = #{sex},
			phone = #{phone},
			email = #{email}
			where id = #{id}
			""")
	void update(Student student);
	
	@Delete("""
			delete from student
			where id = #{id}
			""")
	void deleteById(int id);

}

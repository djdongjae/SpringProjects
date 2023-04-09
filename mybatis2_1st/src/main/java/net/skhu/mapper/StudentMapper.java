package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {
	
	@Select("""
			select *
			from student
			where id = #{id}
			""")
	Student findOne(int id);
	
	@Select("""
			select s.*, d.name departmentName
			from student s left join department d on s.departmentId = d.id
			""")
	List<Student> findAll();
	
	@Insert("""
			insert student(studentNo, name, departmentId, phone, sex, email)
			values (#{studentNo}, #{name}, #{departmentId}, #{phone}, #{sex}, #{email})
			""")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Student student);
	
	@Update("""
			update student
			set studentNo = #{studentNo}, name = #{name}, departmentId = #{departmentId}, phone = #{phone}, sex = #{sex}, email = #{email}
			where id = #{id}
			""")
	void update(Student student);
	
	@Delete("""
			delete from student
			where id = #{id}
			""")
	void delete(int id);


}

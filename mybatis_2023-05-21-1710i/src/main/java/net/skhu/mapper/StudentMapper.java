package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Student;

@Mapper
public interface StudentMapper {

    @Select("SELECT s.*, d.name departmentName " +
            "FROM student s JOIN department d ON s.departmentId = d.id")
    List<Student> findAll();
    
    @Select("""
    		select s.*, d.name departmentName
    		from student s left join department d on s.departmentId = d.id
    		where s.name like #{name}
    		""")
    List<Student> findByName(String name);
    
    @Select("""
    		select s.*, d.name departmentName
    		from student s left join department d on s.departmentId = d.id
    		where s.id = #{id}
    		""")
    Student findById(int id);
}


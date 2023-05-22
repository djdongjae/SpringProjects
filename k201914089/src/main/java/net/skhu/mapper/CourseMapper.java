package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Course;

@Mapper
public interface CourseMapper {

    @Select("SELECT c.*, p.name professorName " +
            "FROM course c JOIN professor p ON c.professorId = p.id")
    List<Course> findAll();
    
    @Select("""
    		select c.*, p.name professorName
    		from course c left join professor p on c.professorId = p.id
    		where c.title like #{title}
    		""")
    List<Course> findByTitle(String title);
    
    @Select("""
    		select c.*, p.name professorName
    		from course c left join professor p on c.professorId = p.id
    		where c.id = #{id}
    		""")
    Course findById(int id);

}


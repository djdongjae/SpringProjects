package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Department;

@Mapper
public interface DepartmentMapper {
	
	@Select("select * from department")
	List<Department> findAll();
	
	@Select("select * from department where id = #{id}")
	Department findOne(int id);
	
	@Insert("insert department (name, shortName, phone) values (#{name}, #{shortName}, #{phone})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Department department);
	
	@Update("update department set name = #{name}, shortName = #{shortName}, phone = #{phone} where id = #{id}")
	void update(Department department);
	
	@Delete("delete from department where id = #{id}")
	void delete(int id);
}

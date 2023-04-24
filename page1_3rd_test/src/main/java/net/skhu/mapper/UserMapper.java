package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.User;
import net.skhu.model.Pagination;

@Mapper
public interface UserMapper {
	
	@Select("""
			select s.*, d.name departmentName
			from user s left join department d on s.departmentId = d.id
			order by s.id
			limit #{firstRecordIndex}, #{sz}
			""")
	List<User> findAll(Pagination pagination);
	
	@Select("""
			select count(id)
			from user
			""")
	int getCount();
	
	@Select("""
			select *
			from user
			where id = #{id}
			""")
	User findOne(int id);
	
	@Insert("""
			insert user (loginName, password, name, email, enabled, userType, departmentId)
			values (#{loginName}, #{password}, #{name}, #{email}, #{enabled}, #{userType}, #{departmentId})
			""")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(User user);
	
	@Update("""
			update user set
			loginName = #{loginName},
			password = #{password}, 
			name = #{name},
			email = #{email},
			enabled = #{enabled},
			userType = #{userType}
			departmentId = #{departmentId}
			where id = #{id}
			""")
	void update(User user);
	
	@Delete("delete from user where id = #{id}")
	void deleteById(int id);
}

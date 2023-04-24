package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.User;

@Mapper
public interface UserMapper {
	
	@Select("""
			select *
			from user
			""")
	List<User> findAll();
	
	@Select("""
			select *
			from user
			where loginName = #{loginName}
			""")
	User findByLoginName(String loginName);
	
	@Insert("""
			insert user (loginName, password, name, email, enabled, userType, departmentId)
			values ({#loginName}, #{password}, #{name}, #{email}, #{enabled}, #{userType}, #{departmentId})
			""")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(User user);
	

}

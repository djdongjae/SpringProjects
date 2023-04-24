package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Person;
import net.skhu.model.Pagination;

@Mapper
public interface PersonMapper {
	
	@Select("""
			select p.*, c.title categoryTitle
			from person p left join category c on p.categoryCode = c.code
			order by p.pid
			limit #{firstRecordIndex}, #{sz}
			""")
	List<Person> findAll(Pagination pagination);
	
	@Select("""
			select count(pid)
			from person
			""")
	int getCount();
	
	@Select("""
			select *
			from person
			where pid = #{pid}
			""")
	Person findOne(int pid);
	
	@Insert("""
			insert person (name, categoryCode, phone, gender, email, title)
			values (#{name}, #{categoryCode}, #{phone}, #{gender}, #{email}, #{title})
			""")
	void insert(Person person);
	
	@Update("""
			update person set
			name = #{name},
			categoryCode = #{categoryCode}, 
			phone = #{phone},
			gender = #{gender},
			email = #{email},
			title = #{title}
			where pid = #{pid}
			""")
	void update(Person person);
	
	@Delete("delete from person where pid = #{pid}")
	void deleteById(int pid);

}

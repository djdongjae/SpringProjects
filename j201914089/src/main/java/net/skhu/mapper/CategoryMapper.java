package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Category;

@Mapper
public interface CategoryMapper {
	
	@Select("""
			select *
			from category
			""")
	List<Category> findAll();

}

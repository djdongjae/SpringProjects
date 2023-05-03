package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.Sugang;

@Mapper
public interface SugangMapper {
	
	@Select("""
			select g.*, s.studentNo, s.name, l.title, l.year, l.semester
			from sugang g
				join student s on g.studentId = s.id
				join lecture l on g.lectureId = l.id
			order by s.studentNo
			""")
	List<Sugang> findAll();

}

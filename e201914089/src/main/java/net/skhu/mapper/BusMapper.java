package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.Bus;

@Mapper
public interface BusMapper {
	
	@Select("select * from bus")
	List<Bus> findAll();
	
	@Select("select * from bus where id = #{id}")
	Bus findOne(int id);
	
	@Insert("insert bus (busNo, firstStop, lastStop, categoryId, firstBus, lastBus) values (#{busNo}, #{firstStop}, #{lastStop}, #{categoryId}, #{firstBus}, #{lastBus})")
	@Options(useGeneratedKeys=true, keyProperty="id")
	void insert(Bus bus);
	
	@Update("update bus set busNo = #{busNo}, firstStop = #{firstStop}, lastStop = #{lastStop}, categoryId = #{categoryId}, firstBus = #{firstBus}, lastBus = #{lastBus} where id = #{id}")
	void update(Bus bus);
	
	@Delete("delete from bus where id = #{id}")
	void delete(int id);
}
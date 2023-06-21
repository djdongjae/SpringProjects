package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import net.skhu.dto.City;

@Mapper
public interface CityMapper {

    @Select("SELECT * FROM city WHERE id = #{id}")
    City findById(int id);

    @Select("""
            SELECT c.*, d.districtName districtName
            FROM city c LEFT JOIN district d ON c.districtId = d.id """)
    List<City> findAll();

    @Insert("""
            INSERT city (districtId, name, population, area)
            VALUES (#{districtId}, #{name}, #{population}, #{area})""")
    @Options(useGeneratedKeys=true, keyProperty="id")
    void insert(City city);
    
    @Update("""
            UPDATE city SET districtId=#{districtId}, name=#{name}, population=#{population},
            area=#{area} WHERE id=#{id} """)
    void update(City city);

    @Delete("DELETE FROM city WHERE id=#{id}")
    void delete(int id);

}



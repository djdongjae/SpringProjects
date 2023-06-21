package net.skhu.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import net.skhu.dto.District;

@Mapper
public interface DistrictMapper {

    @Select("SELECT * FROM district")
    List<District> findAll();
}



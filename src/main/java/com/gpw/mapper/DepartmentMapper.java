package com.gpw.mapper;

import com.gpw.bean.Department;
import org.apache.ibatis.annotations.*;

/**
 * @Author: Gpw
 * @Date: 2019/5/22
 * @Description: com.gpw.mapper
 * @Version: 1.0
 */
@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    public Department findDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public Department deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}

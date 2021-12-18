package xh.zero.tadpole_api.domain.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import xh.zero.tadpole_api.domain.User;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user limit #{pageSize} offset #{offset}")
    List<User> findByOffset(int pageSize, int offset);

    @Select("select count(*) from user")
    int count();
}

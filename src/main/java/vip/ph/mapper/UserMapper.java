package vip.ph.mapper;

import org.apache.ibatis.annotations.Mapper;
import vip.ph.model.User;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();
}

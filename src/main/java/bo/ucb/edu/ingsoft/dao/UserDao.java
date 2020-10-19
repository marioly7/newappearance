package bo.ucb.edu.ingsoft.dao;

import bo.ucb.edu.ingsoft.dto.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public User findByUserId(Integer userId);
    public User deleteUserById(Integer userId);
}

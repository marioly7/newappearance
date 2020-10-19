package bo.ucb.edu.ingsoft.bl;


import bo.ucb.edu.ingsoft.dao.UserDao;
import bo.ucb.edu.ingsoft.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgendaBl {
    private UserDao userDao;

    @Autowired
    public AgendaBl(UserDao userDao) {
        this.userDao = userDao;
    }

    public User findUserById(Integer userId) {
        return  userDao.findByUserId(userId);
    }

    public User deleteUserById(Integer userId) {
        return  userDao.deleteUserById(userId);
    }
}

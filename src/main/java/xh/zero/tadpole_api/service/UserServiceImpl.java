package xh.zero.tadpole_api.service;

import org.springframework.stereotype.Service;
import xh.zero.tadpole_api.dao.UserDao;
import xh.zero.tadpole_api.domain.PagingResponse;
import xh.zero.tadpole_api.domain.User;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAllUsers() {
        return userDao.findAll();
    }

    @Override
    public PagingResponse<User> findUsersByPage(int page, int pageSize) {
        return userDao.findUsersByPage(page, pageSize);
    }
}

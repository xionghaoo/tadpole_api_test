package xh.zero.tadpole_api.dao.impl;

import org.springframework.stereotype.Repository;
import xh.zero.tadpole_api.dao.UserDao;
import xh.zero.tadpole_api.domain.PagingResponse;
import xh.zero.tadpole_api.domain.mappers.UserMapper;
import xh.zero.tadpole_api.domain.User;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public PagingResponse<User> findUsersByPage(int page, int pageSize) {
        int offset = (page - 1) * pageSize;
        PagingResponse<User> response = new PagingResponse<User>();
        List<User> users = userMapper.findByOffset(pageSize, offset);
        int total = userMapper.count();
        response.setData(users);
        response.setCurrentPage(page);
        response.setTotal(total);
        int totalPageNum = 0;
        if (total % pageSize == 0) {
            totalPageNum = total / pageSize;
        } else {
            totalPageNum = total / pageSize + 1;
        }
        response.setTotalPage(totalPageNum);
        return response;
    }
}

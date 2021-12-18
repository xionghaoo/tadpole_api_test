package xh.zero.tadpole_api.dao;

import xh.zero.tadpole_api.domain.PagingResponse;
import xh.zero.tadpole_api.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    PagingResponse<User> findUsersByPage(int page, int pageSize);
}

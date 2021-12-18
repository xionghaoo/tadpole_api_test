package xh.zero.tadpole_api.service;

import org.springframework.stereotype.Service;
import xh.zero.tadpole_api.domain.PagingResponse;
import xh.zero.tadpole_api.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    PagingResponse<User> findUsersByPage(int page, int pageSize);
}

package xh.zero.tadpole_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xh.zero.tadpole_api.domain.PagingResponse;
import xh.zero.tadpole_api.domain.User;
import xh.zero.tadpole_api.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "user", method = RequestMethod.GET)
    public List<User> user() {
        return userService.findAllUsers();
    }

    @RequestMapping(value = "userForPage", method = RequestMethod.GET)
    public PagingResponse<User> userForPage(
        @RequestParam("page") int page,
        @RequestParam("pageSize") int pageSize
    ) {
        return userService.findUsersByPage(page, pageSize);
    }
}

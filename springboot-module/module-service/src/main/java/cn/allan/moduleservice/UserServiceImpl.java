package cn.allan.moduleservice;

import cn.allan.moduledao.User;
import cn.allan.moduledao.UserRepository;
import cn.allan.moduleservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("baseUserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User addOne(User user) {
        return userRepository.save(user);
    }
}

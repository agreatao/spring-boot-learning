package io.github.agreatao.modules.business.serivce.impl;

import io.github.agreatao.modules.business.repository.UserRepository;
import io.github.agreatao.modules.business.repository.entity.User;
import io.github.agreatao.modules.business.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}

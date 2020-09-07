package br.com.green.core.service;

import br.com.green.core.domain.model.GreenUser;
import br.com.green.core.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<GreenUser> getUsers() {
        return userRepository.findAll();
    }

    public GreenUser saveUser(GreenUser user) {
        return userRepository.save(user);
    }
}

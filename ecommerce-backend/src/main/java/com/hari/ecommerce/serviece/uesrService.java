package com.hari.ecommerce.serviece;

import java.util.List;

import com.hari.ecommerce.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.ecommerce.repo.UserRepo;

@Service
public class uesrService {

    @Autowired
    private UserRepo useRepo;

    public User registeruser(User user) {
        try {
            User newUser = useRepo.save(user);
            System.out.println("User added");
            return newUser;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public User loginUser(String email, String password) {
        User found = useRepo.findByEmail(email);
        if (found != null && found.getPassword() != null && found.getPassword().equals(password)) {
            return found;
        }
        return null;
    }

    public List<User> getAllUser() {
        return useRepo.findAll();
    }
}

package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.entity.User;
import ee.ivkhkdev.HRDepartment.helpers.Helper;
import ee.ivkhkdev.HRDepartment.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements AppService<User> {
    @Autowired
    private Helper<User> userAppHelper;

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean add() {
        try {
            Optional<User> optionalUser = userAppHelper.create();
            if (optionalUser.isPresent()) {
                userRepository.save(optionalUser.get());
                return true;
            }
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }

    @Override
    public List<User> list() {
        return List.of();
    }

    @Override
    public boolean print() {
        return false;
    }

    @Override
    public boolean search() {
        return false;
    }

    @Override
    public boolean edit() {
        return false;
    }
}

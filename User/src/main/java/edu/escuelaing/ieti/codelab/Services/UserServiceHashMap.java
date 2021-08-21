package edu.escuelaing.ieti.codelab.Services;

import edu.escuelaing.ieti.codelab.Data.User;
import edu.escuelaing.ieti.codelab.Dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService{

    private final HashMap<String, User> usersMap = new HashMap<>();

    @Override
    public User create(UserDto userDto) {
        User user = new User(userDto);
        usersMap.put(user.getId(),user);
        return user;
    }

    @Override
    public User findById(String id) {

        if (usersMap.containsKey(id)){
            return usersMap.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(usersMap.values());
    }

    @Override
    public boolean deleteById(String id) {
        try {
            usersMap.remove(id);
            return true;
        }catch (Exception e){
            return false;
        }

    }

    @Override
    public User update(UserDto userDto, String userId) {
        User user = new User(userId,userDto);
        usersMap.put(userId,user);
        return user;
    }
}

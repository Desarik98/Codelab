package edu.escuelaing.ieti.codelab.Services;

import edu.escuelaing.ieti.codelab.Data.User;
import edu.escuelaing.ieti.codelab.Dto.UserDto;

import java.util.List;

public interface UserService {

    User create(UserDto user );

    User findById( String id );

    List<User> all();

    boolean deleteById( String id );

    User update( UserDto user, String userId );


}

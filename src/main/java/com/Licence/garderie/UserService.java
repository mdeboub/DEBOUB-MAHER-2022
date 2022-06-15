package com.Licence.garderie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
@Autowired private UserRepository repo;
public List<User> listAll(){
return (List<User>) repo.findAll();
}
public void save(User user) {
repo.save(user);
}

public boolean login(String mail,String password) {

boolean exist=false;
Iterable<User> users = repo.findAll();
for (User user : users)
    if ((user.getEmail().equals(mail)) &&  (user.getPassword().equals(password))) exist=true;
    return exist;
}

public User finduser(String email){
Iterable<User> users = repo.findAll();
User user=null;
for (User user1 : users)
    if (user1.getEmail().equals(email)) { return user1 ;};
return user;
}
}

package ca.filmare.controller;

import ca.filmare.model.Users;
import ca.filmare.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    @Autowired
    UsersRepository usersRepo;

    @GetMapping("/getName")
    public String findUsersByName(String name){
        Users users = usersRepo.findUsersByName(name);
        return users.getName();
    }

    @GetMapping("/getId")
    public String findUsersByIdUsers(Integer idVUsers){
        Users users = usersRepo.findUsersByIdUsers(idVUsers);
        return users.getName();
    }
    @GetMapping("/getUsername")
    public String findUsersByUsername(String username){
        Users users = usersRepo.findUsersByUsername(username);
        return users.getName();
    }
    @GetMapping("/getgender")

    public String findUsersByGender(String gender){
        Users users = usersRepo.findUsersByGender(gender);
        return users.getGender();
    }

    @GetMapping("/all")
    public List<Users> findAll ( ){
        return usersRepo.findAll();
    }



}

package br.com.one.amazon;

import br.com.one.amazon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    // Endpoint para buscar todos os usuários
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Endpoint para buscar um usuário por ID
    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    // Endpoint para criar um novo usuário
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
}
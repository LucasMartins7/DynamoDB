package br.com.one.amazon.service;

import br.com.one.amazon.User;
import br.com.one.amazon.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Método para buscar todos os usuários
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    // Método para buscar um usuário por ID
    public Optional<User> getUserById(String id) {
        return userRepository.findById(id);
    }
    public User createUser(User user) {
        return userRepository.save(user);
    }
}
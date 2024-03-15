package sr.unasat.webapp.services;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;
import sr.unasat.webapp.entities.User;
import sr.unasat.webapp.repositories.UserRepository;

@Singleton
public class UserService {

    @Inject
    private UserRepository userRepository;

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }
}

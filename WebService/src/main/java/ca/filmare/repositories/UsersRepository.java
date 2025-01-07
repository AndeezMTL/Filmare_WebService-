package ca.filmare.repositories;

import ca.filmare.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path="toto")
public interface UsersRepository extends JpaRepository <Users, Integer> {

    public Users findUsersByGender(String gender);
    public Users findUsersByUsername(String Username);
    public Users findUsersByIdUsers(Integer idUsers);
    public Users findUsersByName(String name);


}

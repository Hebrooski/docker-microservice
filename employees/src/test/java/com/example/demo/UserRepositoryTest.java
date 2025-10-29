// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
// import org.junit.jupiter.api.Test;
// import static org.assertj.core.api.Assertions.assertThat;

// @DataJpaTest
// public class UserRepositoryTest {

//     @Autowired
//     private UserRepository userRepository;

//     @Test
//     void testSaveAndFindUser() {
//         User user = new User("testuser", "password");
//         userRepository.save(user);
//         User foundUser = userRepository.findByUsername("testuser");
//         assertThat(foundUser).isNotNull();
//         assertThat(foundUser.getUsername()).isEqualTo("testuser");
//     }
// }
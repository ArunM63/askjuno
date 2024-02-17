package repositoires;

import com.example.User;

public interface JpaRepository<T, T1> {
    void save(User user);
}

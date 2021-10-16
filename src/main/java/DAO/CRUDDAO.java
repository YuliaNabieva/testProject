package DAO;
import java.util.List;

public interface CRUDDAO<T> {
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    void remove(Long id);
    T findbyId(long id);
}

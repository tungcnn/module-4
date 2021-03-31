package repositories;

import entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserRepoImpl implements IUserRepo{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> get() {
        String queryGet = "SELECT c FROM User AS c";
        TypedQuery<User> query = entityManager.createQuery(queryGet, User.class);
        return query.getResultList();
    }

    @Override
    public boolean delete(int id) {
        String queryDel = "DELETE FROM User u WHERE u.id=:id";
        Query query = entityManager.createQuery(queryDel);
        query.setParameter("id", id);
        return query.executeUpdate() > 1 ? false : true;
    }
}

package miniProjet.dao;

import java.util.List;

public interface IGenericDao<T> {

	Long insert(T t);

	boolean update(T t);

	boolean delete(T t);

	List<T> select(T t);
}

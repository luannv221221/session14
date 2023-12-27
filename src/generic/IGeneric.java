package generic;

public interface IGeneric<T> {
    void save(T t);
    void read();
    void update(T t);
    void delete(T t);
}

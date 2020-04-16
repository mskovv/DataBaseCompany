package testgroup.database.dao;

import testgroup.database.model.Worker;
import java.util.List;

public interface WorkerDAO {
    List<Worker> allworkers();
    void add(Worker worker);
    void delete(Worker worker);
    void edit(Worker worker);
    Worker getById(int id);
}

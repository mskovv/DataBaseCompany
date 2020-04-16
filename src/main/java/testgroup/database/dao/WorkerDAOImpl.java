package testgroup.database.dao;

import testgroup.database.model.Worker;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class WorkerDAOImpl implements WorkerDAO {
    private static final AtomicInteger AUTO_ID = new AtomicInteger(1);
    private static Map<Integer, Worker> workers = new HashMap<>();

    static {
        Worker worker1 = new Worker();
        worker1.setId(AUTO_ID.getAndIncrement());
        worker1.setName("Katya");
        worker1.setSurname("Ivanova");
        worker1.setAge(25);
        worker1.setGender("Female");
        worker1.setDept("UpPers");
        worker1.setWorks(true);
        workers.put(worker1.getId(), worker1);

        Worker worker2 = new Worker();
        worker2.setId(AUTO_ID.getAndIncrement());
        worker2.setName("Nastya");
        worker2.setSurname("Butova");
        worker2.setAge(27);
        worker2.setGender("Female");
        worker2.setDept("UpPers");
        worker2.setWorks(false);
        workers.put(worker2.getId(), worker2);

        Worker worker3 = new Worker();
        worker3.setId(AUTO_ID.getAndIncrement());
        worker3.setName("Artem");
        worker3.setSurname("Petrov");
        worker3.setAge(22);
        worker3.setGender("Male");
        worker3.setDept("WebDevOp");
        worker3.setWorks(true);
        workers.put(worker3.getId(), worker3);

        Worker worker4 = new Worker();
        worker4.setId(AUTO_ID.getAndIncrement());
        worker4.setName("Artem");
        worker4.setSurname("Petrov");
        worker4.setAge(22);
        worker4.setGender("Male");
        worker4.setDept("WebDevOp");
        worker4.setWorks(true);
        workers.put(worker4.getId(), worker4);

        Worker worker5 = new Worker();
        worker5.setId(AUTO_ID.getAndIncrement());
        worker5.setName("Artem");
        worker5.setSurname("Petrov");
        worker5.setAge(22);
        worker5.setGender("Male");
        worker5.setDept("WebDevOp");
        worker5.setWorks(true);
        workers.put(worker5.getId(), worker5);
    }

    @Override
    public List<Worker> allworkers() {
        return new ArrayList<>(workers.values());
    }

    @Override
    public void add(Worker worker) {
        worker.setId(AUTO_ID.getAndIncrement());
        workers.put(worker.getId(), worker);
    }

    @Override
    public void delete(Worker worker) {
        workers.remove(worker.getId());
    }

    @Override
    public void edit(Worker worker) {
        workers.put(worker.getId(), worker);
    }

    @Override
    public Worker getById(int id) {
        return workers.get(id);
    }
}

package testgroup.database.service;

import testgroup.database.dao.WorkerDAOImpl;
import testgroup.database.model.Worker;
import java.util.List;
import testgroup.database.dao.WorkerDAO;


public class WorkerServiceImpl implements WorkerService {

    private WorkerDAO workerDAO = new WorkerDAOImpl();

        @Override
        public List<Worker> allworkers() {
            return workerDAO.allworkers();
        }

        @Override
        public void add(Worker worker) {
            workerDAO.add(worker);
        }

        @Override
        public void delete(Worker worker) {
            workerDAO.delete(worker);
        }

        @Override
        public void edit(Worker worker) {
            workerDAO.edit(worker);
        }

        @Override
        public Worker getById(int id) {
            return workerDAO.getById(id);
        }
}

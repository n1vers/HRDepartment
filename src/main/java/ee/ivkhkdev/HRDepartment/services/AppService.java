package ee.ivkhkdev.HRDepartment.services;

import java.util.List;

public interface AppService<T> {
    boolean add();
    List<T> list();
    boolean print();
    boolean search();
    boolean edit();

}

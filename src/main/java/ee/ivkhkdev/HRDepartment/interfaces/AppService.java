package ee.ivkhkdev.HRDepartment.interfaces;

import java.util.List;

public interface AppService<T> {
    boolean add();
    boolean print();
    boolean search();
    boolean edit();
    List<T> list();
}

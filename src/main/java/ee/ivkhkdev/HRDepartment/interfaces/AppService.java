package ee.ivkhkdev.HRDepartment.interfaces;

import java.util.List;

public interface AppService<T> {
    boolean add();
    boolean print(List<T> entities);
    boolean search();
    boolean edit();

}

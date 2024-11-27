package ee.ivkhkdev.HRDepartment.helpers;

import java.util.List;
import java.util.Optional;

public interface Helper<T> {
    Optional<T> create();
    boolean printList(List <T> entities);
    List<T> update(List<T> entities);
    List<T> search( );
}

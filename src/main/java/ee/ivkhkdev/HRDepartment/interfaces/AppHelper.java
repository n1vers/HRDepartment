package ee.ivkhkdev.HRDepartment.interfaces;

import java.util.List;

public interface AppHelper <T> {
    T create();
    boolean print(List <T> listClass);
    List<T> edit(List<T> listClass);
    List<T> search( );
}

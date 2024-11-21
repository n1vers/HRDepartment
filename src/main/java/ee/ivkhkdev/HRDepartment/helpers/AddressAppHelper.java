package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.model.Address;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AddressAppHelper implements AppHelper<Address> {
    @Override
    public Address create() {
        return null;
    }

    @Override
    public boolean printList(List<Address> listClass) {
        return false;
    }

    @Override
    public List<Address> update(List<Address> entities) {
        return List.of();
    }

    @Override
    public List<Address> search() {
        return List.of();
    }
}

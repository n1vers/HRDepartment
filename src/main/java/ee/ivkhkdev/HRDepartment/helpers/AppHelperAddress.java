package ee.ivkhkdev.HRDepartment.helpers;

import ee.ivkhkdev.HRDepartment.interfaces.AppHelper;
import ee.ivkhkdev.HRDepartment.model.Address;

import java.util.List;

public class AppHelperAddress implements AppHelper<Address> {
    @Override
    public Address create() {
        return null;
    }

    @Override
    public boolean print(List<Address> listClass) {
        return false;
    }

    @Override
    public List<Address> edit(List<Address> listClass) {
        return List.of();
    }

    @Override
    public List<Address> search() {
        return List.of();
    }
}

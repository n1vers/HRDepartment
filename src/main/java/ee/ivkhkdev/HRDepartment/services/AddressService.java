package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.model.Address;

import java.util.List;

public class AddressService implements AppService<Address> {

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean print() {
        return false;
    }

    @Override
    public boolean search() {
        return false;
    }

    @Override
    public boolean edit() {
        return false;
    }

    @Override
    public List<Address> list() {
        return List.of();
    }
}

package ee.ivkhkdev.HRDepartment.services;

import ee.ivkhkdev.HRDepartment.interfaces.AppService;
import ee.ivkhkdev.HRDepartment.model.Address;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddressService implements AppService<Address> {

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean print(List<Address> entities) {
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

}

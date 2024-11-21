package ee.ivkhkdev.HRDepartment.repositories;

import ee.ivkhkdev.HRDepartment.interfaces.AppRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class Storage<T> implements AppRepository<T> {
    private String fileName;


    public Storage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(T entity) {
        List<T> entities = this.load();
        if(entities == null) entities = new ArrayList<>();
        entities.add(entity);
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(entities);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }

    @Override
    public void saveAll(List<T> entities) {
        if(entities == null) entities = new ArrayList<>();
        FileOutputStream fileOutputStream;
        ObjectOutputStream objectOutputStream;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(entities);
            objectOutputStream.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Не найден файл");
        } catch (IOException e) {
            System.out.println("Ошибка ввода");
        }
    }

    @Override
    public List<T> load() {
        FileInputStream fileInputStream;
        ObjectInputStream objectInputStream;
        try {
            fileInputStream = new FileInputStream(fileName);
            objectInputStream = new ObjectInputStream(fileInputStream);
            return (List<T>) objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Нет такого файла");
        } catch (IOException e) {
            System.out.println("Ошибка вывода");
        } catch (ClassNotFoundException e) {
            System.out.println("Не найден класс ");
        }
        return new ArrayList<>();
    }
}

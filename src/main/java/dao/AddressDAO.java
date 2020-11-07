package dao;

import entity.Address;

import java.util.List;

public interface AddressDAO {

    //create
    void add(Address address);

    //read
    List<Address> readAll();

    Address readById(long id);

    //update
    void update(Address address);

    //delete
    void remove(Address address);
}
package dao;

import entity.Address;

import java.sql.SQLException;
import java.util.List;

public interface AddressDAO {

    //create
    void add(Address address) throws SQLException;

    //read
    List<Address> readAll() throws SQLException;

    Address readById(long id) throws SQLException;

    //update
    void update(Address address);

    //delete
    void remove(Address address);
}

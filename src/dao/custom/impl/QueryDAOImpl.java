package dao.custom.impl;

import dao.custom.QueryDAO;
import model.CustomDTO;
import model.CustomerDTO;

import java.util.ArrayList;

public class QueryDAOImpl implements QueryDAO {

    @Override
    public ArrayList<CustomDTO> searchOrder() {
        CustomerDTO customerDTO=new CustomerDTO();
        return null;
    }
}

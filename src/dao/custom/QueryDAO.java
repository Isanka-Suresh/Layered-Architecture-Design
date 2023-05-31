package dao.custom;

import dao.SuperDAO;
import model.CustomDTO;

import java.util.ArrayList;

public interface QueryDAO extends SuperDAO {
    ArrayList<CustomDTO> searchOrder();
}

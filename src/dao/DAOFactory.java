package dao;

import dao.custom.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return (daoFactory == null) ? daoFactory = new DAOFactory() : daoFactory;
    }
    public enum DAOTypes{
        CUSTOMER,ITEM,ORDER,ORDER_DETAILS,QUERY_DAO
    }

    public SuperDAO getDAO(DAOTypes types){
        switch (types){
            case CUSTOMER : return new CustomerDAOImpl();
            case ITEM: return new ItemDAOImpl();
            case ORDER:return new OrderDAOImpl();
            case QUERY_DAO:return new QueryDAOImpl();
            case ORDER_DETAILS:return new OrderDetailsDAOImpl();
            default:return null;
        }
    }
}

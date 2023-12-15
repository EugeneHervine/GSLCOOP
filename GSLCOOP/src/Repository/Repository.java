package Repository;

import java.util.ArrayList;

import Connection.Connection;

public interface Repository {
    ArrayList<Object> find(String column, String[] condition, Boolean joinTable, String joinTableName, Connection conn);
    Object findOne(String column, String[] condition, Boolean joinTable, String joinTableName, Connection conn);
}


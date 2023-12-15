package Repository;

import java.util.ArrayList;

import Connection.Connection;

public class TeamRepository implements Repository {

    @Override
    public ArrayList<Object> find(String column, String[] condition, Boolean joinTable, String joinTableName, Connection conn) {
        // Validasi parameter
        if ((column == null && condition != null) || (column != null && condition == null)) {
            System.err.println("Error: Kolom filter dan kondisi filter harus diisi bersamaan.");
            return null;
        }

        if ((joinTableName == null && joinTable != null) || (joinTableName != null && joinTable == null)) {
            System.err.println("Error: Nama table join dan boolean kondisi harus diisi bersamaan.");
            return null;
        }

        // Proses query ke file CSV
        // ...

        // Contoh return
        return new ArrayList<>();
    }

    @Override
    public Object findOne(String column, String[] condition, Boolean joinTable, String joinTableName, Connection conn) {
        // Validasi parameter
        if ((column == null && condition != null) || (column != null && condition == null)) {
            System.err.println("Error: Kolom filter dan kondisi filter harus diisi bersamaan.");
            return null;
        }

        if ((joinTableName == null && joinTable != null) || (joinTableName != null && joinTable == null)) {
            System.err.println("Error: Nama table join dan boolean kondisi harus diisi bersamaan.");
            return null;
        }

        // Proses query ke file CSV
        // ...

        // Contoh return
        return new Object();
    }
}


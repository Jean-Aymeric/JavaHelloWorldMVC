package com.jad.model.dao;

import com.jad.model.DBConnection;
import com.jad.shared.entity.Entity;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * The class Dao entity.
 *
 * @param <E> the type parameter
 * @author jeanaymeric @gmail.com
 * @version 1.0
 */
abstract class DAOEntity <E extends Entity>{
    /**
     * The Connection.
     */
    protected final Connection connection;
    /**
     * The Sql procedure find by id.
     */
    private final String sqlProcedureFindById;
    /**
     * The Sql procedure get all.
     */
    private final String sqlProcedureGetAll;

    /**
     * Instantiates a new Dao entity.
     *
     * @param sqlProcedureFindById the sql procedure find by id
     * @param sqlProcedureGetAll   the sql procedure get all
     */
    public DAOEntity(final String sqlProcedureFindById, final String sqlProcedureGetAll) {
        this.connection = DBConnection.getInstance().getConnection();
        this.sqlProcedureFindById = sqlProcedureFindById;
        this.sqlProcedureGetAll = sqlProcedureGetAll;
    }

    /**
     * Gets connection.
     *
     * @return the connection
     */
    private Connection getConnection() {
        return this.connection;
    }

    /**
     * Gets all.
     *
     * @return the all
     */
    public final List<E> getAll() {
        try {
            final String sql = "{CALL }" + this.getSqlProcedureGetAll();
            final CallableStatement call = this.getConnection().prepareCall(sql);
            final ResultSet resultSet = call.executeQuery();
            List<E> results = new ArrayList<>();
            while (resultSet.next()) {
                results.add(this.resultSetToEntity(resultSet));
            }
            return results;
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    /**
     * Find by id e.
     *
     * @param id the id
     * @return the e
     */
    public final E findById(final int id) {
        try {
            final String sql = "{CALL }" + this.getSqlProcedureFindById();
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setInt(1, id);
            final ResultSet resultSet = call.executeQuery();
            if (resultSet.next()) {
                return this.resultSetToEntity(resultSet);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    /**
     * Find by string e.
     *
     * @param field                    the field
     * @param sqlProcedureFindByString the sql procedure find by string
     * @return the e
     */
    protected final E findByString(final String field, String sqlProcedureFindByString) {
        try {
            final String sql = "{CALL }" + sqlProcedureFindByString;
            final CallableStatement call = this.getConnection().prepareCall(sql);
            call.setString(1, field);
            final ResultSet resultSet = call.executeQuery();
            if (resultSet.next()) {
                return this.resultSetToEntity(resultSet);
            }
        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return null;
    }

    /**
     * Result set to entity e.
     *
     * @param resultSet the result set
     * @return the e
     */
    protected abstract E resultSetToEntity(ResultSet resultSet);

    /**
     * Gets sql procedure find by id.
     *
     * @return the sql procedure find by id
     */
    public final String getSqlProcedureFindById() {
        return sqlProcedureFindById;
    }

    /**
     * Gets sql procedure get all.
     *
     * @return the sql procedure get all
     */
    public final String getSqlProcedureGetAll() {
        return sqlProcedureGetAll;
    }
}

package by.karpov.shop.exception;

import java.sql.SQLException;

public class ShopConnectionException extends RuntimeException {
    public ShopConnectionException(String msg, SQLException e) {
        super(msg,e);
    }
}

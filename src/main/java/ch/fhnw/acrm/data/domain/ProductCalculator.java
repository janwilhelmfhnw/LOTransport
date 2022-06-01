package ch.fhnw.acrm.data.domain;

import javax.persistence.Entity;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@Entity
public class ProductCalculator extends Product {


String query = "Select city FROM agent";

}

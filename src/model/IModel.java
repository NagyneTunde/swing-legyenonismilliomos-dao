/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author nagyg
 */
public interface IModel {
     void close() throws SQLException;
     
     Vector<Kerdes> getAllKerdes()throws SQLException;
     
}

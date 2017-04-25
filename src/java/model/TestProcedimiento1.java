/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author campitos
 */
public class TestProcedimiento1 {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement test=con.prepareCall("{call guardar_alumno(?,?,?)}");
        test.registerOutParameter(1,java.sql.Types.INTEGER);
        test.setString(2,"Victor");
        test.setString(3,"Blake");
      
        test.execute();
        int pk=test.getInt(1);
        System.out.println("El id ingresado es:"+pk);
    }
    
}

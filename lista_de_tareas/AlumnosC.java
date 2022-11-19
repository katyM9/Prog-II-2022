/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author katy alvarado
 */
public class AlumnosC {
    
    int codigo;
    String nombreAlumnos;
    String ApellidosAlumnos;
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreAlumnos() {
        return nombreAlumnos;
    }

    public void setNombreAlumnos(String nombreAlumnos) {
        this.nombreAlumnos = nombreAlumnos;
    }

    public String getApellidosAlumnos() {
        return ApellidosAlumnos;
    }

    public void setApellidosAlumnos(String ApellidosAlumnos) {
        this.ApellidosAlumnos = ApellidosAlumnos;
    }
    
    
    public void InsertarAlumno(JTextField paraNombres, JTextField paraApellidos){
    
        setNombreAlumnos(paraNombres.getText());
        setApellidosAlumnos(paraApellidos.getText());
        
        CConexion objetoConexion = new CConexion();
        
        String consulta= ("insert into Alumnos (nombres, apellidos) values (?,?);");
        
        
        
        
        try{
        
            CallableStatement cs= objetoConexion.estableceConexion().prepareCall(consulta);
            cs.setString(1, getNombreAlumnos());
            
            cs.setString(2, getApellidosAlumnos());
            
            cs.execute();
            
            JOptionPane.showMessageDialog(null, "insertó Correctamente");
            
        
        }catch (Exception e){
        
            JOptionPane.showMessageDialog(null, "NO se insertó Correctamente, error:"+e.toString());
            
        }
        
        
    }
    
    
    
    public void MostrarAlumnos(JTable paraTablaTotalAlumnos){
    
        CConexion objetoConexion = new CConexion();
        DefaultTableModel modelo = new DefaultTableModel();
        
        TableRowSorter<TableModel> OrdenarTabla = new TableRowSorter<TableModel>(modelo);
        paraTablaTotalAlumnos.setRowSorter(OrdenarTabla);
        
        String sql="";
        
        modelo.addColumn("id");
        modelo.addColumn("Nombres");
        modelo.addColumn("Apellidos");
        
        paraTablaTotalAlumnos.setModel(modelo);
        
        sql= "select * from Alumnos;";
        
        String[] datos = new String[3];
        Statement st;
        
        try{

            st= objetoConexion.estableceConexion().createStatement();
            ResultSet rs= st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                
                modelo.addRow(datos);
                
            }
            
            paraTablaTotalAlumnos.setModel(modelo);
            
            
            
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, "No se pueden mostrar los Registros error: "+e.toString());
        }
        
        
    }
    
        public void SeleccionarAlumno (JTable paraTablaAlumnos, JTextField paraid, JTextField paraNombres, JTextField paraApellidos){
        
        try{

            int fila = paraTablaAlumnos.getSelectedRow();
            
            if(fila>=0){
                
                paraid.setText((paraTablaAlumnos.getValueAt(fila, 0).toString()));
                paraNombres.setText(paraTablaAlumnos.getValueAt(fila, 1).toString());
                paraApellidos.setText((paraTablaAlumnos.getValueAt(fila, 2).toString()));
            }
            
            else{
                
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
            
        }catch (Exception e){
        JOptionPane.showMessageDialog(null, "Error de seleccion, error: "+e.toString());
    }
        }
    
    
        public void ModificarAlumnos(JTextField paraCodigo, JTextField paraNombres, JTextField paraApellidos){
            
            setCodigo(Integer.parseInt(paraCodigo.getText()));
            setNombreAlumnos(paraNombres.getText());
            setApellidosAlumnos(paraApellidos.getText());
            
            CConexion objetoConexion = new CConexion();
            String consulta="update Alumnos set alumnos.nombres= ?, alumnos.apellidos=? WHERE alumnos.id=?;";
            
    try{

        CallableStatement cs= objetoConexion.estableceConexion().prepareCall(consulta);
        cs.setString(1, getNombreAlumnos());
        cs.setString(2, getApellidosAlumnos());
        cs.setInt(3, getCodigo());
        
        cs.execute();
        
        JOptionPane.showMessageDialog(null, "Modificó correctamente");
        
        
    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Error de Modificación, error: "+e.toString());
    }
            
            
        }
    
    
    public void EliminarAlumnos(JTextField paraCodigo){
        setCodigo(Integer.parseInt(paraCodigo.getText()));
        
        CConexion objetoConexion = new CConexion();
        String consulta = "DELETE FROM Alumnos WHERE alumnos.id=?;";
        
    try{
        
        CallableStatement cs= objetoConexion.estableceConexion().prepareCall(consulta);
        cs.setInt(1, getCodigo());
        cs.execute();
        JOptionPane.showMessageDialog(null, "Eliminó correctamente");

    }catch (SQLException e){
        JOptionPane.showMessageDialog(null, "Error de Eliminación, error: "+e.toString());
    }
        
    }
    
    
    
    
    
    
    
    
    
    
}



/*
 try{


    }catch (Exception e){
        
    }


*/
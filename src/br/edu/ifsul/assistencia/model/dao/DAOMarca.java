/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.assistencia.model.dao;

import br.edu.ifsul.assistencia.model.Marca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20181210031
 */
public class DAOMarca {
    // INSERIR, ALTERAR , REMOVER, LISTAR, LOCALIZAR
    
      public boolean inserir(Marca obj){
        String sql = " insert into marca (nome) values"
                + "(?) ";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getDescricao());

            //executa update para mostrar as linhas alteradas
            
            if( pst.executeUpdate() > 0 ){
                System.out.println("Marca inserida com sucesso!!!");
                return true;
            }else{
                //nada aconteceu feijoada, tem que retornar falso. Não alterou nenhuma linha
                return false;
            }
            
        }catch(Exception e){
            System.out.println("Erro SQL: " +e.getMessage() );
            return false;
        }
    }
      public boolean alterar(Marca obj){
        String sql = " update marca SET NOME =?  "
                + "where marca_cod = ?  ";
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setString(1, obj.getDescricao());
            pst.setInt(2, obj.getCodigoMarca());

            //executa update para mostrar as linhas alteradas
            
            if( pst.executeUpdate() > 0 ){
                System.out.println("Marca alterada com sucesso!!!");
                return true;
            }else{
                //nada aconteceu feijoada, tem que retornar falso. Não alterou nenhuma linha
                return false;
            }
            
        }catch(Exception e){
            System.out.println("Erro SQL: " +e.getMessage() );
            return false;
        }
    }
      
       public boolean remover(int id){
        String sql = " delete  from marca where marca_cod = ? "; 
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            

            //executa update para mostrar as linhas alteradas
            
            if( pst.executeUpdate() > 0 ){
                System.out.println("Marca removida com sucesso!!!");
                return true;
            }else{
                //nada aconteceu feijoada, tem que retornar falso. Não alterou nenhuma linha
                return false;
            }
            
        }catch(Exception e){
            System.out.println("Erro SQL: " +e.getMessage() );
            return false;
        }
    }
       public List<Marca> listar() {
           String sql = "select distinct marca_cod, nome from marca\n" +
"                   order by marca_cod";
           
           List<Marca> lista = new ArrayList<>();
           try{
               PreparedStatement pst = Conexao.getPreparedStatement(sql);
               ResultSet rs = pst.executeQuery();
               
             while(rs.next()){
                 Marca m = new Marca(); 
                 m.setCodigo_marca(rs.getInt("marca_cod"));
                 m.setDescricao(rs.getString("nome"));
                 
                 lista.add(m);
                         
                 
             }
           }catch (Exception e ){
                     System.out.println(" Erro de SQL: " + e.getMessage());
                     }
           return lista;
           }
        public List<Marca> listarNome() {
           String sql = "select distinct marca_cod, nome from marca\n" +
"                   order by nome";
           
           List<Marca> lista = new ArrayList<>();
           try{
               PreparedStatement pst = Conexao.getPreparedStatement(sql);
               ResultSet rs = pst.executeQuery();
               
             while(rs.next()){
                 Marca m = new Marca(); 
                 m.setCodigo_marca(rs.getInt("marca_cod"));
                 m.setDescricao(rs.getString("nome"));
                 
                 lista.add(m);
                         
                 
             }
           }catch (Exception e ){
                     System.out.println(" Erro de SQL: " + e.getMessage());
                     }
           return lista;
           }
           
       
 public List<Marca> listarMarca() {
           String sql = "select * from marca order by nome";
           
           List<Marca> lista = new ArrayList<>();
           try{
               PreparedStatement pst = Conexao.getPreparedStatement(sql);
               ResultSet rs = pst.executeQuery();
               
             while(rs.next()){
                 Marca m = new Marca(); 
                // m.setCodigo_marca(rs.getInt("marca_cod"));
                 m.setDescricao(rs.getString("nome"));
                 
                 lista.add(m);
                         
                 
             }
           }catch (Exception e ){
                     System.out.println(" Erro de SQL: " + e.getMessage());
                     }
           return lista;
           }
 
  public List<Marca> listarFiltro(Integer id){
    
        String sql = "select * from marca where marca_cod=?";
         System.out.println("SQL: " + sql);
        List<Marca> lista = new ArrayList<>(); 
        try{
            PreparedStatement pst = Conexao.getPreparedStatement(sql);
            pst.setInt(1, id);
            ResultSet rs= pst.executeQuery();
            while(rs.next()){
                Marca m = new Marca();
                m.setCodigo_marca(rs.getInt("marca_cod"));
                m.setDescricao(rs.getString("nome"));
              
                
                lista.add(m);
               
            
            }
        
        
        }catch(Exception e){
            System.out.println("Erro de SQL: " +e.getMessage());
            
        }
       return lista;        
                
    }
           
       }
 

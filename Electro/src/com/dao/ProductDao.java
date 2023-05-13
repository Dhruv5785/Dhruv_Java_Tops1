package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Product;
import com.util.ElectroUtil;

public class ProductDao {
      public static void createProduct(Product p) {
    	  
    	 try {
    		 Connection conn=ElectroUtil.createConnection();
    		 String sql="insert into product(cno,prod_category,prod_model,prod_desc,prod_img,prod_price,prod_name) values (?,?,?,?,?,?,?)";
    		 PreparedStatement pst=conn.prepareStatement(sql);
    		 pst.setInt(1, p.getCno());
    		 pst.setString(2,p.getProd_category());
    		 pst.setString(3, p.getProd_model());
    		 pst.setString(4, p.getProd_desc());
    		 pst.setString(5, p.getProd_img());
    		 pst.setInt(6, p.getProd_price());
    		 pst.setString(7, p.getProd_name());
    		 pst.executeUpdate();
    		
    	 }catch(Exception e) {
    		 e.printStackTrace();
    	 }
      }
      
      public static List<Product> getAllProducts(){
    	  
    	  List<Product> list=new ArrayList<Product>();
    	 
    	  try {
    	  Connection conn=ElectroUtil.createConnection();
    	  String sql="select * from product";
    	  PreparedStatement pst=conn.prepareStatement(sql);
    	  ResultSet rs=pst.executeQuery();
    	  while (rs.next()) {
		   Product p=new Product();
		   p.setPid(rs.getInt("pid"));
		   p.setCno(rs.getInt("cno"));
		   p.setProd_category(rs.getString("prod_category"));
		   p.setProd_model(rs.getString("prod_model"));
		   p.setProd_desc(rs.getString("prod_desc"));
		   p.setProd_img(rs.getString("prod_img"));
		   p.setProd_price(rs.getInt("prod_price"));
		   p.setProd_name(rs.getString("prod_name"));
		   list.add(p);
		 }
    	  
    }
    	  catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  return list;
    	  
      }
 
      public static Product getProductsById(int pid){
    	  
    	  Product p=null;
    	 
    	  try {
    	  Connection conn=ElectroUtil.createConnection();
    	  String sql="select * from product where pid=?";
    	  PreparedStatement pst=conn.prepareStatement(sql);
    	  pst.setInt(1, pid);
    	  ResultSet rs=pst.executeQuery();
          
    	if(rs.next()) {
		   p = new Product();
		   p.setPid(rs.getInt("pid"));
		   p.setCno(rs.getInt("cno"));
		   p.setProd_category(rs.getString("prod_category"));
		   p.setProd_model(rs.getString("prod_model"));
		   p.setProd_desc(rs.getString("prod_desc"));
		   p.setProd_img(rs.getString("prod_img"));
		   p.setProd_price(rs.getInt("prod_price"));
		   p.setProd_name(rs.getString("prod_name"));
    	  }
		 }
    	  catch(Exception e) {
    		  e.printStackTrace();
    	  }
    	  return p;
     }
      
     public static void updateProduct(Product p) {
         
    	  try {
    		  Connection conn=ElectroUtil.createConnection();
    		  String sql="update product set cno=?,prod_category=?,prod_model=?,prod_desc=?,prod_price=?,prod_name=? where pid=?";
    		  PreparedStatement pst=conn.prepareStatement(sql);
    		  pst.setInt(1, p.getCno());
    		  pst.setString(2 , p.getProd_category());
    		  pst.setString(3, p.getProd_model());
    		  pst.setString(4, p.getProd_desc());
    		  pst.setInt(5, p.getProd_price());
    		  pst.setString(6, p.getProd_name());
    		  pst.setInt(7, p.getPid());
    		  pst.executeUpdate();
    		  
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
      }
     
     public static void deleteProduct(int pid) {
    	 try {
			Connection conn=ElectroUtil.createConnection();
			String sql="delete from product where pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, pid);
			pst.executeUpdate();
		} catch (Exception e) {
		    e.printStackTrace();
		}
     }
     
     public static List<Product> getProductByCategory(String prod_category){
   	  
   	  List<Product> list=new ArrayList<Product>();
   	 
   	  try {
   	  Connection conn=ElectroUtil.createConnection();
   	  String sql="select * from product where prod_category=?";
   	  PreparedStatement pst=conn.prepareStatement(sql);
   	  pst.setString(1, prod_category);
   	  ResultSet rs=pst.executeQuery();
   	  while (rs.next()) {
		   Product p=new Product();
		   p.setPid(rs.getInt("pid"));
		   p.setCno(rs.getInt("cno"));
		   p.setProd_category(rs.getString("prod_category"));
		   p.setProd_model(rs.getString("prod_model"));
		   p.setProd_desc(rs.getString("prod_desc"));
		   p.setProd_img(rs.getString("prod_img"));
		   p.setProd_price(rs.getInt("prod_price"));
		   p.setProd_name(rs.getString("prod_name"));
		   list.add(p);
		 }
   	  
   }
   	  catch(Exception e) {
   		  e.printStackTrace();
   	  }
   	  return list;
   	  
     }
}


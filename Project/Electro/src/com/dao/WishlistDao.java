package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Wishlist;
import com.util.ElectroUtil;

public class WishlistDao {
       public static void addToWishlist(Wishlist w) {
    	  try { 
    	   Connection conn=ElectroUtil.createConnection();
    	   String sql="insert into wishlist(pid,cno) values(?,?)";
    	   PreparedStatement pst=conn.prepareStatement(sql);
    	   pst.setInt(1, w.getPid());
    	   pst.setInt(2, w.getCno());
    	   pst.executeUpdate();
    	  }catch(Exception e) {
    		  e.printStackTrace();
    	  }
       }
       
       public static List<Wishlist> getWishlistByUser(int cno) {
    	   
    	   List<Wishlist> list=new ArrayList<Wishlist>();
    	   try {
    		   Connection conn=ElectroUtil.createConnection();
    		   String sql="select * from wishlist where cno=?";
    		   PreparedStatement pst=conn.prepareStatement(sql);
    		   pst.setInt(1, cno);
    		   ResultSet rs=pst.executeQuery();
    		   while(rs.next()) {
    			   Wishlist w=new Wishlist();
    			   w.setWid(rs.getInt("wid"));
    			   w.setPid(rs.getInt("pid"));
    			   w.setCno(rs.getInt("cno"));
    			   list.add(w);    
    		   }
    		   
    	   }catch(Exception e) {
    		   e.printStackTrace();
    	   }
		return list;
       }
       
       public static boolean checkWishlist(int cno,int pid) {
    	   
    	   boolean flag=false;
    	   try {
			Connection conn=ElectroUtil.createConnection();
			String sql="select * from wishlist where cno=? and pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,cno);
			pst.setInt(2, pid);
			ResultSet rs=pst.executeQuery();
			if(rs.next()) {
				flag=true;
			}
		} catch (Exception e) {
		   e.printStackTrace();
		}
    	   return flag;
       }
       
 public static void removeFromWishlist(int cno,int pid) {
    	   
    	   try {
			Connection conn=ElectroUtil.createConnection();
			String sql="delete from wishlist where cno=? and pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,cno);
			pst.setInt(2, pid);
			pst.executeUpdate();
		} catch (Exception e) {
		   e.printStackTrace();
		}
     }
}

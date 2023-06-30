package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.util.ElectroUtil;

public class CartDao {
	
	public static void addToCart(Cart c) {
		try {
			Connection conn=ElectroUtil.createConnection();
			String sql="insert into cart(cno,pid,prod_price,prod_qty,total_price) values(?,?,?,?,?)";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,c.getCno());
			pst.setInt(2, c.getPid());
			pst.setInt(3, c.getProd_price());
			pst.setInt(4, c.getProd_qty());
			pst.setInt(5, c.getTotal_price());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static List<Cart> getCartByUser(int cno){
		
		List<Cart> list=new ArrayList<Cart>();
		try {
			Connection conn=ElectroUtil.createConnection();
			String sql="select * from cart where cno=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cno);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Cart c=new Cart();
				c.setCid(rs.getInt("cid"));
				c.setCno(rs.getInt("cno"));
				c.setPid(rs.getInt("pid"));
		        c.setProd_price(rs.getInt("prod_price"));
		        c.setProd_qty(rs.getInt("prod_qty"));
		        c.setTotal_price(rs.getInt("total_price"));
		        list.add(c);
			}
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return list;
	}
	
	public static boolean checkCart(int cno,int pid) {
		boolean flag=false;
		try {
			Connection conn = ElectroUtil.createConnection();
			String sql="select * from cart where cno=? and pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cno);
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
	
	public static void removeFromCart(int cno,int pid) {
		try {
			Connection conn=ElectroUtil.createConnection();
			String sql="delete from cart where cno=? and pid=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1, cno);
			pst.setInt(2, pid);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Cart getCartByCid(int cid)
	{
		 
		Cart c=null;
		try {
			Connection conn = ElectroUtil.createConnection();
            String sql="select * from cart where cid=?";
            PreparedStatement pst=conn.prepareStatement(sql);
            pst.setInt(1, cid);
            ResultSet rs=pst.executeQuery();
            
            if(rs.next()) {
            	  c = new Cart();
                  c.setCid(rs.getInt("cid"));
                  c.setPid(rs.getInt("pid"));
                  c.setCno(rs.getInt("cno"));
                  c.setProd_price(rs.getInt("prod_price"));
                  c.setProd_qty(rs.getInt("prod_qty"));
                  c.setTotal_price(rs.getInt("total_price"));
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public static void updateCart(Cart c) {
		
		try {
		Connection conn = ElectroUtil.createConnection();
		String sql="update cart set prod_qty=?,total_price=? where cid=?";
		PreparedStatement pst=conn.prepareStatement(sql);
		pst.setInt(1, c.getProd_qty());
		pst.setInt(2, c.getTotal_price());
		pst.setInt(3, c.getCid());
		pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

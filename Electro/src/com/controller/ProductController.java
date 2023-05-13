package com.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.bean.Product;
import com.dao.ProductDao;

@WebServlet("/ProductController")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 512,//512MB
maxFileSize = 1024 * 1024 * 512, //512MB
maxRequestSize = 1024 * 1024 * 512) // 512MB
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String extractfilename(Part file) {
	    String cd = file.getHeader("content-disposition");
	    System.out.println(cd);
	    String[] items = cd.split(";");
	    for (String string : items) {
	        if (string.trim().startsWith("filename")) {
	            return string.substring(string.indexOf("=") + 2, string.length()-1);
	        }
	    }
	    return "";
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("add product")) {
			String savePath = "D:\\Adv-Java\\Electro\\WebContent\\Product_Images";
			File fileSaveDir=new File(savePath);
	        if(!fileSaveDir.exists()){
	            fileSaveDir.mkdir();
	        }
	        Part file1 = request.getPart("prod_img");
		 	String fileName=extractfilename(file1);
		    file1.write(savePath + File.separator + fileName);
		    String filePath= savePath + File.separator + fileName ;
		    
		    Product p=new Product();
		    p.setCno(Integer.parseInt(request.getParameter("cno")));
		    p.setProd_category(request.getParameter("prod_category"));
		    p.setProd_model(request.getParameter("prod_model"));
		    p.setProd_desc(request.getParameter("prod_desc"));
		    p.setProd_img(fileName);
		    p.setProd_price(Integer.parseInt(request.getParameter("prod_price")));
		    p.setProd_name(request.getParameter("prod_name"));
		    ProductDao.createProduct(p);
		    request.setAttribute("msg", "Product Added Successfully");
		    request.getRequestDispatcher("seller_add_product.jsp").forward(request, response);
		    
		}else if(action.equalsIgnoreCase("update product")) {
			
			Product p=new Product();
			p.setCno(Integer.parseInt(request.getParameter("cno")));
			p.setPid(Integer.parseInt(request.getParameter("pid")));
			p.setProd_category(request.getParameter("prod_category"));
			p.setProd_model(request.getParameter("prod_model"));
			p.setProd_desc(request.getParameter("prod_desc"));
			p.setProd_price(Integer.parseInt(request.getParameter("prod_price")));
			p.setProd_name(request.getParameter("prod_name"));
			ProductDao.updateProduct(p);
			request.setAttribute("msg", "Product Updated Successfully");
			request.getRequestDispatcher("seller_edit_product.jsp").forward(request, response);
		}
		
	}

}

package by.teachmeskills.store.controller;

import by.teachmeskills.store.api.product.ProductRequest;
import by.teachmeskills.store.api.product.ProductResponse;
import by.teachmeskills.store.service.ProductService;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService productService = new ProductService();
        List<ProductResponse> productResponses = productService.allProducts();
        req.setAttribute("products", productResponses);
        req.getRequestDispatcher("jsp/products.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String article = req.getParameter("article");
        String name = req.getParameter("name");
        String productType = req.getParameter("productType");
        String price = req.getParameter("price");
        String amount = req.getParameter("amount");
        ProductService productService = new ProductService();
        ProductRequest productRequest = new ProductRequest();
        productRequest.setId(Integer.parseInt(id));
        productRequest.setArticle(Integer.parseInt(article));
        productRequest.setName(name);
        productRequest.setProductType(productType);
        productRequest.setPrice(Double.parseDouble(price));
        productRequest.setAmount(Integer.parseInt(amount));
        ProductResponse productResponse = productService.add(productRequest);
        req.setAttribute("product", productResponse);
        req.getRequestDispatcher("jsp/products.jsp").forward(req, resp);
    }
}

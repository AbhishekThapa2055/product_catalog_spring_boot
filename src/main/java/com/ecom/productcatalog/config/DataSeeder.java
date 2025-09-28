//package com.ecom.productcatalog.config;
//
//import com.ecom.productcatalog.model.Category;
//import com.ecom.productcatalog.model.Product;
//import com.ecom.productcatalog.repository.CategoryRepository;
//import com.ecom.productcatalog.repository.ProductRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
//@Component
//public class DataSeeder implements CommandLineRunner {
//private  final ProductRepository productRepository;
//private  final CategoryRepository categoryRepository;
//
//    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
//        this.productRepository = productRepository;
//        this.categoryRepository = categoryRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//      //clear all existing data
//        productRepository.deleteAll();
//        categoryRepository.deleteAll();
//
//        //Create Categories
//
//        Category electronics = new Category();
//        electronics.setName("Electronics");
//
//        Category clothing = new Category();
//        clothing.setName("Clothing");
//
//        Category womens = new Category();
//        womens.setName("Womens");
//
//        categoryRepository.saveAll(Arrays.asList(electronics,clothing,womens));
//
//        //Create Product
//
//        Product  phone = new Product();
//        phone.setName("Iphone");
//        phone.setDescription("Iphone 10 ");
//        phone.setImageUrl("https://placehold.co/600x400");
//        phone.setPrice(699.0);
//        phone.setCategory(electronics);
//
//
//        Product  laptop = new Product();
//        laptop.setName("HP");
//        laptop.setDescription("Hp Gaming Laptop");
//        laptop.setImageUrl("https://placehold.co/600x400");
//        laptop.setPrice(1000.0);
//        laptop.setCategory(electronics);
//
//        productRepository.saveAll(Arrays.asList(phone,laptop));
//
//
//    }
//}

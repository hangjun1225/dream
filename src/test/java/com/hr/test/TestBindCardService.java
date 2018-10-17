//package com.hr.test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import com.hr.domain.BindCard;
//import com.hr.service.BindCardService;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TestBindCardService {
//    @Autowired
//    private BindCardService bindCardService;
//
//    @Test
//    public void add() throws Exception {
//    	BindCard bindCard=new BindCard();
//    	bindCard.setBankCard("123132");
//    	bindCardService.addBindCard(bindCard);
//    }
//    @Test
//    public void queryById() throws Exception {
//    	Integer id =1;
//        BindCard bindCard = bindCardService.queryById(id);
//        System.out.println(bindCard);
//
//    }
//    
//    @Test
//    public void updateBindCard() throws Exception {
//    	BindCard bindCard=new BindCard();
//    	bindCard.setId(1);
//    	bindCard.setBankMobile("123123");
//    	bindCardService.modifyBindCard(bindCard);
//
//    }
//}

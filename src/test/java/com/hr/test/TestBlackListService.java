package com.hr.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.hr.domain.BlackList;
import com.hr.service.BlackListService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestBlackListService {
    @Autowired
    private BlackListService blackListService;

    @Test
    public void add() throws Exception {
    	BlackList b = blackListService.queryByPersonId(1);
    	System.out.println(b);
    }
}

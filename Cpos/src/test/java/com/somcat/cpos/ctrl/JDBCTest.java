package com.somcat.cpos.ctrl;

import java.util.Date;

import javax.inject.Inject;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.somcat.cpos.domain.ReceiptVO;
import com.somcat.cpos.persistence.ReceiptDAO;

public class JDBCTest {
	private static Logger log = LoggerFactory.getLogger(JDBCTest.class);
	
	@Inject
	ReceiptDAO rdao;
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		for(int i=0; i<10; i++) {
			ReceiptVO rvo = new ReceiptVO("store", 10010000+i, 1+i, "card", new Date(2020, 0, i+5, i+1, i, i),
					0, 0, "2020072900123456", "product"+i, 500+i, 600+i);
			rdao.insertReceipt(rvo);
		}
	}
}

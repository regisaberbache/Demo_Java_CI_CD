package com.example.demo;

import com.example.demo.service.BankService;
import com.example.demo.service.ServiceResponseDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired // normalment on injecte plutôt dans les constructeurs
	BankService bankService;

	@Test
	void contextLoads() {
	}

	@Test // on part du principe ici que 1 test = 1 fonctionnalité
	void RG_11515(){ // on nomme le test comme la fonctionnalité

		// CAS 789
		ServiceResponseDTO<Float> responseDTO789 = bankService.debit(6000F);
		assertEquals("789", responseDTO789.code);

		// CAS 207
		ServiceResponseDTO<Float> responseDTO207 = bankService.debit(1200F);
		assertEquals("207", responseDTO207.code);


	}

}

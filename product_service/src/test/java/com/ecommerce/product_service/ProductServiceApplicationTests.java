package com.ecommerce.product_service;

import com.ecommerce.product_service.dto.ProductRequestDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.shaded.com.fasterxml.jackson.core.JsonProcessingException;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import java.math.BigDecimal;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@SpringBootTest
//@Testcontainers
//@AutoConfigureMockMvc
//class ProductServiceApplicationTests {
//	@Container
//	static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:4.4.2");
//    @Autowired
//	private MockMvc mockMvc;
//	@Autowired
//	private ObjectMapper objectMapper;
//
//
//	@DynamicPropertySource
//	static void setProperties(DynamicPropertyRegistry dynamicPropertyRegistry){
//		dynamicPropertyRegistry.add("spring.data.mongodb.uri", mongoDBContainer::getReplicaSetUrl);
//	}
//
//	@Test
//	void shouldCreateProduct() throws Exception {
//		ProductRequestDTO productRequestDTO = getProductRequest();
//		String productRequestString = objectMapper.writeValueAsString(productRequestDTO);
//		mockMvc.perform(MockMvcRequestBuilders.post("/api/product")
//				.contentType(MediaType.APPLICATION_JSON)
//				.content(productRequestString))
//				.andExpect(status().isCreated());
//
//	}
//
//	private ProductRequestDTO getProductRequest(){
//		return ProductRequestDTO.builder()
//				.name("Samsung A51")
//				.description("A51")
//				.price(BigDecimal.valueOf(24000))
//				.build();
//	}
//
//
//
//}

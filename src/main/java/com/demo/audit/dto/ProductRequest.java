package com.demo.audit.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ProductRequest<T> {
	private String createdBy;
	private String modifiedBy;
	private T product;
}

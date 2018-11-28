package com.example.demo.collection;

import org.bson.types.ObjectId;

import lombok.Data;

@Data
public class Books {

	private ObjectId _id;
	private String name;
	private Integer price;
}

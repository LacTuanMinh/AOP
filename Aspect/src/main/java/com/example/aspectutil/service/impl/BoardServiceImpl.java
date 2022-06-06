package com.example.aspectutil.service.impl;

import com.example.aspectutil.model.Board;
import com.example.aspectutil.service.BoardService;

import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	@Override
	public Board getById(Long id) {
		System.out.println("get board by id: " + id);
		return new Board(id);
	}
}

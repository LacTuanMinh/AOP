package com.example.AspectUtil.service.impl;

import com.example.AspectUtil.model.Board;
import com.example.AspectUtil.service.BoardService;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
		@Override
		public Board getById(Long id) {
				System.out.println("get board by id: " + id);
				return new Board();
		}
}

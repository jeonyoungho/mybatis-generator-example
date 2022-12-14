package com.example.mybatispractice.repository;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;




@Repository
@RequiredArgsConstructor
public class ProductDao {
    private final SqlSession sqlSession;

    public List<HashMap<String, Object>> getProducts() {
        return sqlSession.selectList("foo.selectProducts");
    }
}

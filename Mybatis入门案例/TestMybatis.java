package org.lanqiao.entity;

import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import static org.apache.ibatis.io.Resources.getResourceAsReader;

public class TestMybatis {
    public static void main(String[] args) throws IOException {
        //加载配置文件，访问数据库
        Reader reader = getResourceAsReader("conf.xml");

        SqlSessionFactory seesionFsctory = new SqlSessionFactoryBuilder().build(reader);

        SqlSession session = seesionFsctory.openSession();

        String statement = "org.lanqiao.entity.personMapper.queryPersonById";

        Person person = session.selectOne(statement,1);

        System.out.println(person);

        session.close();


    }
}

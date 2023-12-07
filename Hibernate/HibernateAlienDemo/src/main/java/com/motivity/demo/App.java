package com.motivity.demo;

import com.motivity.demo.dao.AlienDao;

public class App 
{
    public static void main( String[] args )
    {
      AlienDao alienDao = new AlienDao();
      alienDao.saveAlien();
    }
}

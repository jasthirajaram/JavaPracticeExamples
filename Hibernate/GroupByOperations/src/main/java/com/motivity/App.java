package com.motivity;

import com.motivity.service.ServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
        ServiceImpl impl = new ServiceImpl();
        impl.orderByAscOrDesc();
    }
}

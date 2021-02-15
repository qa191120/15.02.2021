package com.example;

public class Wolf extends Dog {
    private String m_pack_name;
    public Wolf(String name, int age, String m_pack_name)
    {
        super(name, age);
        this.m_pack_name = m_pack_name;
    }
}

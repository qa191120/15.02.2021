package com.example;

class Dog
{
    private String m_name;
    private int m_age;

    // when you create a ctor the default ctor is gone ...
    public Dog(String m_name)
    {
        this.m_name = m_name;
    }

    // when you create a ctor the default ctor is gone ...
    public Dog(String m_name, int m_age)
    {
        this.m_name = m_name;
        this.m_age = m_age;
    }

    // after creating a ctor
    // the ctor below is gone .....
    //public Dog()
    //{
    //}
}

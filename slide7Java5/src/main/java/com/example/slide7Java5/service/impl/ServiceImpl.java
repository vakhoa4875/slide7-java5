package com.example.slide7Java5.service.impl;

import com.example.slide7Java5.service.Service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    @Override
    public int deleteAllDisableRecords() {
        System.out.println("Nothing to delete");
        return -1;
    }
}

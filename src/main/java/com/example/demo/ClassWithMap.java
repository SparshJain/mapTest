package com.example.demo;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ClassWithMap {
    Map<Key, Value> map = new HashMap<>();
}

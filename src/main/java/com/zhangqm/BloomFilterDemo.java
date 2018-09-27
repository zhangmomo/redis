package com.zhangqm;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

import java.nio.charset.Charset;

/**
 * 布隆过滤器
 * 防止雪崩
 */
public class BloomFilterDemo {
    public static void main(String[] args) {
        BloomFilter bloomFilter=BloomFilter.create
                (Funnels.stringFunnel(Charset.defaultCharset()),
                        1000000,0.001); //1%
        bloomFilter.put("mic");
        System.out.println(bloomFilter.mightContain("mic"));
    }
}

package com.prystupa;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * Hello world!
 */
public class PopulateApp {
    public static void main(String[] args) {

        CacheFactory.ensureCluster();
        NamedCache myCache = CacheFactory.getCache("mycache");

        myCache.put(1, new Data(1, "11"));
        myCache.put(2, new Data(2, "22"));
        myCache.put(3, new Data(3, "33"));

        System.out.println("Cache populated!");
    }
}

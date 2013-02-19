package com.prystupa;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
import com.tangosol.util.filter.EqualsFilter;

/**
 * Hello world!
 */
public class FilterApp {
    public static void main(String[] args) {

        CacheFactory.ensureCluster();
        NamedCache myCache = CacheFactory.getCache("mycache");

        System.out.println(myCache.entrySet(new EqualsFilter("getStringData", "33")));
        System.out.println(myCache.get(2));
    }

}

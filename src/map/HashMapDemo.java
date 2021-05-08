package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/8 10:06
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();  //DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16 默认的初始值为16
        map.put("henan","河南");  //entry  实例
        map.put("hebei","河北");
        map.put("hubei", "湖北");
        map.put("hubei", "湖北1");  //键重复会覆盖掉原有的值


        map.put("null","空1");
        map.put(null,"空2");
        System.out.println(map);

        for (Map.Entry<String,String> m : map.entrySet()){
            System.out.println(m);
        }
        for (String  k  : map.keySet()){
            System.out.println(k + "=" + map.get(k));

        }
        for (String v : map.values()){
            System.out.println(v);
        }
    }
}
        //DEFAULT_INITIAL_CAPACITY = 1 << 4; // aka 16 默认的初始值为16
        //DEFAULT_LOAD_FACTOR = 0.75f; 当体内容量达到全部的百分之75的时候直接扩容
        //TREEIFY_THRESHOLD = 8;  当长度为8的时候树化
        //UNTREEIFY_THRESHOLD = 6; 当长度为6的时候 退化为数组
        //MAXIMUM_CAPACITY = 1 << 30;  默认的最大  = 2的30次方

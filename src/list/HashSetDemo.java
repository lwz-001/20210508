package list;

import java.util.HashSet;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/8 9:16
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();  // <> 钻石语法
        set.add("111");
        set.add("xxx");
        set.add("上显");
        set.add("333");
        System.out.println(set);
        set.remove("xxx"); // 根据内容移除
        System.out.println(set);
        int size = set.size();
        boolean  empty = set.isEmpty(); //判断是否为空
        System.out.println(size);
        System.out.println(empty);
        set.clear(); //清楚
        System.out.println(set);

    }
}

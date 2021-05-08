package list;

import java.util.TreeSet;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/8 9:26
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("111");
        set.add("222");
        set.add("地理");
        set.add("化学");
        set.add("abc");
        set.add("efg");
        System.out.println(set);
    }
}

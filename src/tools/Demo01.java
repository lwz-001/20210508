package tools;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @qvthor liuwenzheng
 * @date 2021/5/8 11:25
 */
public class Demo01 {
    public static void main(String[] args) {
        String str[] = {"中文","计算机","ABC","123","qq@.com"};
        List<String>list = Arrays.asList(str);  //Arrays.aslist()  将数组转换成列表
        System.out.println(list);

        //2将数组转换成数组列表（链式列表） new ArrayList<>(Arrays.asList(str));
        ArrayList<String> alist = new ArrayList<>(Arrays.asList(str));
        LinkedList<String>llist = new LinkedList<>(Arrays.asList(str));
        alist.remove("abc");
        llist.add("123123");
        System.out.println(alist);
        System.out.println(llist);
        //3将列表转换成数组
        Object[] str2 = alist.toArray();
        for (Object o :str2){
            System.out.println(o+"");
        }
        System.out.println();
        Object[] str3 = llist.toArray();
            for (Object o : str3){
                System.out.println(o + "");
            }
        }
    }


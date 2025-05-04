package Bai8_Collections;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        // Khai báo kiểu dữ liệu map
        Map<String, String> map = new HashMap<>();

        // Thêm giá trị dạng keyname
        map.put("name", "Bao Chau Bong");
        map.put("age", "24");
        map.put("address", "Ha Noi");

        // Truy xuất giá trị thông qua key
        System.out.println(map.get("name"));

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}

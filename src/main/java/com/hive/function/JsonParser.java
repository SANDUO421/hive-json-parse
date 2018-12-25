package com.hive.function;

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * 自定义解析json解析
 * 
 * @author sanduo
 * @date 2018/10/23
 */
public class JsonParser extends UDF {

    // 重载 父类中的一个方法 evaluate()
    public String evaluate(String json, int index) {
        // {"movie":"135","rate":"5","timeStamp":"978305760","uid":"1"}
        String[] result = json.split("\"");
        return result[index * 4 - 1];

    }

}

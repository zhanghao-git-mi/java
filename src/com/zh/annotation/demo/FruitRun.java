package com.zh.annotation.demo;

import com.zh.annotation.demo.util.FruitInfoUtil;
import com.zh.annotation.demo.vo.Apple;

/**
 * @author 61677
 */
public class FruitRun {
    public static void main(String[] args) {
        /***********输出结果***************/
        // 供应商编号：1 供应商名称：陕西红富士集团 供应商地址：陕西省西安市延
        FruitInfoUtil.getFruitInfo(Apple.class);

    }
}

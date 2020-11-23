package com.xiyun.cxn.java.test;

import java.math.BigDecimal;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/11/18 15:58
 */
public class DoBillTest {

    public static void main(String[] args) {
        //wxTest();
        unoinTest();
        //fyTest();

        //元转分



        System.out.println(new BigDecimal("000000000400").toString());


    }

    private static void fyTest() {
        String ylPayStr = "0006170F2619427,289200***4431,01,112132498299,TX27,,1258220110456584797144000,21201104436249845711,55.00,1,SUCCESS,2020-11-04 12:07:05,20201104,,0.00,";
        String ylRefundStr = "0006170F2619427,,,112132449140,TX18,,9722011045658482324,21201104436249845711,50.00,1,SUCCESS,2020-11-04 12:08:12,20201104,1258220110456584797144000,0.00,";

        String wxPayStr = "0008210F2602601,,01,110069563122,TX09,,1258sos20111000795808476000,4200000728202011104307144033,4.00,1,SUCCESS,2020-11-10 07:56:40,20201110,,0.00,";
        String wxRefundStr = "0008210F2602601,,,110069674758,TX18,,12585051e2011102112010112,4200000728202011104307144033,4.00,1,SUCCESS,2020-11-10 08:03:13,20201110,1258sos20111000795808476000,0.00,";

        String wxFPayStr = "0005810F3551422,,01,112069273396,TX09,,12582201101122048920633000,4200000735202011013456159247,22.00,1,SUCCESS,2020-11-01 07:56:52,20201101,,0.00,";
        String wxFRayStr = "0005810F3551422,,,112069243575,TX18,,12584550220110112204901393,4200000735202011013456159247,20.00,1,SUCCESS,2020-11-01 07:58:52,20201101,12582201101122048920633000,0.00,";


        String[] tradeInfo1 = ylPayStr.split(",");
        System.out.println("tradeInfo1 ThirdTradeNo" + tradeInfo1[7]);
        System.out.println("tradeInfo1 setMoney" + new BigDecimal(tradeInfo1[8]).multiply(new BigDecimal(100)).intValue());
        System.out.println("tradeInfo1 tradeType " + tradeInfo1[4]);
        System.out.println("tradeInfo1 setRefundNo " + tradeInfo1[6]);

        System.out.println("===========================");

        String[] tradeInfo2 = ylRefundStr.split(",");
        System.out.println("tradeInfo2 ThirdTradeNo" + tradeInfo2[7]);
        System.out.println("tradeInfo2 setMoney" + new BigDecimal(tradeInfo2[8]).multiply(new BigDecimal(100)).intValue());
        System.out.println("tradeInfo2 tradeType " + tradeInfo2[4]);
        System.out.println("tradeInfo2 setRefundNo " + tradeInfo2[6]);

        System.out.println("===========================");


        String[] tradeInfo3 = wxPayStr.split(",");
        System.out.println("tradeInfo3 ThirdTradeNo" + tradeInfo3[7]);
        System.out.println("tradeInfo3 setMoney" + tradeInfo3[8]);
        System.out.println("tradeInfo3 tradeType " + tradeInfo3[4]);
        System.out.println("tradeInfo3 setRefundNo " + tradeInfo3[6]);

        System.out.println("===========================");


        String[] tradeInfo4 = wxRefundStr.split(",");
        System.out.println("tradeInfo4 ThirdTradeNo" + tradeInfo4[7]);
        System.out.println("tradeInfo4 setMoney" + tradeInfo4[8]);
        System.out.println("tradeInfo4 tradeType " + tradeInfo4[4]);
        System.out.println("tradeInfo4 setRefundNo " + tradeInfo4[6]);


        System.out.println("===========================");


        String[] tradeInfo5 = wxFPayStr.split(",");
        System.out.println("tradeInfo5 ThirdTradeNo" + tradeInfo5[7]);
        System.out.println("tradeInfo5 setMoney" + tradeInfo5[8]);
        System.out.println("tradeInfo5 tradeType " + tradeInfo5[4]);
        System.out.println("tradeInfo5 setRefundNo " + tradeInfo5[6]);
        System.out.println("===========================");


        String[] tradeInfo6 = wxFRayStr.split(",");
        System.out.println("tradeInfo6 ThirdTradeNo" + tradeInfo6[7]);
        System.out.println("tradeInfo6 setMoney" + tradeInfo6[8]);
        System.out.println("tradeInfo6 tradeType " + tradeInfo6[4]);
        System.out.println("tradeInfo6 setRefundNo " + tradeInfo6[6]);

        System.out.println("===========================");


    }


    private static void wxTest() {
        String payStr = "2020-11-17 06:57:18,wx39ff16174ead802b,1532656151,1600450887,,4200000724202011175559836620,M2011170657036624578163000,oAgcP5J_vHXq0onjLAj-sRPvSODo,MICROPAY,SUCCESS,OTHERS,CNY,6.00,0.00,0,0,0.00,0.00,,,美食苑餐厅04号：6元,{\\\"mid\\\":\\\"52A0A7A2-CFB5-48C9-B7A5-FD19DF605AB3\\\"},0.00000,0.00%,6.00,0.00,";
        String refundStr = "2020-11-17 06:57:22,wx39ff16174ead802b,1532656151,1600450887,,4200000724202011175559836620,M2011170657036624578163000,oAgcP5J_vHXq0onjLAj-sRPvSODo,MICROPAY,REFUND,OTHERS,CNY,0.00,0.00,50300406222020111704018312369,90201117065722167,6.00,0.00,ORIGINALSUCCESS,美食苑餐厅04号：6元,{\\\"mid\\\":\\\"52A0A7A2-CFB5-48C9-B7A5-FD19DF605AB3\\\"},0.00000,0.00%,0.00,6.00,";


        String[] tradeInfo = payStr.split(",");
        //第三方流水号
        System.out.println("thirdTradeNo = " + tradeInfo[5]);
        //交易状态
        String tradeType = tradeInfo[9];
        System.out.println("tradeType = " + tradeInfo[9]);
        if ("SUCCESS".equals(tradeType)) {
            System.out.println("tradeMoney = " + tradeInfo[12]);
        } else if ("REFUND".equals(tradeType)) {
            System.out.println("tradeMoney = " + new BigDecimal(tradeInfo[24]).multiply(new BigDecimal(100)).intValue());
            System.out.println("thirdRefundNo = " + tradeInfo[14]);
            System.out.println("RefundNo = " + tradeInfo[15]);
        }
    }

    private static void unoinTest() {
        String payStr = "S22,48223300,00049993,136576,1113120626,622203*********6346,000000000500,5812,03,06201113435861365761,06,M20111304241255223000,01,,,000000000000,C000000000500,0301,,01,,000000,,,,,,822337058122370,,000000000000000,,000000000000,C000000000500,Jsgcoc0t,2410,000000000000,000000000000,00000000000,,5,,C000000000500,04 Z 206264450058";
        String refStr = "S30,48223300,00049993,758693,1113120826,622203*********6346,000000000500,5812,03,06201113435861365761,06,140e2011130411756112,01,136576,1113120626,000000000000,D000000000500,0301,,04,,000000,,,,,06201113435861365761,822337058122370,,000000000000000,,000000000000,D000000000500,Jsgcoc0t,M20111304241255223000|2410,000000000000,000000000000,00000000000,,5,M20111304241255223000,D000000000500,04 Z 206264450058";

        String paySFStr = "S22,48974500,00049993,479334,1101064726,621663*********0997,000000000400,5814,07,84201101244464769582,06,M2011010647263595323193000,01,,,D000000000002,C000000000398,0301,,01,,000000,,,,,,897370658143002,,000000000000000,,000000000000,C000000000398,2x6W4CLB,,C000000000044,000000000000,00000000000,,5,,C000000000400,04 Z 647261360428 1201202009109677";
        String[] paySplit = payStr.split(",");
        String[] refSplit = refStr.split(",");
        String[] paySFSplit = paySFStr.split(",");

        System.out.println(paySplit[11]);
        System.out.println(refSplit[11]);
        System.out.println(paySFSplit[11]);



    }
}

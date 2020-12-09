package com.xiyun.cxn.markdown;

import org.pegdown.PegDownProcessor;

import java.util.Map;

/**
 * @program javaany_
 * @description:
 * @author: cxn
 * @create: 2020/12/02 10:56
 */
public class MarkDownTest {


    private static final String rule = "#### {{index}}、商户ID: {{merchantId}}, 商户名: [{{merchantName}}]({{merchantAddr}})  ####\n";


    public static void main(String[] args) {

        String finalMsg = "#### **你好!** ###\n" + "#### 今天是个好天气" + " 同样也是为了定义一些通用的属性。####\n\n\n" + "#### 会在html内容外层加一个<div>标签. ####\n\n" + "可以在其中进行统一的宽高设置.  \n\n\n\n";


        String mssg ="#### 账期：2020-12-01 ####\n" +
                "\n" +
                "![](https://f2.xiyunerp.com/timg.jpeg)\n" +
                "### **禧云比第三方多: 5** ###\n" +

                "#### 1、商户ID: 4350, 商户名: [北京微信测���十五中/19919999291](https://pr.xiyunerp.com/#/finance/item?reportDate=2020-12-01&groupId=4350)  ####\n" +

                "  *[微信-直连]-单号:t20120101249891153000 \n" +

                "   *[微信-直连]-单号:t20120101249891153000 \n" +

                "   *[微信-直连]-单号:t20120101249891163000 \n" +

                "   *[微信-直连]-单号:t20120101249891253000 \n" +

                "   *[微信-直连]-单号:t20120101249891253000 \n" +

                "#### 2、商户ID: 4353, 商户名: [北京支付宝测试一中/13601261234](https://pr.xiyunerp.com/#/finance/item?reportDate=2020-12-01&groupId=4353)  ####\n" +

                "  *[支付宝-直连]-单号:t20120101249901133000_XY4493 \n" +

                " #### 3、商户ID: 4233, 商户名: [小泥鳅支付宝独立账号/17644431321](https://pr.xiyunerp.com/#/finance/item?reportDate=2020-12-01&groupId=4233)  ####\n" +

                "  *[支付宝-直连]-单号:t2201201261004305633000_XY4404 \n" +

                " #### 4、商户ID: 4355, 商户名: [支付宝最终回归/13601261235](https://pr.xiyunerp.com/#/finance/item?reportDate=2020-12-01&groupId=4355)  ####\n" +

                "  *[支付宝-直连]-单号:t20120100324091253000_XY4491 \n" +

                "   *[支付宝-直连]-单号:t20120100324091263000_XY4491 \n" +

                "   *[支付宝-直连]-单号:t20120100324091273000_XY4491 \n" +

                "   *[支付宝-直连]-单号:t20120100324091283000_XY4491 \n" +

                "   *[支付宝-直连]-单号:t20120100324091293000_XY4491 \n" +

                " ### **禧云比第三方少: 1** ###";
        PegDownProcessor pdp = new PegDownProcessor(Integer.MAX_VALUE);

        String htmlContent = pdp.markdownToHtml(mssg);
        System.out.println(htmlContent);



    }



}



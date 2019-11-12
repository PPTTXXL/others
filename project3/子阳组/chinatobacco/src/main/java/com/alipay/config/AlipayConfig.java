package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101500694047";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCf5zXlwnXZHOzXFMYzxa6+s5IXeSs0UvkKhnyfAWCSogXQk5yDfZ6HbuHINLEHDw/LDyBgf7KPBkcqhmokiY/XVQU+we1Ohf+QghV1/qV8ekJZAM7H0X0HPM1QIEp2jMkyW3iP7kwlGK++F6zbMy82HAVW8Yw/2F+/bMXOlmvQW8z3NdqLetHyNwYrHC/uahTRFifr3GQwZxJ4+Qerb3VJtuBAesJ4V1MP56FHdJagrzxkdz2r+OkvFlAk1LwVJjZuI2NvZitMtUVzNK3dJmziAVt18BocdiZJ9FcUPnKCigSWVnWERrhnqWF953QKHnRiYNH3LRaL1roBEDj3omqVAgMBAAECggEAYecwitJ7UUlygWXIzN4WVdCgfBrGJy0+KgGZv8kaFe153fDi/Wcmbwmm1+vbD9Va+Br02eCVtRhE7naJ+oD3PwJhScF2yIMmrJXZCfu12vcINHJYKOPMx2ek1ZBPxzH/5gM3V/ixSm1I/PyF61f1ag3R/x+5nUWfqhaxLgHPVSxBiTwXApOzApDpGye8yaCXJo5BgdcwRRNlbR6J5teolyIYRS9z+3QybK3AFNacx11r1DPDLaVO3g/f/QQkJeJUUmAKlS8kupOygO5gzCs/di32ZOz2n8PK2iRX5QhiGyD/REJdb/cCspx/0PcZp70d3DsVUZCXURF1UAI+UZBlAQKBgQD+lplN6lOMHWV/aoUvBMk4oKH5ECibiZNs8ey9Kq3vKUJTlh3ezr4c3o3HdksFgzjAyvoFS8hEIMKGcTd7EHT8CI7x+7J+osf9R580/fyCpJcxTWRWzEkyQwrcXBBgn71yaRB6qOyBnxMSAFmvcO3MczpfjhcE1VYEPJN8+lh84QKBgQCgyjOI2S1coaOutzF5Ycqa8OnuHUU+sOIzy8xOjUAn5z+p9C4aumBhWoaYOlZHl93Klc3du926bsLcl9xhz5U7ViajkI2zq7Khhe4xXL7WSYcGEWdcsbV6roEkZ0FoDldeockWv2fTEWzdKn6N545NgnTE/OI1LLEhjZJl/VKQNQKBgQDZJOZZWJYuGhyqEtbKBdEDJa9BWhDoqO0/rRD5P9/e71gNJysPEVOCGCjhifnvF79eYUHjJoIH6dFBDmv94UmGdl5F8yKJdJoTY/VdI40ueOgkOxhsGA4OerRWw4eMgnL5lLdjh5VB8cY4Qmg8hZuuGFIfknf7vWKCdpBttrGmwQKBgGkrGH4gHy2BhEBZDoEoV470mO3oM0yIAcyDNoUCmr3+4YNWdXmCAlxrC7IyJhD54lYJmfe4U5UHsWj742gOkLuY4/kEKcslONexdFTRJvmeajSr2YGlsuAll86pwvw+tSLui0rXsx85PI2Ep/ZFSKyl8Z6PEZ5aNxmNMf6HrSMpAoGAQSL484jxPPvc7VtNCw0jCFBBWzWFqSqDEaGROIhm7YxezNUPAriBoBDyq0+cYCysbZrizz9G3G8OHCRVos+DqGkUZ12ojxF4iLPbD1gqiZf5b8cWJ66dTLZmSqaF7wUynjX8kx5KNgVtiSB1tk6ZbP5IO3ai+iqnPlfByOR6lOU=";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAoKJhA+d5taXW3JGm5plOURXbpCEoHDv64sru1+61mOfgFucUDGuX+wDy909X/WfvBEIUuokXaYV0Wrz2iYlIJd7ZS7hLxgwSu5L9Uj89mqo/LqGy813vt7RIVGmqiu31Jvf3PGVlUDFjGlL9tqZ+6E/H+c9lvLc/lpKz89vlZbSZmMpG7TtgXz7M4isWsliKesEA3fQmqpaH17P7eBTFqsYsETZK67JkeNJrrZInyAgFkzXyWgGyxlylNDI4mZ3LR1a8R0eIPBls6KZ4pOqwp70JeejFP7p217ZDqrKIjj/KaIzrcCKVsEAedXVOUKajsZyb5xeOwOWA7MbIebfEawIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://2752j911v4.wicp.vip/chinatobacco/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://2752j911v4.wicp.vip/chinatobacco/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "D:\\Alipaylog";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


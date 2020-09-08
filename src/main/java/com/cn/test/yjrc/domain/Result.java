package com.cn.test.yjrc.domain;

/**
 * @author wangdakai
 */
public class Result {

    public static String unit_completed = "{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\": {\n" +
            "        \"isComplete\": 1,\n" +
            "        \"registrationCode\": \"ADF93LFA9\",\n" +
            "        \"unitInfo\": [\n" +
            "            {\n" +
            "                \"unitName\": \"首都信息发展股份有限公司\",\n" +
            "                \"unitCode\": \"9111XXXXXXXXXXXXXX\",\n" +
            "                \"unitType\": 1,\n" +
            "                \"district\": 110108,\n" +
            "                \"unitAddress\": \"知春路23号量子银座大厦12层\",\n" +
            "                \"handlerName\": \"张三\",\n" +
            "                \"handlerPhone\": \"13800138000\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static String unit_file= "{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\": {\n" +
            "        \"fileInfo\": [\n" +
            "            {\n" +
            "                \"fileName\": \"单位营业执照\",\n" +
            "                \"route\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586513991321&di=3e822bf7277f7229f3577df63985f4a0&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20190926%2F2269153090f14688bf5712def2df32d3.jpeg\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"fileName\": \"高新技术企业证书\",\n" +
            "                \"route\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586525553799&di=79dd1fbfb69d39bd3b9325bfe2b63c55&imgtype=0&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180727%2F6094ba6147b44aab8680a98fd7026766.jpeg\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";

    public static  String unit_basic="{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\": {\n" +
            "    \"unitInfo\": [\n" +
            "        {\n" +
            "            \"unitName\": \"首都信息发展股份有限公司\",\n" +
            "            \"unitCode\": \"9111XXXXXXXXXXXXXX\",\n" +
            "            \"registeredCapital\": 1000,\n" +
            "            \"registeredCapitalType\": 1,\n" +
            "            \"legalRepresentative\": \"李四\",\n" +
            "            \"establishmentDate\": \"1998-01-23\",\n" +
            "            \"unitType\": 2,\n" +
            "            \"district\": 110108,\n" +
            "            \"unitAddress\": \"知春路23号量子银座大厦12层\",\n" +
            "            \"scope\": \"提供信息源服务；电子商务服务；网络互联、电子计算机设备及软硬件、通信软硬件产品的技术开发、技术咨询、技术服务、技术培训；信息及网络系统集成及代理；销售电子计算机外部设备；药品招标代理；自营和代理各类商品及技术的进出口业务，但国家限定公司经营或禁止出口的商品及技术除外；专业承包。（其中“专业承包”需要取得专项审批之后，方可经营。）\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"unitQualifiedInfo\": [\n" +
            "        {\n" +
            "            \"unitNature\": 1,\n" +
            "            \"organName\": \"北京市科学技术委员会、北京市财政局、北京市国家税务局、北京市地方税务局\",\n" +
            "            \"certificateNumber\": \"GR2017110XXXXX\",\n" +
            "            \"certificateDate\": \"2017-10-25\"\n" +
            "        }\n" +
            "    ],\n" +
            "    \"unitHandlerInfo\": [\n" +
            "        {\n" +
            "            \"handlerName\": \"张三\",\n" +
            "            \"handlerPhone\": \"13800138000\",\n" +
            "            \"emergencyName\": \"李四\",\n" +
            "            \"emergencyPhone\": \"15000000000\"\n" +
            "        }\n" +
            "    ]"+
            "}" +
            "}";

    public static String getNotifications = "{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\": " +
//            "{\n \"policyNotice\":" +
            "[\n" +
            "            {\n" +
            "                \"noticeTitle\": \"北京市引进人才管理办法（试行）\",\n" +
            "                \"noticeDate\": \"【2018-10-16】\",\n" +
            "                \"route\": \"\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"noticeTitle\": \"2016年北京人才发展重要政策文件目录\",\n" +
            "                \"noticeDate\": \"【2016-09-16】\",\n" +
            "                \"route\": \"\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"noticeTitle\": \"北京市工作居住证管理办法\",\n" +
            "                \"noticeDate\": \"【2016-08-16】\",\n" +
            "                \"route\": \"\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"noticeTitle\": \"关于组织填写2015年“千人计划”申报材料的通知\",\n" +
            "                \"noticeDate\": \"【2015-10-16】\",\n" +
            "                \"route\": \"\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"noticeTitle\": \"关于发布《2015年度北京市引进海外高层次人才专项计划》的公告\",\n" +
            "                \"noticeDate\": \"【2015-09-16】\",\n" +
            "                \"route\": \"\"\n" +
            "            },\n" +
            "            {\n" +
            "                \"noticeTitle\": \"关于开展2015年度北京市海外高层次人才引进专项计划申报工作的通知\",\n" +
            "                \"noticeDate\": \"【2015-08-16】\",\n" +
            "                \"route\": \"\"\n" +
            "            }\n" +
            "        ]\n" +
//            " }\n"+
            "}";



    /**====================  个人   ================================*/

    public static String person_completed="{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\": {\n" +
            "        \"isComplete\": 1,\n" +
            "        \"personalInfo\": [\n" +
            "            {\n" +
            "                \"perName\": \"测试用户\",\n" +
            "                \"perPhone\": \"13800138000\",\n" +
            "                \"perType\": 1,\n" +
            "                \"perCode\": \"110108198800000000\"\n" +
            "            }\n" +
            "        ]\n" +
            "    }\n" +
            "}";


    public static String person_file ="{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\":\n" +
            "            {\n" +
            "                \"fileName\": \"职称证书\",\n" +
            "                \"route\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1582388678739&di=6fe7e7c2fe9e00c32d04c458c9ba8a6c&imgtype=0&src=http%3A%2F%2Ff.hiphotos.baidu.com%2Fbaike%2Fc0%253Dbaike60%252C5%252C5%252C60%252C20%2Fsign%3D8fb5bd3e0b24ab18f41be96554938da8%2F0d338744ebf81a4c8cdcb4d1d52a6059252da638.jpg\"\n" +
            "            }\n" +
            "\n" +
            "}";
    public static String person_baisc="{\n" +
            " \"personalInfo\": [{\n" +
            "  \"perName\": \"测试用户\",\n" +
            "  \"gender\": 0,\n" +
            "  \"perPhone\": \"13800138000\",\n" +
            "  \"nation\": 1,\n" +
            "  \"political\": 0,\n" +
            "  \"perType\": 0,\n" +
            "  \"perCode\": \"110108198800000000\",\n" +
            "  \"province\": 11,\n" +
            "  \"marital\": 1,\n" +
            "  \"city\": 110101,\n" +
            "  \"district\": 110108,\n" +
            "  \"address\": \"XXX路X号院XX号楼一单元5层502门\"\n" +
            " }],\n" +
            " \"educationInfo\": {\n" +
            "  \"xlData\": [{\n" +
            "   \"xlState\": 40,\n" +
            "   \"xlCode\": \"XL0123456789\"\n" +
            "  }],\n" +
            "  \"xwData\": [{\n" +
            "   \"xwState\": 20,\n" +
            "   \"xwCode\": \"XW0123456789\"\n" +
            "  }],\n" +
            "  \"zcData\": [{\n" +
            "   \"zcState\": 1,\n" +
            "   \"zcInfo\": [{\n" +
            "    \"zcName\": \"高级工程师\",\n" +
            "    \"zcOrgan\": \"北京市人力资源和社会保障局\",\n" +
            "    \"zcCode\": \"zc1234567\"\n" +
            "   }]\n" +
            "  }]\n" +
            " },\n" +
            " \"workExperience\": [{\n" +
            "   \"startDate\": \"2017-03-01\",\n" +
            "   \"endDate\": \"2020-12-31\",\n" +
            "   \"unitName\": \"首都信息发展股份有限公司\",\n" +
            "   \"location\": 11,\n" +
            "   \"duty\": \"项目经理\"\n" +
            "  },\n" +
            "  {\n" +
            "   \"startDate\": \"2013-09-01\",\n" +
            "   \"endDate\": \"2017-03-01\",\n" +
            "   \"unitName\": \"北京科技公司\",\n" +
            "   \"location\": 11,\n" +
            "   \"duty\": \"工程师\"\n" +
            "  }\n" +
            " ]\n" +
            "}";


    public static String person_Notifications = "{\n" +
            "    \"status\": 200,\n" +
            "    \"msg\": \"success\",\n" +
            "    \"result\":  {\n"+
            " \"policyNotice\": [\n" +
            "    {\n" +
            "        \"noticeTitle\": \"北京市引进人才管理办法（试行）\",\n" +
            "            \"noticeDate\": \"【2019-10-16】\",\n" +
            "            \"route\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"noticeTitle\": \"2016年北京人才发展重要政策文件目录\",\n" +
            "            \"noticeDate\": \"【2016-07-21】\",\n" +
            "            \"route\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "        \"noticeTitle\": \"关于开展2015年度北京市海外高层次人才引进专项计划申报工作的通知\",\n" +
            "            \"noticeDate\": \"【2015-08-16】\",\n" +
            "            \"route\": \"\"\n" +
            "    }\n" +
            "    ]\n"+
            "}\n"+
            "}\n";




}

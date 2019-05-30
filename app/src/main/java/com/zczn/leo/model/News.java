package com.zczn.leo.model;

import java.util.List;

/**
 * @author LiuChenGuang
 * @Email liuchenguang0516@163.com
 * @description: TODO
 * @date :2019/5/20 15:35
 */
public class News {
    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"566b5ba92050331159ffce409a992f51","title":"属兔人：一生的克星，一定要远离，能害你一生的人！","date":"2019-05-20 14:17","category":"头条","author_name":"星星的低语","url":"http://mini.eastday.com/mobile/190520141726455.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_1_mwpm_03200403.jpg"},{"uniquekey":"134e3a4d7b9a2c5cf295a2e8d46982eb","title":"地面部队做好部署准备？伊拉克战争前情景再现？美军真有大动作？","date":"2019-05-20 14:14","category":"头条","author_name":"东方头条 军事亮评","url":"http://mini.eastday.com/mobile/190520141429870.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190520/2019052014_4d81ef21dd764a3e871011495de2e95d_7364_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190520/2019052014_a7ce452b84b049efba6256ef6118bb6d_7572_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190520/2019052014_bfad3ea393ee4c5891ae1c6e13ce4f41_5877_mwpm_03200403.jpg"},{"uniquekey":"d370c96ec028e7d5b305e618620ac6f0","title":"也门冲突再起，胡赛武装和也门政府军将成为中东系列争斗的新工具","date":"2019-05-20 14:08","category":"头条","author_name":"东方头条 123军情观察室","url":"http://mini.eastday.com/mobile/190520140842202.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/2019052014_70ff64e24a704b70903bb421491f4835_1562_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/2019052014_8da6674b0fa64933868106264384676f_9163_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/2019052014_d1d269ce9ce549419338db3722b26ce5_4533_mwpm_03200403.jpg"},{"uniquekey":"59e2b3457fa9051ea80bc67e3bcfb770","title":"宋朝赵官家和大明朱皇帝的家族遗传性格分析","date":"2019-05-20 14:07","category":"头条","author_name":"燕赵节度使","url":"http://mini.eastday.com/mobile/190520140702359.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/20190520140702_8da054e76281d5aa1bc46852d19b4d09_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/20190520140702_8da054e76281d5aa1bc46852d19b4d09_16_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/20190520140702_8da054e76281d5aa1bc46852d19b4d09_2_mwpm_03200403.jpg"},{"uniquekey":"68b2bf82861b234e056223b4e0d36e3f","title":"小伙用竹子做高跟鞋送女友 网友：最甜的520礼物","date":"2019-05-20 14:05","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/190520140555965.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/20190520140555_8234ca02bcd671f65133a5f6b9c76399_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/20190520140555_8234ca02bcd671f65133a5f6b9c76399_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/20190520140555_8234ca02bcd671f65133a5f6b9c76399_3_mwpm_03200403.jpg"},{"uniquekey":"e1c5bcbe5f1286da2f2f2e691c7fda44","title":"高考临近\u201c聪明药\u201d成香饽饽？聪明真能靠吃药吗？","date":"2019-05-20 14:05","category":"头条","author_name":"南海网","url":"http://mini.eastday.com/mobile/190520140532599.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/20190520140532_a6f729e1d9bc9e8277eb6073d6ee3df2_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/20190520140532_a6f729e1d9bc9e8277eb6073d6ee3df2_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/20190520140532_a6f729e1d9bc9e8277eb6073d6ee3df2_2_mwpm_03200403.jpg"},{"uniquekey":"736986c5a5b18aaf1db008c067932775","title":"如何挑选钻戒？男生不知这些小心思，注定你是单身狗！","date":"2019-05-20 14:05","category":"头条","author_name":"乐维斯","url":"http://mini.eastday.com/mobile/190520140512395.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/2019052014_84d457c60f474c7198b077163c17d5bd_6955_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/2019052014_530655e099dd4ca1bf56a9128b711c90_9356_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/2019052014_5dc208f1d20041d88dc406913563b419_2404_cover_mwpm_03200403.jpg"},{"uniquekey":"09f9fc09ddc1372bfa2ee59e138bc76f","title":"10种驱蚊花卉，任意养几盆在家里，蚊虫不敢来，效果超过蚊香","date":"2019-05-20 14:04","category":"头条","author_name":"园艺生活之家","url":"http://mini.eastday.com/mobile/190520140450392.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/2019052014_0c0cf865953e465298a8b609d33a0114_4469_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/2019052014_e495cc7060ca44a1bdfe7e4412c3b86d_8705_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/2019052014_45735a7c90fc434aa7b919f1dc265d7c_0209_cover_mwpm_03200403.jpg"},{"uniquekey":"e2674d7112624c78710e18b9bfda1c89","title":"街拍：美不胜收的小姐姐，一件蓝色一字肩连衣裙，时尚青春靓丽美","date":"2019-05-20 13:58","category":"头条","author_name":"娱乐大咖咖咖","url":"http://mini.eastday.com/mobile/190520135841398.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/2019052013_317b7999741b4fca91b7d79814f6aeae_9143_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/2019052013_82330a6f011c4f03ad9f6ba8768f89e5_9397_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/2019052013_4c39cc24fbda4613aa49cd574bd2913d_0030_cover_mwpm_03200403.jpg"},{"uniquekey":"18127d4c977f223a990ab1364ed7ea51","title":"公安局设在景区进去办事要先买门票？警方回应","date":"2019-05-20 13:58","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190520135812038.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190520/20190520135812_acfc1d4dc0a8574aace80aa2b9e2e9e1_1_mwpm_03200403.jpg"},{"uniquekey":"5b0ee953891d17489beae2c673cc5a06","title":"\u201c背上兄弟\u201d玩快闪，倡导助残新风尚","date":"2019-05-20 13:57","category":"头条","author_name":"郑报融媒","url":"http://mini.eastday.com/mobile/190520135742451.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/20190520135742_09cd747504ff101b8729f0f11c8b53db_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/20190520135742_09cd747504ff101b8729f0f11c8b53db_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/20190520135742_09cd747504ff101b8729f0f11c8b53db_2_mwpm_03200403.jpg"},{"uniquekey":"dde4f957e444c6724e40ade443296b7b","title":"对你不感冒 看都不会看你一眼的星座女","date":"2019-05-20 13:56","category":"头条","author_name":"第一星座网","url":"http://mini.eastday.com/mobile/190520135630916.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/20190520135630_52bf4530496236204513b52d89ce7e39_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/20190520135630_52bf4530496236204513b52d89ce7e39_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/20190520135630_52bf4530496236204513b52d89ce7e39_2_mwpm_03200403.jpg"},{"uniquekey":"3886f5724b65aad39fe723c498ce7fc8","title":"南昌地铁4号线新消息！又有多个站点开始主体开挖！","date":"2019-05-20 13:54","category":"头条","author_name":"乐居买房","url":"http://mini.eastday.com/mobile/190520135402258.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190520/20190520135402_583f406893df3beaff5c3d6f48124845_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190520/20190520135402_583f406893df3beaff5c3d6f48124845_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190520/20190520135402_583f406893df3beaff5c3d6f48124845_2_mwpm_03200403.jpg"},{"uniquekey":"1649552eb936d40a67690d017afe992f","title":"海南一女贼偷偷藏在商场无人角落 入夜偷6铺面","date":"2019-05-20 13:52","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190520135257596.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190520/20190520135257_f70a52cafa84d8e123e7e0c841ffdd1d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190520/20190520135257_f70a52cafa84d8e123e7e0c841ffdd1d_2_mwpm_03200403.jpg"},{"uniquekey":"4945be8c4c3f43f6fc337cae546032e2","title":"《奔跑吧》收视持续破二刷新纪录斩获四连冠！","date":"2019-05-20 13:52","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190520135204574.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190520/20190520135204_d5783e6b5fc2c19c0f765eb766fd5f10_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190520/20190520135204_52b1c284a728d626bd60e7dcee81bbac_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190520/20190520135204_008071dde8cca3eca2c3aa16f7004647_4_mwpm_03200403.jpg"},{"uniquekey":"aac1add3d34adb692538dd9b40c95a5a","title":"时尚女人：出游必备搭配，时尚显气质，清纯又靓丽！","date":"2019-05-20 13:51","category":"头条","author_name":"时尚小发","url":"http://mini.eastday.com/mobile/190520135101093.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/2019052013_720a3b38774d4320b5bc85fc327b76b2_9833_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/2019052013_9ee7aa5533ee4dddba4515f72a36fd7e_0569_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/2019052013_8005337699424db7afbb083b6f9519fd_1448_cover_mwpm_03200403.jpg"},{"uniquekey":"eaf21292ff027024120800bc2af0e7a7","title":"增资平台添新员 一国资系 P2P 注册资本增至 1 亿","date":"2019-05-20 13:50","category":"头条","author_name":"网贷之家","url":"http://mini.eastday.com/mobile/190520135026150.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190520/20190520135026_fa16e8ec8f0bf2e1beb2aa59d808bf46_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190520/20190520135026_fa16e8ec8f0bf2e1beb2aa59d808bf46_1_mwpm_03200403.jpg"},{"uniquekey":"0a127c85058d896f8c010071ff643d84","title":"春季为什么要排毒，春季如何有效排毒，女性如何排毒快","date":"2019-05-20 13:49","category":"头条","author_name":"快乐幸福生活","url":"http://mini.eastday.com/mobile/190520134928611.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/2019052013_3a2d657907c242ac8de0acb9f06a1c44_7609_mwpm_03200403.jpg"},{"uniquekey":"b82d722f2ba70b555e690c4705c9a420","title":"世界足坛史上的四大奇迹，1999年的欧冠是激动人心的奇迹时刻","date":"2019-05-20 13:47","category":"头条","author_name":"阿凡提的保时捷","url":"http://mini.eastday.com/mobile/190520134743482.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134743_bec901feea4ea973168d74eda40f8ad0_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134743_bec901feea4ea973168d74eda40f8ad0_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134743_bec901feea4ea973168d74eda40f8ad0_8_mwpm_03200403.jpg"},{"uniquekey":"4b4689a0aa762d9290508d7e666ce1ea","title":"2019中科院公众科学日：零距离感受地球第三极科学魅力","date":"2019-05-20 13:47","category":"头条","author_name":"中国西藏网","url":"http://mini.eastday.com/mobile/190520134721846.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134721_04894c63d6ec5a7a0abb931efb41a2fd_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134721_04894c63d6ec5a7a0abb931efb41a2fd_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134721_04894c63d6ec5a7a0abb931efb41a2fd_1_mwpm_03200403.jpg"},{"uniquekey":"c879148367153012598ad5084d72c3e3","title":"夏季，多吃素少吃肉，配上米饭超好吃，吃着比肉还要香","date":"2019-05-20 13:47","category":"头条","author_name":"樂樂厨娘","url":"http://mini.eastday.com/mobile/190520134700074.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134700_b7f6c42bc4ed5f4eac89c40d81ec2ff8_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134700_b7f6c42bc4ed5f4eac89c40d81ec2ff8_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134700_b7f6c42bc4ed5f4eac89c40d81ec2ff8_10_mwpm_03200403.jpg"},{"uniquekey":"fec60b15ef8faf528bfc6874ee9160f2","title":"王者荣耀：打野格局分析，孙悟空魅力十足，李白颜值与实力并存","date":"2019-05-20 13:46","category":"头条","author_name":"大飞和小哈","url":"http://mini.eastday.com/mobile/190520134648715.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/20190520134648_03ef3feb563382b04c2dbca74f1a0a00_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/20190520134648_03ef3feb563382b04c2dbca74f1a0a00_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/20190520134648_03ef3feb563382b04c2dbca74f1a0a00_2_mwpm_03200403.jpg"},{"uniquekey":"214c3881e4f6068fb06eb4f56ebf6ba2","title":"美国两位小将百米飚出9秒86，博尔特之后世界短跑就看他们了","date":"2019-05-20 13:46","category":"头条","author_name":"小白说田径","url":"http://mini.eastday.com/mobile/190520134616816.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190520/20190520134616_a0b9e3e7d9487fadd4f7f1d18ed8785e_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190520/20190520134616_a0b9e3e7d9487fadd4f7f1d18ed8785e_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190520/20190520134616_a0b9e3e7d9487fadd4f7f1d18ed8785e_3_mwpm_03200403.jpg"},{"uniquekey":"730be73924b9dcd166905a5b5f2a9588","title":"日产真豁出去了，国六＋5.6L油耗，一看价格，宝骏都要难卖了","date":"2019-05-20 13:42","category":"头条","author_name":"隔壁老王说车","url":"http://mini.eastday.com/mobile/190520134256589.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/2019052013_1dba0cf3b8e54f27b222f62865cfd74e_1609_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/2019052013_16d55471882e4305874d80068862827e_9886_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/2019052013_6ea84d9a95924702b309ede2b76c4a6c_3288_mwpm_03200403.jpg"},{"uniquekey":"da82bee25080e7c6f41b997c44fa835c","title":"中共东莞市常平镇委员会委员到访东莞创客邦","date":"2019-05-20 13:42","category":"头条","author_name":"苏南网","url":"http://mini.eastday.com/mobile/190520134254565.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134254_110387c5c5d8860b80eb30fb5634e34d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134254_110387c5c5d8860b80eb30fb5634e34d_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134254_110387c5c5d8860b80eb30fb5634e34d_3_mwpm_03200403.jpg"},{"uniquekey":"f7f635084f2fbd6847279420e784fb41","title":"2019年12生肖的转运守护石，你知道吗？","date":"2019-05-20 13:42","category":"头条","author_name":"腾晶博尔","url":"http://mini.eastday.com/mobile/190520134229788.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/2019052013_c1efa17fab944a7daf7211fc90d1f77f_1402_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/2019052013_8a5a87b50cf94b54bd243e5688dadca2_8163_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/2019052013_60480cba71fc4424965ad389ba8212b2_6398_cover_mwpm_03200403.jpg"},{"uniquekey":"41a667492ef8d0ff766eb4c9ea20c7ec","title":"耻辱收官逼齐祖5亿豪购？打包阿扎尔+姆巴佩+内马尔，再战巴萨！","date":"2019-05-20 13:40","category":"头条","author_name":"国际足球那些事","url":"http://mini.eastday.com/mobile/190520134037409.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190520/20190520134037_d70b71c1c3dd0ff42b285bb7f00dc094_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190520/20190520134037_d70b71c1c3dd0ff42b285bb7f00dc094_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190520/20190520134037_d70b71c1c3dd0ff42b285bb7f00dc094_3_mwpm_03200403.jpg"},{"uniquekey":"ed13a0a48e0df514fb797f0bca636f99","title":"汽车192种故障灯显示说明大全，新手司机收好了","date":"2019-05-20 13:38","category":"头条","author_name":"威帅车市","url":"http://mini.eastday.com/mobile/190520133815176.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/20190520133815_a0fa404ddd82f632f15052aa99ce78aa_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/20190520133815_a0fa404ddd82f632f15052aa99ce78aa_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/20190520133815_a0fa404ddd82f632f15052aa99ce78aa_11_mwpm_03200403.jpg"},{"uniquekey":"85ef076870ff4c1c97ac54514d6c7239","title":"笑话段子：在网上给女友买了一只箱子，送来的时候，发现颜色错了","date":"2019-05-20 13:38","category":"头条","author_name":"亿良搞笑","url":"http://mini.eastday.com/mobile/190520133810099.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/2019052008_5928ca99a3904c7182dd1690a684d490_7318_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/2019052008_279b9f2415fb45b999c2bd1a1b8e5b86_2158_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/2019052008_fc647775bca34e67a7a0e68d952d46a6_7321_cover_mwpm_03200403.jpg"},{"uniquekey":"1752a48aae99b8124cda82b5f00245d0","title":"太迅速！当红小生求婚还不到半个月，又甜蜜官宣妻子顺利产子！","date":"2019-05-20 13:38","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/190520133800481.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/20190520133800_60ace381a12c28028fb3cf879d5b0e70_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/20190520133800_60ace381a12c28028fb3cf879d5b0e70_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/20190520133800_60ace381a12c28028fb3cf879d5b0e70_2_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"566b5ba92050331159ffce409a992f51","title":"属兔人：一生的克星，一定要远离，能害你一生的人！","date":"2019-05-20 14:17","category":"头条","author_name":"星星的低语","url":"http://mini.eastday.com/mobile/190520141726455.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_1_mwpm_03200403.jpg"},{"uniquekey":"134e3a4d7b9a2c5cf295a2e8d46982eb","title":"地面部队做好部署准备？伊拉克战争前情景再现？美军真有大动作？","date":"2019-05-20 14:14","category":"头条","author_name":"东方头条 军事亮评","url":"http://mini.eastday.com/mobile/190520141429870.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190520/2019052014_4d81ef21dd764a3e871011495de2e95d_7364_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190520/2019052014_a7ce452b84b049efba6256ef6118bb6d_7572_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190520/2019052014_bfad3ea393ee4c5891ae1c6e13ce4f41_5877_mwpm_03200403.jpg"},{"uniquekey":"d370c96ec028e7d5b305e618620ac6f0","title":"也门冲突再起，胡赛武装和也门政府军将成为中东系列争斗的新工具","date":"2019-05-20 14:08","category":"头条","author_name":"东方头条 123军情观察室","url":"http://mini.eastday.com/mobile/190520140842202.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/2019052014_70ff64e24a704b70903bb421491f4835_1562_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/2019052014_8da6674b0fa64933868106264384676f_9163_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/2019052014_d1d269ce9ce549419338db3722b26ce5_4533_mwpm_03200403.jpg"},{"uniquekey":"59e2b3457fa9051ea80bc67e3bcfb770","title":"宋朝赵官家和大明朱皇帝的家族遗传性格分析","date":"2019-05-20 14:07","category":"头条","author_name":"燕赵节度使","url":"http://mini.eastday.com/mobile/190520140702359.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/20190520140702_8da054e76281d5aa1bc46852d19b4d09_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/20190520140702_8da054e76281d5aa1bc46852d19b4d09_16_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/20190520140702_8da054e76281d5aa1bc46852d19b4d09_2_mwpm_03200403.jpg"},{"uniquekey":"68b2bf82861b234e056223b4e0d36e3f","title":"小伙用竹子做高跟鞋送女友 网友：最甜的520礼物","date":"2019-05-20 14:05","category":"头条","author_name":"看看新闻网","url":"http://mini.eastday.com/mobile/190520140555965.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/20190520140555_8234ca02bcd671f65133a5f6b9c76399_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/20190520140555_8234ca02bcd671f65133a5f6b9c76399_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/20190520140555_8234ca02bcd671f65133a5f6b9c76399_3_mwpm_03200403.jpg"},{"uniquekey":"e1c5bcbe5f1286da2f2f2e691c7fda44","title":"高考临近\u201c聪明药\u201d成香饽饽？聪明真能靠吃药吗？","date":"2019-05-20 14:05","category":"头条","author_name":"南海网","url":"http://mini.eastday.com/mobile/190520140532599.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/20190520140532_a6f729e1d9bc9e8277eb6073d6ee3df2_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/20190520140532_a6f729e1d9bc9e8277eb6073d6ee3df2_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/20190520140532_a6f729e1d9bc9e8277eb6073d6ee3df2_2_mwpm_03200403.jpg"},{"uniquekey":"736986c5a5b18aaf1db008c067932775","title":"如何挑选钻戒？男生不知这些小心思，注定你是单身狗！","date":"2019-05-20 14:05","category":"头条","author_name":"乐维斯","url":"http://mini.eastday.com/mobile/190520140512395.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/2019052014_84d457c60f474c7198b077163c17d5bd_6955_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/2019052014_530655e099dd4ca1bf56a9128b711c90_9356_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/2019052014_5dc208f1d20041d88dc406913563b419_2404_cover_mwpm_03200403.jpg"},{"uniquekey":"09f9fc09ddc1372bfa2ee59e138bc76f","title":"10种驱蚊花卉，任意养几盆在家里，蚊虫不敢来，效果超过蚊香","date":"2019-05-20 14:04","category":"头条","author_name":"园艺生活之家","url":"http://mini.eastday.com/mobile/190520140450392.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/2019052014_0c0cf865953e465298a8b609d33a0114_4469_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/2019052014_e495cc7060ca44a1bdfe7e4412c3b86d_8705_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/2019052014_45735a7c90fc434aa7b919f1dc265d7c_0209_cover_mwpm_03200403.jpg"},{"uniquekey":"e2674d7112624c78710e18b9bfda1c89","title":"街拍：美不胜收的小姐姐，一件蓝色一字肩连衣裙，时尚青春靓丽美","date":"2019-05-20 13:58","category":"头条","author_name":"娱乐大咖咖咖","url":"http://mini.eastday.com/mobile/190520135841398.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/2019052013_317b7999741b4fca91b7d79814f6aeae_9143_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/2019052013_82330a6f011c4f03ad9f6ba8768f89e5_9397_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/2019052013_4c39cc24fbda4613aa49cd574bd2913d_0030_cover_mwpm_03200403.jpg"},{"uniquekey":"18127d4c977f223a990ab1364ed7ea51","title":"公安局设在景区进去办事要先买门票？警方回应","date":"2019-05-20 13:58","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/190520135812038.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190520/20190520135812_acfc1d4dc0a8574aace80aa2b9e2e9e1_1_mwpm_03200403.jpg"},{"uniquekey":"5b0ee953891d17489beae2c673cc5a06","title":"\u201c背上兄弟\u201d玩快闪，倡导助残新风尚","date":"2019-05-20 13:57","category":"头条","author_name":"郑报融媒","url":"http://mini.eastday.com/mobile/190520135742451.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/20190520135742_09cd747504ff101b8729f0f11c8b53db_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/20190520135742_09cd747504ff101b8729f0f11c8b53db_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/20190520135742_09cd747504ff101b8729f0f11c8b53db_2_mwpm_03200403.jpg"},{"uniquekey":"dde4f957e444c6724e40ade443296b7b","title":"对你不感冒 看都不会看你一眼的星座女","date":"2019-05-20 13:56","category":"头条","author_name":"第一星座网","url":"http://mini.eastday.com/mobile/190520135630916.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/20190520135630_52bf4530496236204513b52d89ce7e39_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/20190520135630_52bf4530496236204513b52d89ce7e39_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/20190520135630_52bf4530496236204513b52d89ce7e39_2_mwpm_03200403.jpg"},{"uniquekey":"3886f5724b65aad39fe723c498ce7fc8","title":"南昌地铁4号线新消息！又有多个站点开始主体开挖！","date":"2019-05-20 13:54","category":"头条","author_name":"乐居买房","url":"http://mini.eastday.com/mobile/190520135402258.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190520/20190520135402_583f406893df3beaff5c3d6f48124845_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190520/20190520135402_583f406893df3beaff5c3d6f48124845_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190520/20190520135402_583f406893df3beaff5c3d6f48124845_2_mwpm_03200403.jpg"},{"uniquekey":"1649552eb936d40a67690d017afe992f","title":"海南一女贼偷偷藏在商场无人角落 入夜偷6铺面","date":"2019-05-20 13:52","category":"头条","author_name":"北青网","url":"http://mini.eastday.com/mobile/190520135257596.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190520/20190520135257_f70a52cafa84d8e123e7e0c841ffdd1d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190520/20190520135257_f70a52cafa84d8e123e7e0c841ffdd1d_2_mwpm_03200403.jpg"},{"uniquekey":"4945be8c4c3f43f6fc337cae546032e2","title":"《奔跑吧》收视持续破二刷新纪录斩获四连冠！","date":"2019-05-20 13:52","category":"头条","author_name":"中国网","url":"http://mini.eastday.com/mobile/190520135204574.html","thumbnail_pic_s":"http://05imgmini.eastday.com/mobile/20190520/20190520135204_d5783e6b5fc2c19c0f765eb766fd5f10_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://05imgmini.eastday.com/mobile/20190520/20190520135204_52b1c284a728d626bd60e7dcee81bbac_6_mwpm_03200403.jpg","thumbnail_pic_s03":"http://05imgmini.eastday.com/mobile/20190520/20190520135204_008071dde8cca3eca2c3aa16f7004647_4_mwpm_03200403.jpg"},{"uniquekey":"aac1add3d34adb692538dd9b40c95a5a","title":"时尚女人：出游必备搭配，时尚显气质，清纯又靓丽！","date":"2019-05-20 13:51","category":"头条","author_name":"时尚小发","url":"http://mini.eastday.com/mobile/190520135101093.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/2019052013_720a3b38774d4320b5bc85fc327b76b2_9833_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/2019052013_9ee7aa5533ee4dddba4515f72a36fd7e_0569_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/2019052013_8005337699424db7afbb083b6f9519fd_1448_cover_mwpm_03200403.jpg"},{"uniquekey":"eaf21292ff027024120800bc2af0e7a7","title":"增资平台添新员 一国资系 P2P 注册资本增至 1 亿","date":"2019-05-20 13:50","category":"头条","author_name":"网贷之家","url":"http://mini.eastday.com/mobile/190520135026150.html","thumbnail_pic_s":"http://06imgmini.eastday.com/mobile/20190520/20190520135026_fa16e8ec8f0bf2e1beb2aa59d808bf46_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06imgmini.eastday.com/mobile/20190520/20190520135026_fa16e8ec8f0bf2e1beb2aa59d808bf46_1_mwpm_03200403.jpg"},{"uniquekey":"0a127c85058d896f8c010071ff643d84","title":"春季为什么要排毒，春季如何有效排毒，女性如何排毒快","date":"2019-05-20 13:49","category":"头条","author_name":"快乐幸福生活","url":"http://mini.eastday.com/mobile/190520134928611.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/2019052013_3a2d657907c242ac8de0acb9f06a1c44_7609_mwpm_03200403.jpg"},{"uniquekey":"b82d722f2ba70b555e690c4705c9a420","title":"世界足坛史上的四大奇迹，1999年的欧冠是激动人心的奇迹时刻","date":"2019-05-20 13:47","category":"头条","author_name":"阿凡提的保时捷","url":"http://mini.eastday.com/mobile/190520134743482.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134743_bec901feea4ea973168d74eda40f8ad0_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134743_bec901feea4ea973168d74eda40f8ad0_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134743_bec901feea4ea973168d74eda40f8ad0_8_mwpm_03200403.jpg"},{"uniquekey":"4b4689a0aa762d9290508d7e666ce1ea","title":"2019中科院公众科学日：零距离感受地球第三极科学魅力","date":"2019-05-20 13:47","category":"头条","author_name":"中国西藏网","url":"http://mini.eastday.com/mobile/190520134721846.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134721_04894c63d6ec5a7a0abb931efb41a2fd_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134721_04894c63d6ec5a7a0abb931efb41a2fd_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134721_04894c63d6ec5a7a0abb931efb41a2fd_1_mwpm_03200403.jpg"},{"uniquekey":"c879148367153012598ad5084d72c3e3","title":"夏季，多吃素少吃肉，配上米饭超好吃，吃着比肉还要香","date":"2019-05-20 13:47","category":"头条","author_name":"樂樂厨娘","url":"http://mini.eastday.com/mobile/190520134700074.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134700_b7f6c42bc4ed5f4eac89c40d81ec2ff8_7_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134700_b7f6c42bc4ed5f4eac89c40d81ec2ff8_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134700_b7f6c42bc4ed5f4eac89c40d81ec2ff8_10_mwpm_03200403.jpg"},{"uniquekey":"fec60b15ef8faf528bfc6874ee9160f2","title":"王者荣耀：打野格局分析，孙悟空魅力十足，李白颜值与实力并存","date":"2019-05-20 13:46","category":"头条","author_name":"大飞和小哈","url":"http://mini.eastday.com/mobile/190520134648715.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/20190520134648_03ef3feb563382b04c2dbca74f1a0a00_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/20190520134648_03ef3feb563382b04c2dbca74f1a0a00_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/20190520134648_03ef3feb563382b04c2dbca74f1a0a00_2_mwpm_03200403.jpg"},{"uniquekey":"214c3881e4f6068fb06eb4f56ebf6ba2","title":"美国两位小将百米飚出9秒86，博尔特之后世界短跑就看他们了","date":"2019-05-20 13:46","category":"头条","author_name":"小白说田径","url":"http://mini.eastday.com/mobile/190520134616816.html","thumbnail_pic_s":"http://07imgmini.eastday.com/mobile/20190520/20190520134616_a0b9e3e7d9487fadd4f7f1d18ed8785e_6_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07imgmini.eastday.com/mobile/20190520/20190520134616_a0b9e3e7d9487fadd4f7f1d18ed8785e_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07imgmini.eastday.com/mobile/20190520/20190520134616_a0b9e3e7d9487fadd4f7f1d18ed8785e_3_mwpm_03200403.jpg"},{"uniquekey":"730be73924b9dcd166905a5b5f2a9588","title":"日产真豁出去了，国六＋5.6L油耗，一看价格，宝骏都要难卖了","date":"2019-05-20 13:42","category":"头条","author_name":"隔壁老王说车","url":"http://mini.eastday.com/mobile/190520134256589.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/2019052013_1dba0cf3b8e54f27b222f62865cfd74e_1609_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/2019052013_16d55471882e4305874d80068862827e_9886_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/2019052013_6ea84d9a95924702b309ede2b76c4a6c_3288_mwpm_03200403.jpg"},{"uniquekey":"da82bee25080e7c6f41b997c44fa835c","title":"中共东莞市常平镇委员会委员到访东莞创客邦","date":"2019-05-20 13:42","category":"头条","author_name":"苏南网","url":"http://mini.eastday.com/mobile/190520134254565.html","thumbnail_pic_s":"http://03imgmini.eastday.com/mobile/20190520/20190520134254_110387c5c5d8860b80eb30fb5634e34d_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://03imgmini.eastday.com/mobile/20190520/20190520134254_110387c5c5d8860b80eb30fb5634e34d_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://03imgmini.eastday.com/mobile/20190520/20190520134254_110387c5c5d8860b80eb30fb5634e34d_3_mwpm_03200403.jpg"},{"uniquekey":"f7f635084f2fbd6847279420e784fb41","title":"2019年12生肖的转运守护石，你知道吗？","date":"2019-05-20 13:42","category":"头条","author_name":"腾晶博尔","url":"http://mini.eastday.com/mobile/190520134229788.html","thumbnail_pic_s":"http://02imgmini.eastday.com/mobile/20190520/2019052013_c1efa17fab944a7daf7211fc90d1f77f_1402_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02imgmini.eastday.com/mobile/20190520/2019052013_8a5a87b50cf94b54bd243e5688dadca2_8163_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02imgmini.eastday.com/mobile/20190520/2019052013_60480cba71fc4424965ad389ba8212b2_6398_cover_mwpm_03200403.jpg"},{"uniquekey":"41a667492ef8d0ff766eb4c9ea20c7ec","title":"耻辱收官逼齐祖5亿豪购？打包阿扎尔+姆巴佩+内马尔，再战巴萨！","date":"2019-05-20 13:40","category":"头条","author_name":"国际足球那些事","url":"http://mini.eastday.com/mobile/190520134037409.html","thumbnail_pic_s":"http://08imgmini.eastday.com/mobile/20190520/20190520134037_d70b71c1c3dd0ff42b285bb7f00dc094_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08imgmini.eastday.com/mobile/20190520/20190520134037_d70b71c1c3dd0ff42b285bb7f00dc094_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08imgmini.eastday.com/mobile/20190520/20190520134037_d70b71c1c3dd0ff42b285bb7f00dc094_3_mwpm_03200403.jpg"},{"uniquekey":"ed13a0a48e0df514fb797f0bca636f99","title":"汽车192种故障灯显示说明大全，新手司机收好了","date":"2019-05-20 13:38","category":"头条","author_name":"威帅车市","url":"http://mini.eastday.com/mobile/190520133815176.html","thumbnail_pic_s":"http://01imgmini.eastday.com/mobile/20190520/20190520133815_a0fa404ddd82f632f15052aa99ce78aa_4_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01imgmini.eastday.com/mobile/20190520/20190520133815_a0fa404ddd82f632f15052aa99ce78aa_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01imgmini.eastday.com/mobile/20190520/20190520133815_a0fa404ddd82f632f15052aa99ce78aa_11_mwpm_03200403.jpg"},{"uniquekey":"85ef076870ff4c1c97ac54514d6c7239","title":"笑话段子：在网上给女友买了一只箱子，送来的时候，发现颜色错了","date":"2019-05-20 13:38","category":"头条","author_name":"亿良搞笑","url":"http://mini.eastday.com/mobile/190520133810099.html","thumbnail_pic_s":"http://00imgmini.eastday.com/mobile/20190520/2019052008_5928ca99a3904c7182dd1690a684d490_7318_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00imgmini.eastday.com/mobile/20190520/2019052008_279b9f2415fb45b999c2bd1a1b8e5b86_2158_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00imgmini.eastday.com/mobile/20190520/2019052008_fc647775bca34e67a7a0e68d952d46a6_7321_cover_mwpm_03200403.jpg"},{"uniquekey":"1752a48aae99b8124cda82b5f00245d0","title":"太迅速！当红小生求婚还不到半个月，又甜蜜官宣妻子顺利产子！","date":"2019-05-20 13:38","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/190520133800481.html","thumbnail_pic_s":"http://04imgmini.eastday.com/mobile/20190520/20190520133800_60ace381a12c28028fb3cf879d5b0e70_8_mwpm_03200403.jpg","thumbnail_pic_s02":"http://04imgmini.eastday.com/mobile/20190520/20190520133800_60ace381a12c28028fb3cf879d5b0e70_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://04imgmini.eastday.com/mobile/20190520/20190520133800_60ace381a12c28028fb3cf879d5b0e70_2_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * uniquekey : 566b5ba92050331159ffce409a992f51
             * title : 属兔人：一生的克星，一定要远离，能害你一生的人！
             * date : 2019-05-20 14:17
             * category : 头条
             * author_name : 星星的低语
             * url : http://mini.eastday.com/mobile/190520141726455.html
             * thumbnail_pic_s : http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_2_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://02imgmini.eastday.com/mobile/20190520/20190520141726_9367c2b496d803a89d2375d54c831d11_1_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}

package cn.itedus.lottery.test.vo2dto;

/**
 * @description: 引入包名转换
 * @author: 小傅哥，微信：fustack
 * @date: 2022/1/16
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest06 {

    public void test_vo2dto(cn.itedus.lottery.test.vo2dto.bbb.User user) {

        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserNickName(user.getUserNickName());
        userDTO.setUserHead(user.getUserHead());



    }

}

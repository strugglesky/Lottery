package cn.itedus.lottery.test.vo2dto;

import cn.itedus.lottery.test.vo2dto.bbb.User;
import org.springframework.beans.BeanUtils;

import java.util.List;

/**
 * @description: 普通对象转换
 * @author: 小傅哥，微信：fustack
 * @date: 2022/1/16
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class ApiTest01 {

    public void test_vo2dto(User user) {
        UserDTO userDTO = new UserDTO();

    }

    public void test_vo2dto(List<User> userList) {
        for (User user : userList) {
            UserDTO userDTO = new UserDTO();

            BeanUtils.copyProperties(user, userDTO);

        }
    }

    public void test_vo2dto() {
        User user = this.queryUserById();

        UserDTO userDTO = new UserDTO();
    }

    private User queryUserById() {
        return null;
    }

}

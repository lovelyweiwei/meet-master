package com.weiwei.project.service;

import com.weiwei.project.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * 用户服务测试
 *
 */
@SpringBootTest
class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    void testAddUser() {
        User user = new User();
        boolean result = userService.save(user);
        System.out.println(user.getId());
        Assertions.assertTrue(result);
    }

    @Test
    void testUpdateUser() {
        User user = new User();
        boolean result = userService.updateById(user);
        Assertions.assertTrue(result);
    }

    @Test
    void testDeleteUser() {
        boolean result = userService.removeById(1L);
        Assertions.assertTrue(result);
    }

    @Test
    void testGetUser() {
        User user = userService.getById(1L);
        Assertions.assertNotNull(user);
    }

    @Test
    void searchUsersByTags() {
        List<String> tagNameList = Arrays.asList("java", "python");
        List<User> users = userService.searchUsersByTags(tagNameList);
        Assert.assertNotNull(users);
    }

    //@Test
    //void userRegister() {
    //    String userAccount = "weiwei";
    //    String userPassword = "";
    //    String checkPassword = "123456";
    //    try {
    //        long result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //        userAccount = "yu";
    //        result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //        userAccount = "weiwei";
    //        userPassword = "123456";
    //        result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //        userAccount = "yu pi";
    //        userPassword = "12345678";
    //        result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //        checkPassword = "123456789";
    //        result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //        userAccount = "dogYupi";
    //        checkPassword = "12345678";
    //        result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //        userAccount = "weiwei";
    //        result = userService.userRegister(userAccount, userPassword, checkPassword);
    //        Assertions.assertEquals(-1, result);
    //    } catch (Exception e) {
    //
    //    }
    //}
}

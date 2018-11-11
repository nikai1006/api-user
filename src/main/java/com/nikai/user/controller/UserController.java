package com.nikai.user.controller;

import com.jiatui.spi.ServiceResponse;
import com.nikai.user.dto.User;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理接口
 *
 * @author nikai1006@126.com
 * @version 1.0.0
 * @domain USER
 */
@RestController
public class UserController {

    /**
     * 查询所有用户信息
     *
     * @return 用户列表
     * @service 查询所有用户信息
     * @scene 小程序
     * @type QUERY
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @GetMapping("/all-users/find")
    @ResponseBody
    public ServiceResponse<List<User>> queryAll() {
        return null;
    }

    /**
     * 分页查询所有用户信息
     *
     * @param start 起始位置
     * @param length 页大小
     * @return 用户列表
     * @service 分页查询所有用户信息
     * @scene 小程序
     * @type QUERY
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/users-by-page/find")
    @ResponseBody
    public ServiceResponse<Map<String, Object>> queryByPage(Integer start, Integer length) {
        return null;
    }


    /**
     * 根据用户ID查询所有用户信息
     *
     * @param id y用户ID
     * @return 用户列表
     * @service 根据用户ID查询所有用户信息
     * @scene 小程序
     * @type QUERY
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @GetMapping("/user-by-id/find")
    @ResponseBody
    public ServiceResponse<User> queryById(Long id) {
        return null;
    }

    /**
     * 新增用户
     *
     * @param user 用户信息
     * @return 新增结果
     * @service 新增用户
     * @scene 小程序
     * @type COMMAND
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/user/save")
    @ResponseBody
    public ServiceResponse<String> save(User user) {
        return null;
    }

    /**
     * 更新用户信息
     *
     * @param user 用户信息
     * @return 用户列表
     * @service 更新用户信息
     * @scene 小程序
     * @type COMMAND
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/user/modify")
    @ResponseBody
    public ServiceResponse<String> update(User user) {
        return null;
    }

    /**
     * 删除用户
     *
     * @param user 用户信息
     * @return 用户列表
     * @service 删除用户
     * @scene 小程序
     * @type COMMAND
     * @code 0#成功
     * @code 1#系统异常
     * @code 41003#参数失败
     * @code 2#操作繁忙
     */
    @PostMapping("/user/remove")
    @ResponseBody
    public ServiceResponse<String> delete(User user) {
        return null;
    }

}

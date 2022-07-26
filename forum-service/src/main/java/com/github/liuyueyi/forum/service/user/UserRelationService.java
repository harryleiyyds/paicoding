package com.github.liuyueyi.forum.service.user;

import com.github.liueyueyi.forum.api.model.vo.PageParam;
import com.github.liuyueyi.forum.service.comment.dto.UserFollowDTO;

import java.util.List;

/**
 * 用户关系Service接口
 *
 * @author louzai
 * @date 2022-07-20
 */
public interface UserRelationService {

    /**
     * 我关注的用户
     *
     * @param userId
     * @param pageParam
     * @return
     */
    List<UserFollowDTO> getUserFollowList(Long userId, PageParam pageParam);


    /**
     * 关注我的粉丝
     *
     * @param userId
     * @param pageParam
     * @return
     */
    List<UserFollowDTO> getUserFansList(Long userId, PageParam pageParam);



    /**
     * 删除用户关系
     *
     * @param id
     */
    void deleteUserRelationById(Long id);
}

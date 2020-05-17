package com.drhui.rabbit.user.mapper;

import com.drhui.rabbit.user.model.UmsMember;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}

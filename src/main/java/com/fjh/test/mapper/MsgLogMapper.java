package com.fjh.test.mapper;

import com.fjh.test.pojo.MsgLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MsgLogMapper {

    void insert(MsgLog msgLog);

    void updateStatus(MsgLog msgLog);

    List<MsgLog> selectTimeoutMsg();

    void updateTryCount(MsgLog msgLog);

    MsgLog selectByPrimaryKey(String msgId);

}

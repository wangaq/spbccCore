package com.spb.cc.spbccCore.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.spb.cc.spbccCore.entity.Channel;

@Repository
public interface ChannelMapper {
	
	Channel getChannelById(Integer id);

	public List<Channel> getChannelList();

	public int add(Channel Channel);

	public int update(@Param("id") Integer id, @Param("channel") Channel Channel);

	public int delete(Integer id);
}

package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.po.ItemsCustom;

public interface ItemsMapperCustom {
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
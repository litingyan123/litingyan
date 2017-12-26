package cn.itcast.ssm.servie;

import java.util.List;

import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.po.Users;
import cn.itcast.ssm.po.ItemsCustom;

public interface ItemService {

	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;

public ItemsCustom findListById(Integer id) throws Exception;

public void updateItems(Integer id ,ItemsCustom itemsCustom) throws Exception;
public void  deleteItems(int[] items_id,ItemsCustom itemsCustom);
public void updateAllItems(ItemsQueryVo itemsQueryVo);

}

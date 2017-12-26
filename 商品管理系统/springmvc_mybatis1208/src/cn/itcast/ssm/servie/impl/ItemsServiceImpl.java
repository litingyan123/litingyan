package cn.itcast.ssm.servie.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.ssm.exception.CustomException;
import cn.itcast.ssm.mapper.CheckLoginMapper;
import cn.itcast.ssm.mapper.ItemsMapper;
import cn.itcast.ssm.mapper.ItemsMapperCustom;
import cn.itcast.ssm.po.Items;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.po.Users;
import cn.itcast.ssm.servie.ItemService;
@Service
public class ItemsServiceImpl implements ItemService{
	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	@Autowired
	private ItemsMapper itemsMapper;
	
	
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		//ͨ��ItemsMapperCustom��ѯ���ݿ�
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

	
	public ItemsCustom findListById(Integer id) throws Exception {
		Items items=itemsMapper.selectByPrimaryKey(id);
	 if (items==null) {
		throw new CustomException("没有此商品，请重新修改");
	}
		ItemsCustom itemsCustom=null;
		if(items!=null){
			itemsCustom=new ItemsCustom();
			BeanUtils.copyProperties(items,itemsCustom );
		}
	
		return itemsCustom;
	}

	
	
	public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception {
	
		itemsCustom.setId(id);
		itemsMapper.updateByPrimaryKey(itemsCustom);
		
	}


	@Override
	public void deleteItems(int[] items_id, ItemsCustom itemsCustom) {
		
		for (int i = 0; i < items_id.length; i++) {
			
		
			itemsCustom.setId(items_id[i]);
			itemsMapper.deleteByPrimaryKey(items_id[i]);
		}
		
	}


	@Override
	public void updateAllItems(ItemsQueryVo itemsQueryVo) {
		   List<ItemsCustom> list=itemsQueryVo.getItemsList();
		   for (int i = 0; i < list.size(); i++) {
			            /*itemsQueryVo.getItemsCustom().   setId(list.get(i).getId());*/
			           /*System.out.println( itemsQueryVo.getItemsCustom().getId());*/
			           ItemsCustom sCustom=list.get(i);
			           System.out.println(sCustom);
			            itemsMapper.updateByPrimaryKey(list.get(i));
			            
		}
		   
		   
		
	}


	
	

}

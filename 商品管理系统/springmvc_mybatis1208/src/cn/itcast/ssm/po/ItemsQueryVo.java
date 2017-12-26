package cn.itcast.ssm.po;

import java.util.List;

import org.apache.catalina.User;

public class ItemsQueryVo {
	private Items items;
	private ItemsCustom itemsCustom;
	//private UserCustom userCustom;
	//此下的list用于接受批量商品修改的数据
	private List<ItemsCustom> itemsList;
	public List<ItemsCustom> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<ItemsCustom> itemsList) {
		this.itemsList = itemsList;
	}
	public Items getItems() {
		return items;
	}
	public void setItems(Items items) {
		this.items = items;
	}
	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}
	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}

}

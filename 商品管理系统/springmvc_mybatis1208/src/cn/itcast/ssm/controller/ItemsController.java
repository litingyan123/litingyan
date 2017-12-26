package cn.itcast.ssm.controller;


import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.remoting.RemoteTimeoutException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.exception.CustomException;
import cn.itcast.ssm.po.ItemsCustom;
import cn.itcast.ssm.po.ItemsQueryVo;
import cn.itcast.ssm.servie.ItemService;

@Controller
@RequestMapping("/items")
public class ItemsController {

	
	@Autowired 
	private ItemService itemService;
	@RequestMapping("/queryItems")
	
	public ModelAndView queryItems(HttpServletRequest request,ItemsQueryVo itemsQueryVo)throws Exception  {
		
		List<ItemsCustom> list=itemService.findItemsList(itemsQueryVo);
		
		ModelAndView modelAndView =new ModelAndView();
		modelAndView.addObject("itemsList",list);
		modelAndView.setViewName("/items/itemsList");
		return modelAndView;
	}
	
		
	

		@RequestMapping("/editItems")
		public String editItems(HttpServletRequest request,Model model,
				@RequestParam(value="id")Integer items_id) throws Exception{
			ItemsCustom itemsCustom=itemService.findListById(items_id);
//			  if (itemsCustom==null) {
//				throw new CustomException("�޸ĵ���Ʒ������");
//			}
			model.addAttribute("itemsCustom",itemsCustom);
			return "/items/editItems";
			
		}
	

	@RequestMapping("/editItemsSubmit")
	public String editItemsSubmit(HttpServletRequest request,Integer id,ItemsCustom itemsCustom
			,MultipartFile items_pic) throws Exception{
		String name=items_pic.getOriginalFilename();
		        if (items_pic!=null&&name!=null&&name.length()>0) {
					String pic_path="D:\\cs\\TomcatPicture\\";
					
					String newname=UUID.randomUUID()+name.substring(name.lastIndexOf("."));
				     File newfile=new File(pic_path);
				     items_pic.transferTo(newfile);
				   
				     itemsCustom.setPic(newname);
		        
		        
		        }
		            itemsCustom.setId(id);
					itemService.updateItems(id, itemsCustom);
					
					return "success";
		
		
	}
	
	@RequestMapping("/deleteItems")
	public String deleteItems(int[] items_id,ItemsCustom itemsCustom) throws Exception{
		
		   itemService.deleteItems(items_id,itemsCustom);
		
		return "success";
	}
	
	@RequestMapping("/editItemsQuery")
	public ModelAndView editItemsQuery(HttpServletRequest request,
			ItemsQueryVo itemsQueryVo) throws Exception {

		
		List<ItemsCustom> itemsList = itemService.findItemsList(itemsQueryVo);

		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("itemsList", itemsList);

		modelAndView.setViewName("items/editItemsQuery");

		return modelAndView;

	}
	
	@RequestMapping("/editItemsAllSubmit")
	public String editItemsAllSubmit(ItemsQueryVo itemsQueryVo) throws Exception{
		
		itemService.updateAllItems(itemsQueryVo);
		return "success";
	}
	//Restful测试，查询商品信息，返回json
	//("/itemsView{id}")表示将这个位置的参数传到该语法指定的名称
	@RequestMapping("/itemsView/{id}")
	 @ResponseBody
	public ItemsCustom itemsView(@PathVariable("id")Integer id) throws Exception{
		ItemsCustom itemsCustom=itemService.findListById(id);
		return itemsCustom;
		
	}
	
	
}

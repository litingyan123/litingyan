package cn.itcast.ssm.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.Users;
import cn.itcast.ssm.servie.UsersService;


@Controller
public class LoginController {
	//登陆认证
	
 @Autowired 
 private UsersService UsersService;
	@RequestMapping("/login")
	@ResponseBody
    public String login(@RequestBody Users users ,Model model,HttpServletRequest request) throws Exception{
           Users users2=UsersService.CheckLogin(users) ; //获得查询记录
          HttpSession session=request.getSession();
           session.setAttribute("users", users2);
          // model.addAttribute("users", users2);
           //如果查到有数据记录 ，就返回给一个字符串
		if (users2!=null) {
			      
                    	 return  "1";
					}
    		   
    	 
              return  "0";
             // loginerror
    	
    }
	@RequestMapping("/loginnew")
	public String loginnew(){  
		
		 return  "login";
	}
   
}

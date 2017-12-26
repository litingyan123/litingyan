package cn.itcast.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
//		String message=null;
//		if (arg3 instanceof CustomException) {
//			 message= ((CustomException)arg3).getMessage();
//		}
//		  else {
//			message="δ֪����";
//		}  
      CustomException customException=null;
      if (arg3 instanceof CustomException) {
		   customException=(CustomException)arg3;
		   	}
      else
      {
    	  customException =new CustomException("异常错误");
      }
		
		String message=customException.getMessage();
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("message", message);
		modelAndView.setViewName("error");
		return modelAndView;
	}

}

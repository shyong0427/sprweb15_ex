package pack.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Controller
public class ListController {
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter jikwonInter;
	
	@RequestMapping("list")
	public ModelAndView listProcess() {
		ArrayList<JikwonDto> list = (ArrayList<JikwonDto>)jikwonInter.list();
		
		ModelAndView modelAndView = new ModelAndView("list");
		modelAndView.addObject("datas", list);
		
		return modelAndView;
	}
}
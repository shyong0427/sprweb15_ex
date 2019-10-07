package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import pack.model.JikwonDto;
import pack.model.JikwonInter;

@Controller
public class SearchController {
	@Autowired
	@Qualifier("jikwonImpl")
	private JikwonInter jikwonInter;
	
	public ModelAndView jikwon(JikwonBean bean) {
		List<JikwonDto> list = jikwonInter.search(bean);
		
		return new ModelAndView("list", "datas", list);
	}
}

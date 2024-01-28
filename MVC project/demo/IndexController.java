package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@Autowired 
	CollegeDAO collegedao;
	
	@RequestMapping("look")
	public ModelAndView index(@RequestParam("Number")Integer it) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("userNo",it);
		mav.setViewName("welcome.jsp");
		return mav;
	}
	@RequestMapping("addCollege")
	public ModelAndView addUser(College coll) {
		System.out.println(coll.getDeptCount());
		System.out.println(coll.getDeptName());
		ModelAndView mav= new ModelAndView();
		mav.addObject("collegeDetails",coll);
		mav.setViewName("added.jsp");
		collegedao.save(coll);
		return mav;
		
	}
	@RequestMapping("viewCollege")
	public ModelAndView display(College coll) {
    Optional<College> op=collegedao.findById(coll.getDeptId()); 
    College college = op.get();
    ModelAndView mav=new ModelAndView();
    mav.addObject("collegeDetails",college);
    mav.setViewName("display.jsp");
    return mav;

}
	@RequestMapping("deleteCollege")
	public ModelAndView deleteUser(College coll) {
		ModelAndView mav= new ModelAndView();
		collegedao.deleteById(coll.getDeptId());
		mav.addObject("collegeDetails",coll);
		mav.setViewName("delete.jsp");
		return mav;
	
}

	@RequestMapping("updateCollege")
	public ModelAndView updateUser(College coll) {
	   ModelAndView mav = new ModelAndView();
	   collegedao.findById(coll.getDeptId());
	   mav.addObject("collegeDetails",coll);
		mav.setViewName("update.jsp");
		return mav;
	
}
}
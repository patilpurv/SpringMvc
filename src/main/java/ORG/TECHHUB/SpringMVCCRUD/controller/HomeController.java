package ORG.TECHHUB.SpringMVCCRUD.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ORG.TECHHUB.SpringMVCCRUD.model.Employee;
import ORG.TECHHUB.SpringMVCCRUD.model.Employee1;
import ORG.TECHHUB.SpringMVCCRUD.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	EmployeeService empserv;
	//Postman IPI Testing
	@RequestMapping(value="lll")
	@ResponseBody
   public String nn()
   {
	return "hello";
   }
	@RequestMapping(value = "/")
	public String HomePage() {
		return "home";
	}

	@RequestMapping(value = "/reg")
	public String Register() {
		return "Register";
	}

	@RequestMapping(value = "/login")
	public String loginpage() {
		return "home";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String saveEmployee(Employee emp, Map<String, String> map) {

		boolean b = empserv.saveEmployee(emp);
		if (b) {
			map.put("msg", "Register Sucess.....");
		} else {
			map.put("msg", "Not Register Success.....");
		}

		return "Register";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView Login(Employee emp, Map<String, String> map) {
		boolean b = empserv.isLogin(emp);
		ModelAndView mv=new ModelAndView();
		if (b) {
			
			List<Employee1> list=empserv.getAllEmployee1Names();
			list.forEach((l)->System.out.println(l));
			mv.addObject("list",list);
			mv.setViewName("NavBar");
			return mv;
		} else {
			mv.setViewName("home");
			map.put("msg", "PLZ  Registe Thain Login");
			return mv;
		}
	}

	@RequestMapping(value = "/add")
	public String addEmployee() {
		return "AddEmp";
	}

	// use Model Concept
	@RequestMapping(value = "/AddEmployee", method = RequestMethod.POST)
	public String AddNewEmployee(Employee1 emp, Model model) {
		
		boolean b = empserv.isAddEmployee1(emp);
		if (b) {
			model.addAttribute("msg", "Employee Save Sucess.....");
		} else {
			model.addAttribute("msg", "Employee Not Save Success");
		}
		return "AddEmp";
	}

	// use Concept in ModelAndView
	@RequestMapping(value = "/view", method = RequestMethod.GET)
	public ModelAndView getAllEmployee1() {
		List<Employee1> list = empserv.getAllEmployee1();
		ModelAndView mv = new ModelAndView();
		mv.addObject("list", list);
		mv.setViewName("view");
		return mv;

	}

	// use Concept in ModelAndView
	@RequestMapping(value = "/del", method = RequestMethod.GET)

	public ModelAndView DeleteEmployee1(@RequestParam("delete") Integer id) {
		ModelAndView mv = new ModelAndView();

		boolean b = empserv.isDelete(id);
		if (b) {
			List<Employee1> list = empserv.getAllEmployee1();
			mv.addObject("list", list);
			mv.setViewName("view");

		}

		return mv;
	}

	// use Concept in ModelAndView
	@RequestMapping(value = "/upd", method = RequestMethod.GET)
	// url-rewriting multiple data get
	// public String updateEmployee1(@RequestParam("delete")Integer id,@RequestParam("name") String name,@RequestParam("email") String email,@RequestParam("contact") String contact)
	public ModelAndView updateEmployee(@RequestParam("update") Integer id) {
		// System.out.println(id+"\t"+name+"\t"+email+"\t"+contact);
		ModelAndView mv = new ModelAndView();
		List<Employee1> list=empserv.getAllEmployee1();
		for(Employee1 e:list)
		{
		int eid=e.getId();
		if(eid==id)
		{
			mv.addObject("e",e);
			mv.setViewName("update");
		}
		}
		
		return mv;

	}
	//use Concept ModelAndView
@RequestMapping(value="/FinalUpdate",method=RequestMethod.POST)
public ModelAndView FinalUpdate(Employee1 emp)
{
	
	ModelAndView mv=new ModelAndView();
	Boolean b=empserv.isUpdate(emp);
	if(b)
	{
		List<Employee1> list=empserv.getAllEmployee1();
		mv.addObject("list",list);
		mv.setViewName("view");
	}
	return mv;
}
//Search Logic
@RequestMapping(value="/search")
public String searchData()
{
	return "Search";
}
@RequestMapping(value="/namesearch",method=RequestMethod.GET)
public ModelAndView searchByName(HttpServletRequest request)
{
	ModelAndView mv=new ModelAndView();
	String name=request.getParameter("n");
	List<Employee1> list=empserv.searchDataByUsingName(name);
	//list.forEach((l)->System.out.println(l));
	mv.addObject("list", list);
	mv.setViewName("SearchView");
	return mv;
	
}
@RequestMapping(value="/getnames",method=RequestMethod.GET)
public ModelAndView getAllNames()
{
	ModelAndView mv=new ModelAndView();
	List<Employee1> list=empserv.getAllEmployee1Names();
	//list.forEach((l)->System.out.println(l));
	mv.addObject("list",list);
	mv.setViewName("NavBar");
	return mv;
}

}

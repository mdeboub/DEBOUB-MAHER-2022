package com.Licence.garderie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class InscriptionController {

    @Autowired
    private InscriptionService inscriptionService;

    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listInscriptions", inscriptionService.getAllInscriptions());
        return "index";
    }
    
    @RequestMapping("/index")
	public String IndexPage() {
		return "index";
	}
    
    @RequestMapping("/contact")
	public String indexPage() {
		return "contact";
	}
    
    @RequestMapping("/gallery")
	public String galleryPage() {
		return "gallery";
	}
    
    @RequestMapping("/inscription")
	public String inscriptionPage() {
		return "new_Inscription";
	}
    
    @RequestMapping("/apropos")
	public String AproposPage() {
		return "apropos";
	}
    
    @RequestMapping("/indexadmin")
	public String indexadminPage() {
		return "indexadmin";
	}
    
    @RequestMapping("/indexparents")
   	public String indexparentsPage() {
   		return "indexparents";
   	}
    
    @RequestMapping("/ContactReceive")
	public String ContactReceivePage() {
		return "ContactReceive";
	}
    
    @RequestMapping("/employee")
	public String EmployeePage() {
		return "employee";
	}
    
    @RequestMapping("/aproposparents")
   	public String aproposparentsPage() {
   		return "aproposparents";
   	}
    
    @RequestMapping("/galleryparent")
   	public String galleryparentPage() {
   		return "galleryparent";
   	}
    
    @RequestMapping("/indexfac")
   	public String IndexfacPage() {
   		return "indexfac";
   	}
    
    

    @GetMapping("/showNewInscriptionForm")
    public String showNewInscriptionForm(Model model) {
        // create model attribute to bind form data
    	Inscription inscription = new Inscription();
        model.addAttribute("inscription", inscription);
        return "new_Inscription";
    }

    @PostMapping("/saveInscription")
    public String saveInscription(@ModelAttribute("inscription") Inscription inscription) {
        // save employee to database
    	inscriptionService.saveInscription(inscription);
        return "redirect:/showNewInscriptionForm";
    }
    
    @PostMapping("/updateInscription")
    public String updateInscription(@ModelAttribute("inscription") Inscription inscription) {
        // save employee to database
    	inscriptionService.saveInscription(inscription);
        return "redirect:/InscriptionReceive";
    }
   
    @GetMapping("/showInscriptionForUpdate/{id}") public String
    showInscriptionForUpdate(@PathVariable(value = "id") long id, Model model) {
	  
	  // get employee from the service Inscription inscription =
	  Inscription inscription = inscriptionService.getInscriptionById(id);
	  
	  // set employee as a model attribute to pre-populate the form
	  model.addAttribute("inscription",inscription); return " update_inscription"; }
	  
	  @GetMapping("/deleteInscription/{id}") public String
	  deleteInscription(@PathVariable(value = "id") long id) {
	  
	  // call delete employee method
	  this.inscriptionService.deleteInscriptionById(id); return "redirect:/InscriptionReceive"; }
	  
	  @GetMapping("/InscriptionReceive")
	    public String InscriptionReceivePage(Model model) {
	        model.addAttribute("listInscriptions", inscriptionService.getAllInscriptions());
	        return "InscriptionReceive";
	    }
	  
	  

        @Autowired
        private EmployeeService employeeService;

        @GetMapping("/showNewEmployeeForm")
        public String showNewEmployeeForm(Model model) {
            // create model attribute to bind form data
            Employee employee = new Employee();
            model.addAttribute("employee", employee);
            return "new_employee";
        }

        @PostMapping("/saveEmployee")
        public String saveEmployee(@ModelAttribute("employee") Employee employee) {
            // save employee to database
            employeeService.saveEmployee(employee);
            return "redirect:/employee";
        }
        
        @PostMapping("/updateEmployee")
        public String updateEmployee(@ModelAttribute("employee") Employee employee) {
            // save employee to database
            employeeService.saveEmployee(employee);
            return "redirect:/employee";
        }
        
        
        
        @GetMapping("/showFormForUpdate/{id}")
        public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

            // get employee from the service
            Employee employee = employeeService.getEmployeeById(id);

            // set employee as a model attribute to pre-populate the form
            model.addAttribute("employee", employee);
            return "update_employee";
        }

        @GetMapping("/deleteEmployee/{id}")
        public String deleteEmployee(@PathVariable(value = "id") long id) {

            // call delete employee method 
            this.employeeService.deleteEmployeeById(id);
            return "redirect:/employee";
        }
        
        @GetMapping("/employee")
	    public String employeePage(Model model) {
	        model.addAttribute("listEmployees", employeeService.getAllEmployees());
	        return "employee";
	    }
        
        @Autowired
        private ContactService contactService;

        @GetMapping("/showContact")
        public String showContact(Model model) {
            // create model attribute to bind form data
            Contact contact = new Contact();
            model.addAttribute("contact", contact);
            return "new_contact";
        }

        @PostMapping("/saveContact")
        public String saveContact(@ModelAttribute("contact") Contact contact) {
            // save employee to database
            contactService.saveContact(contact);
            return "redirect:/showContact";
        }
        
        @PostMapping("/updateContact")
        public String updateContact(@ModelAttribute("contact") Contact contact) {
            // save employee to database
            contactService.updateContact(contact);
            return "redirect:/ContactReceive";
        }
    	  @GetMapping("/showContactForUpdate/{id}") public String
    	  showContactForUpdate(@PathVariable(value = "id") long id, Model model) {
    	  
    	  // get employee from the service Inscription inscription =
    	  Contact contact = contactService.getContactById(id);
    	  
    	  // set employee as a model attribute to pre-populate the form
    	  model.addAttribute("contact",contact); return "update_contact"; }
    	  
    	  @GetMapping("/deleteContact/{id}") public String
    	  deleteContact(@PathVariable(value = "id") long id) {
    	  
    	  // call delete employee method
    	  this.contactService.deleteContactById(id); return "redirect:/ContactReceive"; }
    	  
    	  @GetMapping("/ContactReceive")
    	    public String ContactReceivePage(Model model) {
    	        model.addAttribute("listContacts", contactService.getAllContacts());
    	        return "ContactReceive";
    	    }
    	 
        
        @Autowired private UserService service;
        
        @GetMapping("/login")
        public String inscrept(Model model){
        model.addAttribute("user", new User());
        model.addAttribute("pageTitel", "Inscreption");
        return "/login";
        }



        @PostMapping("/Inscreption/save")
        public String saveUser( User user)
        {   if (user.getEmail().equals("deboubmaher1@gmail.com")) user.setAdmin(true);
        service.save(user);
        /* test
         * String p=user.getEmail(); System.out.println(p);
         */
        return "redirect:/login";
        }

        @PostMapping("/Inscreption/save1")
        public String saveUser1( User user)
        {

        if (service.login(user.getEmail(),user.getPassword()))
        {   user=service.finduser(user.getEmail());
            if (user.isAdmin()) return "redirect:/indexadmin";
            else return "redirect:/indexparents";}
        else return "redirect:/login";
        }

  
}

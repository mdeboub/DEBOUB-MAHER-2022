package com.Licence.garderie;
import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerApp {

    @Autowired
    private EmailSenderService senderService;





    @GetMapping("/indexfac/new")
    public String email(Model model) throws MessagingException {
        model.addAttribute("fac", new Facture());
       return "Facture";
    }

    @PostMapping("/Facture/new")
    public String processForm(Facture fac) throws MessagingException {
        triggerMail(fac.getMail(),fac.getFacture());
        return "redirect:/indexfac";

    }



    public void triggerMail(String mail, String fac) throws MessagingException {
        senderService.sendSimpleEmail(mail,
                "Facture Belle Vue",
                fac);

    }
}
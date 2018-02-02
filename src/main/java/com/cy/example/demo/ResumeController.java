package com.cy.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class ResumeController {

    @Autowired
    ResumeRepository resumeRepository;

    @Autowired
    EducationRepository educationRepository;

    @Autowired
    ExperienceRepository experienceRepository;

    @Autowired
    SkillRepository skillRepository;


    @RequestMapping("/")
    public String listResume(Model model){
        model.addAttribute("resumes", resumeRepository.findAll());
        return "list";
    }

    public String listEducation(Model model){
        model.addAttribute("educations", educationRepository.findAll());
        return "list";
    }

    public String listExperience(Model model){
        model.addAttribute("experiences", experienceRepository.findAll());
        return "list";
    }

    public String listSkills(Model model){
        model.addAttribute("skills", skillRepository.findAll());
        return "list";
    }

    @GetMapping("/add")
    public String resumeForm(Model model){
        model.addAttribute("resume", new Resume());
        return "resumeform";
    };

    @RequestMapping("/addedu")
    public String educationForm(Model model){
        model.addAttribute("education", new Education());
        return "educationform";
    };

    @RequestMapping("/addexp")
    public String experienceForm(Model model){
        model.addAttribute("experience", new Experience());
        return "experienceform";
    };

    @RequestMapping("/addskills")
    public String skillsForm(Model model){
        model.addAttribute("skill", new Skill());
        return "skillsform";
    };


    @PostMapping("/process")
    public String processForm(@Valid Resume resume, BindingResult result)
    {
        if (result.hasErrors()){
            return "resumeform";
        }
        resumeRepository.save(resume);

        return "redirect:/";
    }

    @PostMapping("/processedu")
    public String processForm(@Valid Education education, BindingResult result)
    {
        if (result.hasErrors()){
            return "educationform";
        }
        educationRepository.save(education);

        return "redirect:/";
    }

    @PostMapping("/processexp")
    public String processForm(@Valid Experience experience, BindingResult result)
    {
        if (result.hasErrors()){
            return "experienceform";
        }
        experienceRepository.save(experience);

        return "redirect:/";
    }

    @PostMapping("/processski")
    public String processForm(@Valid Skill skill, BindingResult result)
    {
        if (result.hasErrors()){
            return "skillsform";
        }
        skillRepository.save(skill);

        return "redirect:/";
    }


}

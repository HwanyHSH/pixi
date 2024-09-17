package com.psproject.controller;

import com.psproject.model.FitRecordDTO;
import com.psproject.model.FitRecordMapper;
import com.psproject.service.FitRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/fitrecord")
public class FitRecordController {

    @Autowired
    private FitRecordService fitRecordService;

    @GetMapping("")
    public String fitRecord(Model model) {

        List<FitRecordDTO> fitRecordDTO = fitRecordService.fitRecord();

        System.out.println("------------------------"+fitRecordDTO);

        model.addAttribute("fitRecordDTO", fitRecordDTO);

        return "fitness/test";
    }

    @GetMapping("/detail")
    public String fitRecordDetail(@RequestParam("record_key") String record_key, Model model) {

        model.addAttribute("recordKey", record_key);

        return "fitness/fitness-plan";
    }



}

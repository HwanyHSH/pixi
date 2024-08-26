package com.psproject.controller;

import com.psproject.model.FitRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fitrecord")
public class FitRecordController {

    @Autowired
    private FitRecordMapper fitRecordMapper;

    @GetMapping("")
    public String fitRecord() {

        return "fitness/test";
    }

}

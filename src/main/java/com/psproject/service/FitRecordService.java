package com.psproject.service;

import com.psproject.model.FitRecordDTO;
import com.psproject.model.FitRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FitRecordService {

    @Autowired
    private FitRecordMapper fitRecordMapper;

    public List<FitRecordDTO> fitRecord() {
        return fitRecordMapper.fitrecord();
    }


}

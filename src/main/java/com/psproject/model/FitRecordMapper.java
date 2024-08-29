package com.psproject.model;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FitRecordMapper {

    List<FitRecordDTO> fitrecord();

}

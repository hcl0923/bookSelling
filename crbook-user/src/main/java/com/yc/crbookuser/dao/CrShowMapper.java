package com.yc.crbookuser.dao;

import com.yc.crbook.bean.CrShow;

import java.util.List;

public interface CrShowMapper {
    List<CrShow> selectByPageAndBoard(CrShow crShow);
}

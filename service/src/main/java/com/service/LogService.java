package com.service;

import com.beans.MtOrderLog;
import com.beans.MtOrderLogExample;
import com.common.utils.DateUtils;
import com.common.utils.StringUtils;
import com.github.pagehelper.PageHelper;
import com.mapper.MtOrderLogMapper;
import com.mapper.MtOrderLogMapper_Manual;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LogService {

    @Autowired
    private MtOrderLogMapper_Manual mtOrderLogMapper_Manual;

    @Autowired
    private MtOrderLogMapper mtOrderLogMapper;

    public Map<String, Object> listQuery(MtOrderLog mtOrderLog, String startTime, String endTime, int limit, int offset) {
        Map<String, Object> map = new HashMap<>();
        try {
            MtOrderLogExample mtOrderLogExample = new MtOrderLogExample();
            MtOrderLogExample.Criteria criteria = mtOrderLogExample.createCriteria();
            if (StringUtils.isNotEmpty(mtOrderLog.getType())) {
                criteria.andTypeEqualTo(mtOrderLog.getType());
            }
            if (StringUtils.isNotEmpty(mtOrderLog.getOrderId())) {
                criteria.andOrderIdLike("%" + mtOrderLog.getOrderId() + "%");
            }
            if (StringUtils.isNotEmpty(mtOrderLog.getJjyBillId())) {
                criteria.andJjyBillIdLike("%" + mtOrderLog.getJjyBillId() + "%");
            }
            criteria.andCreateTimeBetween(DateUtils.format("yyyy-MM-dd HH:mm", startTime), DateUtils.format("yyyy-MM-dd HH:mm", endTime));
            map.put("total", mtOrderLogMapper.countByExample(mtOrderLogExample));
            PageHelper.startPage((offset / limit) + 1, limit);//startPage, PageSize
            List<Map<String, Object>> rows = mtOrderLogMapper_Manual.selectListMap(mtOrderLogExample);
            map.put("rows", rows);
        } catch (Exception e) {
            e.printStackTrace();
            map.put("total", 0);
            map.put("rows", new ArrayList<>());
        }
        return map;
    }
}

package com.web.model.business.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.goclass.mapper.TeacherMapper;
import com.goclass.mapper.TeacherswillMapper;
import com.goclass.pojo.Teacherswill;
import com.web.model.business.service.TeacherService;
import com.web.model.global.entity.TeacherWillTime;

@Service
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	private TeacherswillMapper teacherswillMapper;
	
	@Autowired
	private TeacherMapper teacherMapper;

	@Override
	public void addTimeWill(TeacherWillTime teacherWillTime) {
		Teacherswill teacherswill = new Teacherswill();
		teacherswill.setGmtCreate(new Date());
		teacherswill.setGmtModified(new Date());
		teacherswill.setStatue("0");
		teacherswill.setTeacherId(teacherWillTime.getTeacherId());
		teacherswill.setTeacherName(teacherWillTime.getTeacherName());
		teacherswill.setTimeItems(JSON.toJSONString(teacherWillTime.getItems()));
		
		teacherswillMapper.insert(teacherswill);
	}

	@Override
	public List<Teacherswill> queryAllTimeWill() {
		return teacherswillMapper.selectByExample(null);
	}

	@Override
	public Teacherswill queryTimeWillByWillId(Long willId) {
		return teacherswillMapper.selectByPrimaryKey(willId);
	}

	/**
	 * 是否接受老师上课时间的愿意
	 */
	@Override
	public void isAcceptTeacherTimeWill(Long willId, Integer accept) {
		Teacherswill teacherswill = teacherswillMapper.selectByPrimaryKey(willId);
		/**
		 * accept为1时表示接受，0表示不接受
		 */
		if(accept == 1) {
			//修改状态，statue默认为0即不接受，当accept为1时修改为1即为接受
			teacherswill.setStatue("1");
		}else {
			teacherswill.setStatue("0");
		}
		teacherswillMapper.updateByPrimaryKey(teacherswill);
	}
	
	public List<Long> queryTeacherIdBySubjectId(Long subjectId) {
		return teacherMapper.queryTeacherIdBySubjectId(subjectId);
	}

	@Override
	public List<Integer> queryAllCourseIds() {
		return teacherMapper.queryAllCourseIds();
	}


}

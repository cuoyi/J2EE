package com.crtb.oss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.crtb.oss.model.TVersionstatus;
import com.crtb.oss.repository.VersionStatusRepository;

@Service //ָ��һ����ע�������һ��"Service". ��� annotation����һ�����Ե� @Component��ʹ�ã����� classpath ɨ���Զ�̽�⡣
@Transactional //��һ������������������������
public class VersionStatusService {

	@Autowired //���һ������������ setter �����������÷����ܹ��� Spring ����ע��Ĺ����Զ��󶨡�
	VersionStatusRepository versionStatusRepository;

	public boolean save(TVersionstatus versionStatus) {
		TVersionstatus ret = versionStatusRepository.save(versionStatus);
		
		if (ret != null) {
			return true;
		}
		else {
			return false;
		}
	}

//	public static void main(String[] args) {
//
//		TVersionstatus versionStatus = new TVersionstatus();
//
//		versionStatus.setImei("1234567890");
//		versionStatus.setVersionNo("1.0.7");
//		versionStatus.setReportTime("2015-03-17 22:35");
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				"app-context.xml");	
//
//		VersionStatusService versionStatusService = (VersionStatusService) ctx
//				.getBean("versionStatusService");
//
//		versionStatusService.save(versionStatus);
//	}
}

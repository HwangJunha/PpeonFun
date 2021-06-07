package ppeonfun.service.admin.report;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ppeonfun.dao.admin.project.ProjectDao;
import ppeonfun.dao.admin.report.ReportDao;
import ppeonfun.dto.Information;
import ppeonfun.dto.Member;
import ppeonfun.dto.Project;
import ppeonfun.dto.Report;
import ppeonfun.util.Paging;

@Service("admin.ReportService")
public class ReportServiceImpl implements ReportService {
	private static final Logger logger = LoggerFactory.getLogger(ReportServiceImpl.class);
	
	@Autowired private ReportDao reportDao;
	

	@Override
	public List<Report> selectAllReport() {
		
		return reportDao.selectAllReport();
	}
	
	@Override
	public List<Information> selectAllInformation() {
		
		return reportDao.selectAllInformation();
	}
	
	@Override
	public List<Member> selectAllMember() {
		
		return reportDao.selectAllMember();
	}	
	
	@Override
	public List<Project> selectAllProject() {
		
		return reportDao.selectAllProject();
	}	
	
	@Override
	public void deleteByNum(int num) {
		
		reportDao.deleteByNum(num);
	}	
	
	@Override
	public void approveByNum(int num) {
		
		reportDao.approveByNum(num);
	}	

	@Override
	public void rejectByNum(int num) {
		
		reportDao.rejectByNum(num);
	}
	
	@Override
	public void insertReport(Report report) {
		
		reportDao.insertReport(report);
	}	
}

package ppeonfun.service.admin.report;

import java.util.List;

import ppeonfun.dto.Information;
import ppeonfun.dto.Member;
import ppeonfun.dto.Project;
import ppeonfun.dto.Report;
import ppeonfun.util.Paging;

public interface ReportService {


	public List<Report> selectAllReport();
	public List<Information> selectAllInformation();
	public List<Member> selectAllMember();
	public List<Project> selectAllProject();
	public void insertReport(Report report);
	public void deleteByNum(int num);
	public void approveByNum(int num);
	public void rejectByNum(int num);
	

}

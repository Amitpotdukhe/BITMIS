package mis.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applyLeave")
public class applyLeave {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int leaveId;
	private String staffId;
	private String leaveType;
	private String startDate;
	private String endDate;
	private String leaveStatus;
	private String startFullHalf;
	private String endFullHalf;
	private String leaveReason;
	
	public int getLeaveId() {
		return leaveId;
	}
	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}
	public String getStaffId() {
		return staffId;
	}
	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}
	public String getLeaveType() {
		return leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getLeaveStatus() {
		return leaveStatus;
	}
	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}
	public String getStartFullHalf() {
		return startFullHalf;
	}
	public void setStartFullHalf(String startFullHalf) {
		this.startFullHalf = startFullHalf;
	}
	public String getEndFullHalf() {
		return endFullHalf;
	}
	public void setEndFullHalf(String endFullHalf) {
		this.endFullHalf = endFullHalf;
	}
	public String getLeaveReason() {
		return leaveReason;
	}
	public void setLeaveReason(String leaveReason) {
		this.leaveReason = leaveReason;
	}
	@Override
	public String toString() {
		return "applyLeave [leaveId=" + leaveId + ", staffId=" + staffId + ", leaveType=" + leaveType + ", startDate="
				+ startDate + ", endDate=" + endDate + ", leaveStatus=" + leaveStatus + ", startFullHalf="
				+ startFullHalf + ", endFullHalf=" + endFullHalf + ", leaveReason=" + leaveReason + "]";
	}
	
	
}

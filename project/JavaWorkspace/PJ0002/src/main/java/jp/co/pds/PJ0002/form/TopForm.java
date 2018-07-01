package jp.co.pds.PJ0002.form;

import java.util.List;

import jp.co.pds.PJ0002.dto.WorkTimeDTO;

/**
 * @author Rei Kitahara
 *
 */
public class TopForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	private String selectedGroupId;

	private String selectedYy;

	private String selectedMm;

	private String workTimeTruncUnit;

	private String restTime;

	private List<WorkTimeDTO> workTimes;

	public String getSelectedGroupId() {
		return selectedGroupId;
	}

	public void setSelectedGroupId(String selectedGroupId) {
		this.selectedGroupId = selectedGroupId;
	}

	public String getSelectedYy() {
		return selectedYy;
	}

	public void setSelectedYy(String selectedYy) {
		this.selectedYy = selectedYy;
	}

	public String getSelectedMm() {
		return selectedMm;
	}

	public void setSelectedMm(String selectedMm) {
		this.selectedMm = selectedMm;
	}

	public String getWorkTimeTruncUnit() {
		return workTimeTruncUnit;
	}

	public void setWorkTimeTruncUnit(String value) {
		this.workTimeTruncUnit = value;
	}

	public String getRestTime() {
		return restTime;
	}

	public void setRestTime(String value) {
		this.restTime = value;
	}

	public List<WorkTimeDTO> getWorkTimes() {
		return workTimes;
	}

	public void setWorkTimes(List<WorkTimeDTO> workTimes) {
		this.workTimes = workTimes;
	}

	@Override
	public String toString() {
		return "selectedGroupId=" + selectedGroupId
				+", selectedYy=" + selectedYy
				+", selectedMm=" + selectedMm;
	}
}

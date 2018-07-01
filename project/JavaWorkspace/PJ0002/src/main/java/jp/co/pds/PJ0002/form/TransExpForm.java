package jp.co.pds.PJ0002.form;

import java.util.List;

import jp.co.pds.PJ0002.dto.TransExpDTO;

/**
 * @author Rei Kitahara
 *
 */
public class TransExpForm extends BaseForm {

	private static final long serialVersionUID = 12345678L;

	private String selectedGroupId;

	private String selectedYy;

	private String selectedMm;

	private List<TransExpDTO> transExpDTOs;

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

	public List<TransExpDTO> getTransExpDTOs() {
		return transExpDTOs;
	}

	public void setTransExpDTOs(List<TransExpDTO> transExpDTOs) {
		this.transExpDTOs = transExpDTOs;
	}

	@Override
	public String toString() {
		return "selectedGroupId=" + selectedGroupId
				+", selectedYy=" + selectedYy
				+", selectedMm=" + selectedMm;
	}
}

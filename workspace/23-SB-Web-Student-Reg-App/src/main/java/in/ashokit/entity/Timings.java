package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIMINGS")
public class Timings {

	@Id
	@Column(name = "TIMING_ID")
	private Integer timingId;

	@Column(name = "TIMING_NAME")
	private String timingName;

	public Integer getTimingId() {
		return timingId;
	}

	public void setTimingId(Integer timingId) {
		this.timingId = timingId;
	}

	public String getTimingName() {
		return timingName;
	}

	public void setTimingName(String timingName) {
		this.timingName = timingName;
	}

}

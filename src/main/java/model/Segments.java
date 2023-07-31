package model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Segments generated by hbm2java
 */
@Entity
@Table(name = "segments", catalog = "vehicle_config")
public class Segments implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9104312996111344547L;
	private Integer id;
	private String segType;
	private String minQty;
	private Set<Models> modelses = new HashSet<Models>(0);

	public Segments() {
	}

	public Segments(String segType, String minQty) {
		this.segType = segType;
		this.minQty = minQty;
	}

	public Segments(String segType, String minQty, Set<Models> modelses) {
		this.segType = segType;
		this.minQty = minQty;
		this.modelses = modelses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "seg_type", nullable = false, length = 20)
	public String getSegType() {
		return this.segType;
	}

	public void setSegType(String segType) {
		this.segType = segType;
	}

	@Column(name = "min_qty", nullable = false, length = 20)
	public String getMinQty() {
		return this.minQty;
	}

	public void setMinQty(String minQty) {
		this.minQty = minQty;
	}

	@Transient
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)//mappedBy = "segment_id"
	@JoinColumn(name="segment_id", referencedColumnName = "segment_id")
	public Set<Models> getModelses() {
		return this.modelses;
	}

	public void setModelses(Set<Models> modelses) {
		this.modelses = modelses;
	}

}
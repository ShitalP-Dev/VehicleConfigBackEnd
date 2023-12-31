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
 * Manufacturer generated by hbm2java
 */
@Entity
@Table(name = "manufacturer", catalog = "vehicle_config")
public class Manufacturer implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2382986865704426432L;
	private Integer id;
	private String manuName;
	private int segid;
	
	@Column(name="segid",nullable = false )
	public int getSegid() {
		return segid;
	}

	public void setSegid(int segid) {
		this.segid = segid;
	}

	private Set<Models> modelses = new HashSet<Models>(0);

	public Manufacturer() {
	}

	public Manufacturer(String manuName,int segid) {
		this.manuName = manuName;
		this.segid=segid;
	}

	public Manufacturer(String manuName, Set<Models> modelses) {
		this.manuName = manuName;
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

	@Column(name = "manu_name", nullable = false, length = 20)
	public String getManuName() {
		return this.manuName;
	}

	public void setManuName(String manuName) {
		this.manuName = manuName;
	}

	@Transient
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="manufacturer_id", referencedColumnName="manufacturer_id")
	public Set<Models> getModelses() {
		return this.modelses;
	}

	public void setModelses(Set<Models> modelses) {
		this.modelses = modelses;
	}

}

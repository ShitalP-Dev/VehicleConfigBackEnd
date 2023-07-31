package model;

import java.math.BigDecimal;
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
 * Items generated by hbm2java
 */
@Entity
@Table(name = "items", catalog = "vehicle_config")
public class Items implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5023310896393567773L;
	private Integer id;
	private String name;
	private String itemtype;
	private BigDecimal iprice;
	private int modelid;
	private String modelconfig;
	private String configtype;
	
	
	public Items(String name, String itemtype, BigDecimal iprice, Set<ModelDetail> modelDetails,
			int modelid,String modelconfig,String configtype) {
		super();
		this.name = name;
		this.itemtype = itemtype;
		this.iprice = iprice;
		this.modelDetails = modelDetails;
		this.modelid=modelid;
		this.configtype=configtype;
		this.modelconfig=modelconfig;
	}
@Column(name="itemtype",nullable = false)
	public String getItemtype() {
		return itemtype;
	}

	public void setItemtype(String itemtype) {
		this.itemtype = itemtype;
	}
@Column(name="iprice", nullable = false)
	public BigDecimal getIprice() {
		return iprice;
	}

	public void setIprice(BigDecimal iprice) {
		this.iprice = iprice;
	}

	private Set<ModelDetail> modelDetails = new HashSet<ModelDetail>(0);

	public Items() {
	}

	public Items(String name, Set<ModelDetail> modelDetails) {
		this.name = name;
		this.modelDetails = modelDetails;
	
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

	@Column(name = "name", nullable = false, length = 255)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Transient
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "item-id", referencedColumnName="item_id")
	public Set<ModelDetail> getModelDetails() {
		return this.modelDetails;
	}

	public void setModelDetails(Set<ModelDetail> modelDetails) {
		this.modelDetails = modelDetails;
	}
	
	@Column(name="model_id",nullable = false)
	public int getModelid() {
		return modelid;
	}
	public void setModelid(int modelid) {
		this.modelid = modelid;
	}
	@Column(name="model_config",nullable = false)
	public String getModelconfig() {
		return modelconfig;
	}
	public void setModelconfig(String modelconfig) {
		this.modelconfig = modelconfig;
	}
	@Column(name="config_type",nullable = false)
	public String getConfigtype() {
		return configtype;
	}
	public void setConfigtype(String configtype) {
		this.configtype = configtype;
	}

}

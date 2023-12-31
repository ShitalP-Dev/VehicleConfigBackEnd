package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * ModelDetail generated by hbm2java
 */
@Entity
@Table(name = "model_detail", catalog = "vehicle_config")
public class ModelDetail implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7305319536072142902L;
	private Integer id;
	private int model_id;
	private int item_id;
	private String model_type;
	private String model_config;
	private String config_type;
	


	public ModelDetail() {
	}

	public ModelDetail(int models, int items, String modelType, String modelConfig,String config_type) {
		this.model_id = models;
		this.item_id= items;
		this.model_type = modelType;
		this.model_config = modelConfig;
		this.config_type = config_type;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	@Column(name = "model_id")
	public int getModel_id() {
		return this.model_id;
	}

	public void setModel_id(int models) {
		this.model_id = models;
	}


	
	@Column(name = "item_id")
	public int getItems() {
		return this.item_id;
	}

	public void setItems(int items) {
		this.item_id = items;
	}

	@Column(name = "model_type", nullable = false, length = 20)
	public String getModelType() {
		return this.model_type;
	}

	public void setModelType(String modelType) {
		this.model_type = modelType;
	}

	@Column(name = "model_config", nullable = false, length = 100)
	public String getModel_config() {
		return this.model_config;
	}

	public void setModel_config(String modelConfig) {
		this.model_config = modelConfig;
	}
@Column(name="config_type",nullable=false)
	public String getConfig_type() {
		return config_type;
	}

	public void setConfig_type(String config_type) {
		this.config_type = config_type;
	}

}

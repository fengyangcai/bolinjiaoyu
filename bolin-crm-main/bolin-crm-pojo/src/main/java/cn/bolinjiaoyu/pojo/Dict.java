package cn.bolinjiaoyu.pojo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tb_dict database table.
 * 
 */
@Entity
@Table(name="tb_dict")
public class Dict implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "hasChild")
	private int hasChild;
	@Column
	private String name;
	@Column(name="parentId")
	private int parentId;
	@Column
	private String property;
	@Column
	private int seq;

	public Dict() {
	}

	public int getId() {
		return this.id;   
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHasChild() {
		return this.hasChild;
	}

	public void setHasChild(int hasChild) {
		this.hasChild = hasChild;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getProperty() {
		return this.property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public int getSeq() {
		return this.seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

}
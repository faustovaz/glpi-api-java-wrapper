package org.glpi.api.item;

import com.google.gson.annotations.SerializedName;

public class ItilCategory {

	private long id;
	
	@SerializedName("entities_id")
	private long entitiesId;
	
	@SerializedName("is_recursive")
	private int recursive;
	
	@SerializedName("itilcategories_id")
	private long itilcategoriesId;
	
	private String name;
	
	@SerializedName("completename")
	private String completeName;
	
	private String comment;
	
	private int level;
	
	@SerializedName("knowbaseitemcategories_id")
	private long knowBaseItemCategoriesId;
	
	@SerializedName("users_id")
	private long usersId;
	
	@SerializedName("groups_id")
	private long groupsId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEntitiesId() {
		return entitiesId;
	}

	public void setEntitiesId(long entitiesId) {
		this.entitiesId = entitiesId;
	}

	public boolean isRecursive() {
		return this.recursive == 1;
	}

	public void setRecursive(int recursive) {
		this.recursive = recursive;
	}

	public long getItilcategoriesId() {
		return itilcategoriesId;
	}

	public void setItilcategoriesId(long itilcategoriesId) {
		this.itilcategoriesId = itilcategoriesId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompleteName() {
		return completeName;
	}

	public void setCompleteName(String completeName) {
		this.completeName = completeName;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public long getKnowBaseItemCategoriesId() {
		return knowBaseItemCategoriesId;
	}

	public void setKnowBaseItemCategoriesId(long knowBaseItemCategoriesId) {
		this.knowBaseItemCategoriesId = knowBaseItemCategoriesId;
	}

	public long getUsersId() {
		return usersId;
	}

	public void setUsersId(long usersId) {
		this.usersId = usersId;
	}

	public long getGroupsId() {
		return groupsId;
	}

	public void setGroupsId(long groupsId) {
		this.groupsId = groupsId;
	}
	
	
}


package org.glpi.api.item;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class ItilCategory {

    private long id;
    
    @SerializedName("entities_id")
    private long entitiesId;
    
    @SerializedName("is_recursive")
    private Boolean recursive;
    
    @SerializedName("itilcategories_id")
    private long itilCategoriesId;
    
    private String name;
    
    private String completename;
    
    private String comment;
    
    private int level;
    
    @SerializedName("knowbaseitemcategories_id")
    private long knowBaseItemCategoriesId;
    
    @SerializedName("users_id")
    private long usersId;
    
    @SerializedName("groups_id")
    private long groupsId;
    
    private String code;
    
    @SerializedName("ancestors_cache")
    private String ancestorsCache;
    
    @SerializedName("sons_cache")
    private String sonsCache;
    
    @SerializedName("is_helpdeskvisible")
    private Boolean helpdeskVisible;
    
    @SerializedName("tickettemplates_id_incident")
    private long ticketTemplatesIdIncident;
    
    @SerializedName("tickettemplates_id_demand")
    private long ticketTemplatesIdDemand;
    
    @SerializedName("changetemplates_id")
    private long changeTemplatesId;
    
    @SerializedName("problemtemplates_id")
    private long problemTemplatesId;
    
    @SerializedName("is_incident")
    private Boolean incident;
    
    @SerializedName("is_request")
    private Boolean request;
    
    @SerializedName("is_problem")
    private Boolean problem;
    
    @SerializedName("is_change")
    private Boolean change;
    
    @SerializedName("date_mod")
    private String dateMod;
    
    @SerializedName("date_creation")
    private String dateCreation;
    
    private List<Link> links;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEntitiesId() {
        return entitiesId;
    }

    public void setEntitiesId(int entitiesId) {
        this.entitiesId = entitiesId;
    }

    public Boolean isRecursive() {
        return recursive;
    }

    public void setRecursive(Boolean isRecursive) {
        this.recursive = isRecursive;
    }

    public long getItilcategoriesId() {
        return itilCategoriesId;
    }

    public void setItilcategoriesId(int itilcategoriesId) {
        this.itilCategoriesId = itilcategoriesId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompletename() {
        return completename;
    }

    public void setCompletename(String completename) {
        this.completename = completename;
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

    public long getKnowbaseitemcategoriesId() {
        return knowBaseItemCategoriesId;
    }

    public void setKnowbaseitemcategoriesId(int knowbaseitemcategoriesId) {
        this.knowBaseItemCategoriesId = knowbaseitemcategoriesId;
    }

    public long getUsersId() {
        return usersId;
    }

    public void setUsersId(int usersId) {
        this.usersId = usersId;
    }

    public long getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(int groupsId) {
        this.groupsId = groupsId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAncestorsCache() {
        return ancestorsCache;
    }

    public void setAncestorsCache(String ancestorsCache) {
        this.ancestorsCache = ancestorsCache;
    }

    public String getSonsCache() {
        return sonsCache;
    }

    public void setSonsCache(String sonsCache) {
        this.sonsCache = sonsCache;
    }

    public Boolean isHelpDeskVisible() {
        return helpdeskVisible;
    }

    public void setIsHelpdeskvisible(Boolean isHelpdeskvisible) {
        this.helpdeskVisible = isHelpdeskvisible;
    }

    public long getTickettemplatesIdIncident() {
        return ticketTemplatesIdIncident;
    }

    public void setTickettemplatesIdIncident(long ticketTemplatesIdIncident) {
        this.ticketTemplatesIdIncident = ticketTemplatesIdIncident;
    }

    public long getTickettemplatesIdDemand() {
        return ticketTemplatesIdDemand;
    }

    public void setTickettemplatesIdDemand(long ticketTemplatesIdDemand) {
        this.ticketTemplatesIdDemand = ticketTemplatesIdDemand;
    }

    public long getChangeTemplatesId() {
        return changeTemplatesId;
    }

    public void setChangetemplatesId(long changeTemplatesId) {
        this.changeTemplatesId = changeTemplatesId;
    }

    public long getProblemtemplatesId() {
        return problemTemplatesId;
    }

    public void setProblemtemplatesId(long problemTemplatesId) {
        this.problemTemplatesId = problemTemplatesId;
    }

    public Boolean isIncident() {
        return incident;
    }

    public void setIncident(Boolean isIncident) {
        this.incident = isIncident;
    }

    public Boolean isRequest() {
        return request;
    }

    public void setIsRequest(Boolean isRequest) {
        this.request = isRequest;
    }

    public Boolean isProblem() {
        return problem;
    }

    public void setProblem(Boolean isProblem) {
        this.problem = isProblem;
    }

    public Boolean isChange() {
        return change;
    }

    public void setChange(Boolean isChange) {
        this.change = isChange;
    }

    public String getDateMod() {
        return dateMod;
    }

    public void setDateMod(String dateMod) {
        this.dateMod = dateMod;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
	
	
}


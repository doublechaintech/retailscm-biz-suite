
package com.doublechaintech.retailscm.accountingdocumentconfirmation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;
import com.terapico.caf.DateTime;
import com.doublechaintech.retailscm.BaseEntity;
import com.doublechaintech.retailscm.SmartList;
import com.doublechaintech.retailscm.KeyValuePair;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.doublechaintech.retailscm.accountingdocument.AccountingDocument;

@JsonSerialize(using = AccountingDocumentConfirmationSerializer.class)
public class AccountingDocumentConfirmation extends BaseEntity implements  java.io.Serializable{

	
	public static final String ID_PROPERTY                    = "id"                ;
	public static final String WHO_PROPERTY                   = "who"               ;
	public static final String COMMENTS_PROPERTY              = "comments"          ;
	public static final String MAKE_DATE_PROPERTY             = "makeDate"          ;
	public static final String VERSION_PROPERTY               = "version"           ;

	public static final String ACCOUNTING_DOCUMENT_LIST                 = "accountingDocumentList";

	public static final String INTERNAL_TYPE="AccountingDocumentConfirmation";
	public String getInternalType(){
		return INTERNAL_TYPE;
	}
	
	public String getDisplayName(){
	
		String displayName = getWho();
		if(displayName!=null){
			return displayName;
		}
		
		return super.getDisplayName();
		
	}

	private static final long serialVersionUID = 1L;
	

	protected		String              	mId                 ;
	protected		String              	mWho                ;
	protected		String              	mComments           ;
	protected		Date                	mMakeDate           ;
	protected		int                 	mVersion            ;
	
	
	protected		SmartList<AccountingDocument>	mAccountingDocumentList;
	
		
	public 	AccountingDocumentConfirmation(){
		// lazy load for all the properties
	}
	// disconnect from all, 中文就是一了百了，跟所有一切尘世断绝往来藏身于茫茫数据海洋
	public 	void clearFromAll(){

		this.changed = true;
	}
	
	public 	AccountingDocumentConfirmation(String who, String comments, Date makeDate)
	{
		setWho(who);
		setComments(comments);
		setMakeDate(makeDate);

		this.mAccountingDocumentList = new SmartList<AccountingDocument>();	
	}
	
	//Support for changing the property
	
	public void changeProperty(String property, String newValueExpr) {
     	
		if(WHO_PROPERTY.equals(property)){
			changeWhoProperty(newValueExpr);
		}
		if(COMMENTS_PROPERTY.equals(property)){
			changeCommentsProperty(newValueExpr);
		}
		if(MAKE_DATE_PROPERTY.equals(property)){
			changeMakeDateProperty(newValueExpr);
		}

      
	}
    
    
	protected void changeWhoProperty(String newValueExpr){
		String oldValue = getWho();
		String newValue = parseString(newValueExpr);
		if(equalsString(oldValue , newValue)){
			return;//they can be both null, or exact the same object, this is much faster than equals function
		}
		//they are surely different each other
		updateWho(newValue);
		this.onChangeProperty(WHO_PROPERTY, oldValue, newValue);
		return;
  
	}
			
			
			
	protected void changeCommentsProperty(String newValueExpr){
		String oldValue = getComments();
		String newValue = parseString(newValueExpr);
		if(equalsString(oldValue , newValue)){
			return;//they can be both null, or exact the same object, this is much faster than equals function
		}
		//they are surely different each other
		updateComments(newValue);
		this.onChangeProperty(COMMENTS_PROPERTY, oldValue, newValue);
		return;
  
	}
			
			
			
	protected void changeMakeDateProperty(String newValueExpr){
		Date oldValue = getMakeDate();
		Date newValue = parseDate(newValueExpr);
		if(equalsDate(oldValue , newValue)){
			return;//they can be both null, or exact the same object, this is much faster than equals function
		}
		//they are surely different each other
		updateMakeDate(newValue);
		this.onChangeProperty(MAKE_DATE_PROPERTY, oldValue, newValue);
		return;
  
	}
			
			
			


	
	
	
	public void setId(String id){
		this.mId = trimString(id);;
	}
	public String getId(){
		return this.mId;
	}
	public AccountingDocumentConfirmation updateId(String id){
		this.mId = trimString(id);;
		this.changed = true;
		return this;
	}
	public void mergeId(String id){
		if(id != null) { setId(id);}
	}
	
	
	public void setWho(String who){
		this.mWho = trimString(who);;
	}
	public String getWho(){
		return this.mWho;
	}
	public AccountingDocumentConfirmation updateWho(String who){
		this.mWho = trimString(who);;
		this.changed = true;
		return this;
	}
	public void mergeWho(String who){
		if(who != null) { setWho(who);}
	}
	
	
	public void setComments(String comments){
		this.mComments = trimString(comments);;
	}
	public String getComments(){
		return this.mComments;
	}
	public AccountingDocumentConfirmation updateComments(String comments){
		this.mComments = trimString(comments);;
		this.changed = true;
		return this;
	}
	public void mergeComments(String comments){
		if(comments != null) { setComments(comments);}
	}
	
	
	public void setMakeDate(Date makeDate){
		this.mMakeDate = makeDate;;
	}
	public Date getMakeDate(){
		return this.mMakeDate;
	}
	public AccountingDocumentConfirmation updateMakeDate(Date makeDate){
		this.mMakeDate = makeDate;;
		this.changed = true;
		return this;
	}
	public void mergeMakeDate(Date makeDate){
		setMakeDate(makeDate);
	}
	
	
	public void setVersion(int version){
		this.mVersion = version;;
	}
	public int getVersion(){
		return this.mVersion;
	}
	public AccountingDocumentConfirmation updateVersion(int version){
		this.mVersion = version;;
		this.changed = true;
		return this;
	}
	public void mergeVersion(int version){
		setVersion(version);
	}
	
	

	public  SmartList<AccountingDocument> getAccountingDocumentList(){
		if(this.mAccountingDocumentList == null){
			this.mAccountingDocumentList = new SmartList<AccountingDocument>();
			this.mAccountingDocumentList.setListInternalName (ACCOUNTING_DOCUMENT_LIST );
			//有名字，便于做权限控制
		}
		
		return this.mAccountingDocumentList;	
	}
	public  void setAccountingDocumentList(SmartList<AccountingDocument> accountingDocumentList){
		for( AccountingDocument accountingDocument:accountingDocumentList){
			accountingDocument.setConfirmation(this);
		}

		this.mAccountingDocumentList = accountingDocumentList;
		this.mAccountingDocumentList.setListInternalName (ACCOUNTING_DOCUMENT_LIST );
		
	}
	
	public  void addAccountingDocument(AccountingDocument accountingDocument){
		accountingDocument.setConfirmation(this);
		getAccountingDocumentList().add(accountingDocument);
	}
	public  void addAccountingDocumentList(SmartList<AccountingDocument> accountingDocumentList){
		for( AccountingDocument accountingDocument:accountingDocumentList){
			accountingDocument.setConfirmation(this);
		}
		getAccountingDocumentList().addAll(accountingDocumentList);
	}
	public  void mergeAccountingDocumentList(SmartList<AccountingDocument> accountingDocumentList){
		if(accountingDocumentList==null){
			return;
		}
		if(accountingDocumentList.isEmpty()){
			return;
		}
		addAccountingDocumentList( accountingDocumentList );
		
	}
	public  AccountingDocument removeAccountingDocument(AccountingDocument accountingDocumentIndex){
		
		int index = getAccountingDocumentList().indexOf(accountingDocumentIndex);
        if(index < 0){
        	String message = "AccountingDocument("+accountingDocumentIndex.getId()+") with version='"+accountingDocumentIndex.getVersion()+"' NOT found!";
            throw new IllegalStateException(message);
        }
        AccountingDocument accountingDocument = getAccountingDocumentList().get(index);        
        // accountingDocument.clearConfirmation(); //disconnect with Confirmation
        accountingDocument.clearFromAll(); //disconnect with Confirmation
		
		boolean result = getAccountingDocumentList().planToRemove(accountingDocument);
        if(!result){
        	String message = "AccountingDocument("+accountingDocumentIndex.getId()+") with version='"+accountingDocumentIndex.getVersion()+"' NOT found!";
            throw new IllegalStateException(message);
        }
        return accountingDocument;
        
	
	}
	//断舍离
	public  void breakWithAccountingDocument(AccountingDocument accountingDocument){
		
		if(accountingDocument == null){
			return;
		}
		accountingDocument.setConfirmation(null);
		//getAccountingDocumentList().remove();
	
	}
	
	public  boolean hasAccountingDocument(AccountingDocument accountingDocument){
	
		return getAccountingDocumentList().contains(accountingDocument);
  
	}
	
	public void copyAccountingDocumentFrom(AccountingDocument accountingDocument) {

		AccountingDocument accountingDocumentInList = findTheAccountingDocument(accountingDocument);
		AccountingDocument newAccountingDocument = new AccountingDocument();
		accountingDocumentInList.copyTo(newAccountingDocument);
		newAccountingDocument.setVersion(0);//will trigger copy
		getAccountingDocumentList().add(newAccountingDocument);
		addItemToFlexiableObject(COPIED_CHILD, newAccountingDocument);
	}
	
	public  AccountingDocument findTheAccountingDocument(AccountingDocument accountingDocument){
		
		int index =  getAccountingDocumentList().indexOf(accountingDocument);
		//The input parameter must have the same id and version number.
		if(index < 0){
 			String message = "AccountingDocument("+accountingDocument.getId()+") with version='"+accountingDocument.getVersion()+"' NOT found!";
			throw new IllegalStateException(message);
		}
		
		return  getAccountingDocumentList().get(index);
		//Performance issue when using LinkedList, but it is almost an ArrayList for sure!
	}
	
	public  void cleanUpAccountingDocumentList(){
		getAccountingDocumentList().clear();
	}
	
	
	


	public void collectRefercences(BaseEntity owner, List<BaseEntity> entityList, String internalType){


		
	}
	
	public List<BaseEntity>  collectRefercencesFromLists(String internalType){
		
		List<BaseEntity> entityList = new ArrayList<BaseEntity>();
		collectFromList(this, entityList, getAccountingDocumentList(), internalType);

		return entityList;
	}
	
	public  List<SmartList<?>> getAllRelatedLists() {
		List<SmartList<?>> listOfList = new ArrayList<SmartList<?>>();
		
		listOfList.add( getAccountingDocumentList());
			

		return listOfList;
	}

	
	public List<KeyValuePair> keyValuePairOf(){
		List<KeyValuePair> result =  super.keyValuePairOf();

		appendKeyValuePair(result, ID_PROPERTY, getId());
		appendKeyValuePair(result, WHO_PROPERTY, getWho());
		appendKeyValuePair(result, COMMENTS_PROPERTY, getComments());
		appendKeyValuePair(result, MAKE_DATE_PROPERTY, getMakeDate());
		appendKeyValuePair(result, VERSION_PROPERTY, getVersion());
		appendKeyValuePair(result, ACCOUNTING_DOCUMENT_LIST, getAccountingDocumentList());
		if(!getAccountingDocumentList().isEmpty()){
			appendKeyValuePair(result, "accountingDocumentCount", getAccountingDocumentList().getTotalCount());
			appendKeyValuePair(result, "accountingDocumentCurrentPageNumber", getAccountingDocumentList().getCurrentPageNumber());
		}

		
		return result;
	}
	
	
	public BaseEntity copyTo(BaseEntity baseDest){
		
		
		if(baseDest instanceof AccountingDocumentConfirmation){
		
		
			AccountingDocumentConfirmation dest =(AccountingDocumentConfirmation)baseDest;
		
			dest.setId(getId());
			dest.setWho(getWho());
			dest.setComments(getComments());
			dest.setMakeDate(getMakeDate());
			dest.setVersion(getVersion());
			dest.setAccountingDocumentList(getAccountingDocumentList());

		}
		super.copyTo(baseDest);
		return baseDest;
	}
	public BaseEntity mergeDataTo(BaseEntity baseDest){
		
		
		if(baseDest instanceof AccountingDocumentConfirmation){
		
			
			AccountingDocumentConfirmation dest =(AccountingDocumentConfirmation)baseDest;
		
			dest.mergeId(getId());
			dest.mergeWho(getWho());
			dest.mergeComments(getComments());
			dest.mergeMakeDate(getMakeDate());
			dest.mergeVersion(getVersion());
			dest.mergeAccountingDocumentList(getAccountingDocumentList());

		}
		super.copyTo(baseDest);
		return baseDest;
	}
	
	public String toString(){
		StringBuilder stringBuilder=new StringBuilder(128);

		stringBuilder.append("AccountingDocumentConfirmation{");
		stringBuilder.append("\tid='"+getId()+"';");
		stringBuilder.append("\twho='"+getWho()+"';");
		stringBuilder.append("\tcomments='"+getComments()+"';");
		stringBuilder.append("\tmakeDate='"+getMakeDate()+"';");
		stringBuilder.append("\tversion='"+getVersion()+"';");
		stringBuilder.append("}");

		return stringBuilder.toString();
	}
	
	//provide number calculation function
	

}


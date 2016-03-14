package sde.test;

import java.util.List;
import java.util.ArrayList;

import javax.xml.bind.*;

import introsde.document.soap.*;
import javax.xml.namespace.QName;

import java.io.File;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

//http://192.168.1.8:6901/ws/db?wsdl
//wsimport -keep http://192.168.1.8:6901/ws/db?wsdl

public class StorageClient{
    
    
	public static void main(String[] args) throws Exception {
        
       
        DB db=getDB();
        
        /*JAXBContext jc = JAXBContext.newInstance("soap");
		Marshaller m = jc.createMarshaller();
		m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        */
		//System.out.println("SOAP: http://192.168.1.8:6901/ws/db?wsdl");
        User user=db.getUserById(1L);
        System.out.println(user.getUserName());
        
        User user2=db.getUserById(2L);
        System.out.println(user2.getUserName());
        
        
		
        
    }
    
    public static DB getDB(){
          System.out.println("flaggggggg");
        DBService service= new DBService();
          System.out.println("flaggggggg2222");
        DB db=service.getDBImplPort();
        return db;
    }
    

    public List<Food> getAllFood(){
         System.out.println("flaggggggg");
        
        DB db=getDB();
        List <Food> food=db.getALLFood();
        
        System.out.println(food.size());
        
        System.out.println("flaggggggg");
        return null;
    }
    /*
    //Method #2:

    public Food getFoodById(Long id){
        
        Food food=Food.getByIdFood(id);
        return food;
    }
    
    //Method #3:
    public List <Food> getFoodByCaloriesBound (double calories){
        
        List <Food> food=Food.getByCaloriesBound(calories);
        return food;
    }
    
    
    public List <Food> getFoodByType (String type){
        
        List<Food> food=Food.getByType(type);
        return food;
        
    }
    
    //Method #3:
    public Food createFood (Food food){
        
        return Food.create(food);
        
    }
    
    
    
    ///USER///////////////////////////////////////////////////
    
    //Method #4:
    public List<User> getAllUser(){
        
        List <User> user=User.getAll();
        return user;
    }
    
    
    //Method #5:
    public User getUserById(Long idUser){
        
        User user=User.getById(idUser);
        return user;
    }
    
    //Method #6:
    public User getUserByUsernamePassword(String userName, String password){
        
        User user= User.getByUserNamePassword(userName, password);
        return user;
    }
    
    //Method #7:
    public User createUser (User user){
        
        return User.create(user);
    }
    
    //Method #8:
    public User updateUser (User user){
        
        return User.update(user);
    }
    
    //Method #9:
    public boolean removeUser (User user){
        User.remove(user);
        return true;
    }
    
    //Method #10:
	public User loginUser(String userName, String password){
        
        User user=User.getByUserNamePassword(userName,password);
        return user;
    }
    
    
    //Method #11:
    
	public boolean updatePassword(long id, String firstPassword, String secondPassword){
        //changePasswordc: hangePassword(User user, String unEncryptedPassword
        // return User.updatePassword(id, firstPassword,secondPassword);
        return true;
    }
    
    
    public boolean controlUsernamePassword(String userName, String password){
        
        User user=User.getByUserNamePassword(userName, password);
        if(user!=null){
            
            return true;
        }
        else{
            return false;
        }
    }
    
    ///ACTIVITY//////////////////////////////////////////////////////
    
    //Method #12:
    public List<Activity> getAllActivity(){
        
        List<Activity> activity=Activity.getAll();
        return activity;
    }
    
    //Method #13:
    public Activity getActivityById(Long idActivity){
        
        Activity activity= Activity.getById(idActivity);
        return activity;
    }
    
    //Method #14:
    
    public List<Activity> getActivityByType( String type){
        
        List<Activity> activity= Activity.getByType(type);
        return activity;
    }
    
    //Method #15:
    
    public List<Activity> getActivityByName(String name){
        
        List<Activity> activity=Activity.getByName(name);
        return activity;
    }
    
    //Method #16:
    
    public List<Activity> getActivityByCalories( double calories){
        
        List<Activity> activity= Activity.getByCalories(calories);
        return activity;
    }
    
    
    //Method #17:
    
    public Activity createActivity (Activity activity){
        Activity activity2= Activity.create(activity);
        return activity2;
    }
    
    ///GOAL//////////////////////////////////////////////////////
    
    //Method #18:
    
    public List<Goal> getAllGoal(){
        //to do
        List <Goal> goal= Goal.getAll();
        return goal;
    }
    
    //Method #19:
   
    public Goal getGoalById(Long idGoal){
        
        Goal goal= Goal.getById(idGoal);
        return goal;
    }
    
    //Method #20:
    
    public List<Goal> getGoalByType(String type, long id ){
        
        ////modifacare va solo per user 1
        List <Goal> goal= Goal.getByIdUserType(id,type);
        return goal;
    }
    
    //Method #21:
    
    public List<Goal> getGoalNotAchieved(long id){
        
        ////modifacare va solo per user 1
        List<Goal> goal=Goal.getUnAchieved(id);
        return null;
    }
    
    //Method #21:
   
    public List<Goal> getGoalAchieved(long id){
        
        ////modifacare va solo per user 1
        List<Goal> goal=Goal.getAchieved(id);
        return null;
    }
    
    ///////////mancaaaaaa su database  query////////////////////////
    //Method #22:
    
    public List<Goal> getGoalEndAt(Date endAt){
        
        //to do
        return null;
    }
    
    //Method #23:
    
    public List<Goal> controlGoal(String type){
        //to do
        return null;
    }
    
    
    ///HEALTHMEASURE///////////////////////////////////////////////////////
    
    
    //Method #24:
    
    public List<HealthMeasure> getAllHealthMeasure(){
        
        List<HealthMeasure> healthMeasure= HealthMeasure.getAll();
        return healthMeasure;
    }
    
    //Method #25:
    
    public List<HealthMeasure> getHealthMeasureByIdUser(Long idUser){
        
        List <HealthMeasure> healthMeasure=HealthMeasure.getByIdUser(idUser);
        return healthMeasure;
    }
    ////////////mmm va nella business logic///////////////////
    //Method #26:
    
    public HealthMeasure getRecentHealthMeasureByIdUser(Long idUser){
        
        
        //to do
        return null;
    }
    //////////////////////////////////////////////////////////////////////
    
    //Method #27:
    
    public HealthMeasure createHealthMeasure(HealthMeasure healthMeasure){
        
        HealthMeasure.create(healthMeasure);
        return healthMeasure;
    }
    
    //Method #27:
    
    public HealthMeasure updateHealthMeasure(HealthMeasure healthMeasure){
        
        HealthMeasure.update(healthMeasure);
        return healthMeasure;
        
    }*/

        
}
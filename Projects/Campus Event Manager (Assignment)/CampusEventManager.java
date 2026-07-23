
import java.util.*;
import java.io.*;

class Events{
        private String eventLocation;
        private int eventID;
        private String eventName;
        private int eventCap;
        private String eventDate;
        private String eventTime;

        private ArrayList<String> registeredStudents;
        private Queue<String> waitlist;

        public Events(String location,int id,String name,int capacity, String date, String time){
            this.eventLocation = location;
            this.eventID = id;
            this.eventName = name;
            this.eventCap = capacity;
            this.eventDate = date;
            this.eventTime = time;

            registeredStudents = new ArrayList<>();
            waitlist = new LinkedList<>();
        };
        //Setters:
        public void setEventLocation(String loc){
            eventLocation = loc;

        };
        public void setEventName(String name){
            eventName = name;

        }
        public void setEventCap(int cap){
            if(cap > 0){
                eventCap = cap;
            }else{
                System.out.println("Enter a valid number.");
            };
        }
        public void setEventID(int id){
            
            if(id > 0){
               eventID = id; 
            }else{
                System.out.println("Enter a valid number.");
            }; 
        }
        public void setEventDate(String date) {
        eventDate = date;
        }

        public void setEventTime(String time) {
            eventTime = time;
        }

        //Getters:
        public String getEventLocation(){
            return eventLocation;
        }
        public String getEventName(){
            return eventName;
        }
        public int getEventID(){
            return eventID;
        }
        public int getEventCap(){
            return eventCap;
        }
         public String getEventDate() {
        return eventDate;
        }

        public String getEventTime() {
            return eventTime;
        }

        public ArrayList<String> getRegisteredStudents() {
        return registeredStudents;
        }

        public Queue<String> getWaitlist() {
            return waitlist;
        }

        //DISPLAY EVENTS
        void displayEvents(){
            System.out.println("-----------------------------------");
            System.out.println("Event ID: " + eventID);
            System.out.println("Event Name: " + eventName);
            System.out.println("Location: " + eventLocation);
            System.out.println("Date: " + eventDate);
            System.out.println("Time: " + eventTime);
            System.out.println("Capacity: " + eventCap);
            System.out.println("-----------------------------------");


        }
    }        
class EventManager{      
    HashMap<Integer, Events> eventMap = new HashMap<>();
    Scanner input = new Scanner(System.in);
    ArrayList<Events> events = new ArrayList<>();


    //SEARCHING EVENTS
    public Events searchEventByID(int id){
        if(eventMap.containsKey(id)){
            return eventMap.get(id);
        }
        return null;
    }

    //CREATE EVENTS
    public void createEvents(){
        
        boolean repeat = true;

        do{

            System.out.println("Please add Event - Name: ");
            String name = input.nextLine();
                                
            System.out.println("Please add Event - Location: ");
            String location = input.nextLine();
                                
            System.out.println("Please add Event - ID: ");
            int id = input.nextInt();
            input.nextLine();

            if(eventMap.containsKey(id)){
                System.out.println("Event ID already exists!");
            }else{

            }
            System.out.println("Please add Event Date (dd/mm/yyyy): ");
            String date = input.nextLine();

            System.out.println("Please add Event Time (HH:mm): ");
            String time = input.nextLine();
            
                                
            System.out.println("Please add the maximum participants: ");
            int cap = input.nextInt();
            input.nextLine();

            
            //Creating Objects to store event data
            Events e1 = new Events(
                location,
                id,
                name,
                cap,
                date,
                time
                );

            events.add(e1);
            eventMap.put(id, e1);

            saveToFile();

            System.out.println("Event created Successful!");

            System.out.println("Do you ADD antoher Event[Y/N]: ");
            String addResult = input.nextLine();
                                
            if(addResult.equalsIgnoreCase("N")){
                repeat = false;
            };

            }while(repeat);
            

    };

    //EDIT EVENTS
    public void editEvents(){
        
        System.out.println("Enter EVETN ID:");
        int id = input.nextInt();
        input.nextLine();

        Events e1 = searchEventByID(id);

        if(e1 == null){

            System.out.println("Event not Found");
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Please choose a option:" );
        System.out.println("""
                                                ----------------------------------------
                                                [1] --> Edit (ID)
                                                [2] --> Edit (Name)
                                                [3] --> Edit (Location)
                                                [4] --> Edit (Participants)
                                                [5] --> Edit (Date)
                                                [6] --> Edit (Time)
                                                ----------------------------------------
                            """);  
                         
        int optionEdit = input.nextInt();
        input.nextLine();

        switch(optionEdit){
            case 1:

                System.out.println("Enter a new ID: ");
                int newEventID = input.nextInt();
                
                input.nextLine();

                e1.setEventID(newEventID);

                break;
            case 2:

                System.out.println("Enter the new Name: ");
                String newEventName = input.nextLine();
                
                e1.setEventName(newEventName);

                break;
            case 3:

                System.out.println("Enter the new Location: ");
                String newEventLocation = input.nextLine();

                e1.setEventLocation(newEventLocation);

                break;
            case 4:

                System.out.println("Enter the new Capacity: ");
                int newEventCap = input.nextInt();
                input.nextLine();

                e1.setEventCap(newEventCap);

                break;
            case 5:

                System.out.println("Enter New Date:");
                String newDate = input.nextLine();

                e1.setEventDate(newDate);
                break;
            case 6:

                System.out.println("Enter New Time:");
                String newTime = input.nextLine();

                e1.setEventTime(newTime);
                break;    
            default:
                System.out.println("Please enter a valid option!");
                break;
        } 

        saveToFile();

        System.out.println("Event is updated!");                   
 
    };

    //VIEW EVENTS
    public void viewEvents(){

        if(events.isEmpty()){
            System.out.println("No events Found!");
            return;
        }
        for(Events e1 : events){
            e1.displayEvents();
        }

    };

    //DELETE EVENTS
    public void deleteEvents(){
        
        System.out.println("Enter a EVENT ID:");
        int id = input.nextInt();
        
        Events e1 = searchEventByID(id);

        if(e1 == null){
            System.out.println("Event not Found");
            return;
        }

        events.remove(e1);
        eventMap.remove(id);

        saveToFile();
        System.out.println("Event has been deleted!");

    };


    /*void studentView(){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("Please enter EVENT ID");
        int studentRegisterID = input.nextInt();
        
    };*/ 
    
    //REGISTER STUDENTS
    public void studentRegister(){

        System.out.println("Enter EVENT ID");
        int eventID = input.nextInt();

        System.out.println("Enter STUDENT ID");
        String studentID = input.nextLine();

        Events e1 = searchEventByID(eventID);
        
        if(e1 == null) {
            System.out.println("Event not found.");
            return;
        }

        //CHECKING EVENT SPACE FOR AVALIABILITY
        if(e1.getRegisteredStudents().size() < e1.getEventCap()){
           
            e1.getRegisteredStudents().add(studentID);
            System.out.println("STUDENT REGISTERED!");
    
        }else{
            e1.getWaitlist().add(studentID);

            System.out.println("EVENT FULL!");
            System.out.println(studentID + "Student Added to Waitlist!");

        };
        saveToFile();

    };
    
    //CANCEL REGISTRATION
    public void studentCancel(){
        System.out.println("Enter EVENT ID");
        int id = input.nextInt();

        System.out.println("Enter STUDENT ID");
        String studentID = input.nextLine();

        Events e1 = searchEventByID(id);
        if(e1 == null) {
            System.out.println("Event not found.");
            return;
        }

        if(e1.getRegisteredStudents().contains(studentID)){
            
            e1.getRegisteredStudents().remove(studentID);
            System.out.println("Registration CANCELLED!");

            Thread processing = new Thread(() -> {
                if(!e1.getWaitlist().isEmpty()){
                    String chosenStudent = e1.getWaitlist().poll();

                    e1.getRegisteredStudents().add(chosenStudent);

                    System.out.println(chosenStudent + "Has been Promoted!");
                }

            });

            processing.start();

        }else{
            System.out.println("Student has not been Registed");
        };

        saveToFile();
    }; 


    //VIEW STUDENT EVENTS AVALIABLE
    public void studentView(){
        System.out.println("Enter the STUDENT ID");
        String studentID = input.nextLine();

        boolean isRegisted = false;

        for(Events e1 : events){
            if(e1.getRegisteredStudents().contains(studentID)){
                System.out.println( studentID +"is registered for:" + e1.getEventName());
                isRegisted = true;
            }
        }

        if(!isRegisted){
            System.out.println("Student is not registered");
        }

    };
    
    public void saveToFile(){
        try{

            FileWriter writer = new FileWriter("events.txt");

            for(Events e1 : events){
                writer.write(
                    "-------------------------------------------------------\n"+
                    "ID:" + e1.getEventID() + "\n" +
                    "Name:" + e1.getEventName() + "\n" +
                    "Location: " + e1.getEventLocation() + "\n" +
                    "Capacity: " + e1.getEventCap() + "\n" +
                    "Date: " + e1.getEventDate() + "\n" +
                    "Time: " + e1.getEventTime() + "\n" +
                    "Registered: " + e1.getRegisteredStudents() + "\n" +
                    "Waitlist: " + e1.getWaitlist() + "\n" +
                    "-------------------------------------------------------\n"
                );
            }
            writer.close();

        }catch(IOException e){

            System.out.println("Error Saving File");
        }
    }
};


public class CampusEventManager {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        EventManager manager = new EventManager();

        boolean option = true;

        do{
            System.out.println("---------------------------------------------------------");
            System.out.println("----- Welcome to the CAMPUS EVENT MANAGEMENT SYSTEM -----");
            System.out.println("---------------------------------------------------------");
            System.out.println("""
                                Please choose a option:
                                [1] --> For STAFF
                                [2] --> For STUDENT
                                """);    
                                        
            int prompt = input.nextInt();
            input.nextLine();

            if(prompt == 1){
                System.out.println("---------------------------------------------------------");
                System.out.println("----WELCOME STAFF MEMBER----");
                System.out.println("---------------------------------------------------------");
                System.out.println("""
                        What would like to do:
                        [1] --> CREATE a Event
                        [2] --> EDIT a Event
                        [3] --> VIEW a Event
                        [4] --> DELETE a Event
                        """);
                
                int numOption = input.nextInt();
                input.nextLine();
                
                switch(numOption){
                    case 1:

                        //Creating a Event
                        System.out.println("---------------------------------------------------------");
                        System.out.println("          ----Creating A Event----");
                        System.out.println("---------------------------------------------------------");
                        manager.createEvents();

                        break;
                    case 2:

                        //Editing A EVENT
                        System.out.println("---------------------------------------------------------");
                        System.out.println("----Editing A Event----");
                        System.out.println("---------------------------------------------------------");
                        manager.editEvents();

                        break;
                    case 3:

                        //VIEW A EVENT
                        System.out.println("---------------------------------------------------------");
                        System.out.println("          ----View A Event----");
                        System.out.println("---------------------------------------------------------");
                        manager.viewEvents();
                        
                        break;
                    case 4:

                        //DELETE A EVENT
                        System.out.println("---------------------------------------------------------");
                        System.out.println("          ----Deleting A Event----");
                        System.out.println("---------------------------------------------------------");
                        
                        manager.deleteEvents();

                        break;

                    default:
                        System.out.println("Please a enter a valid option.");
                        break;
                };

            }else if(prompt == 2){

                //This is for Students
            
                System.out.println("---------------------------------------------------------");
                System.out.println("""
                        What would like to do:
                        [1] --> REGISTER FOR a Event
                        [2] --> CANCEL REGISTRATION a Event
                        [3] --> VIEW REGISTRATION
                        """);

                int studentChoice = input.nextInt();
                input.nextLine();

                switch (studentChoice) {
                    case 1:
                        System.out.println("---------------------------------------------------------");
                        System.out.println("          ----REGISTER A Event----");
                        System.out.println("---------------------------------------------------------");
                        
                        manager.studentRegister();
                        
                        break;
                    case 2:

                        System.out.println("---------------------------------------------------------");
                        System.out.println("          ----VIEW Event----");
                        System.out.println("---------------------------------------------------------");
                        manager.studentView();
                        
                        break;

                    case 3:

                        System.out.println("---------------------------------------------------------");
                        System.out.println("          ----CANCEL REGISTRATION A Event----");
                        System.out.println("---------------------------------------------------------");
                        manager.studentCancel();

                        break;
                    default:

                        System.out.println("Please enter EVENT NAME or ID");
                        break;
                }

            }else{
                //This is a invalid value.Try again.
                System.out.println("Please enter a valid option!");
            };

            System.out.println("Do you want to continue using the program [Y/N]");
            String answer = input.next();
            
            if(answer.equalsIgnoreCase("Y")){
                option = true;
            }else{
                option = false;
            };

        }while(option);

    };
    
}; 

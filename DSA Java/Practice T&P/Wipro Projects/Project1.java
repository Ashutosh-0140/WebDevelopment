public class Project1{
    public static void main(String s[]){
        String EmpData[][] = {{"1001","Ashish","01/04/2009","e","R&D","20000"},
                              {"1002","Sushma","01/04/2009","e","R&D","20000"},
                              {"1003","Rahul","01/04/2009","e","R&D","20000"},
                              {"1004","Chahat","01/04/2009","e","R&D","20000"},
                              {"1005","Ranjan","01/04/2009","e","R&D","20000"},
                              {"1006","Suman","01/04/2009","e","R&D","20000"},
                              {"1007","Tanmay","01/04/2009","e","R&D","20000"}};

                            
        boolean found = false;
        if(s.length==0){
            System.out.println("Please enter the employee Id to get data");
        }else{
            String empId = s[0];
            for (String[] emp : EmpData) {
                if (emp[0].equals(empId)) {
                    System.out.println("Emp No.  Emp Name  Department  Designation  Salary");
                    System.out.println(emp[0] + "     " + emp[1] + "     " + emp[2] + "        " + emp[3] + "        " + emp[4]);
                    found = true;
                    break;
                }
            }
        }
        if(!found){
            System.out.println("Not a valid Employee Id");
        }
    }
}
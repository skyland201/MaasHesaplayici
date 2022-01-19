public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;


    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    double raiseSalary(){
        int çalışmaYılı=2021;
        double maaşArtışı;
        if((çalışmaYılı-this.hireYear)<10){
            maaşArtışı=this.salary*0.05;
        }else if((çalışmaYılı-this.hireYear)>=10&&(çalışmaYılı-this.hireYear)<20){
            maaşArtışı=this.salary*0.1;
        }else{
            maaşArtışı=this.salary*0.15;
        }
        return maaşArtışı;

    }double bonus(){
        int bonus=0;
        if((this.workHours-40)!=0){
            bonus=(this.workHours-40)*30;
        }
return bonus;

    }
    double tax(){
        double tax=0;
if(salary>1000)
    tax=salary*0.03;
        return tax;

    }




    void toStrings(){
        System.out.println("Adı : "+this.name+"\n"+"Maaşı : "+this.salary+"\n"+"Çalışma saati : "+workHours+"\n"+"Başlangıç yılı : "+hireYear+"\nVergi : "+tax()+"\nBonus : "
        +bonus()+"\nMaaş artışı : "+raiseSalary()+"\nVergi ve bonuslar ile birlikte maaş : "+(this.salary-this.tax()+this.bonus())+"\nToplam Maaş : "+(this.salary+raiseSalary()));





    }
}

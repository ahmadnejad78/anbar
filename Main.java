package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {

        System.out.println("***** sherkat varedate maske novin ****** \n\n\n");
        System.out.println("shahre khod ra moshakhas konid :\n1.mashad\n2.saier");
        Scanner entekhab = new Scanner(System.in);
        int gozine = entekhab.nextInt();
        //انتخاب شهر
        switch(gozine){
            case 1:
                System.out.println("noie kalaie khod ra entekhab konid : \n1.filterdar\n2.sade");
                int z = entekhab.nextInt();
                switch(z){
                    //فیلتر دار
                    case 1:
                        Warehouse a =new filter();
                        tedad b = new Ftedad();
                        System.out.println("tedad darkhasti khod ra vared konid:");
                        int sefaresh=entekhab.nextInt();
                        if(b.t(sefaresh)){
                            System.out.println("gheymat nahaie:"+a.gheymat(sefaresh)+"toman ast.\n");
                        }
                        else{
                            System.out.println("in tedad kala dar annbar mojod nembashad");
                            break;
                        }
                        System.out.println("shoma baraie sabte nahaie khod bayad 50% hazine sefaresh khod(yani meghdare zir) ra pardakht konid:");

                        b.darsad(a.gheymat(sefaresh));
                        List<String> l1 = new ArrayList<String>();
                        l1.add("1.sabte nahaie\n");
                        l1.add("2.enseraf");
                        System.out.println(l1);
                        int l=entekhab.nextInt();
                        switch(l){
                            case 1:
                                System.out.println("shomare hesab:\n6037997472627588\n****************");
                                System.out.println("shomare jahat peygiri sefareshat : \n0915600000\n**************");
                                System.out.println("montazere sefareshat badi shoma hastim....nmmnon az kharid shoma");
                                break;
                            case 2:
                                System.out.println("montazere sefareshate shoma hastim\n********\nkhoda negahdar");
                                break;
                        }
                        break;
                    //sade
                    case 2:
                        Warehouse c = new rangi();
                        tedad d= new Rtedad();
                        System.out.println("tedad darkhasti khod ra vared konid:");
                        int safar=entekhab.nextInt();
                        if(d.t(safar)){
                            System.out.println("***********\ngheymat nahaie:"+c.gheymat(safar)+"toman ast.\n***********\n");
                        }
                        else{
                            System.out.println("in tedad kala dar anbar mojod nembashad");
                            break;
                        }
                        System.out.println("shoma baraie sabte nahaie khod bayad 50% hazine sefaresh khod(yani meghdare zir) ra pardakht konid:");
                        d.darsad(c.gheymat(safar));
                        System.out.println("***********\n1.sabte nahaie\n2.enseraf");
                        int k=entekhab.nextInt();
                        switch(k){
                            case 1:
                                System.out.println("shomare hesab:\n6037997472627588\n****************");
                                System.out.println("shomare jahat peygiri sefareshat : \n0915600000\n**************");
                                System.out.println("montazere sefareshat badi shoma hastim...mamnon az kharid shoma");
                                break;
                            case 2:
                                System.out.println("montazere sefareshate shoma hastim\n********\nkhoda negahdar");
                                break;
                        }
                        break;
                }
                break;
            case 2:
                System.out.println("ersal be saiere shahr ha ta etelae sanavi emkan pazir nemibashad....");
                break;
        }
    }
}










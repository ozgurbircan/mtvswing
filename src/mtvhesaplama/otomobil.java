/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mtvhesaplama;

/**
 *
 * @author Lenovo
 */
public class otomobil  extends mtv
{
    public int otohesap(int hacim,int yas)
    {
            
        String [] otomobilhacim={"0-1300","1301-1600","1601-1800","1801-2000","2001-2500","2501-3000","3001-3500","3501-4000","4001-999999"};
        String[] otomobilyasi={"1-3","4-6","7-11","12-15","16-99"};
        int [][] otomobil=new int[9][5];
//          hacim yas
       // otomobil[0][1]=5;
       //0-1300
        otomobil[0][0]=646;
        otomobil[0][1]=450;
        otomobil[0][2]=252;
        otomobil[0][3]=191;
        otomobil[0][4]=68;
        
        //1300-1600
        otomobil[1][0]=1035;
        otomobil[1][1]=776;
        otomobil[1][2]=450;
        otomobil[1][3]=318;
        otomobil[1][4]=122;
        
        //1601-1800
        otomobil[2][0]=1827;
        otomobil[2][1]=1428;
        otomobil[2][2]=841;
        otomobil[2][3]=513;
        otomobil[2][4]=199;
        //18-2
        otomobil[3][0]=2878;
        otomobil[3][1]=2217;
        otomobil[3][2]=1303;
        otomobil[3][3]=776;
        otomobil[3][4]=306;
        //2-25
        otomobil[4][0]=4317;
        otomobil[4][1]=3134;
        otomobil[4][2]=1958;
        otomobil[4][3]=1170;
        otomobil[4][4]=463;
        
        //25-30
        otomobil[5][0]=6019;
        otomobil[5][1]=5236;
        otomobil[5][2]=3271;
        otomobil[5][3]=1760;
        otomobil[5][4]=646;
        //3-35
        otomobil[6][0]=9166;
        otomobil[6][1]=8247;
        otomobil[6][2]=4968;
        otomobil[6][3]=2480;
        otomobil[6][4]=910;
        
        //35-4
        otomobil[7][0]=14411;
        otomobil[7][1]=12444;
        otomobil[7][2]=7369;
        otomobil[7][3]=3271;
        otomobil[7][4]=1303;
    
        //4 ve üzerisi
        otomobil[8][0]=23586;
        otomobil[8][1]=17687;
        otomobil[8][2]=10475;
        otomobil[8][3]=4708;
        otomobil[8][4]=1827;
        
        
        return otomobil[hacim][yas];
    
    
    }
    
    
}

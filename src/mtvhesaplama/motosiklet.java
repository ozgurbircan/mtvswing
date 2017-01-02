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
public class motosiklet {
    
    public int motohesap(int hacim,int yas)
    {
        //hacim ve yaş
        int [][] motosiklet=new int[4][5];
        
        motosiklet[0][0]=122;
        motosiklet[0][1]=92;
        motosiklet[0][2]=68;
        motosiklet[0][3]=43;
        motosiklet[0][4]=17;
        
        motosiklet[1][0]=252;
        motosiklet[1][1]=191;
        motosiklet[1][2]=122;
        motosiklet[1][3]=68;
        motosiklet[1][4]=43;
        
        motosiklet[2][0]=646;
        motosiklet[2][1]=385;
        motosiklet[2][2]=191;
        motosiklet[2][3]=122;
        motosiklet[2][4]=68;
        
        motosiklet[3][0]=1565;
        motosiklet[3][1]=1035;
        motosiklet[3][2]=646;
        motosiklet[3][3]=513;
        motosiklet[3][4]=252;
        
        return motosiklet[hacim][yas];

        
    
    }
    
}

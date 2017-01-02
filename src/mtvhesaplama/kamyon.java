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
public class kamyon {
    
    public int kamyonhesap(int hacim,int yas)
    {
    int [][] kamyon=new int[6][3];
    kamyon[0][0]=697;
    kamyon[0][1]=463;
    kamyon[0][2]=228;
    
    kamyon[1][0]=1408;
    kamyon[1][1]=817;
    kamyon[1][2]=463;
    
    kamyon[2][0]=2115;
    kamyon[2][1]=1760;
    kamyon[2][2]=697;
    
    kamyon[3][0]=2348;
    kamyon[3][1]=1995;
    kamyon[3][2]=936;
    
    kamyon[4][0]=2821;
    kamyon[4][1]=2348;
    kamyon[4][2]=1408;
    
    kamyon[5][0]=3529;
    kamyon[5][1]=2821;
    kamyon[5][2]=1640;
    
    return kamyon[hacim][yas];
    }
    
}

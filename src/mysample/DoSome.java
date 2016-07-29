/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mysample;

/**
 *
 * @author regio
 */
public class DoSome {
    private String val;
    
    public DoSome(){
        val = "";
    }

    public String getVal() {
        return val;
    }

    public void setVal(String val) {
        this.val = val;
    }
    
    public boolean compareInts(int a, int b){
        return a==b;
    }
    
    public String sayHello(){
        return "Hello World";
    }
    
    public String saySomething(String tex){
        if(tex!=null && !tex.equals("")&&tex.length()>0)
            return "Im saying: "+tex;
        return "not able to say something";
    }
}


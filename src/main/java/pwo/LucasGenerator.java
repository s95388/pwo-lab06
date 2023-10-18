/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;

/**
 *
 * @author student
 */
public class LucasGenerator {
    private BigDecimal n1 = new BigDecimal(2), 
            n2 = new BigDecimal(1), 
            n3 = new BigDecimal(0);
    
    public void Get() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Lucas.txt"));

            int n = 100;
            
            if (n > 1) {
                writer.write("\n2\n1");
                for (int i = 2; i < n; ++i) {
                    n3 = n2;
                    n2 = n2.add(n1);
                    n1 = n3;
                    writer.write("\n"+n2);
                }
            } else {
                writer.write("\n"+n2);
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("ex");
        }
    }
;
}

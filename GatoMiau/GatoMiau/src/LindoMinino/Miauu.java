/*
 https://github.com/Arthur18aa/3IV9_Andrade_Aguilar_Arturo_Imanol.git
https://github.com/CesaRLB17/3IV9-Lopez-Bastida-Cesar-Ricardo.git
 */
package LindoMinino;

import Principal.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author andra
 */
public class Miauu extends javax.swing.JFrame {
    
    private String empezarJuego ="X";
    private int  xContador = 0;
    private int oContador = 0;
    
    

    /**
     * Creates new form Miauu
     */
    public Miauu() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
        
    }

    private void MarcadorJuego()
    {
        jJugadorX.setText(String.valueOf(xContador));
        jJugadorO.setText(String.valueOf(oContador));
        
    }
    
    private void EscogeUnJugador()
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            empezarJuego="O";
        }
        else
        {
            empezarJuego="X";
        }
    }
    
    private void juegoGanadorX()
    {
            String b1  = jButton1.getText();
            String b2  = jButton6.getText();
            String b3  = jButton7.getText();
        
            String b4  = jButton2.getText();
            String b5  = jButton5.getText();
             String b6  = jButton8.getText();
        
             String b7  = jButton3.getText();
             String b8  = jButton4.getText();
             String b9  = jButton9.getText();
       
             
                 if (b1 ==("X") && b2 ==("X") && b3 ==("X"))
                     
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton1.setBackground(Color.YELLOW);
                 jButton6.setBackground(Color.YELLOW);
                 jButton7.setBackground(Color.YELLOW);
            
        }
                 
                  if (b4 ==("X") && b5 ==("X") && b6 ==("X"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton2.setBackground(Color.CYAN);
                 jButton5.setBackground(Color.CYAN);
                 jButton8.setBackground(Color.CYAN);
            
        }
                  if (b7 ==("X") && b8 ==("X") && b9 ==("X"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton3.setBackground(Color.MAGENTA);
                 jButton4.setBackground(Color.MAGENTA);
                 jButton9.setBackground(Color.MAGENTA);
            
        }
                   if (b1 ==("X") && b4 ==("X") && b7 ==("X"))
                     
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton1.setBackground(Color.GREEN);
                 jButton2.setBackground(Color.GREEN);
                 jButton3.setBackground(Color.GREEN);
            
        }
                 
                  if (b2 ==("X") && b5 ==("X") && b8 ==("X"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton6.setBackground(Color.PINK);
                 jButton5.setBackground(Color.PINK);
                 jButton4.setBackground(Color.PINK);
            
        }
                  if (b3 ==("X") && b6 ==("X") && b9 ==("X"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton7.setBackground(Color.ORANGE);
                 jButton8.setBackground(Color.ORANGE);
                 jButton9.setBackground(Color.ORANGE);
            
        }
                   if (b1 ==("X") && b5 ==("X") && b9 ==("X"))
                     
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton1.setBackground(Color.RED);
                 jButton5.setBackground(Color.RED);
                 jButton9.setBackground(Color.RED);
            
        }
                 
                  if (b3 ==("X") && b5 ==("X") && b7 ==("X"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador X ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                xContador++;
            
                MarcadorJuego();
            
                 jButton7.setBackground(Color.RED);
                 jButton5.setBackground(Color.RED);
                 jButton3.setBackground(Color.RED);
            
        }
    }
    
    private void juegoGanadorO()
    {
            String b1  = jButton1.getText();
            String b2  = jButton6.getText();
            String b3  = jButton7.getText();
        
            String b4  = jButton2.getText();
            String b5  = jButton5.getText();
             String b6  = jButton8.getText();
        
             String b7  = jButton3.getText();
             String b8  = jButton4.getText();
             String b9  = jButton9.getText();
       
             
                 if (b1 ==("O") && b2 ==("O") && b3 ==("O"))
                     
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton1.setBackground(Color.YELLOW);
                 jButton6.setBackground(Color.YELLOW);
                 jButton7.setBackground(Color.YELLOW);
            
        }
                 
                  if (b4 ==("O") && b5 ==("O") && b6 ==("O"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton2.setBackground(Color.CYAN);
                 jButton5.setBackground(Color.CYAN);
                 jButton8.setBackground(Color.CYAN);
            
        }
                  if (b7 ==("O") && b8 ==("O") && b9 ==("O"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton3.setBackground(Color.MAGENTA);
                 jButton4.setBackground(Color.MAGENTA);
                 jButton9.setBackground(Color.MAGENTA);
            
        }
                   if (b1 ==("O") && b4 ==("O") && b7 ==("O"))
                     
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton1.setBackground(Color.GREEN);
                 jButton2.setBackground(Color.GREEN);
                 jButton3.setBackground(Color.GREEN);
            
        }
                 
                  if (b2 ==("O") && b5 ==("O") && b8 ==("O"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton6.setBackground(Color.PINK);
                 jButton5.setBackground(Color.PINK);
                 jButton4.setBackground(Color.PINK);
            
        }
                  if (b3 ==("O") && b6 ==("O") && b9 ==("O"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton7.setBackground(Color.ORANGE);
                 jButton8.setBackground(Color.ORANGE);
                 jButton9.setBackground(Color.ORANGE);
            
        }
                   if (b1 ==("O") && b5 ==("O") && b9 ==("O"))
                     
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton1.setBackground(Color.BLUE);
                 jButton5.setBackground(Color.BLUE);
                 jButton9.setBackground(Color.BLUE);
            
        }
                 
                  if (b3 ==("O") && b5 ==("O") && b7 ==("O"))
                      
        {
                JOptionPane.showMessageDialog(this, "Jugador O ha ganado","Gato", JOptionPane.INFORMATION_MESSAGE);
                oContador++;
            
                MarcadorJuego();
            
                 jButton7.setBackground(Color.BLUE);
                 jButton5.setBackground(Color.BLUE);
                 jButton3.setBackground(Color.BLUE);
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Miauu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jugadorX = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jJugadorX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jugadorO = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jJugadorO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButReset = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gato");

        Miauu.setBackground(new java.awt.Color(255, 102, 102));
        Miauu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Miauu.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 98)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GATO");
        Miauu.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 0, 102));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jugadorX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jugadorX.setText("X:");
        jPanel6.add(jugadorX, java.awt.BorderLayout.LINE_END);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setText("Ingresa tu nombre");
        jPanel6.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jJugadorX.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jJugadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jJugadorX.setText("0");
        jPanel7.add(jJugadorX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jugadorO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jugadorO.setText("O:");
        jPanel11.add(jugadorO, java.awt.BorderLayout.LINE_END);

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setText("Ingresa tu nombre");
        jPanel11.add(jTextField2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jJugadorO.setFont(new java.awt.Font("Tahoma", 3, 48)); // NOI18N
        jJugadorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jJugadorO.setText("0");
        jPanel12.add(jJugadorO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jButReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButReset.setText("Reset");
        jButReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButResetActionPerformed(evt);
            }
        });
        jPanel16.add(jButReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        Miauu.add(jPanel2, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nota: No cierres ninguna ventana y actualiza los puntajes en el lobby. Recuerda bien tus puntuaciones ya que se actualizan de manera maual.");
        Miauu.add(jLabel2, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Miauu, javax.swing.GroupLayout.DEFAULT_SIZE, 1457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Miauu, javax.swing.GroupLayout.DEFAULT_SIZE, 792, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        jButton1.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton1.setForeground(Color.BLUE);
        }
        else
        {
             jButton1.setForeground(Color.RED);
        }
        EscogeUnJugador();
        juegoGanadorX();
        juegoGanadorO();
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private JFrame frame;
    private void jButResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButResetActionPerformed
       
            jButton1.setText(null);
            jButton2.setText(null);
            jButton3.setText(null);
            
            jButton4.setText(null);
            jButton5.setText(null);
            jButton6.setText(null);
            
            jButton7.setText(null);
            jButton8.setText(null);
            jButton9.setText(null);
        
            jButton1.setBackground(Color.LIGHT_GRAY);
            jButton2.setBackground(Color.LIGHT_GRAY);
            jButton3.setBackground(Color.LIGHT_GRAY);
            
            jButton4.setBackground(Color.LIGHT_GRAY);
            jButton5.setBackground(Color.LIGHT_GRAY);
            jButton6.setBackground(Color.LIGHT_GRAY);
            
            jButton7.setBackground(Color.LIGHT_GRAY);
            jButton8.setBackground(Color.LIGHT_GRAY);
            jButton9.setBackground(Color.LIGHT_GRAY);
            
    }//GEN-LAST:event_jButResetActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton6.setForeground(Color.BLUE);
        }
        else
        {
             jButton6.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        jButton7.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton7.setForeground(Color.BLUE);
        }
        else
        {
             jButton7.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }//GEN-LAST:event_jButton7ActionPerformed
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         jButton2.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton2.setForeground(Color.BLUE);
        }
        else
        {
             jButton2.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
        juegoGanadorO();
        
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         jButton5.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton5.setForeground(Color.BLUE);
        }
        else
        {
             jButton5.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         jButton8.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton8.setForeground(Color.BLUE);
        }
        else
        {
             jButton8.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }//GEN-LAST:event_jButton8ActionPerformed
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton3.setForeground(Color.BLUE);
        }
        else
        {
             jButton3.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         jButton4.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton4.setForeground(Color.BLUE);
        }
        else
        {
             jButton4.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
         jButton9.setText(empezarJuego);
    {
        if(empezarJuego.equalsIgnoreCase("X"))
        {
            jButton9.setForeground(Color.BLUE);
        }
        else
        {
             jButton9.setForeground(Color.RED);
        }
        EscogeUnJugador();
         juegoGanadorX();
         juegoGanadorO();
         
    }
    
    }//GEN-LAST:event_jButton9ActionPerformed
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Miauu;
    private javax.swing.JButton jButReset;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jJugadorO;
    private javax.swing.JLabel jJugadorX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel jugadorO;
    private javax.swing.JLabel jugadorX;
    // End of variables declaration//GEN-END:variables

}
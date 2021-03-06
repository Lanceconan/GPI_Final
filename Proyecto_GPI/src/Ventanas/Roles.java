/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ventanas;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import javax.swing.UIManager;

/**
 *
 * @author John
 */
public class Roles extends javax.swing.JFrame {

    /**
     * Creates new form Roles
     */
    public Roles() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rol = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ambiente = new javax.swing.JLabel();
        funcion = new javax.swing.JLabel();
        bibliograficos = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        habilidades = new javax.swing.JLabel();
        competencias = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        necesidades = new javax.swing.JLabel();
        menu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nivel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Roles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 16))); // NOI18N

        rol.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Rol ...", "Auxiliar de aseo", "Reponedor", "Guardia", "Operador de máquinas", "Secretaria", "Vendedor", "Encargado de seguridad", "Encargado de máquinas", "Encargado de personal", "Coordinador", "Encargado de local", "Auditoria", "Gerente Fiscalía", "Gerente de Marketing", "Gerente de RRHH", "Gerente de operaciones", "Gerente de finanzas", "Gerente general" }));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rol, 0, 368, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setText("Roles de la Empresa");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 16))); // NOI18N

        ambiente.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        funcion.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        bibliograficos.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel4.setText("Factores Ambientales:");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel5.setText("Funcion:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel7.setText("Factores Bibliográficos:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel8.setText("Habilidades:");

        habilidades.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        competencias.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel11.setText("Competencias:");

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel12.setText("Necesidades:");

        necesidades.setFont(new java.awt.Font("Trebuchet MS", 2, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ambiente, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bibliograficos, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(competencias, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(necesidades, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(habilidades, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(competencias, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(necesidades, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ambiente, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bibliograficos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menu.png"))); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel1.setText("Volver al Menu Principal");

        nivel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(menu)
                                .addGap(25, 25, 25))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(13, 13, 13))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(nivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(menu))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(nivel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        // TODO add your handling code here:
        Inicio ventana = new Inicio();
        this.dispose();
        Encuesta.setDefaultLookAndFeelDecorated(true);
        ventana.setVisible(true);
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(Encuesta.DO_NOTHING_ON_CLOSE);
        ventana.setTitle("Encuesta | Postulante");
        Image icono;
        icono = Toolkit.getDefaultToolkit().getImage("src/Imagenes/rol.png");
        ventana.setIconImage(icono);
        ventana.getRootPane().setFont(UIManager.getFont("SystemFont"));
    }//GEN-LAST:event_menuActionPerformed

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
        String roles = (String) rol.getSelectedItem();
        
        switch (roles) {
            case "Auxiliar de aseo":                
                nivel.setText("Nivel Operacional");
                funcion.setText("<html><center>Encargado de mantener limpias las instalaciones.</center></html>");
                ambiente.setText("<html><center>Desigualdad pronunciada</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Armónico</center></html>");
                competencias.setText("<html><center>Básicas</center></html>");
                necesidades.setText("<html><center>Predomina X</center></html>");
                break;
            case "Reponedor":
                nivel.setText("Nivel Operacional");
                funcion.setText("<html><center>Se preocupa de reponer items sin stock.</center></html>");
                ambiente.setText("<html><center>Desigualdad pronunciada</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Armónico, Flexible</center></html>");
                competencias.setText("<html><center>Básicas</center></html>");
                necesidades.setText("<html><center>Predomina X</center></html>");
                break;
            case "Operador de máquinas":
                nivel.setText("Nivel Operacional");
                funcion.setText("<html><center>Maneja las máquinas para la producción.</center></html>");
                ambiente.setText("<html><center>Desigualdad pronunciada</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Armónico</center></html>");
                competencias.setText("<html><center>Técnicas</center></html>");
                necesidades.setText("<html><center>Predominante X, Metas Generales, Factor Extrínseco Condiciones Laborales</center></html>");
                break;
            case "Guardia":
                nivel.setText("Nivel Operacional");
                funcion.setText("<html><center>Se preocupa de mantener el orden en las instalaciones, que no entren personas ajenas.</center></html>");
                ambiente.setText("<html><center>Desigualdad pronunciada</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Armónico</center></html>");
                competencias.setText("<html><center>Básicas</center></html>");
                necesidades.setText("<html><center>Orden inferior</center></html>");
                break;
            case "Secretaria":
                nivel.setText("Nivel Operacional");
                funcion.setText("<html><center>Recibe y envía mensajes de su jefe</center></html>");
                ambiente.setText("<html><center>Desigualdad pronunciada</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Comunicador, Armónico</center></html>");
                competencias.setText("<html><center>De Comportamiento</center></html>");
                necesidades.setText("<html><center>Predominante X, Metas Eficacia Personal, Factor extrínseco, Condiciones de trabajo</center></html>");
                break;
            case "Vendedor":
                nivel.setText("Nivel Operacional");
                funcion.setText("<html><center>Encargado de realizar ventas</center></html>");
                ambiente.setText("<html><center>Competitividad agresiva y desleal</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Competitivo, Comunicador, Emprendedor</center></html>");
                competencias.setText("<html><center>De comportamiento</center></html>");
                necesidades.setText("<html><center>Predominante X, Realización, Factor Extrínseco, Sueldo</center></html>");
                break;  
            case "Encargado de seguridad": 
                nivel.setText("Nivel Táctico");
                funcion.setText("<html><center>Ente mayor respecto a la seguridad de la empresa</center></html>");
                ambiente.setText("<html><center>Competitividad, agresiva y desleal.</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Analitico, desarrollador, responsable</center></html>");
                competencias.setText("<html><center>Intelectual</center></html>");
                necesidades.setText("<html><center>Tipo Y, factores intrínsecos</center></html>");
                break;
            case "Encargado de máquinas":
                nivel.setText("Nivel Táctico");
                funcion.setText("<html><center>Relacionado a la mantención, distribución, etc.</center></html>");
                ambiente.setText("<html><center>Competitividad, agresiva y desleal.</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Analítico</center></html>");
                competencias.setText("<html><center>De comportamiento</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            case "Encargado de personal":
                nivel.setText("Nivel Táctico");
                funcion.setText("<html><center>Se preocupa de la supervisión de los trabajadores</center></html>");
                ambiente.setText("<html><center>: Factores extrínsecos</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Competitivo, Desarrollador, Mandatario</center></html>");
                competencias.setText("<html><center>De comportamiento</center></html>");
                necesidades.setText("<html><center>Predomina Y, Factores extrínsecos.</center></html>");
                break;
            case "Coordinador":
                nivel.setText("Nivel Táctico");
                funcion.setText("<html><center>Se encarga de mejorar la producción, coordinando diferentes áreas de la empresa para ello.</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Carencias materiales</center></html>");
                habilidades.setText("<html><center>Competitivo, Analítico</center></html>");
                competencias.setText("<html><center>Intelectual.</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            case "Encargado de local":
                nivel.setText("Nivel Táctico");
                funcion.setText("<html><center>Es el responsable de todo lo que pase en el local de la empresa.</center></html>");
                ambiente.setText("<html><center>Competitividad agresiva y desleal, estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Competitivo, analítico, desarrollador, mandatario</center></html>");
                competencias.setText("<html><center>De comportamiento</center></html>");
                necesidades.setText("<html><center>Factores extrínsecos, tipo Y/T, orden superior</center></html>");
                break;
            case "Auditoria":
                nivel.setText("Nivel Táctico");
                funcion.setText("<html><center>Se preocupa de velar por el buen funcionamiento de la empresa</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Competitivo, Analítico</center></html>");
                competencias.setText("<html><center>Intelectual</center></html>");
                necesidades.setText("<html><center>Orden superior, factores intrínsecos, realización, tipo Y/T</center></html>");
                break;
            case "Gerente Fiscalía":   
                nivel.setText("Nivel Estratégico");
                funcion.setText("<html><center>Se preocupa de toda el área legal de la empresa, que leyes la rigen, procesos jurídicos, etc.</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Disciplinado, analitico.</center></html>");
                competencias.setText("<html><center>Orden y seguridad.</center></html>");
                necesidades.setText("<html><center>Predomina Y,  políticas de la empresa(factor extrínseco),realización.</center></html>");
                break;
            case "Gerente de RRHH":
                nivel.setText("Nivel Estratégico");
                funcion.setText("<html><center>Encargado de ver que perfiles son necesarios en cada cargo, planes de reclutamientos, etc.</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Empático, armónico y desarrollador.</center></html>");
                competencias.setText("<html><center>Orden y seguridad</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            case "Gerente de Marketing":
                nivel.setText("Nivel Estratégico");
                funcion.setText("<html><center>Se encarga de Desarrollo de plan anual de Mercadotecnia, Estudios de Mercado, Imagen Corporativa,etc</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Comunicador, futurista, competitivo.</center></html>");
                competencias.setText("<html><center>Orden y seguridad</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            case "Gerente de operaciones":
                nivel.setText("Nivel Estratégico");
                funcion.setText("<html><center>Encargado mayor del área de producción de la empresa, se preocupa de ver materias primas a menor costo, mejores máquinas, etc.</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Analitico, desarrollo y disciplinado</center></html>");
                competencias.setText("<html><center>Orden y seguridad.</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            case "Gerente de finanzas":
                nivel.setText("Nivel Estratégico");
                funcion.setText("<html><center>: Encargado de los dineros entrantes y salientes de la empresa, opciones de inversión, etc.</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Disciplinado, Analítico</center></html>");
                competencias.setText("<html><center>Orden y seguridad.</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            case "Gerente general":
                nivel.setText("Nivel Estratégico");
                funcion.setText("<html><center>Jefe de todos los gerentes, éstos le rinden cuentas, siendo decisivo en la toma de decisiones en todas las áreas de la empresa.</center></html>");
                ambiente.setText("<html><center>Estabilidad social</center></html>");
                bibliograficos.setText("<html><center>Sin carencias</center></html>");
                habilidades.setText("<html><center>Emprendedor, Disciplinado, Competitivo, Mandatario</center></html>");
                competencias.setText("<html><center>Orden y seguridad</center></html>");
                necesidades.setText("<html><center>Predomina Y</center></html>");
                break;
            default:
                nivel.setText("");
                funcion.setText("<html><center></center></html>");
                ambiente.setText("<html><center></center></html>");
                bibliograficos.setText("<html><center></center></html>");
                habilidades.setText("<html><center></center></html>");
                competencias.setText("<html><center></center></html>");
                necesidades.setText("<html><center></center></html>");
                break;
            }
        
        
    }//GEN-LAST:event_rolActionPerformed

      
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Roles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Roles().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ambiente;
    private javax.swing.JLabel bibliograficos;
    private javax.swing.JLabel competencias;
    private javax.swing.JLabel funcion;
    private javax.swing.JLabel habilidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton menu;
    private javax.swing.JLabel necesidades;
    private javax.swing.JLabel nivel;
    private javax.swing.JComboBox rol;
    // End of variables declaration//GEN-END:variables
}

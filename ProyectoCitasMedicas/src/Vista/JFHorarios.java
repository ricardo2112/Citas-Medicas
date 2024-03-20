
package Vista;

import Negocio.Horario;
import Negocio.Medico;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class JFHorarios extends javax.swing.JFrame {

    public JFHorarios() {
        initComponents();        
        //PARA QUE NO SE FINALICE LA EJECUCIÓN AL CERRAR EL JF
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Toolkit im = Toolkit.getDefaultToolkit();
        setIconImage(im.getImage(getClass().getResource("/ImagenesLogin/ICONOPRINCIPAL.png")));
        this.setTitle("Horarios de atención");
        this.setLocationRelativeTo(null);
        //FORMATO DE LA FECHA
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        jTFFechaActual.setText(dtf.format(LocalDate.now()));
        //ACCIONES INICIALES
        this.jTFDisponible.setVisible(false);
        this.getContentPane().setBackground(new Color (255,255,255));
        cargarMedicos();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCBIdMedico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jCBDias = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHorarios = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTFDisponible = new javax.swing.JTextField();
        jTFFechaActual = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        PanelHorarios = new javax.swing.JPanel();
        jCHB1 = new javax.swing.JCheckBox();
        jCHB2 = new javax.swing.JCheckBox();
        jCHB3 = new javax.swing.JCheckBox();
        jCHB4 = new javax.swing.JCheckBox();
        jCHB5 = new javax.swing.JCheckBox();
        jCHB6 = new javax.swing.JCheckBox();
        jCHB7 = new javax.swing.JCheckBox();
        jCHB8 = new javax.swing.JCheckBox();
        jCHB9 = new javax.swing.JCheckBox();
        jCHB10 = new javax.swing.JCheckBox();
        jCHB11 = new javax.swing.JCheckBox();
        jCHB12 = new javax.swing.JCheckBox();
        jBActualizar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));

        jPanel3.setBackground(new java.awt.Color(69, 199, 197));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Horarios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Médico:");

        jCBIdMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBIdMedico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jCBIdMedico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBIdMedicoItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Día:");

        jCBDias.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBDias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        jCBDias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCBDiasItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBDias, 0, 175, Short.MAX_VALUE)
                    .addComponent(jCBIdMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTableHorarios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTableHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableHorarios.setOpaque(false);
        jTableHorarios.setRowHeight(19);
        jScrollPane1.setViewportView(jTableHorarios);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTFDisponible.setForeground(new java.awt.Color(255, 255, 255));
        jTFDisponible.setText("Disponible");
        jTFDisponible.setBorder(null);

        jTFFechaActual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFFechaActual.setText("dd-mm-aaaa");
        jTFFechaActual.setBorder(null);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTFDisponible, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTFFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTFDisponible)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jTFFechaActual)
                .addContainerGap())
        );

        jBEliminar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Eliminar.png"))); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setBorderPainted(false);
        jBEliminar.setContentAreaFilled(false);
        jBEliminar.setFocusPainted(false);
        jBEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/EliminarPress.png"))); // NOI18N
        jBEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/EliminarRoll.png"))); // NOI18N
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Guardar.png"))); // NOI18N
        jBGuardar.setText("Guardar");
        jBGuardar.setBorderPainted(false);
        jBGuardar.setContentAreaFilled(false);
        jBGuardar.setFocusPainted(false);
        jBGuardar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/GuardarPress.png"))); // NOI18N
        jBGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/GuardarRoll.png"))); // NOI18N
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        PanelHorarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Horarios de atención", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jCHB1.setBackground(new java.awt.Color(245, 245, 245));
        jCHB1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB1.setText("09:00 a 09:30");

        jCHB2.setBackground(new java.awt.Color(245, 245, 245));
        jCHB2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB2.setText("09:30 a 10:00");

        jCHB3.setBackground(new java.awt.Color(245, 245, 245));
        jCHB3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB3.setText("10:00 a 10:30");

        jCHB4.setBackground(new java.awt.Color(245, 245, 245));
        jCHB4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB4.setText("10:30 a 11:00");

        jCHB5.setBackground(new java.awt.Color(245, 245, 245));
        jCHB5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB5.setText("11:00 a 11:30");

        jCHB6.setBackground(new java.awt.Color(245, 245, 245));
        jCHB6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB6.setText("11:30 a 12:00");

        jCHB7.setBackground(new java.awt.Color(245, 245, 245));
        jCHB7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB7.setText("15:00 a 15:30");

        jCHB8.setBackground(new java.awt.Color(245, 245, 245));
        jCHB8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB8.setText("15:30 a 16:00");

        jCHB9.setBackground(new java.awt.Color(245, 245, 245));
        jCHB9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB9.setText("16:00 a 16:30");

        jCHB10.setBackground(new java.awt.Color(245, 245, 245));
        jCHB10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB10.setText("16:30 a 17:00");

        jCHB11.setBackground(new java.awt.Color(245, 245, 245));
        jCHB11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB11.setText("17:00 a 17:30");

        jCHB12.setBackground(new java.awt.Color(245, 245, 245));
        jCHB12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jCHB12.setText("17:30 a 18:00");

        javax.swing.GroupLayout PanelHorariosLayout = new javax.swing.GroupLayout(PanelHorarios);
        PanelHorarios.setLayout(PanelHorariosLayout);
        PanelHorariosLayout.setHorizontalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorariosLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCHB1)
                    .addComponent(jCHB2)
                    .addComponent(jCHB3)
                    .addComponent(jCHB4)
                    .addComponent(jCHB5)
                    .addComponent(jCHB6))
                .addGap(60, 60, 60)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCHB7)
                    .addComponent(jCHB8)
                    .addComponent(jCHB9)
                    .addComponent(jCHB10)
                    .addComponent(jCHB11)
                    .addComponent(jCHB12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelHorariosLayout.setVerticalGroup(
            PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorariosLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHB1)
                    .addComponent(jCHB7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHB2)
                    .addComponent(jCHB8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHB3)
                    .addComponent(jCHB9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHB4)
                    .addComponent(jCHB10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHB5)
                    .addComponent(jCHB11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelHorariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCHB6)
                    .addComponent(jCHB12))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jBActualizar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Actualizar.png"))); // NOI18N
        jBActualizar.setText("Actualizar");
        jBActualizar.setBorderPainted(false);
        jBActualizar.setContentAreaFilled(false);
        jBActualizar.setFocusPainted(false);
        jBActualizar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/ActualizarPress.png"))); // NOI18N
        jBActualizar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/ActualizarRoll.png"))); // NOI18N
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBRegresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Regresar.png"))); // NOI18N
        jBRegresar.setText("Regresar");
        jBRegresar.setBorderPainted(false);
        jBRegresar.setContentAreaFilled(false);
        jBRegresar.setFocusPainted(false);
        jBRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/RegresarPress.png"))); // NOI18N
        jBRegresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/RegresarRoll.png"))); // NOI18N
        jBRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jBActualizar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jBRegresar)
                                .addContainerGap())
                            .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(PanelHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        if (jCBDias.getSelectedIndex() != 0 && jCBIdMedico.getSelectedIndex() !=0 ) {
            Horario atencion = new Horario();
            atencion.eliminar(Integer.parseInt(this.jCBIdMedico.getSelectedItem().toString().substring(0,1)),
                    this.jCBDias.getSelectedIndex());
            this.jCBDias.setSelectedIndex(0);
            desmarcar();
            JOptionPane.showMessageDialog(null, "Los horarios ha sido eliminados con éxito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.jCBDias.setSelectedIndex(0);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un médico y un día.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jCBDias.getSelectedIndex() != 0 && jCBIdMedico.getSelectedIndex() !=0 ) {
            if (obtenerSeleccionados(PanelHorarios)) {
                JOptionPane.showMessageDialog(null, "Los horarios ha sido guardados correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.jCBDias.setSelectedIndex(0);
                desmarcar();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona los horarios.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un médico y un día.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        if (jCBDias.getSelectedIndex() != 0 && jCBIdMedico.getSelectedIndex() !=0 ) {
            Horario atencion = new Horario();
            atencion.eliminar(Integer.parseInt(this.jCBIdMedico.getSelectedItem().toString().substring(0,1)),
                    this.jCBDias.getSelectedIndex());
            if (obtenerSeleccionados(PanelHorarios)) {
                JOptionPane.showMessageDialog(null, "Los horarios ha sido actualizados correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                this.jCBDias.setSelectedIndex(0);
                desmarcar();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, selecciona los horarios.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un médico y un día.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jCBDiasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBDiasItemStateChanged
        if (this.jCBIdMedico.getSelectedIndex() != 0) {
            if (obtenerDiaMedico(PanelHorarios)) {
                jBGuardar.setEnabled(false);
            }else{
                jBGuardar.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jCBDiasItemStateChanged

    private void jCBIdMedicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCBIdMedicoItemStateChanged
        this.jBGuardar.setEnabled(true);
        this.jCBDias.setSelectedIndex(0);
        desmarcar();
    }//GEN-LAST:event_jCBIdMedicoItemStateChanged

    public void desmarcar(){
        this.jCHB1.setSelected(false);
        this.jCHB2.setSelected(false);
        this.jCHB3.setSelected(false);
        this.jCHB4.setSelected(false);
        this.jCHB5.setSelected(false);
        this.jCHB6.setSelected(false);
        this.jCHB7.setSelected(false);
        this.jCHB8.setSelected(false);
        this.jCHB9.setSelected(false);
        this.jCHB10.setSelected(false);
        this.jCHB11.setSelected(false);
        this.jCHB12.setSelected(false);
    }

    private void cargarMedicos(){
        this.jCBIdMedico.removeAllItems();
        this.jCBIdMedico.addItem("Seleccionar");
        for (int i = 0; i < Medico.getMedicos().size(); i++) {
            String medico = Medico.getMedicos().get(i).getId()+" "+Medico.getMedicos().get(i).getNombre()+" "+ Medico.getMedicos().get(i).getApellido();
            jCBIdMedico.addItem(medico);
        }
    }
        
    public boolean obtenerSeleccionados(Container contenedor) {
        boolean bandera = false;
        Medico medico = new Medico();
        medico.setId(Integer.parseInt(this.jCBIdMedico.getSelectedItem().toString().substring(0,1)));
        for (Component comp : contenedor.getComponents()) {
            if (comp instanceof JCheckBox) {
                JCheckBox checkbox = (JCheckBox) comp;
                if (checkbox.isSelected()) {
                    Horario atencion = new Horario();
                    atencion.setDia(this.jCBDias.getSelectedIndex());
                    atencion.setHora(obtenerHora(checkbox.getText()));
                    atencion.registrar(medico);
                    bandera = true;
                }
            }
        }
        return bandera;
    }
    
    public boolean obtenerDiaMedico(Container contenedor) {
        boolean atiende = false;
        Medico medico = new Medico();
        medico.setId(Integer.parseInt(this.jCBIdMedico.getSelectedItem().toString().substring(0, 1)));
    
        for (Component comp : contenedor.getComponents()) {
            if (comp instanceof JCheckBox) {
                JCheckBox checkbox = (JCheckBox) comp;
                boolean encontrado = false;
                for (Horario atencion : Horario.getHorarioPorDia(medico, this.jCBDias.getSelectedIndex())) {
                    if (obtenerHora(checkbox.getText()).equals(atencion.getHora())) {
                        checkbox.setSelected(true);
                        this.jBGuardar.setEnabled(false);
                        atiende = true;
                        encontrado = true;
                        break;  // No es necesario seguir buscando
                    }
                }
                // Si no se encontró una atención para este checkbox, deseleccionarlo
                if (!encontrado) {
                    checkbox.setSelected(false);
                    this.jBGuardar.setEnabled(true);
                    
                }
            }
        }
        return atiende;
    }
    
    public LocalTime obtenerHora(String cadena) {
        String hora = cadena.substring(0, 5);
        return LocalTime.parse(hora);
    }
    
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
            java.util.logging.Logger.getLogger(JFHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFHorarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHorarios;
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JComboBox<String> jCBDias;
    private javax.swing.JComboBox<String> jCBIdMedico;
    private javax.swing.JCheckBox jCHB1;
    private javax.swing.JCheckBox jCHB10;
    private javax.swing.JCheckBox jCHB11;
    private javax.swing.JCheckBox jCHB12;
    private javax.swing.JCheckBox jCHB2;
    private javax.swing.JCheckBox jCHB3;
    private javax.swing.JCheckBox jCHB4;
    private javax.swing.JCheckBox jCHB5;
    private javax.swing.JCheckBox jCHB6;
    private javax.swing.JCheckBox jCHB7;
    private javax.swing.JCheckBox jCHB8;
    private javax.swing.JCheckBox jCHB9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFDisponible;
    private javax.swing.JTextField jTFFechaActual;
    private javax.swing.JTable jTableHorarios;
    // End of variables declaration//GEN-END:variables
}

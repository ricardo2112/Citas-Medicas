
package Vista;

import Negocio.Paciente;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JFPaciente extends javax.swing.JFrame {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public JFPaciente() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Paciente");
        inicializarTabla();
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Toolkit im = Toolkit.getDefaultToolkit();
        setIconImage(im.getImage(getClass().getResource("/ImagenesLogin/ICONOPRINCIPAL.png")));
        jTablePaciente.getTableHeader().setFont(new Font("Dialog", 0 , 12));
        this.getContentPane().setBackground(new Color (245,245,245));
        bloquear(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFNumeroCedula = new javax.swing.JTextField();
        jTFApellidoPaciente = new javax.swing.JTextField();
        jTFNombrePaciente = new javax.swing.JTextField();
        jTFTelefonoPaciente = new javax.swing.JTextField();
        jFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jBActualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePaciente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLimpiar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(184, 207, 229), null), "Ingreso de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("No. de Cédula");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("F. Nacimiento");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Teléfono");

        jTFNumeroCedula.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFNumeroCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNumeroCedulaKeyTyped(evt);
            }
        });

        jTFApellidoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFApellidoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFApellidoPacienteKeyTyped(evt);
            }
        });

        jTFNombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFNombrePaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombrePacienteKeyTyped(evt);
            }
        });

        jTFTelefonoPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFTelefonoPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelefonoPacienteKeyTyped(evt);
            }
        });

        jFechaNacimiento.setDateFormatString("yyyy-MM-dd");
        jFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTFTelefonoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                        .addComponent(jTFNombrePaciente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFApellidoPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTFNumeroCedula, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFNumeroCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFApellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTFTelefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jBActualizar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Actualizar.png"))); // NOI18N
        jBActualizar.setText(" Actualizar");
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

        jBBorrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Eliminar.png"))); // NOI18N
        jBBorrar.setText(" Eliminar");
        jBBorrar.setBorderPainted(false);
        jBBorrar.setContentAreaFilled(false);
        jBBorrar.setFocusPainted(false);
        jBBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/EliminarPress.png"))); // NOI18N
        jBBorrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/EliminarRoll.png"))); // NOI18N
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBRegresar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Regresar.png"))); // NOI18N
        jBRegresar.setText(" Regresar");
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

        jTablePaciente = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTablePaciente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTablePaciente.setForeground(new java.awt.Color(16, 16, 16));
        jTablePaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Apellido", "Nombre", "Edad", "Telefono", "Síntomas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTablePaciente.setRowHeight(19);
        jTablePaciente.getTableHeader().setReorderingAllowed(false);
        jTablePaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTablePacienteMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePaciente);
        if (jTablePaciente.getColumnModel().getColumnCount() > 0) {
            jTablePaciente.getColumnModel().getColumn(0).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(1).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(2).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(3).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(4).setResizable(false);
            jTablePaciente.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel7.setText("Buscar paciente:");

        jLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Limpiar.png"))); // NOI18N
        jLimpiar.setText(" Limpiar");
        jLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLimpiarActionPerformed(evt);
            }
        });

        jBGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Guardar.png"))); // NOI18N
        jBGuardar.setText(" Guardar");
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

        jPanel2.setBackground(new java.awt.Color(99, 199, 197));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Paciente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTFBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jTFBuscar.setText("Cédula");
        jTFBuscar.setBorder(null);
        jTFBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBuscarMousePressed(evt);
            }
        });
        jTFBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscarActionPerformed(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Buscar.png"))); // NOI18N
        jBBuscar.setBorderPainted(false);
        jBBuscar.setContentAreaFilled(false);
        jBBuscar.setFocusPainted(false);
        jBBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarPress.png"))); // NOI18N
        jBBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarRoll.png"))); // NOI18N
        jBBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarRoll.png"))); // NOI18N
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 663, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBGuardar)
                            .addComponent(jBActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBBorrar)
                            .addComponent(jBRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLimpiar))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jTFTelefonoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelefonoPacienteKeyTyped
        char variable = evt.getKeyChar();
        if(Character.isLetter(variable)||Character.isSpaceChar(variable)){
            getToolkit().beep();
            evt.consume();
        }
        if (jTFTelefonoPaciente.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFTelefonoPacienteKeyTyped

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
       try{
            resetBuscar();
            if (!camposEstanVacios()) {
                Pattern patTelfCelular = Pattern.compile("^([0][9]\\d{8})$");
                Pattern patTelfFijo = Pattern.compile("^([^0]\\d{6})$");
                Matcher matTelfCelular = patTelfCelular.matcher(this.jTFTelefonoPaciente.getText());
                Matcher matTelfFijo = patTelfFijo.matcher(this.jTFTelefonoPaciente.getText());
                String getNacimiento = ((JTextField) this.jFechaNacimiento.getDateEditor().getUiComponent()).getText();
                LocalDate fechaNacimiento = LocalDate.parse(getNacimiento, formatter);
                Paciente paciente = new Paciente();
                paciente.setIdCedula(this.jTFNumeroCedula.getText());
                paciente.setNombre(this.jTFNombrePaciente.getText());
                paciente.setApellido(this.jTFApellidoPaciente.getText());
                paciente.setNumeroTelefonico(this.jTFTelefonoPaciente.getText());
                paciente.setFechaNacimiento(fechaNacimiento);
                if (matTelfCelular.matches() || matTelfFijo.matches()) {
                    if (paciente.esCedulaValida()) {
                        paciente.actualizar();
                        limpiar();
                        bloquear(true);
                        inicializarTabla();
                        JOptionPane.showMessageDialog(null, "El paciente ha sido actualizado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "La cédula del paciente no es válida.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El número de teléfono no es válido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "El formato de la fecha no es válido. (Año-Mes-Dia).", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        resetBuscar();
        if (!this.jTFNumeroCedula.getText().isEmpty()) {
            String botones[] = {"  Borrar  ", " Cancelar "};
            int op = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar el paciente?", "Sistema de citas médicas", 0, 0, null, botones, this);
            if(op == JOptionPane.YES_OPTION){
                Paciente paciente = new Paciente();
                paciente.setIdCedula(this.jTFNumeroCedula.getText());
                paciente.eliminar(paciente.getIdCedula());
                limpiar();
                bloquear(false);
                inicializarTabla();
                JOptionPane.showMessageDialog(null, "El paciente ha sido eliminado con éxito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }else if(op == JOptionPane.NO_OPTION){
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un paciente.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jTFBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarMousePressed
        if(this.jTFBuscar.getText().equals("Cédula")){
            this.jTFBuscar.setText("");
            this.jTFBuscar.setForeground(Color.BLACK);
       }
    }//GEN-LAST:event_jTFBuscarMousePressed

    private void jTFBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarActionPerformed
        Paciente pacienteEncontrado = Paciente.getPorId(this.jTFBuscar.getText());
        if (pacienteEncontrado != null) {
            limpiarTabla();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cédula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Telefono");
            Object[] fila = {pacienteEncontrado.getIdCedula(), pacienteEncontrado.getNombre(), pacienteEncontrado.getApellido(), 
                pacienteEncontrado.getFechaNacimiento(), pacienteEncontrado.getNumeroTelefonico()};
            modelo.addRow(fila);
            jTablePaciente.setModel(modelo);
            setSize();
        } else {
            inicializarTabla();
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
        }
    }//GEN-LAST:event_jTFBuscarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {
            resetBuscar();
            
            if (!camposEstanVacios()) {
                Pattern patTelfCelular = Pattern.compile("^([0][9]\\d{8})$");
                Pattern patTelfFijo = Pattern.compile("^([^0]\\d{6})$");
                Matcher matTelfCelular = patTelfCelular.matcher(this.jTFTelefonoPaciente.getText());
                Matcher matTelfFijo = patTelfFijo.matcher(this.jTFTelefonoPaciente.getText());
                String getNacimiento = ((JTextField) this.jFechaNacimiento.getDateEditor().getUiComponent()).getText();
                LocalDate fechaNacimiento = LocalDate.parse(getNacimiento, formatter);
                Paciente paciente = new Paciente();
                paciente.setIdCedula(this.jTFNumeroCedula.getText());
                paciente.setNombre(this.jTFNombrePaciente.getText());
                paciente.setApellido(this.jTFApellidoPaciente.getText());
                paciente.setNumeroTelefonico(this.jTFTelefonoPaciente.getText());
                paciente.setFechaNacimiento(fechaNacimiento);
                if (matTelfCelular.matches() || matTelfFijo.matches()) {
                    if (paciente.esCedulaValida()) {
                        paciente.registrar();
                        limpiar();
                        inicializarTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, "La cédula del paciente no es válida.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El número de teléfono no es válido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } catch (DateTimeParseException e){
            JOptionPane.showMessageDialog(null, "El formato de la fecha no es válido. (Año-Mes-Dia).", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        Paciente pacienteEncontrado = Paciente.getPorId(this.jTFBuscar.getText());
        if (pacienteEncontrado != null) {
            limpiarTabla();
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cédula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Telefono");
            Object[] fila = {pacienteEncontrado.getIdCedula(), pacienteEncontrado.getNombre(), pacienteEncontrado.getApellido(), 
                pacienteEncontrado.getFechaNacimiento(), pacienteEncontrado.getNumeroTelefonico()};
            modelo.addRow(fila);
            jTablePaciente.setModel(modelo);
            setSize();
        } else {
            inicializarTabla();
            JOptionPane.showMessageDialog(null, "Paciente no encontrado");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLimpiarActionPerformed
        limpiar();
        resetBuscar();
    }//GEN-LAST:event_jLimpiarActionPerformed

    private void jTablePacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePacienteMousePressed
        resetBuscar();
        bloquear(true);
        this.jTFNumeroCedula.setEditable(false);
        this.jBGuardar.setEnabled(false);
        int Fila = jTablePaciente.getSelectedRow();
        String codigo = jTablePaciente.getValueAt(Fila, 0).toString();
        Paciente paciente = Paciente.getPorId(codigo);
        LocalDate fechaNacimiento = paciente.getFechaNacimiento();
        this.jTFNumeroCedula.setText(paciente.getIdCedula());
        this.jTFApellidoPaciente.setText(paciente.getApellido());
        this.jTFNombrePaciente.setText(paciente.getNombre());
        this.jTFTelefonoPaciente.setText(paciente.getNumeroTelefonico());
        ((JTextField) this.jFechaNacimiento.getDateEditor().getUiComponent()).setText(fechaNacimiento.format(formatter));
    }//GEN-LAST:event_jTablePacienteMousePressed

    private void jTFNumeroCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNumeroCedulaKeyTyped
        char variable = evt.getKeyChar();
        if(Character.isLetter(variable)||Character.isSpaceChar(variable)){
            getToolkit().beep();
            evt.consume();
        }
        if (jTFNumeroCedula.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFNumeroCedulaKeyTyped

    private void jTFApellidoPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidoPacienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != ' ') {
            getToolkit().beep();
            evt.consume();  // No permite el carácter
        }
        if (jTFApellidoPaciente.getText().length() >= 20) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFApellidoPacienteKeyTyped

    private void jTFNombrePacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombrePacienteKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != ' ') {
            getToolkit().beep();
            evt.consume();  // No permite el carácter
        }
        if (jTFNombrePaciente.getText().length() >= 20) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFNombrePacienteKeyTyped
      
    private void limpiar(){
        this.jTFNumeroCedula.setText("");
        this.jTFApellidoPaciente.setText("");
        this.jTFNombrePaciente.setText("");
        ((JTextField) this.jFechaNacimiento.getDateEditor().getUiComponent()).setText("");
        this.jTFTelefonoPaciente.setText("");
        this.jTFNumeroCedula.requestFocus();
        this.jBGuardar.setEnabled(true);
        this.jTFNumeroCedula.setEditable(true);
    }
    private void bloquear (boolean bandera){
        this.jTFNumeroCedula.setEnabled( bandera);
        this.jTFApellidoPaciente.setEnabled( bandera);
        this.jTFNombrePaciente.setEnabled( bandera);
        this.jTFTelefonoPaciente.setEnabled( bandera);
        ((JTextField) this.jFechaNacimiento.getDateEditor().getUiComponent()).setEnabled( bandera);
    }
  
    private void resetBuscar(){
        if(this.jTFBuscar.getText().isEmpty()){
            this.jTFBuscar.setText("Cédula");
            this.jTFBuscar.setForeground(Color.GRAY);
        }
    }
    
    private void setSize(){
        jTablePaciente.getColumnModel().getColumn(0).setPreferredWidth(95);
        jTablePaciente.getColumnModel().getColumn(1).setPreferredWidth(106);
        jTablePaciente.getColumnModel().getColumn(2).setPreferredWidth(106);
        jTablePaciente.getColumnModel().getColumn(3).setPreferredWidth(122);
        jTablePaciente.getColumnModel().getColumn(4).setPreferredWidth(88);  
    }
    
    public void inicializarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        // Agregar columnas al modelo
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Telefono");
        for(Paciente paciente: Paciente.getPacientes()){
            Object[] fila = {paciente.getIdCedula(), paciente.getNombre(), paciente.getApellido(), 
                paciente.getFechaNacimiento(), paciente.getNumeroTelefonico()};
            modelo.addRow(fila);  
        }
        jTablePaciente.setModel(modelo);
        setSize();
    }
    
    public void limpiarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        while (modelo.getRowCount() > 0) {            
            modelo.removeRow(0);
        }
        jTablePaciente.setModel(modelo);
    }
    
    private boolean camposEstanVacios() {
        return jTFApellidoPaciente.getText().isEmpty() ||
                jTFNombrePaciente.getText().isEmpty() ||
                jTFNumeroCedula.getText().isEmpty() ||
                jTFTelefonoPaciente.getText().isEmpty() ||
                ((JTextField) this.jFechaNacimiento.getDateEditor().getUiComponent()).getText().isEmpty(); // Al menos un campo está vacío
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
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFPaciente().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFPaciente.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBRegresar;
    private com.toedter.calendar.JDateChooser jFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton jLimpiar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellidoPaciente;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFNombrePaciente;
    private javax.swing.JTextField jTFNumeroCedula;
    private javax.swing.JTextField jTFTelefonoPaciente;
    private javax.swing.JTable jTablePaciente;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

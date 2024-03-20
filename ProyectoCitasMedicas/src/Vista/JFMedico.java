
package Vista;

import Negocio.Medico;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JFMedico extends javax.swing.JFrame {

    public JFMedico() throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        inicializarTabla();
        this.setTitle("Médico");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Toolkit im = Toolkit.getDefaultToolkit();
        setIconImage(im.getImage(getClass().getResource("/ImagenesLogin/ICONOPRINCIPAL.png")));
        jTableMedico.getTableHeader().setFont(new Font("Dialog", 0 , 12));
        this.getContentPane().setBackground(new Color (245,245,245));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTFIdMedico = new javax.swing.JTextField();
        jTFApellidoMedico = new javax.swing.JTextField();
        jTFNombreMedico = new javax.swing.JTextField();
        jCBEspecialidades = new javax.swing.JComboBox<>();
        jTFTelefonoMedico = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jCBConsultorio = new javax.swing.JComboBox<>();
        jBHorario = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMedico = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jBActualizar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(184, 207, 229), null), "Ingreso de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel1.setText("ID Médico");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Apellido");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("Especialidad");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setText("Consultorio");

        jTFIdMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFIdMedico.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTFIdMedico.setEnabled(false);

        jTFApellidoMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFApellidoMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFApellidoMedicoKeyTyped(evt);
            }
        });

        jTFNombreMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFNombreMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombreMedicoKeyTyped(evt);
            }
        });

        jCBEspecialidades.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBEspecialidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Alergología", "Cardiología", "Dermatología", "Endocrinología", "Gastroenterología", "Ginecología", "Hematología", "Medicina familiar", "Medicina física", "Medicina interna", "Neumología", "Neurología", "Nutriología", "Oftalmología", "Otorrinolaringología", "Pediatría", "Psiquiatría", "Radiología", "Reumatología", "Traumatología", "Urología", "Ninguna", "Cirugía general" }));

        jTFTelefonoMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFTelefonoMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFTelefonoMedicoKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Teléfono");

        jCBConsultorio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCBConsultorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "1", "2", "3", "4", "5", "6", "7" }));

        jBHorario.setText("Horario");
        jBHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFTelefonoMedico)
                    .addComponent(jCBEspecialidades, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFApellidoMedico)
                    .addComponent(jTFNombreMedico)
                    .addComponent(jCBConsultorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFIdMedico))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFIdMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFApellidoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBEspecialidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jCBConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTFTelefonoMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBHorario)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTableMedico = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableMedico.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableMedico.setForeground(new java.awt.Color(16, 16, 16));
        jTableMedico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Médico", "Apellido", "Nombre", "Especialidad", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMedico.setRowHeight(19);
        jTableMedico.getTableHeader().setReorderingAllowed(false);
        jTableMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMedicoMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMedico);
        if (jTableMedico.getColumnModel().getColumnCount() > 0) {
            jTableMedico.getColumnModel().getColumn(0).setResizable(false);
            jTableMedico.getColumnModel().getColumn(0).setHeaderValue("ID Médico");
            jTableMedico.getColumnModel().getColumn(1).setResizable(false);
            jTableMedico.getColumnModel().getColumn(1).setHeaderValue("Apellido");
            jTableMedico.getColumnModel().getColumn(2).setResizable(false);
            jTableMedico.getColumnModel().getColumn(2).setHeaderValue("Nombre");
            jTableMedico.getColumnModel().getColumn(3).setResizable(false);
            jTableMedico.getColumnModel().getColumn(3).setHeaderValue("Especialidad");
            jTableMedico.getColumnModel().getColumn(4).setResizable(false);
            jTableMedico.getColumnModel().getColumn(4).setHeaderValue("Telefono");
        }

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBActualizar)
                    .addComponent(jBBorrar)
                    .addComponent(jBRegresar)
                    .addComponent(jBGuardar))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jBGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jTFBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jTFBuscar.setText("Especialidad");
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
        jTFBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscarKeyTyped(evt);
            }
        });

        jBBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Buscar.png"))); // NOI18N
        jBBuscar.setBorder(null);
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
                .addComponent(jTFBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jBBuscar))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFBuscar)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Buscar médico:");

        jBLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Limpiar.png"))); // NOI18N
        jBLimpiar.setText(" Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(99, 199, 197));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Médico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(jBLimpiar))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(36, 36, 36)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBLimpiar)))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        resetBuscar();
        if (!this.jTFIdMedico.getText().isEmpty()) {
            String botones[] = {"  Borrar  ", " Cancelar "};
            int op = JOptionPane.showOptionDialog(null, "¿Está seguro que desea eliminar el médico?", "Citas médicas", JOptionPane.WARNING_MESSAGE, JOptionPane.WARNING_MESSAGE, null, botones, this);
            if(op == JOptionPane.YES_OPTION){
                Medico medico = new Medico();
                medico.setId(Integer.parseInt(this.jTFIdMedico.getText()));
                medico.eliminar(medico.getId());
                limpiar();
                inicializarTabla();
                JOptionPane.showMessageDialog(null, "El médico ha sido eliminado con éxito.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            }else if(op == JOptionPane.NO_OPTION){
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un médico.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }   
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        resetBuscar();
        if (!camposEstanVacios()) {
            Pattern patCelular = Pattern.compile("^([0][9]\\d{8})$");//VALIDACIÓN NUMEROS CELULARES
            Pattern patFijo = Pattern.compile("^([^0]\\d{6})$");//VALIDAD NÚMEROS CONVENCIONALES
            Matcher matTelfCelular  = patCelular.matcher(this.jTFTelefonoMedico.getText());
            Matcher matTelfFijo = patFijo.matcher(this.jTFTelefonoMedico.getText());
            Medico medico = new Medico();
            medico.setApellido(this.jTFApellidoMedico.getText());
            medico.setNombre(this.jTFNombreMedico.getText());
            medico.setEspecialidad(this.jCBEspecialidades.getSelectedItem().toString());
            medico.setConsultorio(Integer.parseInt(this.jCBConsultorio.getSelectedItem().toString()));
            medico.setNumeroTelefonico(this.jTFTelefonoMedico.getText());
            medico.setId(Integer.parseInt(this.jTFIdMedico.getText()));
            if (matTelfCelular.matches() || matTelfFijo.matches()) {
                medico.actualizar();
                limpiar();
                inicializarTabla();
                JOptionPane.showMessageDialog(null, "El médico ha sido actualizado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El número de teléfono no es válido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jTFBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarMousePressed
        if(this.jTFBuscar.getText().equals("Especialidad")){
            this.jTFBuscar.setText("");
            this.jTFBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFBuscarMousePressed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        resetBuscar();
        if (!camposEstanVacios()) {
            Pattern patCelular = Pattern.compile("^([0][9]\\d{8})$");//VALIDACIÓN NUMEROS CELULARES
            Pattern patFijo = Pattern.compile("^([^0]\\d{6})$");//VALIDAD NÚMEROS CONVENCIONALES
            Matcher matTelfCelular  = patCelular.matcher(this.jTFTelefonoMedico.getText());
            Matcher matTelfFijo = patFijo.matcher(this.jTFTelefonoMedico.getText());
            Medico medico = new Medico();
            medico.setApellido(this.jTFApellidoMedico.getText());
            medico.setNombre(this.jTFNombreMedico.getText());
            medico.setEspecialidad(this.jCBEspecialidades.getSelectedItem().toString());
            medico.setConsultorio(Integer.parseInt(this.jCBConsultorio.getSelectedItem().toString()));
            medico.setNumeroTelefonico(this.jTFTelefonoMedico.getText());
            if (matTelfCelular.matches() || matTelfFijo.matches()) {
                medico.registrar();
                limpiar();
                inicializarTabla();
                JOptionPane.showMessageDialog(null, "El médico ha sido guardado correctamente.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "El número de teléfono no es válido.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
        resetBuscar();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTFBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarActionPerformed
        if ( Medico.getPorEspecialidad(this.jTFBuscar.getText())!= null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Especialidad");
            modelo.addColumn("Consultorio");
            modelo.addColumn("Teléfono");
            for (Medico medico : Medico.getPorEspecialidad(this.jTFBuscar.getText())) {
                Object[] fila = {medico.getId(), medico.getNombre(), medico.getApellido(), medico.getEspecialidad(), medico.getConsultorio(), medico.getNumeroTelefonico()};
                modelo.addRow(fila);
            }
            jTableMedico.setModel(modelo);
            setSize();
        }
    }//GEN-LAST:event_jTFBuscarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if ( Medico.getPorEspecialidad(this.jTFBuscar.getText())!= null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Especialidad");
            modelo.addColumn("Consultorio");
            modelo.addColumn("Teléfono");
            for (Medico medico : Medico.getPorEspecialidad(this.jTFBuscar.getText())) {
                Object[] fila = {medico.getId(), medico.getNombre(), medico.getApellido(), medico.getEspecialidad(), medico.getConsultorio(), medico.getNumeroTelefonico()};
                modelo.addRow(fila);
            }
            jTableMedico.setModel(modelo);
            setSize();
        }else{
            resetBuscar();
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTableMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMedicoMousePressed
        resetBuscar();
        bloquear(true);
        this.jBGuardar.setEnabled(false);
        int Fila = jTableMedico.getSelectedRow();
        int codigo = Integer.parseInt(jTableMedico.getValueAt(Fila, 0).toString());
        Medico medico = Medico.getPorId(codigo);
        this.jTFIdMedico.setText(String.valueOf(medico.getId()));
        this.jTFApellidoMedico.setText(medico.getApellido());
        this.jCBEspecialidades.setSelectedItem(medico.getEspecialidad());
        this.jCBConsultorio.setSelectedItem(String.valueOf(medico.getConsultorio()));
        this.jTFNombreMedico.setText(medico.getNombre());
        this.jTFTelefonoMedico.setText(medico.getNumeroTelefonico());
    }//GEN-LAST:event_jTableMedicoMousePressed

    private void jTFTelefonoMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFTelefonoMedicoKeyTyped
        char variable = evt.getKeyChar();
        if(Character.isLetter(variable)||Character.isSpaceChar(variable)){
            getToolkit().beep();
            evt.consume();
        }
        if (jTFTelefonoMedico.getText().length()>=10) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFTelefonoMedicoKeyTyped

    private void jTFApellidoMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidoMedicoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != ' ') {
            getToolkit().beep();
            evt.consume();  // No permite el carácter
        }
        if (jTFApellidoMedico.getText().length() >= 20) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFApellidoMedicoKeyTyped

    private void jTFNombreMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombreMedicoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != ' ') {
            getToolkit().beep();
            evt.consume();  // No permite el carácter
        }
        if (jTFNombreMedico.getText().length() >= 20) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFNombreMedicoKeyTyped

    private void jTFBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarKeyTyped
        char variable = evt.getKeyChar();
        if(Character.isDigit(variable)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTFBuscarKeyTyped

    private void jBHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHorarioActionPerformed
        JFHorarios horario = new JFHorarios();
        horario.setVisible(true);
    }//GEN-LAST:event_jBHorarioActionPerformed

    private void limpiar (){
        jTFIdMedico.setText("");
        jTFApellidoMedico.setText("");
        jTFNombreMedico.setText("");
        jCBConsultorio.setSelectedIndex(0);
        jCBEspecialidades.setSelectedIndex(0);
        jTFTelefonoMedico.setText("");
        this.jBGuardar.setEnabled(true);
        bloquear(true);
    }
    private void bloquear (boolean bandera){
        jTFApellidoMedico.setEnabled(bandera);
        jTFNombreMedico.setEnabled(bandera);
        jCBConsultorio.setEnabled(bandera);
        jCBEspecialidades.setEnabled(bandera);
        jTFTelefonoMedico.setEnabled(bandera);
    }
    
    private void resetBuscar(){
      //MÉTODO PARA DE VOLVER EL TEXTO PREDETERMINADO EN JTFBUSCAR
        if(this.jTFBuscar.getText().isEmpty()){
            this.jTFBuscar.setText("Especialidad");
            this.jTFBuscar.setForeground(Color.GRAY);
        }
    }
    
    private void setSize(){
        jTableMedico.getColumnModel().getColumn(0).setPreferredWidth(48);
        jTableMedico.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTableMedico.getColumnModel().getColumn(2).setPreferredWidth(100);
        jTableMedico.getColumnModel().getColumn(3).setPreferredWidth(140);
        jTableMedico.getColumnModel().getColumn(4).setPreferredWidth(77);
        jTableMedico.getColumnModel().getColumn(5).setPreferredWidth(92);        
    }
    
    public void inicializarTabla(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Consultorio");
        modelo.addColumn("Teléfono");
        for (Medico medico : Medico.getMedicos()) {
            Object[] fila = {medico.getId(), medico.getNombre(), medico.getApellido(), medico.getEspecialidad(), medico.getConsultorio(), medico.getNumeroTelefonico()};
            modelo.addRow(fila);
        }
        jTableMedico.setModel(modelo);
        setSize();
    }
    
    private boolean camposEstanVacios() {
        return jTFApellidoMedico.getText().isEmpty() ||
                jTFNombreMedico.getText().isEmpty() ||
                jTFTelefonoMedico.getText().isEmpty() ||
                jCBConsultorio.getSelectedIndex() == 0 ||
                jCBEspecialidades.getSelectedIndex() == 0; // Al menos un campo está vacío
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
            java.util.logging.Logger.getLogger(JFMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFMedico().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFMedico.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBHorario;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBConsultorio;
    private javax.swing.JComboBox<String> jCBEspecialidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFApellidoMedico;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFIdMedico;
    private javax.swing.JTextField jTFNombreMedico;
    private javax.swing.JTextField jTFTelefonoMedico;
    private javax.swing.JTable jTableMedico;
    // End of variables declaration//GEN-END:variables

}

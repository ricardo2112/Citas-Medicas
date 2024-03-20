
package Vista;

import Negocio.CitaMedica;
import static Negocio.CitaMedica.getHorasDisponibles;
import Negocio.Horario;
import Negocio.Medico;
import Negocio.Paciente;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public final class JFCitaMedica extends javax.swing.JFrame {
    Medico medico;
    Paciente paciente;
    CitaMedica citaMedica;

    public JFCitaMedica() throws SQLException {
        initComponents();
        inicializarTablaCitas();
        inicializarTablaMedico();
        inicializarTablaPaciente();
        this.setLocationRelativeTo(null);
        this.setTitle("Cita Médica");
        this.jCHorario.setEnabled(false);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        Toolkit im = Toolkit.getDefaultToolkit();
        setIconImage(im.getImage(getClass().getResource("/ImagenesLogin/ICONOPRINCIPAL.png")));
        jTableCita.getTableHeader().setFont(new Font("Dialog", 0 , 12));
        jTablaMedicos.getTableHeader().setFont(new Font("Dialog", 0 , 12));
        jTablaPaciente.getTableHeader().setFont(new Font("Dialog", 0 , 12));
        this.getContentPane().setBackground(new Color (245,245,245));
        this.jBLimpiar.requestFocus();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jBLimpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jNombreMedico = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jConsultorio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jEspecialidad = new javax.swing.JLabel();
        jTelefonoM = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPaciente = new javax.swing.JLabel();
        jCedula = new javax.swing.JLabel();
        jNacimiento = new javax.swing.JLabel();
        jTelefonoP = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jFechaCita = new com.toedter.calendar.JDateChooser();
        jCHorario = new javax.swing.JComboBox<>();
        jHora = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCita = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTFBuscar = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jTFaux = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTablaMedicos = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTFBuscarMedico = new javax.swing.JTextField();
        jBBuscarMedico = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTablaPaciente = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jTFBuscarPaciente = new javax.swing.JTextField();
        jBBuscarPaciente = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBRegresar = new javax.swing.JButton();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel8.setText("Buscar cita:");

        jBLimpiar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jBLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Limpiar.png"))); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(245, 245, 245));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(184, 207, 229), null), "Cita Médica", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(546, 200));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Médico:");

        jNombreMedico.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Consultorio:");

        jConsultorio.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Especialidad:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Teléfono:");

        jEspecialidad.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jTelefonoM.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Paciente:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Cédula:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Fecha de Nacimiento:");

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Teléfono:");

        jPaciente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jCedula.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jNacimiento.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jTelefonoP.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel11.setText("Fecha de la cita:");

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel14.setText("Hora:");

        jFechaCita.setDateFormatString("yyyy-MM-dd");
        jFechaCita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jFechaCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jFechaCitaMousePressed(evt);
            }
        });
        jFechaCita.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jFechaCitaPropertyChange(evt);
            }
        });

        jCHorario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar" }));
        jCHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCHorarioMouseEntered(evt);
            }
        });

        jHora.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(jNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(jConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(jTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(jPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)
                        .addComponent(jCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(jNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(6, 6, 6)
                        .addComponent(jTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jNombreMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jConsultorio, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTelefonoM, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jTelefonoP, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        jTableCita = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTableCita.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTableCita.setForeground(new java.awt.Color(16, 16, 16));
        jTableCita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Cita", "Consultorio", "Cédula Paciente", "ID Médico", "Fecha Cita", "Hora", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCita.setGridColor(new java.awt.Color(255, 255, 255));
        jTableCita.setRowHeight(19);
        jTableCita.getTableHeader().setResizingAllowed(false);
        jTableCita.getTableHeader().setReorderingAllowed(false);
        jTableCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableCitaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCita);
        if (jTableCita.getColumnModel().getColumnCount() > 0) {
            jTableCita.getColumnModel().getColumn(0).setResizable(false);
            jTableCita.getColumnModel().getColumn(1).setResizable(false);
            jTableCita.getColumnModel().getColumn(2).setResizable(false);
            jTableCita.getColumnModel().getColumn(3).setResizable(false);
            jTableCita.getColumnModel().getColumn(4).setResizable(false);
            jTableCita.getColumnModel().getColumn(5).setResizable(false);
            jTableCita.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel3.setBackground(new java.awt.Color(99, 199, 197));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cita Médica");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTFBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jTFBuscar.setText("Paciente o Médico");
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jBBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFBuscar)
            .addComponent(jBBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jTFaux.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(455, Short.MAX_VALUE)
                .addComponent(jTFaux, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel5.setBackground(new java.awt.Color(245, 245, 245));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selección de médico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jTablaMedicos = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTablaMedicos.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTablaMedicos.setForeground(new java.awt.Color(16, 16, 16));
        jTablaMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaMedicos.setGridColor(new java.awt.Color(255, 255, 255));
        jTablaMedicos.getTableHeader().setResizingAllowed(false);
        jTablaMedicos.getTableHeader().setReorderingAllowed(false);
        jTablaMedicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTablaMedicosMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTablaMedicos);

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel12.setText("Buscar:");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jTFBuscarMedico.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFBuscarMedico.setForeground(new java.awt.Color(153, 153, 153));
        jTFBuscarMedico.setText("Especialidad");
        jTFBuscarMedico.setBorder(null);
        jTFBuscarMedico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBuscarMedicoMousePressed(evt);
            }
        });
        jTFBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscarMedicoActionPerformed(evt);
            }
        });
        jTFBuscarMedico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscarMedicoKeyTyped(evt);
            }
        });

        jBBuscarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Buscar.png"))); // NOI18N
        jBBuscarMedico.setBorderPainted(false);
        jBBuscarMedico.setContentAreaFilled(false);
        jBBuscarMedico.setFocusPainted(false);
        jBBuscarMedico.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarPress.png"))); // NOI18N
        jBBuscarMedico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarRoll.png"))); // NOI18N
        jBBuscarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarMedicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jTFBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFBuscarMedico, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jBBuscarMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(245, 245, 245));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selección de paciente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 16))); // NOI18N

        jTablaPaciente = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        jTablaPaciente.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jTablaPaciente.setForeground(new java.awt.Color(16, 16, 16));
        jTablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablaPaciente.setGridColor(new java.awt.Color(255, 255, 255));
        jTablaPaciente.getTableHeader().setResizingAllowed(false);
        jTablaPaciente.getTableHeader().setReorderingAllowed(false);
        jTablaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTablaPacienteMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTablaPaciente);

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel13.setText("Buscar:");

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jTFBuscarPaciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTFBuscarPaciente.setForeground(new java.awt.Color(153, 153, 153));
        jTFBuscarPaciente.setText("Cédula");
        jTFBuscarPaciente.setBorder(null);
        jTFBuscarPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTFBuscarPacienteMousePressed(evt);
            }
        });
        jTFBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFBuscarPacienteActionPerformed(evt);
            }
        });
        jTFBuscarPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFBuscarPacienteKeyTyped(evt);
            }
        });

        jBBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Buscar.png"))); // NOI18N
        jBBuscarPaciente.setBorderPainted(false);
        jBBuscarPaciente.setContentAreaFilled(false);
        jBBuscarPaciente.setFocusPainted(false);
        jBBuscarPaciente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarPress.png"))); // NOI18N
        jBBuscarPaciente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/BuscarRoll.png"))); // NOI18N
        jBBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarPacienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jBBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTFBuscarPaciente)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jBBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(15, 15, 15)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jBGuardar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Guardar.png"))); // NOI18N
        jBGuardar.setText(" Guardar");
        jBGuardar.setBorder(null);
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

        jBBorrar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Eliminar.png"))); // NOI18N
        jBBorrar.setText("  Cancelar");
        jBBorrar.setBorder(null);
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

        jBActualizar.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jBActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesVarias/Actualizar.png"))); // NOI18N
        jBActualizar.setText(" Actualizar");
        jBActualizar.setBorder(null);
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
        jBRegresar.setBorder(null);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(241, 241, 241)
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jBActualizar)
                                        .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBorrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRegresar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jBLimpiar)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        try {
            resetBuscar();
            this.jTFBuscarPaciente.setText("Cédula");
            this.jTFBuscarPaciente.setForeground(Color.GRAY);
            this.jTFBuscarMedico.setText("Especialidad");
            this.jTFBuscarMedico.setForeground(Color.GRAY);      
            if (citaMedica != null) {
                citaMedica.setHora(LocalTime.parse(jCHorario.getSelectedItem().toString()));
                String fecha = ((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).getText();
                citaMedica.setFecha(LocalDate.parse((CharSequence) fecha));
                if (!citaMedica.esFechaPasada(LocalDate.parse(fecha), LocalTime.parse(jCHorario.getSelectedItem().toString()))) {
                    citaMedica.cambiarHorario(LocalDate.parse((CharSequence) fecha), LocalTime.parse(jCHorario.getSelectedItem().toString()));
                    inicializarTablaCitas();
                    limpiar();
                    mensaje("La cita médica fue reagendada con éxito.",  JOptionPane.INFORMATION_MESSAGE);
                } else {
                    mensaje("La fecha y hora seleccionadas son pasadas.", JOptionPane.ERROR_MESSAGE);
                }
            } else {
               mensaje("Por favor, selecciona una cita médica.", JOptionPane.ERROR_MESSAGE);
            }
        } catch (DateTimeParseException e){
            mensaje( "Por favor, selecciona una fecha y hora.", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        resetBuscar();
        this.jTFBuscarPaciente.setText("Cédula");
        this.jTFBuscarPaciente.setForeground(Color.GRAY);
        this.jTFBuscarMedico.setText("Especialidad");
        this.jTFBuscarMedico.setForeground(Color.GRAY);
        String botones[] = {"  Si  ", " No "};
        int op = confirmacion("¿Está seguro que desea cancelar la cita?", botones);
        if (citaMedica != null) {
            if (op == JOptionPane.YES_OPTION){
                int id = citaMedica.getId();
                citaMedica.cancelarCita(id);
                inicializarTablaCitas();
                limpiar();
                JOptionPane.showMessageDialog(null, "La cita médica fue cancelada con éxito.", "Mensaje", JOptionPane.ERROR_MESSAGE);
            } else if (op == JOptionPane.NO_OPTION){
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona una cita médica.", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegresarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBRegresarActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            resetBuscar();
            if (medico != null && paciente != null) {
                CitaMedica cita = new CitaMedica();
                cita.setMedico(medico);
                cita.setPaciente(paciente);
                cita.setHora(LocalTime.parse(jCHorario.getSelectedItem().toString()));
                String fecha = ((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).getText();
                cita.setFecha(LocalDate.parse((CharSequence) fecha));
                if (!cita.esFechaPasada(LocalDate.parse(fecha), LocalTime.parse(jCHorario.getSelectedItem().toString()))) {
                    for(Horario horario : cita.getMedico().getHorarios()){
                        if (horario.estaDentroHorario(LocalDate.parse(fecha), LocalTime.parse(jCHorario.getSelectedItem().toString()))) {
                            cita.registrar();
                            inicializarTablaCitas();
                            medico = null;
                            paciente = null;
                            limpiar();
                            mensaje("La cita médica fue agendada con éxito.", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        }
                    }
                } else {
                    mensaje("La fecha y hora seleccionadas son pasadas.", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                mensaje("Por favor, selecciona un médico y un paciente.", JOptionPane.ERROR_MESSAGE);
            }  
        } catch (DateTimeParseException e){
            mensaje("Por favor, selecciona una fecha y hora.", JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
        this.jTablaMedicos.setEnabled(true);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jTFBuscarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarMousePressed
        resetMedico();
        resetPaciente();
        if(this.jTFBuscar.getText().equals("Paciente o Médico")){
            this.jTFBuscar.setText("");
            this.jTFBuscar.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFBuscarMousePressed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        if (!this.jTFBuscar.getText().isEmpty() && !this.jTFBuscar.getText().equals("Paciente o Médico")){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Paciente");
            modelo.addColumn("Médico");
            modelo.addColumn("Especialidad");
            modelo.addColumn("Consultorio");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.setRowCount(0);
            for (CitaMedica cita : CitaMedica.getCitasMedicasPorPaciente(this.jTFBuscar.getText())) {
                Object	[] fila = {cita.getId(), cita.getPaciente().getNombre()+" "+cita.getPaciente().getApellido(),
                    cita.getMedico().getNombre()+" "+cita.getMedico().getApellido(),
                    cita.getMedico().getEspecialidad(), cita.getMedico().getConsultorio(), cita.getFecha(), cita.getHora()};
                modelo.addRow(fila);
            }

            for (CitaMedica cita : CitaMedica.getCitasMedicasPorMedico(this.jTFBuscar.getText())) {
                Object	[] fila = {cita.getId(), cita.getPaciente().getNombre()+" "+cita.getPaciente().getApellido(),
                    cita.getMedico().getNombre()+" "+cita.getMedico().getApellido(),
                    cita.getMedico().getEspecialidad(), cita.getMedico().getConsultorio(), cita.getFecha(), cita.getHora()};
                modelo.addRow(fila);
            }
            jTableCita.setModel(modelo);
            setSizeCitas();     
        } else {
            
            inicializarTablaCitas();
        }   
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTableCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCitaMousePressed
        this.jBGuardar.setEnabled(false);
        this.jTablaMedicos.setEnabled(false);
        this.jTFBuscarPaciente.setText("Cédula");
        this.jTFBuscarPaciente.setForeground(Color.GRAY);
        this.jTFBuscarMedico.setText("Especialidad");
        this.jTFBuscarMedico.setForeground(Color.GRAY);
        int Fila = jTableCita.getSelectedRow();
        String codigo = jTableCita.getValueAt(Fila, 0).toString();
        citaMedica = CitaMedica.getCitaPorId(Integer.parseInt(codigo));
        medico = citaMedica.getMedico();
        paciente = citaMedica.getPaciente();
        jNacimiento.setText(paciente.getFechaNacimiento().toString());
        jNombreMedico.setText(medico.getNombre()+" "+medico.getApellido());
        jPaciente.setText(paciente.getNombre()+" "+paciente.getApellido());
        jCedula.setText(paciente.getIdCedula());
        jConsultorio.setText(medico.getConsultorio()+"");
        jEspecialidad.setText(medico.getEspecialidad());
        jTelefonoM.setText(medico.getNumeroTelefonico());
        jTelefonoP.setText(paciente.getNumeroTelefonico());
        ((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).setText(citaMedica.getFecha()+"");
        jCHorario.setSelectedIndex(0);
        jHora.setText(citaMedica.getHora()+"");
    }//GEN-LAST:event_jTableCitaMousePressed

    private void jTFBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarKeyTyped

    }//GEN-LAST:event_jTFBuscarKeyTyped

    private void jTFBuscarMedicoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarMedicoMousePressed
        limpiar();
        resetBuscar();
        resetPaciente();
        if(this.jTFBuscarMedico.getText().equals("Especialidad")){
            this.jTFBuscarMedico.setText("");
            this.jTFBuscarMedico.setForeground(Color.BLACK);
        } 
    }//GEN-LAST:event_jTFBuscarMedicoMousePressed

    private void jTFBuscarPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTFBuscarPacienteMousePressed
        if(this.jTFBuscarPaciente.getText().equals("Cédula")){
            this.jTFBuscarPaciente.setText("");
            this.jTFBuscarPaciente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_jTFBuscarPacienteMousePressed

    private void jBBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarMedicoActionPerformed
        if ( Medico.getPorEspecialidad(this.jTFBuscarMedico.getText())!= null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Especialidad");
            for (Medico medicoEncontrado : Medico.getPorEspecialidad(this.jTFBuscarMedico.getText())) {
                Object[] fila = {medicoEncontrado.getId(), medicoEncontrado.getNombre(), medicoEncontrado.getApellido(), medicoEncontrado.getEspecialidad()};
                modelo.addRow(fila);
            }
            jTablaMedicos.setModel(modelo);
            setSizeMedico();
        }
    }//GEN-LAST:event_jBBuscarMedicoActionPerformed

    private void jBBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarPacienteActionPerformed
        Paciente pacienteEncontrado = Paciente.getPorId(this.jTFBuscarPaciente.getText());
        if (pacienteEncontrado != null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cédula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            Object[] fila = {pacienteEncontrado.getIdCedula(), pacienteEncontrado.getNombre(), pacienteEncontrado.getApellido(), 
                pacienteEncontrado.getNumeroTelefonico()};
            modelo.addRow(fila);
            jTablaPaciente.setModel(modelo);
            setSizePaciente();
        } else {
            inicializarTablaPaciente();
            JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
        }
    }//GEN-LAST:event_jBBuscarPacienteActionPerformed

    private void jTFBuscarMedicoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarMedicoKeyTyped
        if(this.jTFBuscarMedico.getText().equals("Especialidad")){
            this.jTFBuscarMedico.setText("");
            this.jTFBuscarMedico.setForeground(Color.BLACK);
        } 
    }//GEN-LAST:event_jTFBuscarMedicoKeyTyped

    private void jTFBuscarPacienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFBuscarPacienteKeyTyped

    }//GEN-LAST:event_jTFBuscarPacienteKeyTyped

    private void jTablaMedicosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaMedicosMousePressed
        try {
            int Fila = jTablaMedicos.getSelectedRow();
            int codigo = Integer.parseInt(jTablaMedicos.getValueAt(Fila, 0).toString());
            medico = Medico.getPorId(codigo);
            this.jNombreMedico.setText(medico.getNombre()+" "+medico.getApellido());
            this.jTelefonoM.setText(medico.getNumeroTelefonico());
            this.jEspecialidad.setText(medico.getEspecialidad());
            this.jConsultorio.setText(String.valueOf(medico.getConsultorio()));
            this.jCHorario.setSelectedIndex(0);
            ((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).setText("");
        } catch (ArrayIndexOutOfBoundsException e){
            
        }
    }//GEN-LAST:event_jTablaMedicosMousePressed

    private void jTablaPacienteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablaPacienteMousePressed
        int Fila = jTablaPaciente.getSelectedRow();
        String codigo = jTablaPaciente.getValueAt(Fila, 0).toString();
        paciente = Paciente.getPorId(codigo);
        this.jCedula.setText(paciente.getIdCedula());
        this.jPaciente.setText(paciente.getNombre()+" "+paciente.getApellido());
        this.jTelefonoP.setText(paciente.getNumeroTelefonico());
        this.jNacimiento.setText(paciente.getFechaNacimiento().toString());
    }//GEN-LAST:event_jTablaPacienteMousePressed

    private void jCHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCHorarioMouseEntered
        String fecha = ((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).getText();
        if (!fecha.isEmpty() && !jNombreMedico.getText().isEmpty() && jCHorario.getSelectedIndex() == 0) {
            actualizarHorario();
        }
        
        if (!fecha.equals(((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).getText())) {
            this.jCHorario.setSelectedIndex(0);
            actualizarHorario();
        }
    }//GEN-LAST:event_jCHorarioMouseEntered

    private void jFechaCitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFechaCitaMousePressed

    }//GEN-LAST:event_jFechaCitaMousePressed

    private void jFechaCitaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jFechaCitaPropertyChange
        this.jCHorario.setSelectedIndex(0);
    }//GEN-LAST:event_jFechaCitaPropertyChange

    private void jTFBuscarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarMedicoActionPerformed
        if ( Medico.getPorEspecialidad(this.jTFBuscarMedico.getText())!= null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Especialidad");
            for (Medico medicoEncontrado : Medico.getPorEspecialidad(this.jTFBuscarMedico.getText())) {
                Object[] fila = {medicoEncontrado.getId(), medicoEncontrado.getNombre(), medicoEncontrado.getApellido(), medicoEncontrado.getEspecialidad()};
                modelo.addRow(fila);
            }
            jTablaMedicos.setModel(modelo);
            setSizeMedico();
        }
    }//GEN-LAST:event_jTFBuscarMedicoActionPerformed

    private void jTFBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarPacienteActionPerformed
        Paciente pacienteEncontrado = Paciente.getPorId(this.jTFBuscarPaciente.getText());
        if (pacienteEncontrado != null) {
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Cédula");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            Object[] fila = {pacienteEncontrado.getIdCedula(), pacienteEncontrado.getNombre(), pacienteEncontrado.getApellido(), 
                pacienteEncontrado.getNumeroTelefonico()};
            modelo.addRow(fila);
            jTablaPaciente.setModel(modelo);
            setSizePaciente();
        } else {
            inicializarTablaPaciente();
            JOptionPane.showMessageDialog(null, "Paciente no encontrado.");
        }
    }//GEN-LAST:event_jTFBuscarPacienteActionPerformed

    private void jTFBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFBuscarActionPerformed
        if (!this.jTFBuscar.getText().isEmpty() && !this.jTFBuscar.getText().equals("Paciente o Médico")){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("ID");
            modelo.addColumn("Paciente");
            modelo.addColumn("Médico");
            modelo.addColumn("Especialidad");
            modelo.addColumn("Consultorio");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            modelo.setRowCount(0);
            for (CitaMedica cita : CitaMedica.getCitasMedicasPorPaciente(this.jTFBuscar.getText())) {
                Object	[] fila = {cita.getId(), cita.getPaciente().getNombre()+" "+cita.getPaciente().getApellido(),
                    cita.getMedico().getNombre()+" "+cita.getMedico().getApellido(),
                    cita.getMedico().getEspecialidad(), cita.getMedico().getConsultorio(), cita.getFecha(), cita.getHora()};
                modelo.addRow(fila);
            }

            for (CitaMedica cita : CitaMedica.getCitasMedicasPorMedico(this.jTFBuscar.getText())) {
                Object	[] fila = {cita.getId(), cita.getPaciente().getNombre()+" "+cita.getPaciente().getApellido(),
                    cita.getMedico().getNombre()+" "+cita.getMedico().getApellido(),
                    cita.getMedico().getEspecialidad(), cita.getMedico().getConsultorio(), cita.getFecha(), cita.getHora()};
                modelo.addRow(fila);
            }
            jTableCita.setModel(modelo);
            setSizeCitas();     
        } else {
            
            inicializarTablaCitas();
        }   
    }//GEN-LAST:event_jTFBuscarActionPerformed
    
    public void actualizarHorario(){
        this.jCHorario.setEnabled(true);
        this.jCHorario.removeAllItems();
        this.jCHorario.addItem("Seleccionar");
        LocalDate fecha = LocalDate.parse(((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).getText());
        for (int i = 0; i < getHorasDisponibles(fecha, medico).size(); i++) {
            String hora = getHorasDisponibles(fecha, medico).get(i).toString();
            jCHorario.addItem(hora);

        } 
    }
    
    private void limpiar (){
        inicializarTablaCitas();
        inicializarTablaMedico();
        inicializarTablaPaciente();
        this.jBGuardar.setEnabled(true);
        this.jTablaMedicos.setEnabled(true);
        this.jTablaPaciente.setEnabled(true);
        this.jTFBuscar.setText("Paciente o Médico");
        this.jTFBuscar.setForeground(Color.GRAY);
        this.jTFBuscarPaciente.setText("Cédula");
        this.jTFBuscarPaciente.setForeground(Color.GRAY);
        this.jTFBuscarMedico.setText("Especialidad");
        this.jTFBuscarMedico.setForeground(Color.GRAY);
        this.jCHorario.setSelectedIndex(0);
        this.jCedula.setText("");
        this.jConsultorio.setText("");
        this.jEspecialidad.setText("");
        ((JTextField) this.jFechaCita.getDateEditor().getUiComponent()).setText("");
        this.jNacimiento.setText("");
        this.jNombreMedico.setText("");
        this.jPaciente.setText("");
        this.jTelefonoM.setText("");
        this.jTelefonoP.setText("");
        this.jHora.setText("");
        this.jCHorario.setEnabled(false);
   }
    
    public void inicializarTablaPaciente(){
        DefaultTableModel modelo = new DefaultTableModel();
        // Agregar columnas al modelo
        modelo.addColumn("Cédula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Telefono");
        for(Paciente pacienteEncontrado: Paciente.getPacientes()){
            Object[] fila = {pacienteEncontrado.getIdCedula(), pacienteEncontrado.getNombre(), pacienteEncontrado.getApellido(), 
                pacienteEncontrado.getNumeroTelefonico()};
            modelo.addRow(fila);  
        }
        jTablaPaciente.setModel(modelo);
        setSizePaciente();
    }
    
    public void inicializarTablaMedico(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Especialidad");
        
        for (Medico medicoEncontrado : Medico.getMedicos()) {
            Object[] fila = {medicoEncontrado.getId(), medicoEncontrado.getNombre(), medicoEncontrado.getApellido(), medicoEncontrado.getEspecialidad()};
            modelo.addRow(fila);
        }
        jTablaMedicos.setModel(modelo);
        setSizeMedico();
    }
    
    public void inicializarTablaCitas(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Paciente");
        modelo.addColumn("Médico");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Consultorio");
        modelo.addColumn("Fecha");
        modelo.addColumn("Hora");
        modelo.setRowCount(0);
        for (CitaMedica cita : CitaMedica.getCitasMedicas()) {
            Object	[] fila = {cita.getId(), cita.getPaciente().getNombre()+" "+cita.getPaciente().getApellido(),
                cita.getMedico().getNombre()+" "+cita.getMedico().getApellido(),
                cita.getMedico().getEspecialidad(), cita.getMedico().getConsultorio(), cita.getFecha(), cita.getHora()};
            modelo.addRow(fila);
        }
        jTableCita.setModel(modelo);
        setSizeCitas();
    }

    private void resetBuscar(){
        if(this.jTFBuscar.getText().isEmpty()){
            this.jTFBuscar.setText("Paciente o Médico");
            this.jTFBuscar.setForeground(Color.GRAY);
        }
    }
     
    private void resetMedico(){
        if(this.jTFBuscarMedico.getText().isEmpty()){
            this.jTFBuscarMedico.setText("Especialidad");
            this.jTFBuscarMedico.setForeground(Color.GRAY);
        }
    }
    
    private void resetPaciente(){
        if(this.jTFBuscarPaciente.getText().isEmpty()){
            this.jTFBuscarPaciente.setText("Cédula");
            this.jTFBuscarPaciente.setForeground(Color.GRAY);
        }
    }
    
    private void setSizeCitas(){
        jTableCita.getColumnModel().getColumn(0).setPreferredWidth(42);
        jTableCita.getColumnModel().getColumn(1).setPreferredWidth(142);
        jTableCita.getColumnModel().getColumn(2).setPreferredWidth(142);
        jTableCita.getColumnModel().getColumn(3).setPreferredWidth(160);
        jTableCita.getColumnModel().getColumn(4).setPreferredWidth(93);
        jTableCita.getColumnModel().getColumn(5).setPreferredWidth(86);
        jTableCita.getColumnModel().getColumn(6).setPreferredWidth(86);
    }
    
    private void setSizeMedico(){
        jTablaMedicos.getColumnModel().getColumn(0).setPreferredWidth(64);
        jTablaMedicos.getColumnModel().getColumn(1).setPreferredWidth(79);
        jTablaMedicos.getColumnModel().getColumn(2).setPreferredWidth(79);
        jTablaMedicos.getColumnModel().getColumn(3).setPreferredWidth(127);
    }
    
    private void setSizePaciente(){
        jTablaPaciente.getColumnModel().getColumn(0).setPreferredWidth(84);
        jTablaPaciente.getColumnModel().getColumn(1).setPreferredWidth(88);
        jTablaPaciente.getColumnModel().getColumn(2).setPreferredWidth(88);
        jTablaPaciente.getColumnModel().getColumn(3).setPreferredWidth(105);
    }
    
    public void mensaje(String contenido, int tipo){
        JPanel panel = new JPanel(new FlowLayout());
        Font fuente14 = new Font("Dialog", Font.PLAIN, 14);
        JLabel label = new JLabel(contenido);
        label.setFont(fuente14);
        panel.add(label);
        UIManager.put("OptionPane.messageFont", fuente14);
        // Muestra el JOptionPane personalizado
        JOptionPane.showMessageDialog(
                null,
                panel,
                "Mensaje",
                tipo
        );
    }
    
    public int confirmacion(String mensaje, String botones[]){
        JPanel panel = new JPanel(new FlowLayout());
        Font fuente14 = new Font("Dialog", Font.PLAIN, 14);
        JLabel label = new JLabel(mensaje);
        label.setFont(fuente14);
        panel.add(label);
        UIManager.put("OptionPane.messageFont", fuente14);
        return JOptionPane.showOptionDialog(null, "¿Está seguro que desea cancelar la cita? ", 
                "Mensaje", 0, 0, null, botones, this);
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
            java.util.logging.Logger.getLogger(JFCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCitaMedica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new JFCitaMedica().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(JFCitaMedica.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBBuscarMedico;
    private javax.swing.JButton jBBuscarPaciente;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRegresar;
    private javax.swing.JComboBox<String> jCHorario;
    private javax.swing.JLabel jCedula;
    private javax.swing.JLabel jConsultorio;
    private javax.swing.JLabel jEspecialidad;
    private com.toedter.calendar.JDateChooser jFechaCita;
    private javax.swing.JLabel jHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jNacimiento;
    private javax.swing.JLabel jNombreMedico;
    private javax.swing.JLabel jPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTFBuscar;
    private javax.swing.JTextField jTFBuscarMedico;
    private javax.swing.JTextField jTFBuscarPaciente;
    private javax.swing.JTextField jTFaux;
    private javax.swing.JTable jTablaMedicos;
    private javax.swing.JTable jTablaPaciente;
    private javax.swing.JTable jTableCita;
    private javax.swing.JLabel jTelefonoM;
    private javax.swing.JLabel jTelefonoP;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}

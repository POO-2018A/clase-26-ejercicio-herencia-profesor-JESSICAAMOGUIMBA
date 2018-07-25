
package matricula;



import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel; 

public class Matricula extends javax.swing.JFrame {   

    //Tablas
    String [][] materias;
    DefaultTableModel tblModelMaterias;
    
    String [][] estudiantes;
    DefaultTableModel tblModelEstudiantes;
        
    String [][] matriculas;
    DefaultTableModel tblModelMatriculas;
    
    String [][] profesor;
    DefaultTableModel tblModelProfesor;
    
    
    List<Materia> listaMaterias = new ArrayList<Materia>();
    DefaultComboBoxModel listaMateriasModel = 
            new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesModel = 
            new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    List<Profesores> listaProfesores = new ArrayList<Profesores>();
    DefaultComboBoxModel listaProfesoresModel = 
            new DefaultComboBoxModel(listaProfesores.toArray());
    
    List<Estudiante> listaEstudiantesMatriculados = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesMatriculadosModel = 
            new DefaultComboBoxModel(listaEstudiantesMatriculados.toArray());
      
  // ARCHIVOS
    
    ArrayList<Object> materiaController = new ArrayList<>();
    int contP = 0;
    ArrayList<Object> profesoresController = new ArrayList<>();
    int cont = 0;
    
    
    
    ClsControlador controller = new ClsControlador();
    
    /**
     *
     */
    public Matricula() {
        initComponents();
        this.setTitle("VENTANA DE MATRICULAS");

        // archivos .dat
        materiaController = controller.extraerObjetos("materias.dat");
        if(materiaController.size() > 0){
            Materia ultimo = (Materia) materiaController.get(materiaController.size()-1);
            cont = ultimo.getId();
        }
        
        
        profesoresController = controller.extraerObjetos("profesores.dat");
        if(profesoresController.size() > 0){
            Profesores ultimo = (Profesores) profesoresController.get(profesoresController.size()-1);
            cont = ultimo.getId(); 
        }
    


        /*
        1Inicializo Tabla materias
        */
        String titulosColumnasMaterias[] = new String [] {
            "Materia"
        };
        
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblMaterias.setModel(tblModelMaterias);
              
        
        /*
        2Inicializo tabla estudiantes
        */        
        String titulosColumnasEstudiantes[] = new String [] {
            "Nombre", "Apellido", "Edad"
        };
        
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblEstudiantes.setModel(tblModelEstudiantes);   
                
        /*
        3Inicializo tabla matriculas
       */
        String titulosColumnasMatriculas[] = new String [] {
            "Estudiante", "Materia"
        };
        
        tblModelMatriculas = new DefaultTableModel(matriculas, titulosColumnasMatriculas);
        tblMatricula.setModel(tblModelMatriculas);
        
        /*  
        4Inicializo tabla proferores
       */
        String tituloColumnasProfesor[] = new String [] {
            "Nombre", "Apellido", " Materia"
        };
        
        tblModelProfesor = new DefaultTableModel(profesor, tituloColumnasProfesor);
        tblProfesor.setModel(tblModelProfesor);
                
        /*
        Inicializo combo de materias , estudiantes y profesores
        */
       cmbListaMaterias.setModel(listaMateriasModel);
     
       cmbListaEstudiantes.setModel(listaEstudiantesModel);

       cmbMateriaProfesor.setModel(listaProfesoresModel);
       llenarCombo();
       llenarGrid();
      
               
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblNombreMateria = new javax.swing.JLabel();
        txtNombreMateria = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMaterias = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreProfesor = new javax.swing.JTextField();
        txtApellidoProfesor = new javax.swing.JTextField();
        txtEdadProfesor = new javax.swing.JTextField();
        cmbMateriaProfesor = new javax.swing.JComboBox<>();
        btnRegistrarProfesor = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblProfesor = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblNombreEstudiante = new javax.swing.JLabel();
        lblApellidoEstudiante = new javax.swing.JLabel();
        lblEdadEstudiante = new javax.swing.JLabel();
        txtNombreEstudiante = new javax.swing.JTextField();
        txtApellidoEstudiante = new javax.swing.JTextField();
        txtEdadEstudiante = new javax.swing.JTextField();
        btnRegistrarEstudiante = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEstudiantes = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        lblEstudiante = new javax.swing.JLabel();
        cmbListaEstudiantes = new javax.swing.JComboBox<>();
        lblMateria = new javax.swing.JLabel();
        cmbListaMaterias = new javax.swing.JComboBox<>();
        btnMatricularEstudiante = new javax.swing.JButton();
        btnItem = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombreMateria.setText("Nombre de la Materia :");

        btnAgregarMateria.setText("Agregar materia");
        btnAgregarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMateriaActionPerformed(evt);
            }
        });

        tblMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblMaterias);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(btnAgregarMateria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombreMateria)
                                .addGap(74, 74, 74)
                                .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMateria)
                    .addComponent(txtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(btnAgregarMateria)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Materias", jPanel1);

        jLabel2.setText("Nombre :");

        jLabel4.setText("Apellido :");

        jLabel5.setText("Edad :");

        jLabel6.setText("Materia :");

        cmbMateriaProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMateriaProfesorActionPerformed(evt);
            }
        });

        btnRegistrarProfesor.setText("Registrar");
        btnRegistrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProfesorActionPerformed(evt);
            }
        });

        tblProfesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblProfesor);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(btnRegistrarProfesor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombreProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(txtApellidoProfesor)
                                    .addComponent(txtEdadProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(cmbMateriaProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtApellidoProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cmbMateriaProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadProfesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(43, 43, 43)
                .addComponent(btnRegistrarProfesor)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Profesores", jPanel4);

        lblNombreEstudiante.setText("Nombre :");

        lblApellidoEstudiante.setText("Apellido :");

        lblEdadEstudiante.setText("Edad :");

        btnRegistrarEstudiante.setText("Registrar Estudiante");
        btnRegistrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEstudianteActionPerformed(evt);
            }
        });

        tblEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE", "APELLIDO", "EDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblEstudiantes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreEstudiante)
                            .addComponent(lblApellidoEstudiante)
                            .addComponent(lblEdadEstudiante))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                .addComponent(txtApellidoEstudiante))
                            .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnRegistrarEstudiante))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEstudiante)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoEstudiante)
                    .addComponent(txtApellidoEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEstudiante)
                    .addComponent(txtEdadEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Estudiantes", jPanel2);

        lblEstudiante.setText("Estudiante : ");

        cmbListaEstudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaEstudiantesActionPerformed(evt);
            }
        });

        lblMateria.setText("Materia : ");

        cmbListaMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbListaMateriasActionPerformed(evt);
            }
        });

        btnMatricularEstudiante.setText("Matricular");
        btnMatricularEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularEstudianteActionPerformed(evt);
            }
        });

        btnItem.setText("Items seleccionado");
        btnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItemActionPerformed(evt);
            }
        });

        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tblMatricula);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMateria)
                    .addComponent(lblEstudiante))
                .addGap(91, 91, 91)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(318, 318, 318))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnMatricularEstudiante)
                        .addGap(182, 182, 182)
                        .addComponent(btnItem)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstudiante))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblMateria))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMatricularEstudiante)
                    .addComponent(btnItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );

        jTabbedPane1.addTab("Matrículas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMateriaActionPerformed
        
        Materia newMateria = new Materia(txtNombreMateria.getText());
        String nombreMateria = txtNombreMateria.getText();
        llenarGrid();
        
        boolean materiaExiste = false;
        if (!nombreMateria.equals("")) {
           int confirmacion = JOptionPane.showConfirmDialog(rootPane, " Ingresar esta Materia?", "Confirmación", JOptionPane.YES_NO_OPTION);
           
           if (confirmacion ==0) {
               for(Materia materiaSelecc : listaMaterias) {
            if(materiaSelecc.getNombre().equals(newMateria.getNombre())) {
                materiaExiste = true; 
            }
               }
               if(!materiaExiste) {
                   cont++;
                   Materia estudiante = new Materia(cont, txtNombreMateria.getText());
                   materiaController.add(estudiante);//
                   controller.escribirObjeto("materias.dat", materiaController);
                   materiaController = controller.extraerObjetos("materias.dat");
                   llenarCombo();
                    
                   listaMateriasModel.addElement(newMateria);
                   tblModelMaterias.addRow(new String[]{newMateria.getNombre()});  
                   listaProfesoresModel.addElement(newMateria);
               }
               txtNombreMateria.setText("");
           }
        }else{
           JOptionPane.showMessageDialog(rootPane,"Debe ingresar todos los campos","Advertencia", HEIGHT);
        }
       
    }//GEN-LAST:event_btnAgregarMateriaActionPerformed

    private void btnRegistrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteActionPerformed
        
        String nombre = txtNombreEstudiante.getText();
        String apellido = txtApellidoEstudiante.getText();
        int edad = Integer.parseInt(txtEdadEstudiante.getText());
        
        Estudiante newEstudiante = new Estudiante(nombre, apellido, edad);
        
        tblModelEstudiantes.addRow(new String[]{newEstudiante.getNombre(), newEstudiante.getApellido(), "" +  newEstudiante.getEdad()});
        
        listaEstudiantesModel.addElement(newEstudiante);
        
        txtNombreEstudiante.setText("");
        txtApellidoEstudiante.setText("");
        txtEdadEstudiante.setText("");
    }//GEN-LAST:event_btnRegistrarEstudianteActionPerformed

    private void btnMatricularEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularEstudianteActionPerformed
             
       /*Estudiante estudianteSel = (Estudiante)cmbListaEstudiantes.getSelectedItem();
        Materia materiaSel = (Materia) cmbListaMaterias.getSelectedItem();
        
        System.out.println("Estudiante seleccionado" + estudianteSel.getNombre());
        System.out.println("Materia seleccionado" + materiaSel.getNombre());
        
        boolean materiaExiste = false;
        ArrayList<Materia> materiasXEstudiante = estudianteSel.getMaterias(); //en el constructor aumentamos arreglo de materias
        if(materiasXEstudiante.size() > 0){
            for(Materia m : materiasXEstudiante) {
                if(materiaSel.equals(m)){
                    materiaExiste = true;
                    break;
                }
            }
        }
        
        if(!materiaExiste) {
            //tblModelMatriculas.addRow(new String[]{estudianteSel.getNombre(),materiaSel.getNombre()});
            tblModelMatriculas.addRow(new String[]{estudianteSel.getNombre().toString() ,materiaSel.getNombre().toString()});
            materiasXEstudiante.add(materiaSel);
        } else {
            JOptionPane.showMessageDialog(rootPane, "El estudiante ya se encuentra matriculado en esta materia.");
        }*/
     
       String materias = cmbListaMaterias.getSelectedItem().toString();
       String estudiantes = cmbListaEstudiantes.getSelectedItem().toString();
             
       tblModelMatriculas.addRow(new String[]{estudiantes,materias,});
              
     
    }//GEN-LAST:event_btnMatricularEstudianteActionPerformed

    private void cmbListaMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaMateriasActionPerformed
        // TODO add your handling code here:  
    }//GEN-LAST:event_cmbListaMateriasActionPerformed

    private void cmbListaEstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbListaEstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbListaEstudiantesActionPerformed

    private void btnRegistrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProfesorActionPerformed
        // TODO add your handling code here:
               
        String nombre = txtNombreProfesor.getText();
        String apellido = txtApellidoProfesor.getText();
        int edadProf = Integer.parseInt(txtEdadProfesor.getText());
        String materiaElegida = cmbMateriaProfesor.getSelectedItem().toString();
        llenarGrid();
        
        Profesores profesor = new Profesores(nombre,apellido,edadProf, materiaElegida);
         boolean verificarProfesor=false;
         
       if (!nombre.equals("") && !apellido.equals("") && !materiaElegida.equals("")){
     
          
                for (Profesores pSelec : listaProfesores){
                    if (pSelec.getMateria().equals(profesor.getMateria())){
                        verificarProfesor =true;
                        break;
                    }
                }
                if (!verificarProfesor){contP++;
                   Profesores prof = new Profesores (contP, txtNombreProfesor.getText(), txtApellidoProfesor.getText(),Integer.valueOf (txtEdadProfesor.getText()), cmbMateriaProfesor.getSelectedItem().toString() );
                   profesoresController.add(prof);
                   controller.escribirObjeto("profesores.dat", profesoresController);
                   profesoresController = controller.extraerObjetos("profesores.dat");
                   llenarCombo();
                   
                   
                    listaProfesores.add(profesor);
                    tblModelProfesor.addRow(new String [] {profesor.getNombre(), profesor.getApellido(), profesor.getMateria()});
                    cmbListaMaterias.addItem(materiaElegida);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Esta materia ya esta registrada.");

                }
                
                txtNombreProfesor.setText("");
                txtApellidoProfesor.setText("");
                txtEdadProfesor.setText("");
       }
       else{
       JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
       }
       
    }//GEN-LAST:event_btnRegistrarProfesorActionPerformed

    private void btnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItemActionPerformed
        // TODO add your handling code here:
      
         System.out.println("Materia seleccionada: "+ "   "  + cmbListaMaterias.getSelectedItem());
       
    }//GEN-LAST:event_btnItemActionPerformed

    private void cmbMateriaProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMateriaProfesorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbMateriaProfesorActionPerformed
    
   
    
    /**
     * @param args the command line arguments
     */
    
    public void llenarCombo(){
        if(materiaController.size() > 0){
            cmbListaMaterias.setEnabled(true);
            materiaController = controller.extraerObjetos("materias.dat");
            cmbListaMaterias.setModel(new javax.swing.DefaultComboBoxModel(materiaController.toArray()));
        }else{
            //cmbListaMaterias.setEnabled(false);
        }
    }
    
    public void llenarGrid(){
        if(materiaController.size() > 0){
            Materia est = new Materia();
            DefaultTableModel model = (DefaultTableModel) tblMaterias.getModel();
            for(int i = 0; i < materiaController.size(); i ++){
                est = (Materia) materiaController.get(i);
                System.out.println(est.getNombre());
                Object estudiantesG [] = {est.getNombre()};
                model.insertRow(i, estudiantesG);
            }
        }
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
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Matricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Matricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMateria;
    private javax.swing.JButton btnItem;
    private javax.swing.JButton btnMatricularEstudiante;
    private javax.swing.JButton btnRegistrarEstudiante;
    private javax.swing.JButton btnRegistrarProfesor;
    private javax.swing.JComboBox<String> cmbListaEstudiantes;
    private javax.swing.JComboBox<String> cmbListaMaterias;
    private javax.swing.JComboBox<String> cmbMateriaProfesor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblApellidoEstudiante;
    private javax.swing.JLabel lblEdadEstudiante;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblNombreEstudiante;
    private javax.swing.JLabel lblNombreMateria;
    private javax.swing.JTable tblEstudiantes;
    private javax.swing.JTable tblMaterias;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTable tblProfesor;
    private javax.swing.JTextField txtApellidoEstudiante;
    private javax.swing.JTextField txtApellidoProfesor;
    private javax.swing.JTextField txtEdadEstudiante;
    private javax.swing.JTextField txtEdadProfesor;
    private javax.swing.JTextField txtNombreEstudiante;
    private javax.swing.JTextField txtNombreMateria;
    private javax.swing.JTextField txtNombreProfesor;
    // End of variables declaration//GEN-END:variables
}

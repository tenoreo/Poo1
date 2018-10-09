/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.Pasajero;
import Logica.Viaje;
import Logica.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import org.jdom2.Element;
import sun.util.calendar.LocalGregorianCalendar.Date;

/**
 *
 * @author kenda
 */
public class SolicitarViaje extends javax.swing.JFrame {
    private DefaultTableModel model=new DefaultTableModel();
    private static final String patronCorreo = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    List<Pasajero> lPasajero=new ArrayList<Pasajero>();
    /**
     * Creates new form SolicitarViaje
     */
    public SolicitarViaje() {
        initComponents();
        tablaContenidos();
    }
    public void tablaContenidos(){
        String titulos[]={"Nombre","Identificación","Correo","Dirección","Teléfono"};
        model.setColumnIdentifiers(titulos);
        tabla.setModel(model);
        TableColumn columnaN=tabla.getColumn("Nombre");
        columnaN.setPreferredWidth(150);
        TableColumn columnaI=tabla.getColumn("Identificación");
        columnaI.setPreferredWidth(100);
        TableColumn columnaC=tabla.getColumn("Correo");
        columnaC.setPreferredWidth(100);
        TableColumn columnaD=tabla.getColumn("Dirección");
        columnaD.setPreferredWidth(100);
        TableColumn columnaT=tabla.getColumn("Teléfono");
        columnaT.setPreferredWidth(80);
        
    }
    
    public boolean existePasajero(String ced,String nomb) throws IOException{
        Xml verXml = new Xml();
        List list=verXml.cargarPasajero();
        for ( int j = 0; j < list.size(); j++ ){//Se recorre cada nodo padre
            Element campo = (Element)list.get( j );
            String cedula = campo.getChildTextTrim("Cedula");
            String nombre = campo.getChildTextTrim("Nombre");
            if(ced.equals(nombre) && ced.equals(cedula))//Equals para verifica si es el mismo
                return true;
        }return false;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfPSalida = new javax.swing.JTextField();
        tfFViaje = new javax.swing.JTextField();
        tfHInicio = new javax.swing.JTextField();
        tfHFinal = new javax.swing.JTextField();
        tfDestino = new javax.swing.JTextField();
        tfNombre = new javax.swing.JTextField();
        tfIdent = new javax.swing.JTextField();
        tfCorreo = new javax.swing.JTextField();
        tfDireccion = new javax.swing.JTextField();
        tfTelefono = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnSolicitar = new javax.swing.JButton();
        cbbHInicio = new javax.swing.JComboBox<>();
        cbbHFinal = new javax.swing.JComboBox<>();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Consolas", 3, 24)); // NOI18N
        jLabel1.setText("Soilicitar Viaje");

        jLabel2.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel2.setText("Punto de salida:");

        jLabel3.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel3.setText("Fecha del viaje:");

        jLabel4.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel4.setText("Hora de inicio:");

        jLabel5.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel5.setText("Hora de Finalización:");

        jLabel6.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel6.setText("Destino:");

        jLabel7.setFont(new java.awt.Font("Consolas", 3, 20)); // NOI18N
        jLabel7.setText("Pasajeros");

        jLabel8.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel8.setText("Nombre:");

        jLabel9.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel9.setText("Identificacion:");

        jLabel10.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel10.setText("Correo:");

        jLabel11.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel11.setText("Dirección:");

        jLabel12.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N
        jLabel12.setText("Teléfono:");

        tfPSalida.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfFViaje.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfHInicio.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfHFinal.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfDestino.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfNombre.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfIdent.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfCorreo.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfDireccion.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        tfTelefono.setFont(new java.awt.Font("Consolas", 2, 18)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        tabla.setFont(tabla.getFont().deriveFont((tabla.getFont().getStyle() | java.awt.Font.ITALIC), tabla.getFont().getSize()+5));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla);

        btnSolicitar.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        btnSolicitar.setText("Solicitar Viaje");
        btnSolicitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarActionPerformed(evt);
            }
        });

        cbbHInicio.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        cbbHInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        cbbHFinal.setFont(new java.awt.Font("Consolas", 3, 18)); // NOI18N
        cbbHFinal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AM", "PM" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombre)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                            .addComponent(tfIdent)
                            .addComponent(tfCorreo)
                            .addComponent(tfDireccion))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                                    .addComponent(tfFViaje)
                                    .addComponent(tfDestino))
                                .addComponent(tfHInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfHFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnSolicitar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbHFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbbHInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfPSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfFViaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tfHInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbbHInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfHFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cbbHFinal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSolicitar))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfIdent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tfCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addComponent(tfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(tfTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEliminar)
                            .addGap(18, 18, 18)
                            .addComponent(btnAgregar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String[] pasajeros=new String[5];
            String c=tfIdent.getText().trim();
            pasajeros[0]=c;
            String tel=tfTelefono.getText().trim();
            pasajeros[1]=tel;
            String nomb=tfNombre.getText().trim();
            pasajeros[2]=nomb;
            String cor=tfCorreo.getText().trim();
            pasajeros[3]=cor;
            String dir=tfDireccion.getText().trim();
            pasajeros[4]=dir;
            Pasajero pasajero=new Pasajero(nomb,Integer.parseInt(c),dir,cor,Integer.parseInt(tel));
            Xml escribirPasajero=new Xml();
            List<Pasajero> listaPasajero=null;
            boolean pase=true;
            if(c.equals("") && tel.equals("") && nomb.equals("") && cor.equals("")
                    && dir.equals("")){
                JOptionPane.showMessageDialog(this,"Por favor revise que todos los campos sean llenados");// TODO add your handling code here:
                pase=false;
            }else if(existePasajero(tfIdent.getText().trim(),tfNombre.getText().trim())){
                JOptionPane.showMessageDialog(this,"El pasajero no esta registrado en el sistema registrelo por favor");// TODO add your handling code here:
            pase=false;
            }else{
                for(int i=0;i<tabla.getRowCount();i++){
                    if(lPasajero.get(i).equals(pasajero.getNombreCompleto().toLowerCase()) &&
                            lPasajero.get(i).equals(c.toLowerCase())){
                        JOptionPane.showMessageDialog(this,"Ya el pasajero esta registrado");
                        pase=false;
                    }
                }
            }
            if(pase){
                model.addRow(pasajeros);
                lPasajero.add(pasajero);
                tfNombre.setText("");
                tfIdent.setText("");
                tfCorreo.setText("");
                tfDireccion.setText("");
                tfTelefono.setText("");
            }
        } catch (IOException ex) {
            Logger.getLogger(SolicitarViaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int indice=tabla.getSelectedRow();
        if(indice>-1){
            lPasajero.remove(indice);
            model.removeRow(indice);
        }
        else{
            JOptionPane.showMessageDialog(this,"Seleccione el pasajero a eliminar");
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSolicitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarActionPerformed
        String pSalida=tfPSalida.getText().trim();
        String fViaje=tfFViaje.getText().trim();
        String hInicio=tfHInicio.getText().trim();
        String hFinal=tfHFinal.getText().trim();
        String destino=tfDestino.getText().trim();
        String cbHInicio=cbbHInicio.getSelectedItem().toString().trim();
        String cbHFinal=cbbHFinal.getSelectedItem().toString().trim();
        Xml escribirViaje=new Xml();
        List<Viaje> listaViaje=null; 
        if(pSalida.isEmpty() && fViaje.isEmpty() && hInicio.isEmpty() && hFinal.isEmpty() && destino.isEmpty())
            JOptionPane.showMessageDialog(this,"EL formulario esta incompleto");
        else if(validarPSalida(pSalida))
            JOptionPane.showMessageDialog(this,"El campo de punto de salida esta incorrecto");
        else if(validarFViaje(hInicio) && validarFViaje(hFinal))//gftygfytfytg
            JOptionPane.showMessageDialog(this,"El campo de punto de salida esta incorrecto");
        else if(validarViajes(hInicio,hFinal,cbHInicio,cbHFinal))
                JOptionPane.showMessageDialog(this,"La reserva debe ser 24 horas antes de hacer el viaje");
        else{
            escribirViaje.escribirViaje();
            
        }
    }//GEN-LAST:event_btnSolicitarActionPerformed
    
    public boolean validarPSalida(String text){
        if(tryParse(text)<0)
            return true;
        return false;
    }
    @SuppressWarnings("empty-statement")
    public boolean validarViajes(String inicio,String finala,String cbHInicio,String cbFinal){
        
        //primera hora(la que inicia)
        char inicio1=inicio.charAt(0);
        char inicio2=inicio.charAt(1);
        String ini1=Character.toString(inicio1);
        String ini2=Character.toString(inicio2);
        int in1=Integer.valueOf(ini1)*10;
        int in2=Integer.valueOf(ini2)*1;
        int t1=in1+in2;
        
        //segunda hora(la que termina)
        char final1=finala.charAt(0);
        char final2=finala.charAt(1);
        String fina1=Character.toString(final1);
        String fina2=Character.toString(final2);
        int fin1=Integer.valueOf(fina1)*10;
        int fin2=Integer.valueOf(fina2)*1;
        int t2=fin1+fin2;
        
        //los minutos de inicio
        char inicio3=inicio.charAt(3);
        char inicio4=inicio.charAt(4);
        String ini3=Character.toString(inicio3);
        String ini4=Character.toString(inicio4);
        int in3=Integer.valueOf(ini3)*10;
        int in4=Integer.valueOf(ini4)*1;
        int t3=in3+in4;
        
        
        //los minutos de la final
        char final3=finala.charAt(3);
        char final4=finala.charAt(4);
        String fina3=Character.toString(final3);
        String fina4=Character.toString(final4);
        int fin3=Integer.valueOf(fina3)*10;
        int fin4=Integer.valueOf(fina4)*1;
        int t4=fin3+fin4;
        
        //dia,mes,ano actual
        Calendar c = Calendar.getInstance();
        String dia=Integer.toString(c.get(Calendar.DATE));
        int dia1=Integer.parseInt(dia);
        String mes=Integer.toString(c.get(Calendar.MONTH));
        int mes1=Integer.parseInt(mes);
        String annio = Integer.toString(c.get(Calendar.YEAR));
        int annio1=Integer.parseInt(annio);
        
        Calendar calendario = new GregorianCalendar();
        
        //tiempo actual(hora,minutos y segundos)
        int hora=calendario.get(Calendar.HOUR_OF_DAY);
        int minutos= calendario.get(Calendar.MINUTE);
        int segundos= calendario.get(Calendar.SECOND);
        return hora>t1 && cbHInicio=="AM";
    }
    public boolean validarFViaje(String text){
        int i=0;
        String ca = null;
        int car;
        for(char c:text.toCharArray()){
            if(i==0 || i==1 || i==3 || i==4 ||i==6 ||i==7)
                ca=Character.toString(c);
                car=Integer.valueOf(ca);
                if(tryParse(ca)<0) 
                    return false;
        
        }
        return true;
    }
    
    public static  Integer tryParse(String text) {
        try {
            int resul=Integer.parseInt(text);
            return resul;
        } catch (NumberFormatException e) {
            return -1;
        }
    }
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
            java.util.logging.Logger.getLogger(SolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SolicitarViaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SolicitarViaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSolicitar;
    private javax.swing.JComboBox<String> cbbHFinal;
    private javax.swing.JComboBox<String> cbbHInicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tfCorreo;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfDireccion;
    private javax.swing.JTextField tfFViaje;
    private javax.swing.JTextField tfHFinal;
    private javax.swing.JTextField tfHInicio;
    private javax.swing.JTextField tfIdent;
    private javax.swing.JTextField tfNombre;
    private javax.swing.JTextField tfPSalida;
    private javax.swing.JTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
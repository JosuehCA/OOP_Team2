using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using MySql.Data.MySqlClient;
namespace RFID

{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            CheckForIllegalCrossThreadCalls = false;
        }
        private void button1_Click(object sender, EventArgs e)
        {
            try
            {
                string consulta = string.Format("INSERT INTO `RFID`.`datos`(`uid`,`nombre`,`fechaderegistro`)VALUES('{0}','{1}','{2}');", txt_uid.Text, txt_nombre.Text, DateTime.Now.ToString("dd-MM-yyyy")); //Query SQL
                string cadenaConexion = @"server=127.0.0.1; database=RFID; User id=root; password=Cdeciencia198;";
                MySqlDataAdapter adaptador = new MySqlDataAdapter(consulta, cadenaConexion);
                MySqlCommandBuilder comando = new MySqlCommandBuilder(adaptador);
                DataTable dt = new DataTable();
                adaptador.Fill(dt);
                MessageBox.Show("Agregado");
            }
            catch (Exception ex)
            {
                MessageBox.Show("error " + ex.Message);
            }
        }
        private void button2_Click(object sender, EventArgs e)
        {
            try
            {
                string consulta = string.Format("SELECT * FROM RFID.datos where uid = '{0}'", txt_uid.Text); //Query SQL
                string cadenaConexion = @"server=127.0.0.1; database=RFID; User id=root; password=Cdeciencia1985;";
                MySqlDataAdapter adaptador = new MySqlDataAdapter(consulta, cadenaConexion);
                MySqlCommandBuilder comando = new MySqlCommandBuilder(adaptador);
                DataTable dt = new DataTable();
                adaptador.Fill(dt);
                MessageBox.Show(string.Format("id: {0} uid: {1} nombre: {2} fecha: {3}", dt.Rows[0].ItemArray[0].ToString(), dt.Rows[0].ItemArray[1].ToString(), dt.Rows[0].ItemArray[2].ToString(), dt.Rows[0].ItemArray[3].ToString()));
            }
            catch (Exception ex)
            {
                MessageBox.Show("Error " + ex.Message);
            }
        }
        private void button3_Click(object sender, EventArgs e)
        {
            serialPort1.Open();
            string entrada = serialPort1.ReadLine();
            serialPort1.Close();
            txt_uid.Text = entrada;
        }
    }
}
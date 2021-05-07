using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab1
{
    public partial class Lab1B : Form
    {
        public Lab1B()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label5_Click(object sender, EventArgs e)
        {

        }

        private void button1_Click(object sender, EventArgs e)
        {
            //takes user input
            int txtA = 0;
            int txtB = 0;
            int txtC = 0;
            try
            {
                txtA = Convert.ToInt32(txtClassA.Text);
                txtB = Convert.ToInt32(txtClassB.Text);
                txtC = Convert.ToInt32(txtClassC.Text);
            }
            catch (Exception ex) 
            {
                MessageBox.Show("Please enter whole numbers only.");
            }

            //computes cash totals
            decimal classA = txtA * 15;
            decimal classB = txtB * 12;
            decimal classC = txtC * 9;
            decimal total = classA + classB + classC;

            //displays cash totals
            txtTotalA.Text = classA.ToString("c");
            txtTotalB.Text = classB.ToString("c");
            txtTotalC.Text = classC.ToString("c");
            txtTotal.Text = total.ToString("c");

        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            //clears all text boxes
            txtClassA.Text = "";
            txtClassB.Text = "";
            txtClassC.Text = "";
            txtTotalA.Text = "";
            txtTotalB.Text = "";
            txtTotalC.Text = "";
            txtTotal.Text = "";
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            //closes program
            this.Close();
        }
    }
}

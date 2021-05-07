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
    public partial class Lab1A : Form

    {
        public Lab1A()
        {
            InitializeComponent();
        }

        private void Lab1A_Load(object sender, EventArgs e)
        {

        }

        private void btnConvert_Click(object sender, EventArgs e)
        {

        }

        private void btnC_Click(object sender, EventArgs e)
        {
            //takes user input
            decimal input = Convert.ToDecimal(txtInput.Text);

            //converts input to celsius
            decimal result = (input - 32) * 5 / 9;

            //displays coverted temperature
            txtResult.Text = result.ToString();
        }

        private void Lab1A_Load_1(object sender, EventArgs e)
        {

        }

        private void btnF_Click(object sender, EventArgs e)
        {
            //takes user input
            decimal input = Convert.ToDecimal(txtInput.Text);

            //coverts input to fahrenheit
            decimal result = (input + 32) * 5 / 9;

            //displays converted temp
            txtResult.Text = result.ToString();
        }
    }
}

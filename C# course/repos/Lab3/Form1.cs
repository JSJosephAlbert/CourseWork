using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab3
{
    public partial class Form1 : Form
    {
        
        public Calculator calculator = (Calculator)new Calculator();
        public MemoryCalculator memoryCalculator;
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            //.FlatStyle = FlatStyle.Flat;
            //.FlatAppearance.BorderSize = 0;

            //for whatever reason this only works if done here
            memoryCalculator = new MemoryCalculator(this);
        }

        private void btnMultiply_Click(object sender, EventArgs e)
        {
            //looking back, idk why i did this this way
            calculator.op1 = Convert.ToDecimal(textBox1.Text);
            calculator.operation = "*";
            textBox1.Text = "0";
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            calculator.op1 = Convert.ToDecimal(textBox1.Text);
            calculator.operation = "+";
            textBox1.Text = "0";
        }

        private void btnDecimal_Click(object sender, EventArgs e)
        {
            textBox1.Text += ".";
        }

        private void btnPosNeg_Click(object sender, EventArgs e)
        {
            decimal x = Convert.ToDecimal(textBox1.Text);
            x *= -1;
            textBox1.Text = Convert.ToString(x);
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            textBox1.Text += "0";
        }

        private void btnSubtract_Click(object sender, EventArgs e)
        {
            calculator.op1 = Convert.ToDecimal(textBox1.Text);
            calculator.operation = "-";
            textBox1.Text = "0";
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            textBox1.Text += "3";
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            textBox1.Text += "2";
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            textBox1.Text += "1";
        }

        private void btnWhat_Click(object sender, EventArgs e)
        {
            decimal x = Convert.ToDecimal(textBox1.Text);
            x = calculator.Reciprocal(x);
            textBox1.Text = Convert.ToString(x);
        }

        private void btnEquals_Click(object sender, EventArgs e)
        {
            calculator.op2 = Convert.ToDecimal(textBox1.Text);
            textBox1.Text = Convert.ToString(calculator.Equals());
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            textBox1.Text += "6";
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            textBox1.Text += "5";
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            textBox1.Text += "4";
        }

        private void btnSqrt_Click(object sender, EventArgs e)
        {
            double x = Convert.ToDouble(textBox1.Text);
            x = Math.Sqrt(x);
            textBox1.Text = Convert.ToString(x);
        }

        private void btnDivide_Click(object sender, EventArgs e)
        {
            if (Convert.ToDecimal(textBox1.Text) != 0)
            {
                calculator.op1 = Convert.ToDecimal(textBox1.Text);
                calculator.operation = "/";
                textBox1.Text = "0";
            }
            else
            {
                textBox1.Text = "Cannot divide by 0.";
            }
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            textBox1.Text += "9";
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            textBox1.Text += "8";
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            textBox1.Text += "7";
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            calculator.op1 = 0;
            calculator.op2 = 0;
            calculator.operation = "";
            textBox1.Text = "0";
        }

        private void btnBack_Click(object sender, EventArgs e)
        {
            int stringLength = textBox1.Text.Length;
            if (stringLength > 0)
            {
                string newText = textBox1.Text.Remove(stringLength - 1, 1);
                textBox1.Text = newText;
            }
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnMStore_Click(object sender, EventArgs e)
        {
            memoryCalculator.MemoryStore(textBox1.Text);
        }

        private void btnMRecall_Click(object sender, EventArgs e)
        {
            memoryCalculator.MemoryRecall();
        }

        private void btnMAdd_Click(object sender, EventArgs e)
        {
            memoryCalculator.MemoryAdd(textBox1.Text);
        }

        private void btnMClear_Click(object sender, EventArgs e)
        {
            memoryCalculator.MemoryClear();
        }
    }
}

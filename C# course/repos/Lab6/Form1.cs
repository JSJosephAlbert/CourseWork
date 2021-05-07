using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            rdoLatin.Select();
            label2.Text = "";
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        private void btnTranslate_Click(object sender, EventArgs e)
        {
            ITranslator translator;

            if (rdoLatin.Checked)
            {
                translator = new PigLatinTranslator();
                label2.Text = "Pig Latin:";
            }
            else
            {
                translator = new PigGreekTranslator();
                label2.Text = "Pig Greek:";
            }
            //else MessageBox.Show("Please check a box for either Pig Latin or Pig Greek.");

            if (!String.IsNullOrEmpty(textBox1.Text))
            {
                string[] english = textBox1.Text.Split(new char[] { ' ', '\t' }, StringSplitOptions.RemoveEmptyEntries);

                //for each word in the string run it through the translator
                foreach (string word in english) {
                   textBox2.Text += translator.Translate(word) + " ";
                }
            }
        }

        private void btnClear_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
            textBox2.Clear();
        }

        private void radLatin_CheckedChanged(object sender, EventArgs e)
        {
            
        }

        private void radGreek_CheckedChanged(object sender, EventArgs e)
        {

        }
    }
}

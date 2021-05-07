using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab2
{
    public partial class AddNewStudent : Form
    {
        Student newStudent = new Student();
        public AddNewStudent()
        {
            InitializeComponent();
        }

        private void btAddScore_Click(object sender, EventArgs e)
        {
            newStudent.StudentName = txtStudentName.Text;

            txtScores.Text += Convert.ToInt32(txtScore.Text) +" ";
            newStudent.Scores.Add(Convert.ToInt32(txtScore.Text));
        }

        private void btOK_Click(object sender, EventArgs e)
        {
            this.Tag = newStudent;
        }

        private void btClearScores_Click(object sender, EventArgs e)
        {
            txtScores.Text = "";
            newStudent.Scores.Clear();
        }
    }
}

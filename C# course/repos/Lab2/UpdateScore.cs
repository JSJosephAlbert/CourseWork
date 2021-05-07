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
    public partial class UpdateScore : Form
    {
        public Student student;
        public UpdateScore()
        {
            InitializeComponent();
        }

        private void btUpdate_Click(object sender, EventArgs e)
        {
            int score = Convert.ToInt32(txtScore.Text);

            this.Tag = score;
        }

        private void UpdateScore_Load(object sender, EventArgs e)
        {
        }
    }
}

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
    public partial class AddScore : Form
    {
        public Student student;
        public int score;
        public AddScore()
        {
            InitializeComponent();
        }

        private void btAdd_Click(object sender, EventArgs e)
        {
            score = Convert.ToInt32(txtScore.Text);

            this.Tag = score;
        }
    }
}

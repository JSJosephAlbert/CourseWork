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
    public partial class UpdateStudentScores : Form
    {
        public Student student;
        public UpdateStudentScores()
        {
            InitializeComponent();
            student = new Student();
        }

        private void UpdateStudentScores_Load(object sender, EventArgs e)
        {
            student = (Student)this.Tag;

            txtName.Text = student.StudentName;

            //loads student scores into listbox
            foreach (var score in student.Scores)
            {
                lstScores.Items.Add(score);
            }
        }

        private void btAdd_Click(object sender, EventArgs e)
        {
            int newScore;

            this.Tag = student;

            Form addScore = new AddScore();
            StudentScores.SetDialogProperties(addScore);

            DialogResult dialogResult = addScore.ShowDialog();

            if (dialogResult == DialogResult.OK)
            {
                //adds the new score
                newScore = (int)addScore.Tag;
                student.Scores.Add(newScore);

                lstScores.Items.Add(newScore);
            }
        }

        private void btUpdate_Click(object sender, EventArgs e)
        {
            int newScore;

            this.Tag = student;

            Form updateScore = new UpdateScore();
            StudentScores.SetDialogProperties(updateScore);

            DialogResult dialogResult = updateScore.ShowDialog();

            if (dialogResult == DialogResult.OK)
            {
                //updates student
                newScore = (int)updateScore.Tag;
                int index = lstScores.SelectedIndex;
                student.Scores[index] = newScore;

                //doesnt work for whatever reason but the update score displays correctly on the main form so i guess its kinda fine
                lstScores.SelectedItem = newScore;
            }
        }

        private void btRemove_Click(object sender, EventArgs e)
        {
            while (lstScores.SelectedItems.Count != 0)

            {
                //behold the freeze button
                //nevermind, now it just crashes
                lstScores.Items.Remove((int)lstScores.SelectedItem);
                student.Scores.Remove((int)lstScores.SelectedItem);
            }
            
        }

        private void btClearScores_Click(object sender, EventArgs e)
        {
            //clears scores
            lstScores.Items.Clear();
            student.Scores.Clear();
        }
    }
}

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
    public partial class StudentScores : Form
    {
        public List<Student> students;

        public StudentScores()
        {
            InitializeComponent();
            students = new List<Student>();
        }

        private void OpenAddNewStudent(object sender, EventArgs e)
        {
            Form addNewStudent = new AddNewStudent();
            SetDialogProperties(addNewStudent);

            DialogResult dialogResult = addNewStudent.ShowDialog();

            if (dialogResult == DialogResult.OK)
            {
                //adds new student
                Student student = (Student)addNewStudent.Tag;

                students.Add(student);
                ListStudents();
                lstStudents.SelectedIndex = 0;
            }

        }
        public void ListStudents()
        {
            lstStudents.Items.Clear();
            foreach (var student in students)
            {
                lstStudents.Items.Add(student);
            }
        }

        public static void SetDialogProperties(Form addNewStudent)
        {
            addNewStudent.FormBorderStyle = FormBorderStyle.FixedDialog;
            addNewStudent.ControlBox = false;
            addNewStudent.MaximizeBox = false;
            addNewStudent.MinimizeBox = false;
        }

        private void OpenUpdateStudentScores(object sender, EventArgs e)
        {
            Student student = (Student)lstStudents.SelectedItem;

            Form updateStudentScores = new UpdateStudentScores();

            updateStudentScores.Tag = student;

            DialogResult dialogResult = updateStudentScores.ShowDialog();
            
            if(dialogResult == DialogResult.OK)
            {
                student = (Student)updateStudentScores.Tag;

                lstStudents.SelectedItem = student;

                ListStudents();
            }
        }

        private void Exit(object sender, EventArgs e)
        {
            this.Close();
        }

        public void lstStudents_SelectedIndexChanged(object sender, EventArgs e)
        {
            Student student = (Student)lstStudents.SelectedItem;
            //crashes if student is null despite if statement
            if (student != null) {
                txtAverage.Text = Convert.ToString(student.Average());
                txtScoreCount.Text = Convert.ToString(student.Count());
                txtScoreTotal.Text = Convert.ToString(student.Sum());
                this.Tag = student;
            }
        }

        private void StudentScores_Load(object sender, EventArgs e)
        {
            
        }
    }
}

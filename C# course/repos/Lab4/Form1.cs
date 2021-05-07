using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Lab4
{
    public partial class Form1 : Form
    {
        //creates robot object
        Robot robot = (Robot)new Robot();
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            label2.Location = new Point(robot.x, robot.y);
            label1.Text = "x:" + Convert.ToString(robot.x - 100) + " " + "y:" + Convert.ToString(robot.y - 100);
        }

        private void panel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            this.Close();
        }

        //events to set robot direction
        //this might look weird if you dont have wingdings 3 downloaded
        private void btnW_Click(object sender, EventArgs e)
        {
            robot.SetDirection("left");
            label2.Text = "f";
        }
        private void btnN_Click(object sender, EventArgs e)
        {
            robot.SetDirection("up");
            label2.Text = "h";
        }
        private void btnE_Click(object sender, EventArgs e)
        {
            robot.SetDirection("right");
            label2.Text = "g";
        }
        private void btnS_Click(object sender, EventArgs e)
        {
            robot.SetDirection("down");
            label2.Text = "i";
        }

        private void btnG1_Click(object sender, EventArgs e)
        {
            //checks if robot is in bounds
            if (robot.y <= 200 && robot.y >= 0 && robot.x <= 200 && robot.x >= 0)
            {
                robot.Go1();
                label2.Location = new Point(robot.x, robot.y);
            }

            //these if statements check if robot is out of bounds
            if (robot.y > 200)
            {
                robot.y -= 1;
                label2.Location = new Point(robot.x, robot.y);
            }
            if (robot.x > 200)
            {
                robot.x -= 1;
                label2.Location = new Point(robot.x, robot.y);
            }
            if (robot.y < 0)
            {
                robot.y += 1;
                label2.Location = new Point(robot.x, robot.y);
            }
            if (robot.x < 0)
            {
                robot.x += 1;
                label2.Location = new Point(robot.x, robot.y);
            }

            //updates coordinates
            label1.Text = "x:" + Convert.ToString(robot.x - 100) + " " + "y:" + Convert.ToString(robot.y - 100);
        }

        private void btnG10_Click(object sender, EventArgs e)
        {
            //checks if robot is in bounds
            if (robot.y <= 200 && robot.y >= 0 && robot.x <= 200 && robot.x >= 0) {
                robot.Go10();
                label2.Location = new Point(robot.x, robot.y);
            }
            else
            {
                //commented out because its annoying
                //MessageBox.Show("Robot has reached end of area");
            }

            //these loops keep the robot within the bounds
            while (robot.y > 200)
            {
                robot.y -= 1;
                label2.Location = new Point(robot.x, robot.y);
                label1.Text = "x:" + Convert.ToString(robot.x) + " " + "y:" + Convert.ToString(robot.y);
            }
            while (robot.x > 200)
            {
                robot.x -= 1;
                label2.Location = new Point(robot.x, robot.y);
                label1.Text = "x:" + Convert.ToString(robot.x) + " " + "y:" + Convert.ToString(robot.y);
            }
            while (robot.y < 0)
            {
                robot.y += 1;
                label2.Location = new Point(robot.x, robot.y);
                label1.Text = "x:" + Convert.ToString(robot.x) + " " + "y:" + Convert.ToString(robot.y);
            }
            while (robot.x < 0)
            {
                robot.x += 1;
                label2.Location = new Point(robot.x, robot.y);
                label1.Text = "x:" + Convert.ToString(robot.x) + " " + "y:" + Convert.ToString(robot.y);
            }

            //updates coordinates
            label1.Text = "x:" + Convert.ToString(robot.x - 100) + " " + "y:" + Convert.ToString(robot.y - 100);
        }

        //centers robot ;)
        private void btnCenter_Click(object sender, EventArgs e)
        {
            robot.Center();
            label2.Location = new Point(robot.x, robot.y);
            label1.Text = "x:" + Convert.ToString(robot.x - 100) + " " + "y:" + Convert.ToString(robot.y - 100);
        }
    }
}

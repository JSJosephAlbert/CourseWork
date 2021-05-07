using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Lab4
{

    class Robot
    {
        //class variables
        private string up = "h";
        private string down = "i";
        private string left = "f";
        private string right = "g";
        public string direction;
        public int x;
        public int y;
        public int centerX = 100;
        public int centerY= 100;

        //no arg constructor
        public Robot()
        {
            x = centerX;
            y = centerY;
            direction = up;
        }

        //sets direction. takes up, down, left, or right strings as argument
        public void SetDirection(string x)
        {
            if(x == "up")
            {
                direction = up;
            }
            if(x == "down")
            {
                direction = down;
            }
            if(x == "left")
            {
                direction = left;
            }
            if(x == "right")
            {
                direction = right;
            }
        }
        //centers robot
        public void Center()
        {
            x = centerX;
            y = centerY;
        }

        //adds or subracts 10 to x or y depending on robots direction
        public void Go10()
        {
            if(direction == up)
            {
                y -= 10;
            }
            if(direction == down)
            {
                y += 10;
            }
            if(direction == left)
            {
                x -= 10;
            }
            if(direction == right)
            {
                x += 10;
            }
        }

        //adds or subracts 1 to x or y depending on robots direction
        public void Go1()
        {
            if (direction == up)
            {
                y -= 1;
            }
            if (direction == down)
            {
                y += 1;
            }
            if (direction == left)
            {
                x -= 1;
            }
            if (direction == right)
            {
                x += 1;
            }
        }

    }
}

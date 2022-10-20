public class TimeConversion {
    public static void main(String[] args) {
        String s = "11:00:00PM";
        // Get hours
        int h1 = (int)s.charAt(1) - '0';
        int h2 = (int)s.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        String[] holder = new String[8];

        // If time is in "AM"
        if (s.charAt(8) == 'A') {
            if (hh == 12)
            {
                for (int i = 2; i <= 7; i++)
                    holder[i] = String.valueOf(s.charAt(i));
                // override the first 2 value
                holder[0] = "0";
                holder[1] = "0";
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    holder[i] = String.valueOf(s.charAt(i));
            }
        }
        // If time is in "PM"
        else {
            if (hh == 12)
            {
                for (int i = 0; i <= 7; i++)
                    holder[i] = String.valueOf(s.charAt(i));
            }
            else
            {
                hh = hh + 12;
                String hour = String.valueOf(hh);
                String[] h = hour.split("");
                for (int i = 2; i <= 7; i++)
                    holder[i] = String.valueOf(s.charAt(i));
                // override the first 2 value
                holder[0] = h[0];
                holder[1] = h[1];
            }
        }
        System.out.println(String.join("", holder));
    }
}

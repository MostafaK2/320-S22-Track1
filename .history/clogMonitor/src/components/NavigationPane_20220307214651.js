import React from "react";
import Link from "@mui/material/Link";

function NavigationPane() {
  return (
    <div>
      <h1>Navigation</h1>

      <h3>
        <Link href="#" underline="none">
          Home
        </Link>
      </h3>
      <h3>
        <Link href="#" underline="none">
          Business Processes
        </Link>
      </h3>
      <h3>
        <Link href="#" underline="none">
          Log Events
        </Link>
      </h3>
    </div>
  );
}

export default NavigationPane;

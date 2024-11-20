const express = require("express");
const dotenv = require('dotenv');
const connectDB = require("./config/db");
const userRoutes = require("./routes/userRoutes");

dotenv.config();

const app = express();
const port = process.env.PORT || 3000;

app.use(express.json());

connectDB();

const authMiddleware = function (req, res, next) {
  console.log("auth middleware triggered");
  next();
};
app.use(authMiddleware);


app.use("/api", userRoutes);

app.get("/name", (req, res) => {
  res.sendFile("./name.html", { root: __dirname });
});

app.listen(port, () => {
  console.log(`Example app listening on localhost:${port}`);
});

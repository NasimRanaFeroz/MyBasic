const express = require("express");
const app = express();
const port = 3000;
app.use(express.json());

const item = require("./routes/item");
app.use("/item", item);

const authMiddleware = function (req, res, next) {
  console.log("auth middleware done");
  next();
};
app.use(authMiddleware);

app.get("/name", (req, res) => {
  res.sendFile("./name.html", { root: __dirname });
});

app.listen(port, () => {
  console.log(`Example app listening on localhost:${port}`);
});

const express = require("express");
const router = express.Router();

const User = require("../models/userModel");
const getUser = require("../controllers/userController");

router.get("/get-users", getUser);

router.get("/hello", (req, res) => {
  res.send("Hello World!");
});

router.get("/users", async (req, res) => {
  try {
    const users = await User.find({});
    res.status(200).json(users);
  } catch (err) {
    res.status(500).json({ success: false, message: err.message });
  }
});

router.post("/users", async (req, res) => {
  try {
    const { name, age } = req.body;
    const newUser = new User({ name, age });
    await newUser.save();
    res.status(200).json({ success: true, message: newUser });
  } catch (err) {
    res.status(500).json({ success: false, message: err.message });
  }
});

router.put("/users/:id", async (req, res) => {
  const { id } = req.params;
  const { name, age } = req.body;

  try {
    const updatedUser = await User.findByIdAndUpdate(
      id,
      { name, age },
      { new: true }
    );

    if (!updatedUser) {
      res.json({
        message: "User not found",
      });
    }
    res.status(200).json({
      success: true,
      user: updatedUser,
    });
  } catch (err) {
    res.status(500).json({ success: false, message: err.message });
  }
});

router.delete("/users/:id", async (req, res) => {
  const { id } = req.params;

  try {
    const deletedUser = await User.findByIdAndDelete(id);

    if (!deletedUser) {
      res.json({
        message: "User not found",
      });
    }
    res.status(200).json({
      success: true,
      user: deletedUser,
    });
  } catch (err) {
    res.status(500).json({ success: false, message: err.message });
  }
});

module.exports = router;


import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/app";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries


const firebaseConfig = {
  apiKey: "AIzaSyC80TAVvaTc1w7ICZ6CPbNixOcmBsGqCqE",
  authDomain: "basic-nasim.firebaseapp.com",
  projectId: "basic-nasim",
  storageBucket: "basic-nasim.firebasestorage.app",
  messagingSenderId: "462345495165",
  appId: "1:462345495165:web:a0c1d74d57b64b7fa94714"
};

const app = initializeApp(firebaseConfig);
const auth = getAuth(app);

export { app, auth };
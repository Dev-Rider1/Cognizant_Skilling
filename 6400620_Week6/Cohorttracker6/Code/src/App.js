
import './App.css';
import { BrowserRouter, Routes, Route, Link, Navigate } from 'react-router-dom';
import Home from './Home';
import TrainersList from './TrainerList';
import TrainerDetails from './TrainerDetails';
import trainersMock from './TrainersMock';

function App() {
  return (
    <div style={{ border: '1px solid #888', margin: 20, padding: 20, maxWidth: 400 }}>
      <h2>My Academy Trainers App</h2>
      <BrowserRouter>
        <nav>
          <Link to="/">Home</Link> |{' '}
          <Link to="/trainers">Show Trainers</Link>
        </nav>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/trainers" element={<TrainersList trainers={trainersMock} />} />
          <Route path="/trainers/:id" element={<TrainerDetails />} />
          <Route path="*" element={<Navigate to="/" replace />} />
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;


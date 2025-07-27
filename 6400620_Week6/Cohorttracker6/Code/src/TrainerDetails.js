import React from "react";
import { useParams } from "react-router-dom";
import trainersMock from "./TrainersMock";

function TrainerDetails() {
  const { id } = useParams();
  const trainer = trainersMock.find((t) => t.trainerId === id);

  if (!trainer) return <div>Trainer not found</div>;

  return (
    <div>
      <h3>Trainers Details</h3>
      <b>{trainer.name} ({trainer.technology})</b>
      <div>{trainer.email}</div>
      <div>{trainer.phone}</div>
      <ul>
        {trainer.skills.map((skill, idx) => (
          <li key={idx}>{skill}</li>
        ))}
      </ul>
    </div>
  );
}

export default TrainerDetails;

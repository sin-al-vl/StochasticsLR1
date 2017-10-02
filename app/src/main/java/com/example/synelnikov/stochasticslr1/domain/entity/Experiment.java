package com.example.synelnikov.stochasticslr1.domain.entity;

import android.support.annotation.NonNull;

import java.util.Random;

import io.reactivex.Observable;

public class Experiment {

    private Random random;

    private int attemptNumber;

    @NonNull
    private Field field;

    @NonNull
    private Unit unit;

    private ExperimentResult result;

    public Experiment(int attemptNumber, @NonNull Field field, @NonNull Unit unit) {
        this.attemptNumber = attemptNumber;
        this.field = field;
        this.unit = unit;

        result = new ExperimentResult();
        random = new Random();
    }

    public Observable<ExperimentResult> startExperiment() {

        return Observable.create(emitter -> {
            for (int i = 0; i < attemptNumber; i++) {
                testUnit();
                emitter.onNext(result);
            }
            emitter.onComplete();
        });
    }

    public void testUnit() {

        while (true) {

            float actualProbability = random.nextFloat();

            float moveLeftProbabilityLimit = unit.getFreezeProbability() +
                    unit.getMoveLeftProbability();

            float moveRightProbabilityLimit = moveLeftProbabilityLimit +
                    unit.getMoveRightProbability();

            float moveUpProbabilityLimit = moveRightProbabilityLimit +
                    unit.getMoveUpProbability();

            if (actualProbability <= unit.getFreezeProbability()) {
                result.freeze();
                break;
            } else if (actualProbability <= moveLeftProbabilityLimit) {
                unit.moveLeft();
                if (isUnitGone()) {
                    result.goneLeft();
                    break;
                }
            } else if (actualProbability <= moveRightProbabilityLimit) {
                unit.moveRight();
                if (isUnitGone()) {
                    result.goneRight();
                    break;
                }
            } else if (actualProbability <= moveUpProbabilityLimit) {
                unit.moveUp();
                if (isUnitGone()) {
                    result.goneUp();
                    break;
                }
            } else {
                unit.moveDown();
                if (isUnitGone()) {
                    result.goneDown();
                    break;
                }
            }
        }
    }

    private boolean isUnitGone() {
        return !field.contains(unit.getCoordinateX(), unit.getCoordinateY());
    }

    public ExperimentResult getResult() {
        return result;
    }

    public int getAttemptNumber() {
        return attemptNumber;
    }

    public void setAttemptNumber(int attemptNumber) {
        this.attemptNumber = attemptNumber;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}

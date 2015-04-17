(ns bowling.core-spec
  (:require [bowling.core :refer :all]
            [speclj.core :refer :all]))

(describe "Scoring a bowling game"
  (it "scores a gutter game"
    (let [game (new-game)]
      (reduce #(roll %1 %2) game (repeat 20 0)))))

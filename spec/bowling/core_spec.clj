(ns bowling.core-spec
  (:require [bowling.core :refer :all]
            [speclj.core :refer :all]))

(describe "Scoring a bowling game"

  (it "scores a gutter game"
    (let [game (new-game)]
      (should= 0
               (->> (repeat 20 0)
                    (reduce #(roll %1 %2) game)
                    score))))

  (it "scores a singles game"
    (let [game (new-game)]
      (should= 20
               (->> (repeat 20 1)
                    (reduce #(roll %1 %2) game)
                    score)))))

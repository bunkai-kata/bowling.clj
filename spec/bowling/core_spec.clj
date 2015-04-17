(ns bowling.core-spec
  (:require [bowling.core :refer :all]
            [speclj.core :refer :all]))

(describe "Scoring a bowling game"

  (with g (new-game))

  (it "scores a gutter game"
    (should= 0
             (let [n 20
                   pins 0]
               (->> (repeat n pins)
                    (reduce #(roll %1 %2) @g)
                    score))))

  (it "scores a singles game"
    (should= 20
             (->> (repeat 20 1)
                  (reduce #(roll %1 %2) @g)
                  score))))

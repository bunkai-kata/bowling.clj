(ns bowling.core-spec
  (:require [bowling.core :refer :all]
            [speclj.core :refer :all]))

(describe "scoring a bowling game"
  (it "scores a gutter game"
    (let [g (new-game)]
      (should= 0
              (->> (repeat 20 0)
                   (reduce #(roll %1 %2) g)
                   score)))))

;; Exercise 2.40
;; Page 169

(defn unique-pairs
    [n]
    (mapcat #(n-pairs %) (range 2 (inc n))))


(defn n-pairs
    [n]
    (map #(list n %) (range 1 n)))